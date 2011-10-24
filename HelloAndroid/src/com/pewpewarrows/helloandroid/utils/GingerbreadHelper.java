package com.pewpewarrows.helloandroid.utils;

import com.pewpewarrows.helloandroid.HelloAndroidApplication;

import android.os.StrictMode;

public class GingerbreadHelper extends CompatHelper {
	public GingerbreadHelper() {
		// Log and kill the application for violating StrictMode during
		// development
		if (HelloAndroidApplication.isDebugMode()) {
			StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder()
					.detectAll().penaltyLog().penaltyDeath().build());
			StrictMode.setVmPolicy(new StrictMode.VmPolicy.Builder()
					.detectAll().penaltyLog().penaltyDeath().build());
		}
	}
}
