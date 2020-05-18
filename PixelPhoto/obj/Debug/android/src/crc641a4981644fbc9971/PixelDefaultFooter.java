package crc641a4981644fbc9971;


public class PixelDefaultFooter
	extends com.liaoinstan.springview.container.BaseFooter
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_getView:(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;:GetGetView_Landroid_view_LayoutInflater_Landroid_view_ViewGroup_Handler\n" +
			"n_onDropAnim:(Landroid/view/View;I)V:GetOnDropAnim_Landroid_view_View_IHandler\n" +
			"n_onLimitDes:(Landroid/view/View;Z)V:GetOnLimitDes_Landroid_view_View_ZHandler\n" +
			"n_onPreDrag:(Landroid/view/View;)V:GetOnPreDrag_Landroid_view_View_Handler\n" +
			"n_onStartAnim:()V:GetOnStartAnimHandler\n" +
			"n_onFinishAnim:()V:GetOnFinishAnimHandler\n" +
			"";
		mono.android.Runtime.register ("PixelPhoto.Helpers.PullSwipeStyles.PixelDefaultFooter, PixelPhoto", PixelDefaultFooter.class, __md_methods);
	}


	public PixelDefaultFooter ()
	{
		super ();
		if (getClass () == PixelDefaultFooter.class)
			mono.android.TypeManager.Activate ("PixelPhoto.Helpers.PullSwipeStyles.PixelDefaultFooter, PixelPhoto", "", this, new java.lang.Object[] {  });
	}

	public PixelDefaultFooter (android.app.Activity p0)
	{
		super ();
		if (getClass () == PixelDefaultFooter.class)
			mono.android.TypeManager.Activate ("PixelPhoto.Helpers.PullSwipeStyles.PixelDefaultFooter, PixelPhoto", "Android.App.Activity, Mono.Android", this, new java.lang.Object[] { p0 });
	}


	public android.view.View getView (android.view.LayoutInflater p0, android.view.ViewGroup p1)
	{
		return n_getView (p0, p1);
	}

	private native android.view.View n_getView (android.view.LayoutInflater p0, android.view.ViewGroup p1);


	public void onDropAnim (android.view.View p0, int p1)
	{
		n_onDropAnim (p0, p1);
	}

	private native void n_onDropAnim (android.view.View p0, int p1);


	public void onLimitDes (android.view.View p0, boolean p1)
	{
		n_onLimitDes (p0, p1);
	}

	private native void n_onLimitDes (android.view.View p0, boolean p1);


	public void onPreDrag (android.view.View p0)
	{
		n_onPreDrag (p0);
	}

	private native void n_onPreDrag (android.view.View p0);


	public void onStartAnim ()
	{
		n_onStartAnim ();
	}

	private native void n_onStartAnim ();


	public void onFinishAnim ()
	{
		n_onFinishAnim ();
	}

	private native void n_onFinishAnim ();

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
