package crc645ae0f6458d76f053;


public class NewsFeedFragment_ApiPostUpdaterHelper
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
		mono.android.Runtime.register ("PixelPhoto.Activities.Tabbes.Fragments.NewsFeedFragment+ApiPostUpdaterHelper, PixelPhoto", NewsFeedFragment_ApiPostUpdaterHelper.class, __md_methods);
	}


	public NewsFeedFragment_ApiPostUpdaterHelper ()
	{
		super ();
		if (getClass () == NewsFeedFragment_ApiPostUpdaterHelper.class)
			mono.android.TypeManager.Activate ("PixelPhoto.Activities.Tabbes.Fragments.NewsFeedFragment+ApiPostUpdaterHelper, PixelPhoto", "", this, new java.lang.Object[] {  });
	}

	public NewsFeedFragment_ApiPostUpdaterHelper (crc6456149e0b144569aa.HomeActivity p0, crc64d3dc3d50400dcde9.PRecyclerView p1, android.os.Handler p2)
	{
		super ();
		if (getClass () == NewsFeedFragment_ApiPostUpdaterHelper.class)
			mono.android.TypeManager.Activate ("PixelPhoto.Activities.Tabbes.Fragments.NewsFeedFragment+ApiPostUpdaterHelper, PixelPhoto", "PixelPhoto.Activities.Tabbes.HomeActivity, PixelPhoto:PixelPhoto.Activities.Posts.Extras.PRecyclerView, PixelPhoto:Android.OS.Handler, Mono.Android", this, new java.lang.Object[] { p0, p1, p2 });
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
