package fdi.example.external.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.shared.GWT;
import com.google.gwt.user.client.Window;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class GWTExternalJSTEST implements EntryPoint {
	
	static {
        export();
    }
	
	
	/**
     * Makes our setData method accessible from plain JS
     */
    private static native void export() /*-{
        $wnd.setData = @fdi.example.external.client.GWTExternalJSTEST::setData(Lcom/google/gwt/core/client/JavaScriptObject;);
    }-*/;

    private static void setData(JavaScriptObject javaScriptObject) {
    	GWT.log(javaScriptObject.toString());
    	Window.alert("HolaMundo");
        // this method is now reachable as window.setData
    }

	/**
	 * This is the entry point method.
	 */
	public void onModuleLoad() {
		
	}
}
