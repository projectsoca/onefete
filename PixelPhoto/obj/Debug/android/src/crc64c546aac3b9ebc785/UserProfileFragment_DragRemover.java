package crc64c546aac3b9ebc785;


public class UserProfileFragment_DragRemover
	extends android.support.design.widget.AppBarLayout.Behavior.DragCallback
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_canDrag:(Landroid/support/design/widget/AppBarLayout;)Z:GetCanDrag_Landroid_support_design_widget_AppBarLayout_Handler\n" +
			"";
		mono.android.Runtime.register ("PixelPhoto.Activities.UserProfile.UserProfileFragment+DragRemover, PixelPhoto", UserProfileFragment_DragRemover.class, __md_methods);
	}


	public UserProfileFragment_DragRemover ()
	{
		super ();
		if (getClass () == UserProfileFragment_DragRemover.class)
			mono.android.TypeManager.Activate ("PixelPhoto.Activities.UserProfile.UserProfileFragment+DragRemover, PixelPhoto", "", this, new java.lang.Object[] {  });
	}


	public boolean canDrag (android.support.design.widget.AppBarLayout p0)
	{
		return n_canDrag (p0);
	}

	private native boolean n_canDrag (android.support.design.widget.AppBarLayout p0);

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
