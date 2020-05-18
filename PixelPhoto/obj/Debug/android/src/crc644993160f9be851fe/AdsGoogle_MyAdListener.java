package crc644993160f9be851fe;


public class AdsGoogle_MyAdListener
	extends com.google.android.gms.ads.AdListener
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onAdFailedToLoad:(I)V:GetOnAdFailedToLoad_IHandler\n" +
			"n_onAdLoaded:()V:GetOnAdLoadedHandler\n" +
			"";
		mono.android.Runtime.register ("PixelPhoto.Helpers.Ads.AdsGoogle+MyAdListener, PixelPhoto", AdsGoogle_MyAdListener.class, __md_methods);
	}


	public AdsGoogle_MyAdListener ()
	{
		super ();
		if (getClass () == AdsGoogle_MyAdListener.class)
			mono.android.TypeManager.Activate ("PixelPhoto.Helpers.Ads.AdsGoogle+MyAdListener, PixelPhoto", "", this, new java.lang.Object[] {  });
	}

	public AdsGoogle_MyAdListener (com.google.android.gms.ads.AdView p0, android.support.v7.widget.RecyclerView p1)
	{
		super ();
		if (getClass () == AdsGoogle_MyAdListener.class)
			mono.android.TypeManager.Activate ("PixelPhoto.Helpers.Ads.AdsGoogle+MyAdListener, PixelPhoto", "Android.Gms.Ads.AdView, Xamarin.GooglePlayServices.Ads.Lite:Android.Support.V7.Widget.RecyclerView, Xamarin.Android.Support.v7.RecyclerView", this, new java.lang.Object[] { p0, p1 });
	}


	public void onAdFailedToLoad (int p0)
	{
		n_onAdFailedToLoad (p0);
	}

	private native void n_onAdFailedToLoad (int p0);


	public void onAdLoaded ()
	{
		n_onAdLoaded ();
	}

	private native void n_onAdLoaded ();

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
