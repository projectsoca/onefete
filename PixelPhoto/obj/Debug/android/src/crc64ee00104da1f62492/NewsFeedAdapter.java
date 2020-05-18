package crc64ee00104da1f62492;


public class NewsFeedAdapter
	extends android.support.v7.widget.RecyclerView.Adapter
	implements
		mono.android.IGCUserPeer,
		com.bumptech.glide.ListPreloader.PreloadModelProvider,
		com.google.android.gms.ads.formats.UnifiedNativeAd.OnUnifiedNativeAdLoadedListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onCreateViewHolder:(Landroid/view/ViewGroup;I)Landroid/support/v7/widget/RecyclerView$ViewHolder;:GetOnCreateViewHolder_Landroid_view_ViewGroup_IHandler\n" +
			"n_getItemCount:()I:GetGetItemCountHandler\n" +
			"n_onBindViewHolder:(Landroid/support/v7/widget/RecyclerView$ViewHolder;ILjava/util/List;)V:GetOnBindViewHolder_Landroid_support_v7_widget_RecyclerView_ViewHolder_ILjava_util_List_Handler\n" +
			"n_onBindViewHolder:(Landroid/support/v7/widget/RecyclerView$ViewHolder;I)V:GetOnBindViewHolder_Landroid_support_v7_widget_RecyclerView_ViewHolder_IHandler\n" +
			"n_getItemId:(I)J:GetGetItemId_IHandler\n" +
			"n_getItemViewType:(I)I:GetGetItemViewType_IHandler\n" +
			"n_getPreloadItems:(I)Ljava/util/List;:GetGetPreloadItems_IHandler:Bumptech.Glide.ListPreloader/IPreloadModelProviderInvoker, Xamarin.Android.Glide\n" +
			"n_getPreloadRequestBuilder:(Ljava/lang/Object;)Lcom/bumptech/glide/RequestBuilder;:GetGetPreloadRequestBuilder_Ljava_lang_Object_Handler:Bumptech.Glide.ListPreloader/IPreloadModelProviderInvoker, Xamarin.Android.Glide\n" +
			"n_onUnifiedNativeAdLoaded:(Lcom/google/android/gms/ads/formats/UnifiedNativeAd;)V:GetOnUnifiedNativeAdLoaded_Lcom_google_android_gms_ads_formats_UnifiedNativeAd_Handler:Android.Gms.Ads.Formats.UnifiedNativeAd/IOnUnifiedNativeAdLoadedListenerInvoker, Xamarin.GooglePlayServices.Ads.Lite\n" +
			"";
		mono.android.Runtime.register ("PixelPhoto.Activities.Tabbes.Adapters.NewsFeedAdapter, PixelPhoto", NewsFeedAdapter.class, __md_methods);
	}


	public NewsFeedAdapter ()
	{
		super ();
		if (getClass () == NewsFeedAdapter.class)
			mono.android.TypeManager.Activate ("PixelPhoto.Activities.Tabbes.Adapters.NewsFeedAdapter, PixelPhoto", "", this, new java.lang.Object[] {  });
	}

	public NewsFeedAdapter (android.app.Activity p0, crc64d3dc3d50400dcde9.PRecyclerView p1)
	{
		super ();
		if (getClass () == NewsFeedAdapter.class)
			mono.android.TypeManager.Activate ("PixelPhoto.Activities.Tabbes.Adapters.NewsFeedAdapter, PixelPhoto", "Android.App.Activity, Mono.Android:PixelPhoto.Activities.Posts.Extras.PRecyclerView, PixelPhoto", this, new java.lang.Object[] { p0, p1 });
	}


	public android.support.v7.widget.RecyclerView.ViewHolder onCreateViewHolder (android.view.ViewGroup p0, int p1)
	{
		return n_onCreateViewHolder (p0, p1);
	}

	private native android.support.v7.widget.RecyclerView.ViewHolder n_onCreateViewHolder (android.view.ViewGroup p0, int p1);


	public int getItemCount ()
	{
		return n_getItemCount ();
	}

	private native int n_getItemCount ();


	public void onBindViewHolder (android.support.v7.widget.RecyclerView.ViewHolder p0, int p1, java.util.List p2)
	{
		n_onBindViewHolder (p0, p1, p2);
	}

	private native void n_onBindViewHolder (android.support.v7.widget.RecyclerView.ViewHolder p0, int p1, java.util.List p2);


	public void onBindViewHolder (android.support.v7.widget.RecyclerView.ViewHolder p0, int p1)
	{
		n_onBindViewHolder (p0, p1);
	}

	private native void n_onBindViewHolder (android.support.v7.widget.RecyclerView.ViewHolder p0, int p1);


	public long getItemId (int p0)
	{
		return n_getItemId (p0);
	}

	private native long n_getItemId (int p0);


	public int getItemViewType (int p0)
	{
		return n_getItemViewType (p0);
	}

	private native int n_getItemViewType (int p0);


	public java.util.List getPreloadItems (int p0)
	{
		return n_getPreloadItems (p0);
	}

	private native java.util.List n_getPreloadItems (int p0);


	public com.bumptech.glide.RequestBuilder getPreloadRequestBuilder (java.lang.Object p0)
	{
		return n_getPreloadRequestBuilder (p0);
	}

	private native com.bumptech.glide.RequestBuilder n_getPreloadRequestBuilder (java.lang.Object p0);


	public void onUnifiedNativeAdLoaded (com.google.android.gms.ads.formats.UnifiedNativeAd p0)
	{
		n_onUnifiedNativeAdLoaded (p0);
	}

	private native void n_onUnifiedNativeAdLoaded (com.google.android.gms.ads.formats.UnifiedNativeAd p0);

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
