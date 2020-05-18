package crc6408b91f01eb12b448;


public class PreCachingLayoutManager
	extends android.support.v7.widget.LinearLayoutManager
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_collectAdjacentPrefetchPositions:(IILandroid/support/v7/widget/RecyclerView$State;Landroid/support/v7/widget/RecyclerView$LayoutManager$LayoutPrefetchRegistry;)V:GetCollectAdjacentPrefetchPositions_IILandroid_support_v7_widget_RecyclerView_State_Landroid_support_v7_widget_RecyclerView_LayoutManager_LayoutPrefetchRegistry_Handler\n" +
			"";
		mono.android.Runtime.register ("PixelPhoto.Helpers.CacheLoaders.PreCachingLayoutManager, PixelPhoto", PreCachingLayoutManager.class, __md_methods);
	}


	public PreCachingLayoutManager (android.content.Context p0)
	{
		super (p0);
		if (getClass () == PreCachingLayoutManager.class)
			mono.android.TypeManager.Activate ("PixelPhoto.Helpers.CacheLoaders.PreCachingLayoutManager, PixelPhoto", "Android.Content.Context, Mono.Android", this, new java.lang.Object[] { p0 });
	}


	public PreCachingLayoutManager (android.content.Context p0, android.util.AttributeSet p1, int p2, int p3)
	{
		super (p0, p1, p2, p3);
		if (getClass () == PreCachingLayoutManager.class)
			mono.android.TypeManager.Activate ("PixelPhoto.Helpers.CacheLoaders.PreCachingLayoutManager, PixelPhoto", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android:System.Int32, mscorlib:System.Int32, mscorlib", this, new java.lang.Object[] { p0, p1, p2, p3 });
	}


	public PreCachingLayoutManager (android.content.Context p0, int p1, boolean p2)
	{
		super (p0, p1, p2);
		if (getClass () == PreCachingLayoutManager.class)
			mono.android.TypeManager.Activate ("PixelPhoto.Helpers.CacheLoaders.PreCachingLayoutManager, PixelPhoto", "Android.Content.Context, Mono.Android:System.Int32, mscorlib:System.Boolean, mscorlib", this, new java.lang.Object[] { p0, p1, p2 });
	}


	public void collectAdjacentPrefetchPositions (int p0, int p1, android.support.v7.widget.RecyclerView.State p2, android.support.v7.widget.RecyclerView.LayoutManager.LayoutPrefetchRegistry p3)
	{
		n_collectAdjacentPrefetchPositions (p0, p1, p2, p3);
	}

	private native void n_collectAdjacentPrefetchPositions (int p0, int p1, android.support.v7.widget.RecyclerView.State p2, android.support.v7.widget.RecyclerView.LayoutManager.LayoutPrefetchRegistry p3);

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
