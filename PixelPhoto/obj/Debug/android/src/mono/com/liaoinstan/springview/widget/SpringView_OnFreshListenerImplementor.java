package mono.com.liaoinstan.springview.widget;


public class SpringView_OnFreshListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.liaoinstan.springview.widget.SpringView.OnFreshListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onLoadmore:()V:GetOnLoadMoreHandler:Liaoinstan.SpringViewLib.Widgets.SpringView/IOnFreshListenerInvoker, SpringView\n" +
			"n_onRefresh:()V:GetOnRefreshHandler:Liaoinstan.SpringViewLib.Widgets.SpringView/IOnFreshListenerInvoker, SpringView\n" +
			"";
		mono.android.Runtime.register ("Liaoinstan.SpringViewLib.Widgets.SpringView+IOnFreshListenerImplementor, SpringView", SpringView_OnFreshListenerImplementor.class, __md_methods);
	}


	public SpringView_OnFreshListenerImplementor ()
	{
		super ();
		if (getClass () == SpringView_OnFreshListenerImplementor.class)
			mono.android.TypeManager.Activate ("Liaoinstan.SpringViewLib.Widgets.SpringView+IOnFreshListenerImplementor, SpringView", "", this, new java.lang.Object[] {  });
	}


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
