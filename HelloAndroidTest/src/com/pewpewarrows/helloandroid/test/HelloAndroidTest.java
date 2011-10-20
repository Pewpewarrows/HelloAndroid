package com.pewpewarrows.helloandroid.test;

import android.test.ActivityInstrumentationTestCase2;
import android.widget.TextView;

import com.pewpewarrows.helloandroid.activities.HelloAndroid;

public class HelloAndroidTest extends
		ActivityInstrumentationTestCase2<HelloAndroid> {

	private HelloAndroid mActivity;
	private TextView mView;
	private String resourceString;

	public HelloAndroidTest() {
		super("com.pewpewarrows.helloandroid", HelloAndroid.class);
	}

	@Override
	protected void setUp() throws Exception {
		super.setUp();
		mActivity = this.getActivity();
		mView = (TextView) mActivity
				.findViewById(com.pewpewarrows.helloandroid.R.id.textview);
		resourceString = mActivity
				.getString(com.pewpewarrows.helloandroid.R.string.hello);
	}

	public void testPreconditions() {
		assertNotNull(mView);
	}

}
