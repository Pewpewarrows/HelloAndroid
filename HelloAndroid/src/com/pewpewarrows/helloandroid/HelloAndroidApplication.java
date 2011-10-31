package com.pewpewarrows.helloandroid;

import android.app.Application;

import com.pewpewarrows.helloandroid.shim.CompatShim;

public class HelloAndroidApplication extends Application {
	@Override
	public void onCreate() {
		CompatShim.init(C.DEBUG);

		super.onCreate();
	}
}
