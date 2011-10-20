package com.pewpewarrows.helloandroid.activities;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.pewpewarrows.helloandroid.R;

public class HelloAndroid extends ListActivity {
	private ListView mDemoActivityList;
	private String[] mDemoActivities = { "HelloAndroid" };

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setContentView(R.layout.main);

		ArrayAdapter<String> mAdapter = new ArrayAdapter<String>(this,
				android.R.layout.simple_list_item_1, mDemoActivities);

		setListAdapter(mAdapter);
	}

	private void generateDemoActivities() {
		// TODO
	}

	@Override
	protected void onListItemClick(ListView parent, View v, int position, long id) {
		Class activityKlass = null;
		
		if ("HelloAndroid".equals(mDemoActivities[position])) {
			activityKlass = HelloWorld.class;
		}
		
		if (activityKlass != null) {
			startActivity(new Intent(HelloAndroid.this, activityKlass));
		}
	}
}
