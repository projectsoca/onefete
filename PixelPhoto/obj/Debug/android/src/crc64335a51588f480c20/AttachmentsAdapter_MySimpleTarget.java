package crc64335a51588f480c20;


public class AttachmentsAdapter_MySimpleTarget
	extends com.bumptech.glide.request.target.CustomTarget
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onResourceReady:(Ljava/lang/Object;Lcom/bumptech/glide/request/transition/Transition;)V:GetOnResourceReady_Ljava_lang_Object_Lcom_bumptech_glide_request_transition_Transition_Handler\n" +
			"n_onLoadCleared:(Landroid/graphics/drawable/Drawable;)V:GetOnLoadCleared_Landroid_graphics_drawable_Drawable_Handler\n" +
			"";
		mono.android.Runtime.register ("PixelPhoto.Activities.AddPost.Adapters.AttachmentsAdapter+MySimpleTarget, PixelPhoto", AttachmentsAdapter_MySimpleTarget.class, __md_methods);
	}


	public AttachmentsAdapter_MySimpleTarget ()
	{
		super ();
		if (getClass () == AttachmentsAdapter_MySimpleTarget.class)
			mono.android.TypeManager.Activate ("PixelPhoto.Activities.AddPost.Adapters.AttachmentsAdapter+MySimpleTarget, PixelPhoto", "", this, new java.lang.Object[] {  });
	}


	public AttachmentsAdapter_MySimpleTarget (int p0, int p1)
	{
		super (p0, p1);
		if (getClass () == AttachmentsAdapter_MySimpleTarget.class)
			mono.android.TypeManager.Activate ("PixelPhoto.Activities.AddPost.Adapters.AttachmentsAdapter+MySimpleTarget, PixelPhoto", "System.Int32, mscorlib:System.Int32, mscorlib", this, new java.lang.Object[] { p0, p1 });
	}

	public AttachmentsAdapter_MySimpleTarget (crc64335a51588f480c20.AttachmentsAdapter p0, crc64335a51588f480c20.AttachmentsAdapterViewHolder p1, int p2)
	{
		super ();
		if (getClass () == AttachmentsAdapter_MySimpleTarget.class)
			mono.android.TypeManager.Activate ("PixelPhoto.Activities.AddPost.Adapters.AttachmentsAdapter+MySimpleTarget, PixelPhoto", "PixelPhoto.Activities.AddPost.Adapters.AttachmentsAdapter, PixelPhoto:PixelPhoto.Activities.AddPost.Adapters.AttachmentsAdapterViewHolder, PixelPhoto:System.Int32, mscorlib", this, new java.lang.Object[] { p0, p1, p2 });
	}


	public void onResourceReady (java.lang.Object p0, com.bumptech.glide.request.transition.Transition p1)
	{
		n_onResourceReady (p0, p1);
	}

	private native void n_onResourceReady (java.lang.Object p0, com.bumptech.glide.request.transition.Transition p1);


	public void onLoadCleared (android.graphics.drawable.Drawable p0)
	{
		n_onLoadCleared (p0);
	}

	private native void n_onLoadCleared (android.graphics.drawable.Drawable p0);

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
