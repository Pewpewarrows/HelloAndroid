package com.pewpewarrows.helloandroid.utils;

import android.os.Build;

public abstract class CompatHelper {
	static private CompatHelper instance = null;
	
	static public void init() {
		if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.ICE_CREAM_SANDWICH) {
			
		} else if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.GINGERBREAD) {
			instance = new GingerbreadHelper();
		} else if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.FROYO) {
			
		} else if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.ECLAIR_MR1) {
			
		} else {
			instance = new EmptyCompatHelper();
		}
	}
	
	static class EmptyCompatHelper extends CompatHelper {
		// intentionally left empty
	}
}
