package crc640e677e11525c94a8;


public class LastActivitiesAdapterViewHolder
	extends android.support.v7.widget.RecyclerView.ViewHolder
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"";
		mono.android.Runtime.register ("PixelPhoto.Activities.TikProfile.Adapters.LastActivitiesAdapterViewHolder, PixelPhoto", LastActivitiesAdapterViewHolder.class, __md_methods);
	}


	public LastActivitiesAdapterViewHolder (android.view.View p0)
	{
		super (p0);
		if (getClass () == LastActivitiesAdapterViewHolder.class)
			mono.android.TypeManager.Activate ("PixelPhoto.Activities.TikProfile.Adapters.LastActivitiesAdapterViewHolder, PixelPhoto", "Android.Views.View, Mono.Android", this, new java.lang.Object[] { p0 });
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
