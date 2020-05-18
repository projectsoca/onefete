package crc645ae0f6458d76f053;


public class ExploreFragment
	extends android.support.v4.app.Fragment
	implements
		mono.android.IGCUserPeer,
		com.liaoinstan.springview.widget.SpringView.OnFreshListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onCreate:(Landroid/os/Bundle;)V:GetOnCreate_Landroid_os_Bundle_Handler\n" +
			"n_onCreateView:(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;:GetOnCreateView_Landroid_view_LayoutInflater_Landroid_view_ViewGroup_Landroid_os_Bundle_Handler\n" +
			"n_onLowMemory:()V:GetOnLowMemoryHandler\n" +
			"n_onLoadmore:()V:GetOnLoadMoreHandler:Liaoinstan.SpringViewLib.Widgets.SpringView/IOnFreshListenerInvoker, SpringView\n" +
			"n_onRefresh:()V:GetOnRefreshHandler:Liaoinstan.SpringViewLib.Widgets.SpringView/IOnFreshListenerInvoker, SpringView\n" +
			"";
		mono.android.Runtime.register ("PixelPhoto.Activities.Tabbes.Fragments.ExploreFragment, PixelPhoto", ExploreFragment.class, __md_methods);
	}


	public ExploreFragment ()
	{
		super ();
		if (getClass () == ExploreFragment.class)
			mono.android.TypeManager.Activate ("PixelPhoto.Activities.Tabbes.Fragments.ExploreFragment, PixelPhoto", "", this, new java.lang.Object[] {  });
	}


	public void onCreate (android.os.Bundle p0)
	{
		n_onCreate (p0);
	}

	private native void n_onCreate (android.os.Bundle p0);


	public android.view.View onCreateView (android.view.LayoutInflater p0, android.view.ViewGroup p1, android.os.Bundle p2)
	{
		return n_onCreateView (p0, p1, p2);
	}

	private native android.view.View n_onCreateView (android.view.LayoutInflater p0, android.view.ViewGroup p1, android.os.Bundle p2);


	public void onLowMemory ()
	{
		n_onLowMemory ();
	}

	private native void n_onLowMemory ();


	public void onLoadmore ()
	{
		n_onLoadmore ();
	}

	private native void n_onLoadmore ();


	public void onRefresh ()
	{
		n_onRefresh ();
	}

	private native void n_onRefresh ();

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
