package fdi.example.external.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.shared.GWT;
import com.google.gwt.http.client.Request;
import com.google.gwt.http.client.RequestBuilder;
import com.google.gwt.http.client.RequestCallback;
import com.google.gwt.http.client.RequestException;
import com.google.gwt.http.client.Response;
import com.google.gwt.user.client.Window;
//import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.VerticalPanel;

import fdi.example.external.shared.SharedObject;



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
		LB.addItem("primero10");
		LB.addItem(getVariableBase());
		VP.add(LB);

		
		 RequestBuilder builder = new RequestBuilder(RequestBuilder.GET, "aa.txt");

	        try {
	            builder.sendRequest(null, new RequestCallback() {
	                public void onError(Request request, Throwable exception) {
	                    // Code omitted for clarity
	                }

	                public void onResponseReceived(Request request, Response response) {
	                    // Code omitted for clarity
	                	
	                	Window.alert(response.getText());
	                	
//	                	
//	                	Serializer serializer = (Serializer) GWT.create(Serializer.class);
//
//	                	DocumentCompleteJSON Hola=(DocumentCompleteJSON) serializer.deSerialize(response.getText(), "fdi.ucm.server.interconect.model.DocumentCompleteJSON");
//	                	Window.alert(Hola.getDocumento().getId()+"");
	                }
	            });

	        } catch (RequestException e) {
	            // Code omitted for clarity
	        }
		
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
    
    
    
    
	public static native String getVariableBase() /*-{
	  return  $wnd.DocExpand;
	}-*/;

	/**
	 * This is the entry point method.
	 */
	public void onModuleLoad() {
		
	}
}
