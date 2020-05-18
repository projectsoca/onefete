package crc64c546aac3b9ebc785;


public class UserProfileFragment
	extends android.support.v4.app.Fragment
	implements
		mono.android.IGCUserPeer,
		android.support.design.widget.AppBarLayout.OnOffsetChangedListener,
		com.afollestad.materialdialogs.MaterialDialog.ListCallback,
		com.afollestad.materialdialogs.MaterialDialog.SingleButtonCallback
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onCreate:(Landroid/os/Bundle;)V:GetOnCreate_Landroid_os_Bundle_Handler\n" +
			"n_onCreateView:(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;:GetOnCreateView_Landroid_view_LayoutInflater_Landroid_view_ViewGroup_Landroid_os_Bundle_Handler\n" +
			"n_onLowMemory:()V:GetOnLowMemoryHandler\n" +
			"n_onRequestPermissionsResult:(I[Ljava/lang/String;[I)V:GetOnRequestPermissionsResult_IarrayLjava_lang_String_arrayIHandler\n" +
			"n_onOptionsItemSelected:(Landroid/view/MenuItem;)Z:GetOnOptionsItemSelected_Landroid_view_MenuItem_Handler\n" +
			"n_onOffsetChanged:(Landroid/support/design/widget/AppBarLayout;I)V:GetOnOffsetChanged_Landroid_support_design_widget_AppBarLayout_IHandler:Android.Support.Design.Widget.AppBarLayout/IOnOffsetChangedListenerInvoker, Xamarin.Android.Support.Design\n" +
			"n_onSelection:(Lcom/afollestad/materialdialogs/MaterialDialog;Landroid/view/View;ILjava/lang/CharSequence;)V:GetOnSelection_Lcom_afollestad_materialdialogs_MaterialDialog_Landroid_view_View_ILjava_lang_CharSequence_Handler:AFollestad.MaterialDialogs.MaterialDialog/IListCallbackInvoker, AFollestad.MaterialDialogs.Core\n" +
			"n_onClick:(Lcom/afollestad/materialdialogs/MaterialDialog;Lcom/afollestad/materialdialogs/DialogAction;)V:GetOnClick_Lcom_afollestad_materialdialogs_MaterialDialog_Lcom_afollestad_materialdialogs_DialogAction_Handler:AFollestad.MaterialDialogs.MaterialDialog/ISingleButtonCallbackInvoker, AFollestad.MaterialDialogs.Core\n" +
			"";
		mono.android.Runtime.register ("PixelPhoto.Activities.UserProfile.UserProfileFragment, PixelPhoto", UserProfileFragment.class, __md_methods);
	}


	public UserProfileFragment ()
	{
		super ();
		if (getClass () == UserProfileFragment.class)
			mono.android.TypeManager.Activate ("PixelPhoto.Activities.UserProfile.UserProfileFragment, PixelPhoto", "", this, new java.lang.Object[] {  });
	}


	public void onCreate (android.os.Bundle p0)
	{
		n_onCreate (p0);
	}

	private native void n_onCreate (android.os.Bundle p0);


	public android.view.View onCreateView (android.view.LayoutInflater p0, android.view.ViewGroup p1, android.os.Bundle p2)
	{
		return n_onCreateView (p0, p1, p2);
	}

	private native android.view.View n_onCreateView (android.view.LayoutInflater p0, android.view.ViewGroup p1, android.os.Bundle p2);


	public void onLowMemory ()
	{
		n_onLowMemory ();
	}

	private native void n_onLowMemory ();


	public void onRequestPermissionsResult (int p0, java.lang.String[] p1, int[] p2)
	{
		n_onRequestPermissionsResult (p0, p1, p2);
	}

	private native void n_onRequestPermissionsResult (int p0, java.lang.String[] p1, int[] p2);


	public boolean onOptionsItemSelected (android.view.MenuItem p0)
	{
		return n_onOptionsItemSelected (p0);
	}

	private native boolean n_onOptionsItemSelected (android.view.MenuItem p0);


	public void onOffsetChanged (android.support.design.widget.AppBarLayout p0, int p1)
	{
		n_onOffsetChanged (p0, p1);
	}

	private native void n_onOffsetChanged (android.support.design.widget.AppBarLayout p0, int p1);


	public void onSelection (com.afollestad.materialdialogs.MaterialDialog p0, android.view.View p1, int p2, java.lang.CharSequence p3)
	{
		n_onSelection (p0, p1, p2, p3);
	}

	private native void n_onSelection (com.afollestad.materialdialogs.MaterialDialog p0, android.view.View p1, int p2, java.lang.CharSequence p3);


	public void onClick (com.afollestad.materialdialogs.MaterialDialog p0, com.afollestad.materialdialogs.DialogAction p1)
	{
		n_onClick (p0, p1);
	}

	private native void n_onClick (com.afollestad.materialdialogs.MaterialDialog p0, com.afollestad.materialdialogs.DialogAction p1);

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
