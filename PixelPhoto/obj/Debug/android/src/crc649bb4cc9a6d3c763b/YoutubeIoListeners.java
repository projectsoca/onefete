package crc649bb4cc9a6d3c763b;


public class YoutubeIoListeners
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.google.android.youtube.player.YouTubePlayer.OnInitializedListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onInitializationFailure:(Lcom/google/android/youtube/player/YouTubePlayer$Provider;Lcom/google/android/youtube/player/YouTubeInitializationResult;)V:GetOnInitializationFailure_Lcom_google_android_youtube_player_YouTubePlayer_Provider_Lcom_google_android_youtube_player_YouTubeInitializationResult_Handler:Com.Google.Android.Youtube.Player.IYouTubePlayerOnInitializedListenerInvoker, Naxam.YoutubePlayerApi.Droid\n" +
			"n_onInitializationSuccess:(Lcom/google/android/youtube/player/YouTubePlayer$Provider;Lcom/google/android/youtube/player/YouTubePlayer;Z)V:GetOnInitializationSuccess_Lcom_google_android_youtube_player_YouTubePlayer_Provider_Lcom_google_android_youtube_player_YouTubePlayer_ZHandler:Com.Google.Android.Youtube.Player.IYouTubePlayerOnInitializedListenerInvoker, Naxam.YoutubePlayerApi.Droid\n" +
			"";
		mono.android.Runtime.register ("PixelPhoto.Activities.Posts.Listeners.YoutubeIoListeners, PixelPhoto", YoutubeIoListeners.class, __md_methods);
	}


	public YoutubeIoListeners ()
	{
		super ();
		if (getClass () == YoutubeIoListeners.class)
			mono.android.TypeManager.Activate ("PixelPhoto.Activities.Posts.Listeners.YoutubeIoListeners, PixelPhoto", "", this, new java.lang.Object[] {  });
	}

	public YoutubeIoListeners (android.app.Activity p0, java.lang.String p1, com.google.android.youtube.player.YouTubePlayer p2)
	{
		super ();
		if (getClass () == YoutubeIoListeners.class)
			mono.android.TypeManager.Activate ("PixelPhoto.Activities.Posts.Listeners.YoutubeIoListeners, PixelPhoto", "Android.App.Activity, Mono.Android:System.String, mscorlib:Com.Google.Android.Youtube.Player.IYouTubePlayer, Naxam.YoutubePlayerApi.Droid", this, new java.lang.Object[] { p0, p1, p2 });
	}


	public void onInitializationFailure (com.google.android.youtube.player.YouTubePlayer.Provider p0, com.google.android.youtube.player.YouTubeInitializationResult p1)
	{
		n_onInitializationFailure (p0, p1);
	}

	private native void n_onInitializationFailure (com.google.android.youtube.player.YouTubePlayer.Provider p0, com.google.android.youtube.player.YouTubeInitializationResult p1);


	public void onInitializationSuccess (com.google.android.youtube.player.YouTubePlayer.Provider p0, com.google.android.youtube.player.YouTubePlayer p1, boolean p2)
	{
		n_onInitializationSuccess (p0, p1, p2);
	}

	private native void n_onInitializationSuccess (com.google.android.youtube.player.YouTubePlayer.Provider p0, com.google.android.youtube.player.YouTubePlayer p1, boolean p2);

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
