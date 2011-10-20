package com.pewpewarrows.helloandroid.activities;

import java.util.Date;

import com.pewpewarrows.helloandroid.R;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DateButton extends Activity implements View.OnClickListener {

	Button btn;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.date_button);
		
		btn = (Button) findViewById(R.id.date_button);
		btn.setOnClickListener(this);
	}
	
	public String getCurrentDate() {
		return new Date().toString();
	}

	@Override
	public void onClick(View v) {
		btn.setText(getCurrentDate());
	}
	
}
