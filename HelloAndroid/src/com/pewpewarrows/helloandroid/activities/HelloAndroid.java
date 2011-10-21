package com.pewpewarrows.helloandroid.activities;

import java.util.HashMap;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.pewpewarrows.helloandroid.R;

public class HelloAndroid extends ListActivity {
	private HashMap<String, Class<?>> mDemoActivities;

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setContentView(R.layout.main);
		
		generateDemoActivities();

		ArrayAdapter<String> mAdapter = new ArrayAdapter<String>(
				this,
				android.R.layout.simple_list_item_1, 
				mDemoActivities.keySet().toArray(new String[mDemoActivities.size()]));

		setListAdapter(mAdapter);
	}

	private void generateDemoActivities() {
		mDemoActivities = new HashMap<String, Class<?>>();
		
		mDemoActivities.put("Hello Android", HelloWorld.class);
		mDemoActivities.put("Date Button", DateButton.class);
		
		// TODO: adjustable radio button layout example
		// TODO: relative layout form example
		// TODO: table layout form example
		// TODO: edittext input type options example (also: hooking into "Done" button)
		// TODO: multiselect listview example
		// TODO: spinner control example
		// TODO: grid layout example
		// TODO: auto-complete textview example
		// TODO: gallery view example
		// TODO: custom listview row.xml example
		// TODO: dynamic listview row adapter example
		// TODO: using a layout inflater example
		// TODO: using convertview for better listview example
	}

	@Override
	protected void onListItemClick(ListView parent, View v, int position, long id) {
		String[] activities = mDemoActivities.keySet().toArray(new String[mDemoActivities.size()]);
		Class<?> activityKlass = mDemoActivities.get(activities[position]);
		
		if (activityKlass != null) {
			startActivity(new Intent(HelloAndroid.this, activityKlass));
		}
	}
}
