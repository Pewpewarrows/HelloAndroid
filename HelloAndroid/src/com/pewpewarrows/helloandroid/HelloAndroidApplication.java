package com.pewpewarrows.helloandroid;

import com.pewpewarrows.electricsheep.ESApplication;

public class HelloAndroidApplication extends ESApplication {
	
	@Override
	public void onCreate() {
		setupApp(C.APP_TAG);
		makeCompatible(C.DEBUG);
	}
	
}
