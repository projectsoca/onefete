package crc64dcad9b0f02e0063c;


public class EditingToolsAdapterViewHolder
	extends android.support.v7.widget.RecyclerView.ViewHolder
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"";
		mono.android.Runtime.register ("PixelPhoto.Activities.Editor.Adapters.EditingToolsAdapterViewHolder, PixelPhoto", EditingToolsAdapterViewHolder.class, __md_methods);
	}


	public EditingToolsAdapterViewHolder (android.view.View p0)
	{
		super (p0);
		if (getClass () == EditingToolsAdapterViewHolder.class)
			mono.android.TypeManager.Activate ("PixelPhoto.Activities.Editor.Adapters.EditingToolsAdapterViewHolder, PixelPhoto", "Android.Views.View, Mono.Android", this, new java.lang.Object[] { p0 });
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
