package crc6426a9e2bd1c5b2325;


public class Methods_LocalNotification_NotificationBroadcasterCloser
	extends android.content.BroadcastReceiver
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onReceive:(Landroid/content/Context;Landroid/content/Intent;)V:GetOnReceive_Landroid_content_Context_Landroid_content_Intent_Handler\n" +
			"";
		mono.android.Runtime.register ("PixelPhoto.Helpers.Utils.Methods+LocalNotification+NotificationBroadcasterCloser, PixelPhoto", Methods_LocalNotification_NotificationBroadcasterCloser.class, __md_methods);
	}


	public Methods_LocalNotification_NotificationBroadcasterCloser ()
	{
		super ();
		if (getClass () == Methods_LocalNotification_NotificationBroadcasterCloser.class)
			mono.android.TypeManager.Activate ("PixelPhoto.Helpers.Utils.Methods+LocalNotification+NotificationBroadcasterCloser, PixelPhoto", "", this, new java.lang.Object[] {  });
	}


	public void onReceive (android.content.Context p0, android.content.Intent p1)
	{
		n_onReceive (p0, p1);
	}

	private native void n_onReceive (android.content.Context p0, android.content.Intent p1);

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
