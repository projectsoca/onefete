package me.relex.circleindicator;


public class CircleIndicator_ReverseInterpolator
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
		mono.android.Runtime.register ("Me.Relex.CircleIndicator+ReverseInterpolator, CircleIndicator", CircleIndicator_ReverseInterpolator.class, __md_methods);
	}


	public CircleIndicator_ReverseInterpolator ()
	{
		super ();
		if (getClass () == CircleIndicator_ReverseInterpolator.class)
			mono.android.TypeManager.Activate ("Me.Relex.CircleIndicator+ReverseInterpolator, CircleIndicator", "", this, new java.lang.Object[] {  });
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
