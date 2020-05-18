package crc642e3f8bdf96b34fd3;


public class ReplyAdapterViewHolder
	extends android.support.v7.widget.RecyclerView.ViewHolder
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"";
		mono.android.Runtime.register ("PixelPhoto.Activities.Comment.Adapters.ReplyAdapterViewHolder, PixelPhoto", ReplyAdapterViewHolder.class, __md_methods);
	}


	public ReplyAdapterViewHolder (android.view.View p0)
	{
		super (p0);
		if (getClass () == ReplyAdapterViewHolder.class)
			mono.android.TypeManager.Activate ("PixelPhoto.Activities.Comment.Adapters.ReplyAdapterViewHolder, PixelPhoto", "Android.Views.View, Mono.Android", this, new java.lang.Object[] { p0 });
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
