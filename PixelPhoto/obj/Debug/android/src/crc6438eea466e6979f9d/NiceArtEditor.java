package crc6438eea466e6979f9d;


public class NiceArtEditor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"";
		mono.android.Runtime.register ("PixelPhoto.NiceArt.NiceArtEditor, PixelPhoto", NiceArtEditor.class, __md_methods);
	}


	public NiceArtEditor ()
	{
		super ();
		if (getClass () == NiceArtEditor.class)
			mono.android.TypeManager.Activate ("PixelPhoto.NiceArt.NiceArtEditor, PixelPhoto", "", this, new java.lang.Object[] {  });
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
