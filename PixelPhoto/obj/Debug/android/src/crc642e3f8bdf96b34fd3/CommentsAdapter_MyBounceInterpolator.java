package crc642e3f8bdf96b34fd3;


public class CommentsAdapter_MyBounceInterpolator
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.view.animation.Interpolator,
		android.animation.TimeInterpolator
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_getInterpolation:(F)F:GetGetInterpolation_FHandler:Android.Views.Animations.IInterpolatorInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n" +
			"";
		mono.android.Runtime.register ("PixelPhoto.Activities.Comment.Adapters.CommentsAdapter+MyBounceInterpolator, PixelPhoto", CommentsAdapter_MyBounceInterpolator.class, __md_methods);
	}


	public CommentsAdapter_MyBounceInterpolator ()
	{
		super ();
		if (getClass () == CommentsAdapter_MyBounceInterpolator.class)
			mono.android.TypeManager.Activate ("PixelPhoto.Activities.Comment.Adapters.CommentsAdapter+MyBounceInterpolator, PixelPhoto", "", this, new java.lang.Object[] {  });
	}

	public CommentsAdapter_MyBounceInterpolator (double p0, double p1)
	{
		super ();
		if (getClass () == CommentsAdapter_MyBounceInterpolator.class)
			mono.android.TypeManager.Activate ("PixelPhoto.Activities.Comment.Adapters.CommentsAdapter+MyBounceInterpolator, PixelPhoto", "System.Double, mscorlib:System.Double, mscorlib", this, new java.lang.Object[] { p0, p1 });
	}


	public float getInterpolation (float p0)
	{
		return n_getInterpolation (p0);
	}

	private native float n_getInterpolation (float p0);

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
