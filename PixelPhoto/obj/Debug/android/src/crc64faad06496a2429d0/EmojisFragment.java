package crc64faad06496a2429d0;


public class EmojisFragment
	extends android.support.design.widget.BottomSheetDialogFragment
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_setupDialog:(Landroid/app/Dialog;I)V:GetSetupDialog_Landroid_app_Dialog_IHandler\n" +
			"n_onStart:()V:GetOnStartHandler\n" +
			"n_onLowMemory:()V:GetOnLowMemoryHandler\n" +
			"";
		mono.android.Runtime.register ("PixelPhoto.Activities.Editor.Tools.EmojisFragment, PixelPhoto", EmojisFragment.class, __md_methods);
	}


	public EmojisFragment ()
	{
		super ();
		if (getClass () == EmojisFragment.class)
			mono.android.TypeManager.Activate ("PixelPhoto.Activities.Editor.Tools.EmojisFragment, PixelPhoto", "", this, new java.lang.Object[] {  });
	}

	public EmojisFragment (crc6438eea466e6979f9d.NiceArtEditor p0)
	{
		super ();
		if (getClass () == EmojisFragment.class)
			mono.android.TypeManager.Activate ("PixelPhoto.Activities.Editor.Tools.EmojisFragment, PixelPhoto", "PixelPhoto.NiceArt.NiceArtEditor, PixelPhoto", this, new java.lang.Object[] { p0 });
	}


	public void setupDialog (android.app.Dialog p0, int p1)
	{
		n_setupDialog (p0, p1);
	}

	private native void n_setupDialog (android.app.Dialog p0, int p1);


	public void onStart ()
	{
		n_onStart ();
	}

	private native void n_onStart ();


	public void onLowMemory ()
	{
		n_onLowMemory ();
	}

	private native void n_onLowMemory ();

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
