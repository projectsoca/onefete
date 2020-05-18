package crc64faad06496a2429d0;


public class TextEditorFragment
	extends android.support.v4.app.DialogFragment
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onCreateView:(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;:GetOnCreateView_Landroid_view_LayoutInflater_Landroid_view_ViewGroup_Landroid_os_Bundle_Handler\n" +
			"n_onViewCreated:(Landroid/view/View;Landroid/os/Bundle;)V:GetOnViewCreated_Landroid_view_View_Landroid_os_Bundle_Handler\n" +
			"n_onStart:()V:GetOnStartHandler\n" +
			"n_onLowMemory:()V:GetOnLowMemoryHandler\n" +
			"";
		mono.android.Runtime.register ("PixelPhoto.Activities.Editor.Tools.TextEditorFragment, PixelPhoto", TextEditorFragment.class, __md_methods);
	}


	public TextEditorFragment ()
	{
		super ();
		if (getClass () == TextEditorFragment.class)
			mono.android.TypeManager.Activate ("PixelPhoto.Activities.Editor.Tools.TextEditorFragment, PixelPhoto", "", this, new java.lang.Object[] {  });
	}

	public TextEditorFragment (crc642e113c14c859c466.EditImageActivity p0, crc642e113c14c859c466.EditColorActivity p1)
	{
		super ();
		if (getClass () == TextEditorFragment.class)
			mono.android.TypeManager.Activate ("PixelPhoto.Activities.Editor.Tools.TextEditorFragment, PixelPhoto", "PixelPhoto.Activities.Editor.EditImageActivity, PixelPhoto:PixelPhoto.Activities.Editor.EditColorActivity, PixelPhoto", this, new java.lang.Object[] { p0, p1 });
	}


	public android.view.View onCreateView (android.view.LayoutInflater p0, android.view.ViewGroup p1, android.os.Bundle p2)
	{
		return n_onCreateView (p0, p1, p2);
	}

	private native android.view.View n_onCreateView (android.view.LayoutInflater p0, android.view.ViewGroup p1, android.os.Bundle p2);


	public void onViewCreated (android.view.View p0, android.os.Bundle p1)
	{
		n_onViewCreated (p0, p1);
	}

	private native void n_onViewCreated (android.view.View p0, android.os.Bundle p1);


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
