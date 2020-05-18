package crc6426a9e2bd1c5b2325;


public class GridSpacingItemDecoration
	extends android.support.v7.widget.RecyclerView.ItemDecoration
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_getItemOffsets:(Landroid/graphics/Rect;Landroid/view/View;Landroid/support/v7/widget/RecyclerView;Landroid/support/v7/widget/RecyclerView$State;)V:GetGetItemOffsets_Landroid_graphics_Rect_Landroid_view_View_Landroid_support_v7_widget_RecyclerView_Landroid_support_v7_widget_RecyclerView_State_Handler\n" +
			"";
		mono.android.Runtime.register ("PixelPhoto.Helpers.Utils.GridSpacingItemDecoration, PixelPhoto", GridSpacingItemDecoration.class, __md_methods);
	}


	public GridSpacingItemDecoration ()
	{
		super ();
		if (getClass () == GridSpacingItemDecoration.class)
			mono.android.TypeManager.Activate ("PixelPhoto.Helpers.Utils.GridSpacingItemDecoration, PixelPhoto", "", this, new java.lang.Object[] {  });
	}

	public GridSpacingItemDecoration (int p0, int p1, boolean p2)
	{
		super ();
		if (getClass () == GridSpacingItemDecoration.class)
			mono.android.TypeManager.Activate ("PixelPhoto.Helpers.Utils.GridSpacingItemDecoration, PixelPhoto", "System.Int32, mscorlib:System.Int32, mscorlib:System.Boolean, mscorlib", this, new java.lang.Object[] { p0, p1, p2 });
	}


	public void getItemOffsets (android.graphics.Rect p0, android.view.View p1, android.support.v7.widget.RecyclerView p2, android.support.v7.widget.RecyclerView.State p3)
	{
		n_getItemOffsets (p0, p1, p2, p3);
	}

	private native void n_getItemOffsets (android.graphics.Rect p0, android.view.View p1, android.support.v7.widget.RecyclerView p2, android.support.v7.widget.RecyclerView.State p3);

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
