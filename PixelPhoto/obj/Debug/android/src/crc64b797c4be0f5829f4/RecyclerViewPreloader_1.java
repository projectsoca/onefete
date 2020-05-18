package crc64b797c4be0f5829f4;


public class RecyclerViewPreloader_1
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
		mono.android.Runtime.register ("Bumptech.Glide.Integration.RecyclerView.RecyclerViewPreloader`1, Bumptech.Glide.Integration.RecyclerView", RecyclerViewPreloader_1.class, __md_methods);
	}


	public RecyclerViewPreloader_1 ()
	{
		super ();
		if (getClass () == RecyclerViewPreloader_1.class)
			mono.android.TypeManager.Activate ("Bumptech.Glide.Integration.RecyclerView.RecyclerViewPreloader`1, Bumptech.Glide.Integration.RecyclerView", "", this, new java.lang.Object[] {  });
	}

	public RecyclerViewPreloader_1 (com.bumptech.glide.RequestManager p0, com.bumptech.glide.ListPreloader.PreloadModelProvider p1, com.bumptech.glide.ListPreloader.PreloadSizeProvider p2, int p3)
	{
		super ();
		if (getClass () == RecyclerViewPreloader_1.class)
			mono.android.TypeManager.Activate ("Bumptech.Glide.Integration.RecyclerView.RecyclerViewPreloader`1, Bumptech.Glide.Integration.RecyclerView", "Bumptech.Glide.RequestManager, Xamarin.Android.Glide:Bumptech.Glide.ListPreloader+IPreloadModelProvider, Xamarin.Android.Glide:Bumptech.Glide.ListPreloader+IPreloadSizeProvider, Xamarin.Android.Glide:System.Int32, mscorlib", this, new java.lang.Object[] { p0, p1, p2, p3 });
	}

	public RecyclerViewPreloader_1 (android.app.Activity p0, com.bumptech.glide.ListPreloader.PreloadModelProvider p1, com.bumptech.glide.ListPreloader.PreloadSizeProvider p2, int p3)
	{
		super ();
		if (getClass () == RecyclerViewPreloader_1.class)
			mono.android.TypeManager.Activate ("Bumptech.Glide.Integration.RecyclerView.RecyclerViewPreloader`1, Bumptech.Glide.Integration.RecyclerView", "Android.App.Activity, Mono.Android:Bumptech.Glide.ListPreloader+IPreloadModelProvider, Xamarin.Android.Glide:Bumptech.Glide.ListPreloader+IPreloadSizeProvider, Xamarin.Android.Glide:System.Int32, mscorlib", this, new java.lang.Object[] { p0, p1, p2, p3 });
	}

	public RecyclerViewPreloader_1 (android.support.v4.app.FragmentActivity p0, com.bumptech.glide.ListPreloader.PreloadModelProvider p1, com.bumptech.glide.ListPreloader.PreloadSizeProvider p2, int p3)
	{
		super ();
		if (getClass () == RecyclerViewPreloader_1.class)
			mono.android.TypeManager.Activate ("Bumptech.Glide.Integration.RecyclerView.RecyclerViewPreloader`1, Bumptech.Glide.Integration.RecyclerView", "Android.Support.V4.App.FragmentActivity, Xamarin.Android.Support.Fragment:Bumptech.Glide.ListPreloader+IPreloadModelProvider, Xamarin.Android.Glide:Bumptech.Glide.ListPreloader+IPreloadSizeProvider, Xamarin.Android.Glide:System.Int32, mscorlib", this, new java.lang.Object[] { p0, p1, p2, p3 });
	}

	public RecyclerViewPreloader_1 (android.app.Fragment p0, com.bumptech.glide.ListPreloader.PreloadModelProvider p1, com.bumptech.glide.ListPreloader.PreloadSizeProvider p2, int p3)
	{
		super ();
		if (getClass () == RecyclerViewPreloader_1.class)
			mono.android.TypeManager.Activate ("Bumptech.Glide.Integration.RecyclerView.RecyclerViewPreloader`1, Bumptech.Glide.Integration.RecyclerView", "Android.App.Fragment, Mono.Android:Bumptech.Glide.ListPreloader+IPreloadModelProvider, Xamarin.Android.Glide:Bumptech.Glide.ListPreloader+IPreloadSizeProvider, Xamarin.Android.Glide:System.Int32, mscorlib", this, new java.lang.Object[] { p0, p1, p2, p3 });
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
