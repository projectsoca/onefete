package crc64ba0a71cbe1768fe2;


public class AddPostActivity
	extends android.support.v7.app.AppCompatActivity
	implements
		mono.android.IGCUserPeer,
		com.sothree.slidinguppanel.SlidingUpPanelLayout.PanelSlideListener,
		com.afollestad.materialdialogs.MaterialDialog.SingleButtonCallback,
		com.afollestad.materialdialogs.MaterialDialog.InputCallback,
		com.afollestad.materialdialogs.MaterialDialog.ListCallback
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onCreate:(Landroid/os/Bundle;)V:GetOnCreate_Landroid_os_Bundle_Handler\n" +
			"n_onResume:()V:GetOnResumeHandler\n" +
			"n_onPause:()V:GetOnPauseHandler\n" +
			"n_onTrimMemory:(I)V:GetOnTrimMemory_IHandler\n" +
			"n_onLowMemory:()V:GetOnLowMemoryHandler\n" +
			"n_onOptionsItemSelected:(Landroid/view/MenuItem;)Z:GetOnOptionsItemSelected_Landroid_view_MenuItem_Handler\n" +
			"n_onActivityResult:(IILandroid/content/Intent;)V:GetOnActivityResult_IILandroid_content_Intent_Handler\n" +
			"n_onRequestPermissionsResult:(I[Ljava/lang/String;[I)V:GetOnRequestPermissionsResult_IarrayLjava_lang_String_arrayIHandler\n" +
			"n_onBackPressed:()V:GetOnBackPressedHandler\n" +
			"n_onPanelSlide:(Landroid/view/View;F)V:GetOnPanelSlide_Landroid_view_View_FHandler:Com.Sothree.Slidinguppanel.SlidingUpPanelLayout/IPanelSlideListenerInvoker, Xamarin.Bindings.AndroidSlidingUpPanel\n" +
			"n_onPanelStateChanged:(Landroid/view/View;Lcom/sothree/slidinguppanel/SlidingUpPanelLayout$PanelState;Lcom/sothree/slidinguppanel/SlidingUpPanelLayout$PanelState;)V:GetOnPanelStateChanged_Landroid_view_View_Lcom_sothree_slidinguppanel_SlidingUpPanelLayout_PanelState_Lcom_sothree_slidinguppanel_SlidingUpPanelLayout_PanelState_Handler:Com.Sothree.Slidinguppanel.SlidingUpPanelLayout/IPanelSlideListenerInvoker, Xamarin.Bindings.AndroidSlidingUpPanel\n" +
			"n_onClick:(Lcom/afollestad/materialdialogs/MaterialDialog;Lcom/afollestad/materialdialogs/DialogAction;)V:GetOnClick_Lcom_afollestad_materialdialogs_MaterialDialog_Lcom_afollestad_materialdialogs_DialogAction_Handler:AFollestad.MaterialDialogs.MaterialDialog/ISingleButtonCallbackInvoker, AFollestad.MaterialDialogs.Core\n" +
			"n_onInput:(Lcom/afollestad/materialdialogs/MaterialDialog;Ljava/lang/CharSequence;)V:GetOnInput_Lcom_afollestad_materialdialogs_MaterialDialog_Ljava_lang_CharSequence_Handler:AFollestad.MaterialDialogs.MaterialDialog/IInputCallbackInvoker, AFollestad.MaterialDialogs.Core\n" +
			"n_onSelection:(Lcom/afollestad/materialdialogs/MaterialDialog;Landroid/view/View;ILjava/lang/CharSequence;)V:GetOnSelection_Lcom_afollestad_materialdialogs_MaterialDialog_Landroid_view_View_ILjava_lang_CharSequence_Handler:AFollestad.MaterialDialogs.MaterialDialog/IListCallbackInvoker, AFollestad.MaterialDialogs.Core\n" +
			"";
		mono.android.Runtime.register ("PixelPhoto.Activities.AddPost.AddPostActivity, PixelPhoto", AddPostActivity.class, __md_methods);
	}


	public AddPostActivity ()
	{
		super ();
		if (getClass () == AddPostActivity.class)
			mono.android.TypeManager.Activate ("PixelPhoto.Activities.AddPost.AddPostActivity, PixelPhoto", "", this, new java.lang.Object[] {  });
	}


	public void onCreate (android.os.Bundle p0)
	{
		n_onCreate (p0);
	}

	private native void n_onCreate (android.os.Bundle p0);


	public void onResume ()
	{
		n_onResume ();
	}

	private native void n_onResume ();


	public void onPause ()
	{
		n_onPause ();
	}

	private native void n_onPause ();


	public void onTrimMemory (int p0)
	{
		n_onTrimMemory (p0);
	}

	private native void n_onTrimMemory (int p0);


	public void onLowMemory ()
	{
		n_onLowMemory ();
	}

	private native void n_onLowMemory ();


	public boolean onOptionsItemSelected (android.view.MenuItem p0)
	{
		return n_onOptionsItemSelected (p0);
	}

	private native boolean n_onOptionsItemSelected (android.view.MenuItem p0);


	public void onActivityResult (int p0, int p1, android.content.Intent p2)
	{
		n_onActivityResult (p0, p1, p2);
	}

	private native void n_onActivityResult (int p0, int p1, android.content.Intent p2);


	public void onRequestPermissionsResult (int p0, java.lang.String[] p1, int[] p2)
	{
		n_onRequestPermissionsResult (p0, p1, p2);
	}

	private native void n_onRequestPermissionsResult (int p0, java.lang.String[] p1, int[] p2);


	public void onBackPressed ()
	{
		n_onBackPressed ();
	}

	private native void n_onBackPressed ();


	public void onPanelSlide (android.view.View p0, float p1)
	{
		n_onPanelSlide (p0, p1);
	}

	private native void n_onPanelSlide (android.view.View p0, float p1);


	public void onPanelStateChanged (android.view.View p0, com.sothree.slidinguppanel.SlidingUpPanelLayout.PanelState p1, com.sothree.slidinguppanel.SlidingUpPanelLayout.PanelState p2)
	{
		n_onPanelStateChanged (p0, p1, p2);
	}

	private native void n_onPanelStateChanged (android.view.View p0, com.sothree.slidinguppanel.SlidingUpPanelLayout.PanelState p1, com.sothree.slidinguppanel.SlidingUpPanelLayout.PanelState p2);


	public void onClick (com.afollestad.materialdialogs.MaterialDialog p0, com.afollestad.materialdialogs.DialogAction p1)
	{
		n_onClick (p0, p1);
	}

	private native void n_onClick (com.afollestad.materialdialogs.MaterialDialog p0, com.afollestad.materialdialogs.DialogAction p1);


	public void onInput (com.afollestad.materialdialogs.MaterialDialog p0, java.lang.CharSequence p1)
	{
		n_onInput (p0, p1);
	}

	private native void n_onInput (com.afollestad.materialdialogs.MaterialDialog p0, java.lang.CharSequence p1);


	public void onSelection (com.afollestad.materialdialogs.MaterialDialog p0, android.view.View p1, int p2, java.lang.CharSequence p3)
	{
		n_onSelection (p0, p1, p2, p3);
	}

	private native void n_onSelection (com.afollestad.materialdialogs.MaterialDialog p0, android.view.View p1, int p2, java.lang.CharSequence p3);

	private java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}
