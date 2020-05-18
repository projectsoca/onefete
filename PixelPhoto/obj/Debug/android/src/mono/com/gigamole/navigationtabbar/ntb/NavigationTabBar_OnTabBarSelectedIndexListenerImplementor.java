package mono.com.gigamole.navigationtabbar.ntb;


public class NavigationTabBar_OnTabBarSelectedIndexListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.gigamole.navigationtabbar.ntb.NavigationTabBar.OnTabBarSelectedIndexListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onEndTabSelected:(Lcom/gigamole/navigationtabbar/ntb/NavigationTabBar$Model;I)V:GetOnEndTabSelected_Lcom_gigamole_navigationtabbar_ntb_NavigationTabBar_Model_IHandler:Com.Gigamole.Navigationtabbar.Ntb.NavigationTabBar/IOnTabBarSelectedIndexListenerInvoker, NavigationTabBar\n" +
			"n_onStartTabSelected:(Lcom/gigamole/navigationtabbar/ntb/NavigationTabBar$Model;I)V:GetOnStartTabSelected_Lcom_gigamole_navigationtabbar_ntb_NavigationTabBar_Model_IHandler:Com.Gigamole.Navigationtabbar.Ntb.NavigationTabBar/IOnTabBarSelectedIndexListenerInvoker, NavigationTabBar\n" +
			"";
		mono.android.Runtime.register ("Com.Gigamole.Navigationtabbar.Ntb.NavigationTabBar+IOnTabBarSelectedIndexListenerImplementor, NavigationTabBar", NavigationTabBar_OnTabBarSelectedIndexListenerImplementor.class, __md_methods);
	}


	public NavigationTabBar_OnTabBarSelectedIndexListenerImplementor ()
	{
		super ();
		if (getClass () == NavigationTabBar_OnTabBarSelectedIndexListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Gigamole.Navigationtabbar.Ntb.NavigationTabBar+IOnTabBarSelectedIndexListenerImplementor, NavigationTabBar", "", this, new java.lang.Object[] {  });
	}


	public void onEndTabSelected (com.gigamole.navigationtabbar.ntb.NavigationTabBar.Model p0, int p1)
	{
		n_onEndTabSelected (p0, p1);
	}

	private native void n_onEndTabSelected (com.gigamole.navigationtabbar.ntb.NavigationTabBar.Model p0, int p1);


	public void onStartTabSelected (com.gigamole.navigationtabbar.ntb.NavigationTabBar.Model p0, int p1)
	{
		n_onStartTabSelected (p0, p1);
	}

	private native void n_onStartTabSelected (com.gigamole.navigationtabbar.ntb.NavigationTabBar.Model p0, int p1);

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
