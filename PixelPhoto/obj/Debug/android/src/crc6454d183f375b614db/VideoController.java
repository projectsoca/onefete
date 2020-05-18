package crc6454d183f375b614db;


public class VideoController
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
		mono.android.Runtime.register ("PixelPhoto.Helpers.Controller.VideoController, PixelPhoto", VideoController.class, __md_methods);
	}


	public VideoController ()
	{
		super ();
		if (getClass () == VideoController.class)
			mono.android.TypeManager.Activate ("PixelPhoto.Helpers.Controller.VideoController, PixelPhoto", "", this, new java.lang.Object[] {  });
	}

	public VideoController (android.view.View p0, java.lang.String p1)
	{
		super ();
		if (getClass () == VideoController.class)
			mono.android.TypeManager.Activate ("PixelPhoto.Helpers.Controller.VideoController, PixelPhoto", "Android.Views.View, Mono.Android:System.String, mscorlib", this, new java.lang.Object[] { p0, p1 });
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
