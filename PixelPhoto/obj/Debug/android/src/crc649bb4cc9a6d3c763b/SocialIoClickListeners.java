package crc649bb4cc9a6d3c763b;


public class SocialIoClickListeners
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.afollestad.materialdialogs.MaterialDialog.ListCallback,
		com.afollestad.materialdialogs.MaterialDialog.SingleButtonCallback
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onSelection:(Lcom/afollestad/materialdialogs/MaterialDialog;Landroid/view/View;ILjava/lang/CharSequence;)V:GetOnSelection_Lcom_afollestad_materialdialogs_MaterialDialog_Landroid_view_View_ILjava_lang_CharSequence_Handler:AFollestad.MaterialDialogs.MaterialDialog/IListCallbackInvoker, AFollestad.MaterialDialogs.Core\n" +
			"n_onClick:(Lcom/afollestad/materialdialogs/MaterialDialog;Lcom/afollestad/materialdialogs/DialogAction;)V:GetOnClick_Lcom_afollestad_materialdialogs_MaterialDialog_Lcom_afollestad_materialdialogs_DialogAction_Handler:AFollestad.MaterialDialogs.MaterialDialog/ISingleButtonCallbackInvoker, AFollestad.MaterialDialogs.Core\n" +
			"";
		mono.android.Runtime.register ("PixelPhoto.Activities.Posts.Listeners.SocialIoClickListeners, PixelPhoto", SocialIoClickListeners.class, __md_methods);
	}


	public SocialIoClickListeners ()
	{
		super ();
		if (getClass () == SocialIoClickListeners.class)
			mono.android.TypeManager.Activate ("PixelPhoto.Activities.Posts.Listeners.SocialIoClickListeners, PixelPhoto", "", this, new java.lang.Object[] {  });
	}

	public SocialIoClickListeners (android.app.Activity p0)
	{
		super ();
		if (getClass () == SocialIoClickListeners.class)
			mono.android.TypeManager.Activate ("PixelPhoto.Activities.Posts.Listeners.SocialIoClickListeners, PixelPhoto", "Android.App.Activity, Mono.Android", this, new java.lang.Object[] { p0 });
	}


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
