package crc64ee00104da1f62492;


public class NotificationsAdapterViewHolder
	extends android.support.v7.widget.RecyclerView.ViewHolder
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"";
		mono.android.Runtime.register ("PixelPhoto.Activities.Tabbes.Adapters.NotificationsAdapterViewHolder, PixelPhoto", NotificationsAdapterViewHolder.class, __md_methods);
	}


	public NotificationsAdapterViewHolder (android.view.View p0)
	{
		super (p0);
		if (getClass () == NotificationsAdapterViewHolder.class)
			mono.android.TypeManager.Activate ("PixelPhoto.Activities.Tabbes.Adapters.NotificationsAdapterViewHolder, PixelPhoto", "Android.Views.View, Mono.Android", this, new java.lang.Object[] { p0 });
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
