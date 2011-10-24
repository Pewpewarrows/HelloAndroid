package com.pewpewarrows.helloandroid;

import com.pewpewarrows.helloandroid.utils.CompatHelper;

import android.app.Application;
import android.os.StrictMode;

public class HelloAndroidApplication extends Application {
	private static final boolean DEBUG = true;

	@Override
	public void onCreate() {
		CompatHelper.init();

		super.onCreate();
	}

	public static boolean isDebugMode() {
		return DEBUG;
	}
}
