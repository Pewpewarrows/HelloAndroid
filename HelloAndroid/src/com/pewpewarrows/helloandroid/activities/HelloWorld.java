package com.pewpewarrows.helloandroid.activities;

import android.app.Activity;
import android.os.Bundle;

import com.pewpewarrows.helloandroid.R;

public class HelloWorld extends Activity {
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setContentView(R.layout.hello_world);
	}
}
