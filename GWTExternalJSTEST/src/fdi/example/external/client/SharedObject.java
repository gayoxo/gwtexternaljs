package fdi.example.external.client;


import com.google.gwt.core.client.JavaScriptObject;


public class SharedObject extends JavaScriptObject {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	protected SharedObject() {}
	
	
	
	  public final native String getValor() /*-{ 
	    return this.Valor_0_g$;
	  }-*/;
	  public final native String getValor2() /*-{
	    return this.Valor2_0_g$;
	  }-*/;

	
		
}
