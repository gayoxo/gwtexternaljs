package fdi.example.external.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.shared.GWT;
//import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.VerticalPanel;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class GWTExternalJSTEST implements EntryPoint {
	
	static {
        export();
    }
	
	public GWTExternalJSTEST() {
		
	}
	
	
	public GWTExternalJSTEST(String id) {
		RootPanel RP=RootPanel.get(id);
		VerticalPanel VP=new VerticalPanel();
		RP.add(VP);
		
		ListBox LB=new ListBox();
		LB.setMultipleSelect(true);
		LB.addItem("primero");
		LB.addItem("primero1");
		LB.addItem("primero2");
		LB.addItem("primero3");
		LB.addItem("primero4");
		LB.addItem("primero5");
		LB.addItem("primero6");
		LB.addItem("primero7");
		LB.addItem("primero8");
		LB.addItem("primero9");
		VP.add(LB);
	}

	/**
     * Makes our setData method accessible from plain JS
     */
    private static native void export() /*-{
        $wnd.setData = @fdi.example.external.client.GWTExternalJSTEST::setData(Lcom/google/gwt/core/client/JavaScriptObject;);
    }-*/;

    private static void setData(JavaScriptObject javaScriptObject) {
    	GWT.log(javaScriptObject.toString());
    //	Window.alert("HolaMundo");
        // this method is now reachable as window.setData
    	new GWTExternalJSTEST(javaScriptObject.toString());
   
    }

	/**
	 * This is the entry point method.
	 */
	public void onModuleLoad() {
		
	}
}
