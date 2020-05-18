package crc64fcce8b45f9dbe865;


public class MessagesBoxActivity_XamarinRecyclerViewOnScrollListener
	extends android.support.v7.widget.RecyclerView.OnScrollListener
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onScrolled:(Landroid/support/v7/widget/RecyclerView;II)V:GetOnScrolled_Landroid_support_v7_widget_RecyclerView_IIHandler\n" +
			"";
		mono.android.Runtime.register ("PixelPhoto.Activities.Chat.MessagesBoxActivity+XamarinRecyclerViewOnScrollListener, PixelPhoto", MessagesBoxActivity_XamarinRecyclerViewOnScrollListener.class, __md_methods);
	}


	public MessagesBoxActivity_XamarinRecyclerViewOnScrollListener ()
	{
		super ();
		if (getClass () == MessagesBoxActivity_XamarinRecyclerViewOnScrollListener.class)
			mono.android.TypeManager.Activate ("PixelPhoto.Activities.Chat.MessagesBoxActivity+XamarinRecyclerViewOnScrollListener, PixelPhoto", "", this, new java.lang.Object[] {  });
	}

	public MessagesBoxActivity_XamarinRecyclerViewOnScrollListener (android.support.v7.widget.LinearLayoutManager p0, android.support.v4.widget.SwipeRefreshLayout p1)
	{
		super ();
		if (getClass () == MessagesBoxActivity_XamarinRecyclerViewOnScrollListener.class)
			mono.android.TypeManager.Activate ("PixelPhoto.Activities.Chat.MessagesBoxActivity+XamarinRecyclerViewOnScrollListener, PixelPhoto", "Android.Support.V7.Widget.LinearLayoutManager, Xamarin.Android.Support.v7.RecyclerView:Android.Support.V4.Widget.SwipeRefreshLayout, Xamarin.Android.Support.SwipeRefreshLayout", this, new java.lang.Object[] { p0, p1 });
	}


	public void onScrolled (android.support.v7.widget.RecyclerView p0, int p1, int p2)
	{
		n_onScrolled (p0, p1, p2);
	}

	private native void n_onScrolled (android.support.v7.widget.RecyclerView p0, int p1, int p2);

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
