package crc6454d183f375b614db;


public class LangController
	extends android.content.ContextWrapper
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"";
		mono.android.Runtime.register ("PixelPhoto.Helpers.Controller.LangController, PixelPhoto", LangController.class, __md_methods);
	}


	public LangController (android.content.Context p0)
	{
		super (p0);
		if (getClass () == LangController.class)
			mono.android.TypeManager.Activate ("PixelPhoto.Helpers.Controller.LangController, PixelPhoto", "Android.Content.Context, Mono.Android", this, new java.lang.Object[] { p0 });
	}

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
