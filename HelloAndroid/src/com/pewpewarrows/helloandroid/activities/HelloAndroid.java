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
		// TODO: auto-complete edittext example
		// TODO: gallery view example
		// TODO: custom listview row.xml example
		// TODO: dynamic listview row adapter example
		// TODO: using a layout inflater example
		// TODO: using convertview for better listview example
		
		// TODO: this:
		mDemoActivities.put("Fancy listView Holder", ViewHolder.class);
		
		// TODO: ratingbar widgets in dynamic listview example
		// TODO: date and time picker dialogs example
		// TODO: chronometer example
		// TODO: tabhost and tabactivity example
		// TODO: dynamic tab creation example
		// TODO: viewflipper example
		// TODO: dynamic viewflipper example
		// TODO: slidingdrawer example
		// TODO: embedded webkit (webview) example
		// TODO: custom webviewclient example
		// TODO: options + context menu example
		// TODO: using menu resource xml example
		// TODO: showing toast messages and alert dialog example
		// TODO: rotation layout state saving example
		// TODO: rotation layout save object example
		// TODO: manual rotation change example
		// TODO: prevent rotation change example
		// TODO: background thread and handler example
		// TODO: asynctask example
		// TODO: rotation aware asynctask example
		// TODO: intent filter examples
		// TODO: broadcast receiver example
		// TODO: launching intents example
		// TODO: tabbed internal activity with intents example
		// TODO: resource strings and formatting example
		// TODO: styling widgets example
		// TODO: application and activity themes example
		// TODO: custom layouts (like Hand of Cards) example
		// TODO: xml-defined drawable example
		// TODO: nine-patch bitmap PNG example
		// TODO: px, mm, in, dip, sp comparison example
		// TODO: handling wide range of screen sizes and density example
		// TODO: actionbar example
		// TODO: fragments example (using EU flags activity from earlier)
		// TODO: backwards-compatibility and platform changes example
		// TODO: accessing a static file example
		// TODO: trivial text editor read/write example
		// TODO: using a PreferenceActivity example
		// TODO: Honeycomb preferences example
		// TODO: custom Preference intent example
		// TODO: simple SQLite example
		// TODO: SQLite DB migration example
		// TODO: building SQLite SELECT queries example
		// TODO: SQLite CursorAdapter example
		// TODO: BeanScript / SL4A interpreter example
		// TODO: loading HttpResponse into WebView example
		// TODO: loading HttpResponse into ListView example
		// TODO: using AndroidHttpClient example
		// TODO: DownloadManager example
		// TODO: DownloadManager Service example
		// TODO: Music Player example
		// TODO: HttpClient Binding to a Service example
		// TODO: Notification example
		// TODO: Foreground Notification example
		// TODO: Custom Permissions example
		// TODO: Location listening and proximity example
		// TODO: MapView example
		// TODO: MapView Overlay example
		// TODO: MapView Fragments & compatibility example
		// TODO: Making a phone call example
		// TODO: Changing Fonts example
		// TODO: Custom Font example
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
