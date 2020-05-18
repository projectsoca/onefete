﻿using System;
using System.IO;
using Android;
using Android.App;
using Android.Content;
using Android.Content.PM;
using Android.Graphics;
using Android.Media;
using Android.OS;
using Android.Support.V7.App;
using Android.Support.V7.Widget;
using Android.Views;
using Android.Widget;
using AndroidHUD;
using Com.Victorminerva.Widget.Edittext;
using PixelPhoto.Activities.Editor.Adapters;
using PixelPhoto.Activities.Editor.Tools;
using PixelPhoto.Helpers.Ads;
using PixelPhoto.Helpers.Fonts;
using PixelPhoto.Helpers.Model.Editor;
using PixelPhoto.Helpers.Utils;
using PixelPhoto.NiceArt;
using PixelPhoto.NiceArt.Models;
using PixelPhoto.NiceArt.Utils;
using AlertDialog = Android.App.AlertDialog;
using File = Java.IO.File;
using FileNotFoundException = Java.IO.FileNotFoundException;

namespace PixelPhoto.Activities.Editor
{
    [Activity(Icon = "@mipmap/icon", Theme = "@style/MyTheme", ConfigurationChanges = ConfigChanges.Keyboard | ConfigChanges.Locale | ConfigChanges.UiMode | ConfigChanges.ScreenSize | ConfigChanges.Orientation | ConfigChanges.KeyboardHidden | ConfigChanges.ScreenLayout | ConfigChanges.ScreenSize | ConfigChanges.SmallestScreenSize | ConfigChanges.UiMode | ConfigChanges.Locale)]
    public class EditColorActivity : AppCompatActivity, INiceArt.IOnSaveListener, ITextEditor, INiceArt.IOnNiceArtEditorListener
    {
        private RecyclerView AddTextColorPickerRecyclerView;
        private ImageView CloseImageView;
        private ColorPickerAdapter ColorPickerAdapter;
        public string MColorCode = "#ffffff";
        private RecyclerView FontTypeFaceRecyclerView;
        private int Height;
        private LinearLayoutManager LayoutManager;
        private LinearLayoutManager LayoutManagerTypeFace;
        public AutofitEdittext MAutoResizeEditText;    
        private NiceArtEditorView NewColorView;
        private TextView SaveTextView , ColorTextView;
        private FontTypeFaceAdapter TypeFaceAdapter;
        private int Width;
        private Typeface FontTxtResult;
        public NiceArtEditor NewColorEditor;
        public View RootView;
        private ColorFragment MColorFragment;
         
           
        public void OnAddViewListener(ViewType viewType, int numberOfAddedViews)
        {
        }

        public void OnRemoveViewListener(int numberOfAddedViews)
        {
        }

        public void OnRemoveViewListener(ViewType viewType, int numberOfAddedViews)
        {
        }

        public void OnStartViewChangeListener(ViewType viewType)
        {
        }

        public void OnStopViewChangeListener(ViewType viewType)
        {
        }

        protected override void OnCreate(Bundle savedInstanceState)
        {
            try
            {
                base.OnCreate(savedInstanceState);

                View mContentView = Window.DecorView;
                var uiOptions = (int)mContentView.SystemUiVisibility;
                var newUiOptions = (int)uiOptions;

                newUiOptions |= (int)SystemUiFlags.Fullscreen;
                newUiOptions |= (int)SystemUiFlags.HideNavigation;
                mContentView.SystemUiVisibility = (StatusBarVisibility)newUiOptions;

                Window.AddFlags(WindowManagerFlags.Fullscreen);

                SetTheme(AppSettings.SetTabDarkTheme ? Resource.Style.MyTheme_Dark_Base : Resource.Style.MyTheme_Base);

                // Create your application here
                SetContentView(Resource.Layout.edit_color_layout);

                MAutoResizeEditText = (AutofitEdittext) FindViewById(Resource.Id.rEdittext);

                var fontTxt6 = Typeface.CreateFromAsset(Assets, "SF-UI-Display-Regular.ttf");
                var mEmojiTypeFace = Typeface.CreateFromAsset(Assets, "emojione-android.ttf");

                NewColorView = FindViewById<NiceArtEditorView>(Resource.Id.imgColorView);

                NewColorEditor = new NiceArtEditor.Builder(this, NewColorView, ContentResolver)
                    .SetPinchTextScalable(true) // set false to disable pinch to zoom on text insertion.By default its true
                    .SetDefaultEmojiTypeface(mEmojiTypeFace) // set default font TypeFace to add emojis
                    .Build(); // build NiceArt Editor sdk

                NewColorEditor.SetOnNiceArtEditorListener(this);

                //Setup the color picker for text color
                AddTextColorPickerRecyclerView =FindViewById<RecyclerView>(Resource.Id.add_text_color_picker_recycler_view);
                FontTypeFaceRecyclerView = FindViewById<RecyclerView>(Resource.Id.fontTypeFace_recycler_view);

                //Color 
                MColorFragment = new ColorFragment(NewColorEditor,this);

                LayoutManager = new LinearLayoutManager(this, LinearLayoutManager.Horizontal, false);
                AddTextColorPickerRecyclerView.SetLayoutManager(LayoutManager);
                AddTextColorPickerRecyclerView.HasFixedSize = true;

                LayoutManagerTypeFace = new LinearLayoutManager(this, LinearLayoutManager.Horizontal, false);
                FontTypeFaceRecyclerView.SetLayoutManager(LayoutManagerTypeFace);
                FontTypeFaceRecyclerView.HasFixedSize = true;

                ColorPickerAdapter = new ColorPickerAdapter(this, ColorType.ColorGradient, false);
                ColorPickerAdapter.ItemClick += ColorPickerAdapterOnItemClick;
                AddTextColorPickerRecyclerView.SetAdapter(ColorPickerAdapter);

                TypeFaceAdapter = new FontTypeFaceAdapter(this);
                TypeFaceAdapter.ItemClick += TypeFaceAdapterOnItemClick;
                FontTypeFaceRecyclerView.SetAdapter(TypeFaceAdapter);

                CloseImageView = FindViewById<ImageView>(Resource.Id.imgClose);
                SaveTextView = FindViewById<TextView>(Resource.Id.imgSave);
                ColorTextView = FindViewById<TextView>(Resource.Id.txtColor);

                SaveTextView.Tag = "Add";
                SaveTextView.Text = GetText(Resource.String.Lbl_Add);
                FontUtils.SetTextViewIcon(FontsIconFrameWork.IonIcons, ColorTextView, "\uf37b");
                
                CloseImageView.Click += CloseImageViewOnClick;
                SaveTextView.Click += SaveTextViewOnClick;
                ColorTextView.Click += ColorTextViewOnClick;

                SaveTextView.SetTypeface(fontTxt6, TypefaceStyle.Normal);

                var display = WindowManager.DefaultDisplay;
                var size = new Point();
                display.GetSize(size);
                Width = size.X;
                Height = size.Y;
                int[] color = {Color.ParseColor("#6ec052"), Color.ParseColor("#28c4f3")};
                var (gradient, bitmap) = ColorUtil.GetGradientDrawable(this, color, Width, Height);
                if (bitmap != null)
                {
                    NewColorEditor.ClearAllViews();
                    NewColorView.GetSource().ClearColorFilter();

                    NewColorView.GetSource()?.SetImageBitmap(bitmap);
                }

                if ((int) Build.VERSION.SdkInt < 23)
                {
                    if (!Directory.Exists(Methods.Path.FolderDcimNiceArt))
                        Directory.CreateDirectory(Methods.Path.FolderDcimNiceArt);
                }
                else
                {
                    RequestPermissions(new[]
                    {
                        Manifest.Permission.ReadExternalStorage,
                        Manifest.Permission.WriteExternalStorage
                    }, 10);
                }

                AdsGoogle.Ad_RewardedVideo(this);
            }
            catch (Exception e)
            {
                Console.WriteLine(e);
            }
        }
           
        //Color Image
        public void ColorPickerAdapterOnItemClick(object sender, ColorPickerAdapterClickEventArgs adapterClickEvents)
        {
            try
            {
                var position = adapterClickEvents.Position;
                if (position >= 0)
                {
                    var item = ColorPickerAdapter.GetItem(position);
                    if (item != null)
                    {
                        if (item.ColorFirst == "#ecf0f1")
                        {
                            MAutoResizeEditText.SetTextColor(Color.Black);
                            MAutoResizeEditText.SetHintTextColor(Color.Black);
                        }
                        else
                        {
                            MAutoResizeEditText.SetTextColor(Color.White);
                            MAutoResizeEditText.SetHintTextColor(Color.White);
                        }

                        if (!string.IsNullOrEmpty(item.ColorSecond))
                        {
                            int[] color = {Color.ParseColor(item.ColorFirst), Color.ParseColor(item.ColorSecond)};
                            var (gradient, bitmap) = ColorUtil.GetGradientDrawable(this, color, Width, Height);

                            NewColorView.GetSource()?.SetImageBitmap(bitmap);
                        }
                        else
                        {
                            int[] color = { Color.ParseColor(item.ColorFirst) , Color.ParseColor(item.ColorFirst) };
                            var (gradient, bitmap) = ColorUtil.GetGradientDrawable(this, color, Width, Height);
                            NewColorView.GetSource()?.SetImageBitmap(bitmap);
                        }
                    }
                }
            }
            catch (Exception exception)
            {
                Console.WriteLine(exception);
            }
        }

        //Color Text
        private void ColorTextViewOnClick(object sender, EventArgs e)
        {
            try
            {
                MColorFragment.Show(SupportFragmentManager, MColorFragment.Tag);
            }
            catch (Exception exception)
            {
                Console.WriteLine(exception);
            }
        }

        //Permissions
        public override void OnRequestPermissionsResult(int requestCode, string[] permissions,
            Permission[] grantResults)
        {
            try
            {
                base.OnRequestPermissionsResult(requestCode, permissions, grantResults);

                if (requestCode == 101)
                {
                    if (grantResults.Length > 0 && grantResults[0] == Permission.Granted)
                        SaveImage();
                    else
                        Toast.MakeText(this, GetText(Resource.String.Lbl_Permission_is_denailed), ToastLength.Long)
                            .Show();
                }
                else if (requestCode == 10)
                {
                    if (!Directory.Exists(Methods.Path.FolderDcimNiceArt))
                        Directory.CreateDirectory(Methods.Path.FolderDcimNiceArt);
                }
            }
            catch (Exception e)
            {
                Console.WriteLine(e);
            }
        }

        public override void OnTrimMemory(TrimMemory level)
        {
            try
            {
                
                
                GC.Collect(GC.MaxGeneration, GCCollectionMode.Forced);
                base.OnTrimMemory(level);
            }
            catch (Exception exception)
            {
                Console.WriteLine(exception);
            }
        }

        public override void OnLowMemory()
        {
            try
            {
                GC.Collect(GC.MaxGeneration);
                base.OnLowMemory();
            }
            catch (Exception exception)
            {
                Console.WriteLine(exception);
            }
        }
        
        #region Save

        public void SaveTextViewOnClick(object sender, EventArgs e)
        {
            try
            {
                if (string.IsNullOrEmpty(MColorCode))
                    MColorCode = "#ffffff";

                if (SaveTextView.Tag.ToString() == "Add")
                {
                    MAutoResizeEditText.Visibility = ViewStates.Invisible;
                    ColorTextView.Visibility = ViewStates.Invisible;

                    OnDone(MAutoResizeEditText.Text, MColorCode, ViewTextType.Add, FontTxtResult);

                    SaveTextView.Tag = "Save";
                    SaveTextView.Text = GetText(Resource.String.Lbl_Save);
                }
                else if (SaveTextView.Tag.ToString() == "Save")
                {
                    SaveImage();
                }
            }
            catch (Exception exception)
            {
                Console.WriteLine(exception);
            }
        }

        public void SaveImage()
        {
            try
            {
                RunOnUiThread(() =>
                {
                    try
                    {
                        //Show a progress
                        AndHUD.Shared.Show(this, GetText(Resource.String.Lbl_Loading) + "... ");

                        if ((int)Build.VERSION.SdkInt < 23)
                        {
                            if (!Directory.Exists(Methods.Path.FolderDcimNiceArt))
                                Directory.CreateDirectory(Methods.Path.FolderDcimNiceArt);

                            var file = new File(Methods.Path.FolderDcimNiceArt + File.Separator + "" + BitmapUtil.GetTimestamp(DateTime.Now) +
                                                ".png");
                            try
                            {
                                file.CreateNewFile();

                                var saveSettings = new SaveSettings.Builder()
                                    .SetClearViewsEnabled(true)
                                    .SetTransparencyEnabled(true)
                                    .Build();

                                NewColorEditor.SaveAsFile(file.Path, saveSettings, this);
                            }
                            catch (FileNotFoundException e)
                            {
                                e.PrintStackTrace();
                            }
                            catch (IOException e)
                            {
                                Console.WriteLine(e);
                            }
                        }
                        else
                        {
                            if (CheckSelfPermission(Manifest.Permission.ReadExternalStorage) == Permission.Granted &&
                                CheckSelfPermission(Manifest.Permission.WriteExternalStorage) == Permission.Granted)
                            {
                                if (!Directory.Exists(Methods.Path.FolderDcimNiceArt))
                                    Directory.CreateDirectory(Methods.Path.FolderDcimNiceArt);

                                var file = new File(Methods.Path.FolderDcimNiceArt + File.Separator + "" + BitmapUtil.GetTimestamp(DateTime.Now) + ".png");
                                try
                                {
                                    file.CreateNewFile();

                                    var saveSettings = new SaveSettings.Builder()
                                        .SetClearViewsEnabled(true)
                                        .SetTransparencyEnabled(true)
                                        .Build();

                                    NewColorEditor.SaveAsFile(file.Path, saveSettings, this);
                                }
                                catch (FileNotFoundException e)
                                {
                                    e.PrintStackTrace();
                                }
                                catch (IOException e)
                                {
                                    Console.WriteLine(e);
                                }
                            }
                            else
                            {
                                RequestPermissions(new[]
                                {
                            Manifest.Permission.ReadExternalStorage,
                            Manifest.Permission.WriteExternalStorage
                        }, 101);
                            }
                        }
                    }
                    catch (Exception e)
                    {
                        Console.WriteLine(e);
                    }
                }); 
            }
            catch (Exception exception)
            {
                Console.WriteLine(exception);
            } 
        }

        public void ShowSaveDialog()
        {
            try
            {
                var builder = new AlertDialog.Builder(this);
                builder.SetMessage(GetText(Resource.String.Lbl_Are_you_want_to_exit_without_saving_image));
                builder.SetPositiveButton(GetText(Resource.String.Lbl_Save), delegate
                {
                    SaveImage();
                });
                builder.SetNegativeButton(GetText(Resource.String.Lbl_Cancel), delegate { });
                builder.SetNeutralButton(GetText(Resource.String.Lbl_Discard), delegate { var resultIntent = new Intent(); SetResult(Result.Canceled, resultIntent); Finish(); });
                builder.Create().Show();
            }
            catch (Exception e)
            {
                Console.WriteLine(e);
            }
        }

        public void OnSuccess(string imagePath, Bitmap savedResultBitmap)
        {
            try
            {
                RunOnUiThread(() =>
                {
                    try
                    {
                        AndHUD.Shared.Dismiss(this);

                        //File pathOfFile = new File(imagePath);
                        //NewColorView.GetSource().SetImageURI(Uri.FromFile(new File(imagePath)));

                        ////Show image in Gallery
                        //var mediaScanIntent = new Intent(Intent.ActionMediaScannerScanFile);
                        //mediaScanIntent.SetData(Uri.FromFile(pathOfFile));
                        //SendBroadcast(mediaScanIntent);

                        // Tell the media scanner about the new file so that it is
                        // immediately available to the user.
                        MediaScannerConnection.ScanFile(Application.Context, new string[] { imagePath }, null, null);

                        // put the String to pass back into an Intent and close this activity
                        var resultIntent = new Intent();
                        resultIntent.PutExtra("ImagePath", imagePath);
                        SetResult(Result.Ok, resultIntent);
                        Finish();
                        NewColorEditor.ClearAllViews();
                        NewColorView.GetSource().ClearColorFilter(); 
                    }
                    catch (Exception e)
                    {
                        Console.WriteLine(e);
                    }
                });
            }
            catch (Exception e)
            {
                Console.WriteLine(e); 
            } 
        }

        public void OnFailure(string exception)
        {
            try
            {
                //Show a Error image with a message
                AndHUD.Shared.ShowError(this, GetText(Resource.String.Lbl_Failed_to_save_Image), MaskType.Clear, TimeSpan.FromSeconds(2));

                // put the String to pass back into an Intent and close this activity
                var resultIntent = new Intent();
                SetResult(Result.Canceled, resultIntent);
                Finish();
                AndHUD.Shared.Dismiss(this);
            }
            catch (Exception e)
            {
                Console.WriteLine(e);
            }
        }

        #endregion

        #region Close

        public void CloseImageViewOnClick(object sender, EventArgs e)
        {
            try
            {
                OnBackPressed();
            }
            catch (Exception exception)
            {
                Console.WriteLine(exception);
            }
        }

        public override void OnBackPressed()
        {
            try
            {
                if (!NewColorEditor.IsCacheEmpty() && !string.IsNullOrEmpty(MAutoResizeEditText.Text))
                    ShowSaveDialog();
                else
                {
                    base.OnBackPressed();
                    var resultIntent = new Intent();
                    SetResult(Result.Canceled, resultIntent);
                    Finish();
                }
            }
            catch (Exception e)
            {
                Console.WriteLine(e);
            }
        }

        #endregion

        #region Text

        public void OnDone(string inputText, string colorCode, ViewTextType changeText, Typeface textTypeface)
        {
            try
            {
                if (changeText == ViewTextType.Add)
                    NewColorEditor.AddText(textTypeface, inputText, colorCode);
                else
                    NewColorEditor.EditText(RootView, textTypeface, inputText, colorCode);
            }
            catch (Exception e)
            {
                Console.WriteLine(e);
            }
        }

        //Change Text
        public void OnEditTextChangeListener(View rootView, string text, int colorCode)
        {
            try
            {
                RootView = rootView;
                var textEditorDialogFragment = new TextEditorFragment(null, this);
                textEditorDialogFragment.Show(this, null, this, text, colorCode, ViewTextType.Change);
                textEditorDialogFragment.SetOnTextEditorListener(this);
            }
            catch (Exception e)
            {
                Console.WriteLine(e);
            }
        }

        //Type Face Text
        public void TypeFaceAdapterOnItemClick(object sender, FontTypeFaceAdapterClickEventArgs adapterClickEvents)
        {
            try
            {
                var position = adapterClickEvents.Position;
                if (position >= 0)
                {
                    var item = TypeFaceAdapter.GetItem(position);
                    if (item != null)
                    {
                        FontTxtResult = item;
                        MAutoResizeEditText.SetTypeface(item, TypefaceStyle.Normal);
                    }
                }
            }
            catch (Exception exception)
            {
                Console.WriteLine(exception);
            }
        }
         
        #endregion
    }
}