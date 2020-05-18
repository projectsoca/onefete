package crc64dcad9b0f02e0063c;


public class FontTypeFaceAdapterViewHolder
	extends android.support.v7.widget.RecyclerView.ViewHolder
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"";
		mono.android.Runtime.register ("PixelPhoto.Activities.Editor.Adapters.FontTypeFaceAdapterViewHolder, PixelPhoto", FontTypeFaceAdapterViewHolder.class, __md_methods);
	}


	public FontTypeFaceAdapterViewHolder (android.view.View p0)
	{
		super (p0);
		if (getClass () == FontTypeFaceAdapterViewHolder.class)
			mono.android.TypeManager.Activate ("PixelPhoto.Activities.Editor.Adapters.FontTypeFaceAdapterViewHolder, PixelPhoto", "Android.Views.View, Mono.Android", this, new java.lang.Object[] { p0 });
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
