package crc6426a9e2bd1c5b2325;


public class Methods_LocalNotification_BackgroundRunner
	extends mono.android.app.IntentService
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onHandleIntent:(Landroid/content/Intent;)V:GetOnHandleIntent_Landroid_content_Intent_Handler\n" +
			"";
		mono.android.Runtime.register ("PixelPhoto.Helpers.Utils.Methods+LocalNotification+BackgroundRunner, PixelPhoto", Methods_LocalNotification_BackgroundRunner.class, __md_methods);
	}


	public Methods_LocalNotification_BackgroundRunner (java.lang.String p0)
	{
		super (p0);
		if (getClass () == Methods_LocalNotification_BackgroundRunner.class)
			mono.android.TypeManager.Activate ("PixelPhoto.Helpers.Utils.Methods+LocalNotification+BackgroundRunner, PixelPhoto", "System.String, mscorlib", this, new java.lang.Object[] { p0 });
	}


	public Methods_LocalNotification_BackgroundRunner ()
	{
		super ();
		if (getClass () == Methods_LocalNotification_BackgroundRunner.class)
			mono.android.TypeManager.Activate ("PixelPhoto.Helpers.Utils.Methods+LocalNotification+BackgroundRunner, PixelPhoto", "", this, new java.lang.Object[] {  });
	}


	public void onHandleIntent (android.content.Intent p0)
	{
		n_onHandleIntent (p0);
	}

	private native void n_onHandleIntent (android.content.Intent p0);

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
