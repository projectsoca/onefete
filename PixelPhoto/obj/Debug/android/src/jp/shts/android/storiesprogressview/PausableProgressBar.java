package jp.shts.android.storiesprogressview;


public class PausableProgressBar
	extends android.widget.FrameLayout
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"";
		mono.android.Runtime.register ("JP.ShTs.StoriesProgressView.PausableProgressBar, StoriesProgressView", PausableProgressBar.class, __md_methods);
	}


	public PausableProgressBar (android.content.Context p0)
	{
		super (p0);
		if (getClass () == PausableProgressBar.class)
			mono.android.TypeManager.Activate ("JP.ShTs.StoriesProgressView.PausableProgressBar, StoriesProgressView", "Android.Content.Context, Mono.Android", this, new java.lang.Object[] { p0 });
	}


	public PausableProgressBar (android.content.Context p0, android.util.AttributeSet p1)
	{
		super (p0, p1);
		if (getClass () == PausableProgressBar.class)
			mono.android.TypeManager.Activate ("JP.ShTs.StoriesProgressView.PausableProgressBar, StoriesProgressView", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android", this, new java.lang.Object[] { p0, p1 });
	}


	public PausableProgressBar (android.content.Context p0, android.util.AttributeSet p1, int p2)
	{
		super (p0, p1, p2);
		if (getClass () == PausableProgressBar.class)
			mono.android.TypeManager.Activate ("JP.ShTs.StoriesProgressView.PausableProgressBar, StoriesProgressView", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android:System.Int32, mscorlib", this, new java.lang.Object[] { p0, p1, p2 });
	}


	public PausableProgressBar (android.content.Context p0, android.util.AttributeSet p1, int p2, int p3)
	{
		super (p0, p1, p2, p3);
		if (getClass () == PausableProgressBar.class)
			mono.android.TypeManager.Activate ("JP.ShTs.StoriesProgressView.PausableProgressBar, StoriesProgressView", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android:System.Int32, mscorlib:System.Int32, mscorlib", this, new java.lang.Object[] { p0, p1, p2, p3 });
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
