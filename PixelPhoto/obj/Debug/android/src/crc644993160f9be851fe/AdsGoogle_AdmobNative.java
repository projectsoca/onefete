package crc644993160f9be851fe;


public class AdsGoogle_AdmobNative
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.google.android.gms.ads.formats.UnifiedNativeAd.OnUnifiedNativeAdLoadedListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onUnifiedNativeAdLoaded:(Lcom/google/android/gms/ads/formats/UnifiedNativeAd;)V:GetOnUnifiedNativeAdLoaded_Lcom_google_android_gms_ads_formats_UnifiedNativeAd_Handler:Android.Gms.Ads.Formats.UnifiedNativeAd/IOnUnifiedNativeAdLoadedListenerInvoker, Xamarin.GooglePlayServices.Ads.Lite\n" +
			"";
		mono.android.Runtime.register ("PixelPhoto.Helpers.Ads.AdsGoogle+AdmobNative, PixelPhoto", AdsGoogle_AdmobNative.class, __md_methods);
	}


	public AdsGoogle_AdmobNative ()
	{
		super ();
		if (getClass () == AdsGoogle_AdmobNative.class)
			mono.android.TypeManager.Activate ("PixelPhoto.Helpers.Ads.AdsGoogle+AdmobNative, PixelPhoto", "", this, new java.lang.Object[] {  });
	}


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
