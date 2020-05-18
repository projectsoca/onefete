package crc643890d7e1c3d16eb2;


public class Holders_AdMobAdapterViewHolder
	extends android.support.v7.widget.RecyclerView.ViewHolder
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"";
		mono.android.Runtime.register ("PixelPhoto.Activities.Posts.Adapters.Holders+AdMobAdapterViewHolder, PixelPhoto", Holders_AdMobAdapterViewHolder.class, __md_methods);
	}


	public Holders_AdMobAdapterViewHolder (android.view.View p0)
	{
		super (p0);
		if (getClass () == Holders_AdMobAdapterViewHolder.class)
			mono.android.TypeManager.Activate ("PixelPhoto.Activities.Posts.Adapters.Holders+AdMobAdapterViewHolder, PixelPhoto", "Android.Views.View, Mono.Android", this, new java.lang.Object[] { p0 });
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
