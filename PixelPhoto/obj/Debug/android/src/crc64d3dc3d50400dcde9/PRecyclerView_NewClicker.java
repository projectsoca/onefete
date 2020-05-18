package crc64d3dc3d50400dcde9;


public class PRecyclerView_NewClicker
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.view.View.OnClickListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onClick:(Landroid/view/View;)V:GetOnClick_Landroid_view_View_Handler:Android.Views.View/IOnClickListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n" +
			"";
		mono.android.Runtime.register ("PixelPhoto.Activities.Posts.Extras.PRecyclerView+NewClicker, PixelPhoto", PRecyclerView_NewClicker.class, __md_methods);
	}


	public PRecyclerView_NewClicker ()
	{
		super ();
		if (getClass () == PRecyclerView_NewClicker.class)
			mono.android.TypeManager.Activate ("PixelPhoto.Activities.Posts.Extras.PRecyclerView+NewClicker, PixelPhoto", "", this, new java.lang.Object[] {  });
	}

	public PRecyclerView_NewClicker (android.widget.FrameLayout p0, java.lang.String p1, crc64d3dc3d50400dcde9.PRecyclerView p2)
	{
		super ();
		if (getClass () == PRecyclerView_NewClicker.class)
			mono.android.TypeManager.Activate ("PixelPhoto.Activities.Posts.Extras.PRecyclerView+NewClicker, PixelPhoto", "Android.Widget.FrameLayout, Mono.Android:System.String, mscorlib:PixelPhoto.Activities.Posts.Extras.PRecyclerView, PixelPhoto", this, new java.lang.Object[] { p0, p1, p2 });
	}


	public void onClick (android.view.View p0)
	{
		n_onClick (p0);
	}

	private native void n_onClick (android.view.View p0);

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
