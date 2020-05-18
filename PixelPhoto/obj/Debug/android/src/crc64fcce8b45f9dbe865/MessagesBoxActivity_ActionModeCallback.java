package crc64fcce8b45f9dbe865;


public class MessagesBoxActivity_ActionModeCallback
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.support.v7.view.ActionMode.Callback
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onActionItemClicked:(Landroid/support/v7/view/ActionMode;Landroid/view/MenuItem;)Z:GetOnActionItemClicked_Landroid_support_v7_view_ActionMode_Landroid_view_MenuItem_Handler:Android.Support.V7.View.ActionMode/ICallbackInvoker, Xamarin.Android.Support.v7.AppCompat\n" +
			"n_onCreateActionMode:(Landroid/support/v7/view/ActionMode;Landroid/view/Menu;)Z:GetOnCreateActionMode_Landroid_support_v7_view_ActionMode_Landroid_view_Menu_Handler:Android.Support.V7.View.ActionMode/ICallbackInvoker, Xamarin.Android.Support.v7.AppCompat\n" +
			"n_onDestroyActionMode:(Landroid/support/v7/view/ActionMode;)V:GetOnDestroyActionMode_Landroid_support_v7_view_ActionMode_Handler:Android.Support.V7.View.ActionMode/ICallbackInvoker, Xamarin.Android.Support.v7.AppCompat\n" +
			"n_onPrepareActionMode:(Landroid/support/v7/view/ActionMode;Landroid/view/Menu;)Z:GetOnPrepareActionMode_Landroid_support_v7_view_ActionMode_Landroid_view_Menu_Handler:Android.Support.V7.View.ActionMode/ICallbackInvoker, Xamarin.Android.Support.v7.AppCompat\n" +
			"";
		mono.android.Runtime.register ("PixelPhoto.Activities.Chat.MessagesBoxActivity+ActionModeCallback, PixelPhoto", MessagesBoxActivity_ActionModeCallback.class, __md_methods);
	}


	public MessagesBoxActivity_ActionModeCallback ()
	{
		super ();
		if (getClass () == MessagesBoxActivity_ActionModeCallback.class)
			mono.android.TypeManager.Activate ("PixelPhoto.Activities.Chat.MessagesBoxActivity+ActionModeCallback, PixelPhoto", "", this, new java.lang.Object[] {  });
	}

	public MessagesBoxActivity_ActionModeCallback (crc64fcce8b45f9dbe865.MessagesBoxActivity p0)
	{
		super ();
		if (getClass () == MessagesBoxActivity_ActionModeCallback.class)
			mono.android.TypeManager.Activate ("PixelPhoto.Activities.Chat.MessagesBoxActivity+ActionModeCallback, PixelPhoto", "PixelPhoto.Activities.Chat.MessagesBoxActivity, PixelPhoto", this, new java.lang.Object[] { p0 });
	}


	public boolean onActionItemClicked (android.support.v7.view.ActionMode p0, android.view.MenuItem p1)
	{
		return n_onActionItemClicked (p0, p1);
	}

	private native boolean n_onActionItemClicked (android.support.v7.view.ActionMode p0, android.view.MenuItem p1);


	public boolean onCreateActionMode (android.support.v7.view.ActionMode p0, android.view.Menu p1)
	{
		return n_onCreateActionMode (p0, p1);
	}

	private native boolean n_onCreateActionMode (android.support.v7.view.ActionMode p0, android.view.Menu p1);


	public void onDestroyActionMode (android.support.v7.view.ActionMode p0)
	{
		n_onDestroyActionMode (p0);
	}

	private native void n_onDestroyActionMode (android.support.v7.view.ActionMode p0);


	public boolean onPrepareActionMode (android.support.v7.view.ActionMode p0, android.view.Menu p1)
	{
		return n_onPrepareActionMode (p0, p1);
	}

	private native boolean n_onPrepareActionMode (android.support.v7.view.ActionMode p0, android.view.Menu p1);

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
