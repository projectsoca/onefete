package crc64d3dc3d50400dcde9;


public class PRecyclerView
	extends android.support.v7.widget.RecyclerView
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"";
		mono.android.Runtime.register ("PixelPhoto.Activities.Posts.Extras.PRecyclerView, PixelPhoto", PRecyclerView.class, __md_methods);
	}


	public PRecyclerView (android.content.Context p0)
	{
		super (p0);
		if (getClass () == PRecyclerView.class)
			mono.android.TypeManager.Activate ("PixelPhoto.Activities.Posts.Extras.PRecyclerView, PixelPhoto", "Android.Content.Context, Mono.Android", this, new java.lang.Object[] { p0 });
	}


	public PRecyclerView (android.content.Context p0, android.util.AttributeSet p1)
	{
		super (p0, p1);
		if (getClass () == PRecyclerView.class)
			mono.android.TypeManager.Activate ("PixelPhoto.Activities.Posts.Extras.PRecyclerView, PixelPhoto", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android", this, new java.lang.Object[] { p0, p1 });
	}


	public PRecyclerView (android.content.Context p0, android.util.AttributeSet p1, int p2)
	{
		super (p0, p1, p2);
		if (getClass () == PRecyclerView.class)
			mono.android.TypeManager.Activate ("PixelPhoto.Activities.Posts.Extras.PRecyclerView, PixelPhoto", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android:System.Int32, mscorlib", this, new java.lang.Object[] { p0, p1, p2 });
	}

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