package crc6454d183f375b614db;


public class VideoController_AdMediaSourceFactory
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.google.android.exoplayer2.source.ads.AdsMediaSource.MediaSourceFactory
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_createMediaSource:(Landroid/net/Uri;)Lcom/google/android/exoplayer2/source/MediaSource;:GetCreateMediaSource_Landroid_net_Uri_Handler:Com.Google.Android.Exoplayer2.Source.Ads.AdsMediaSource/IMediaSourceFactoryInvoker, ExoPlayer.Core\n" +
			"n_getSupportedTypes:()[I:GetGetSupportedTypesHandler:Com.Google.Android.Exoplayer2.Source.Ads.AdsMediaSource/IMediaSourceFactoryInvoker, ExoPlayer.Core\n" +
			"";
		mono.android.Runtime.register ("PixelPhoto.Helpers.Controller.VideoController+AdMediaSourceFactory, PixelPhoto", VideoController_AdMediaSourceFactory.class, __md_methods);
	}


	public VideoController_AdMediaSourceFactory ()
	{
		super ();
		if (getClass () == VideoController_AdMediaSourceFactory.class)
			mono.android.TypeManager.Activate ("PixelPhoto.Helpers.Controller.VideoController+AdMediaSourceFactory, PixelPhoto", "", this, new java.lang.Object[] {  });
	}

	public VideoController_AdMediaSourceFactory (crc6454d183f375b614db.VideoController p0)
	{
		super ();
		if (getClass () == VideoController_AdMediaSourceFactory.class)
			mono.android.TypeManager.Activate ("PixelPhoto.Helpers.Controller.VideoController+AdMediaSourceFactory, PixelPhoto", "PixelPhoto.Helpers.Controller.VideoController, PixelPhoto", this, new java.lang.Object[] { p0 });
	}


	public com.google.android.exoplayer2.source.MediaSource createMediaSource (android.net.Uri p0)
	{
		return n_createMediaSource (p0);
	}

	private native com.google.android.exoplayer2.source.MediaSource n_createMediaSource (android.net.Uri p0);


	public int[] getSupportedTypes ()
	{
		return n_getSupportedTypes ();
	}

	private native int[] n_getSupportedTypes ();

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
