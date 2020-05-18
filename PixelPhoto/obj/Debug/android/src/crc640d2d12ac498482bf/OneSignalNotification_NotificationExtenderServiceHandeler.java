package crc640d2d12ac498482bf;


public class OneSignalNotification_NotificationExtenderServiceHandeler
	extends com.onesignal.NotificationExtenderService
	implements
		mono.android.IGCUserPeer,
		android.support.v4.app.NotificationCompat.Extender
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onHandleIntent:(Landroid/content/Intent;)V:GetOnHandleIntent_Landroid_content_Intent_Handler\n" +
			"n_onNotificationProcessing:(Lcom/onesignal/OSNotificationReceivedResult;)Z:GetOnNotificationProcessing_Lcom_onesignal_OSNotificationReceivedResult_Handler\n" +
			"n_extend:(Landroid/support/v4/app/NotificationCompat$Builder;)Landroid/support/v4/app/NotificationCompat$Builder;:GetExtend_Landroid_support_v4_app_NotificationCompat_Builder_Handler:Android.Support.V4.App.NotificationCompat/IExtenderInvoker, Xamarin.Android.Support.Compat\n" +
			"";
		mono.android.Runtime.register ("PixelPhoto.OneSignal.OneSignalNotification+NotificationExtenderServiceHandeler, PixelPhoto", OneSignalNotification_NotificationExtenderServiceHandeler.class, __md_methods);
	}


	public OneSignalNotification_NotificationExtenderServiceHandeler ()
	{
		super ();
		if (getClass () == OneSignalNotification_NotificationExtenderServiceHandeler.class)
			mono.android.TypeManager.Activate ("PixelPhoto.OneSignal.OneSignalNotification+NotificationExtenderServiceHandeler, PixelPhoto", "", this, new java.lang.Object[] {  });
	}


	public void onHandleIntent (android.content.Intent p0)
	{
		n_onHandleIntent (p0);
	}

	private native void n_onHandleIntent (android.content.Intent p0);


	public boolean onNotificationProcessing (com.onesignal.OSNotificationReceivedResult p0)
	{
		return n_onNotificationProcessing (p0);
	}

	private native boolean n_onNotificationProcessing (com.onesignal.OSNotificationReceivedResult p0);


	public android.support.v4.app.NotificationCompat.Builder extend (android.support.v4.app.NotificationCompat.Builder p0)
	{
		return n_extend (p0);
	}

	private native android.support.v4.app.NotificationCompat.Builder n_extend (android.support.v4.app.NotificationCompat.Builder p0);

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
