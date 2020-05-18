package crc64f7686dee5924dd97;


public class ApiPostUpdaterHelper
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		java.lang.Runnable
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_run:()V:GetRunHandler:Java.Lang.IRunnableInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n" +
			"";
		mono.android.Runtime.register ("PixelPhoto.Activities.Chat.Service.ApiPostUpdaterHelper, PixelPhoto", ApiPostUpdaterHelper.class, __md_methods);
	}


	public ApiPostUpdaterHelper ()
	{
		super ();
		if (getClass () == ApiPostUpdaterHelper.class)
			mono.android.TypeManager.Activate ("PixelPhoto.Activities.Chat.Service.ApiPostUpdaterHelper, PixelPhoto", "", this, new java.lang.Object[] {  });
	}

	public ApiPostUpdaterHelper (android.content.Context p0, android.os.Handler p1, android.os.ResultReceiver p2)
	{
		super ();
		if (getClass () == ApiPostUpdaterHelper.class)
			mono.android.TypeManager.Activate ("PixelPhoto.Activities.Chat.Service.ApiPostUpdaterHelper, PixelPhoto", "Android.Content.Context, Mono.Android:Android.OS.Handler, Mono.Android:Android.OS.ResultReceiver, Mono.Android", this, new java.lang.Object[] { p0, p1, p2 });
	}


	public void run ()
	{
		n_run ();
	}

	private native void n_run ();

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
