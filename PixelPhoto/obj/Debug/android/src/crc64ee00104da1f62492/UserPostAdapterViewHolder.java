package crc64ee00104da1f62492;


public class UserPostAdapterViewHolder
	extends android.support.v7.widget.RecyclerView.ViewHolder
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"";
		mono.android.Runtime.register ("PixelPhoto.Activities.Tabbes.Adapters.UserPostAdapterViewHolder, PixelPhoto", UserPostAdapterViewHolder.class, __md_methods);
	}


	public UserPostAdapterViewHolder (android.view.View p0)
	{
		super (p0);
		if (getClass () == UserPostAdapterViewHolder.class)
			mono.android.TypeManager.Activate ("PixelPhoto.Activities.Tabbes.Adapters.UserPostAdapterViewHolder, PixelPhoto", "Android.Views.View, Mono.Android", this, new java.lang.Object[] { p0 });
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