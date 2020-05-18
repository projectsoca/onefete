package crc64f7686dee5924dd97;


public class ServiceResultReceiver
	extends android.os.ResultReceiver
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onReceiveResult:(ILandroid/os/Bundle;)V:GetOnReceiveResult_ILandroid_os_Bundle_Handler\n" +
			"";
		mono.android.Runtime.register ("PixelPhoto.Activities.Chat.Service.ServiceResultReceiver, PixelPhoto", ServiceResultReceiver.class, __md_methods);
	}


	public ServiceResultReceiver (android.os.Handler p0)
	{
		super (p0);
		if (getClass () == ServiceResultReceiver.class)
			mono.android.TypeManager.Activate ("PixelPhoto.Activities.Chat.Service.ServiceResultReceiver, PixelPhoto", "Android.OS.Handler, Mono.Android", this, new java.lang.Object[] { p0 });
	}


	public void onReceiveResult (int p0, android.os.Bundle p1)
	{
		n_onReceiveResult (p0, p1);
	}

	private native void n_onReceiveResult (int p0, android.os.Bundle p1);

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
