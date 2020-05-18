package crc64d3dc3d50400dcde9;


public class PRecyclerView_ChildAttachStateChangeListener
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.support.v7.widget.RecyclerView.OnChildAttachStateChangeListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onChildViewAttachedToWindow:(Landroid/view/View;)V:GetOnChildViewAttachedToWindow_Landroid_view_View_Handler:Android.Support.V7.Widget.RecyclerView/IOnChildAttachStateChangeListenerInvoker, Xamarin.Android.Support.v7.RecyclerView\n" +
			"n_onChildViewDetachedFromWindow:(Landroid/view/View;)V:GetOnChildViewDetachedFromWindow_Landroid_view_View_Handler:Android.Support.V7.Widget.RecyclerView/IOnChildAttachStateChangeListenerInvoker, Xamarin.Android.Support.v7.RecyclerView\n" +
			"";
		mono.android.Runtime.register ("PixelPhoto.Activities.Posts.Extras.PRecyclerView+ChildAttachStateChangeListener, PixelPhoto", PRecyclerView_ChildAttachStateChangeListener.class, __md_methods);
	}


	public PRecyclerView_ChildAttachStateChangeListener ()
	{
		super ();
		if (getClass () == PRecyclerView_ChildAttachStateChangeListener.class)
			mono.android.TypeManager.Activate ("PixelPhoto.Activities.Posts.Extras.PRecyclerView+ChildAttachStateChangeListener, PixelPhoto", "", this, new java.lang.Object[] {  });
	}

	public PRecyclerView_ChildAttachStateChangeListener (crc64d3dc3d50400dcde9.PRecyclerView p0)
	{
		super ();
		if (getClass () == PRecyclerView_ChildAttachStateChangeListener.class)
			mono.android.TypeManager.Activate ("PixelPhoto.Activities.Posts.Extras.PRecyclerView+ChildAttachStateChangeListener, PixelPhoto", "PixelPhoto.Activities.Posts.Extras.PRecyclerView, PixelPhoto", this, new java.lang.Object[] { p0 });
	}


	public void onChildViewAttachedToWindow (android.view.View p0)
	{
		n_onChildViewAttachedToWindow (p0);
	}

	private native void n_onChildViewAttachedToWindow (android.view.View p0);


	public void onChildViewDetachedFromWindow (android.view.View p0)
	{
		n_onChildViewDetachedFromWindow (p0);
	}

	private native void n_onChildViewDetachedFromWindow (android.view.View p0);

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
