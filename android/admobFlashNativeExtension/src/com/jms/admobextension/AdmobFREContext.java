package com.jms.admobextension;

import java.util.HashMap;
import java.util.Map;

import com.adobe.fre.FREContext;
import com.adobe.fre.FREFunction;

public class AdmobFREContext extends FREContext {

	@Override
	public void dispose() {
		// TODO Auto-generated method stub

	}

	@Override
	public Map<String, FREFunction> getFunctions() {
		// TODO Auto-generated method stub
	    Map<String, FREFunction> functions = new HashMap<String, FREFunction>();
	    functions.put("AdmobBanner", new AdmobBanner());
	    return functions;
	}
}
