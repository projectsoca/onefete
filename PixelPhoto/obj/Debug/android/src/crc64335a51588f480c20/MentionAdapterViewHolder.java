package crc64335a51588f480c20;


public class MentionAdapterViewHolder
	extends android.support.v7.widget.RecyclerView.ViewHolder
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"";
		mono.android.Runtime.register ("PixelPhoto.Activities.AddPost.Adapters.MentionAdapterViewHolder, PixelPhoto", MentionAdapterViewHolder.class, __md_methods);
	}


	public MentionAdapterViewHolder (android.view.View p0)
	{
		super (p0);
		if (getClass () == MentionAdapterViewHolder.class)
			mono.android.TypeManager.Activate ("PixelPhoto.Activities.AddPost.Adapters.MentionAdapterViewHolder, PixelPhoto", "Android.Views.View, Mono.Android", this, new java.lang.Object[] { p0 });
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
