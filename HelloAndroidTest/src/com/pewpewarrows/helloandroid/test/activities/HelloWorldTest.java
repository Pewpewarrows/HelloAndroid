package com.pewpewarrows.helloandroid.test.activities;

import android.test.ActivityInstrumentationTestCase2;
import android.widget.TextView;

import com.pewpewarrows.helloandroid.activities.HelloWorld;

public class HelloWorldTest extends
		ActivityInstrumentationTestCase2<HelloWorld> {

	private HelloWorld mActivity;
	private TextView mView;
	private String resourceString;

	public HelloWorldTest() {
		super("com.pewpewarrows.helloandroid", HelloWorld.class);
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

	public void testText() {
		assertEquals(resourceString, (String) mView.getText());
	}

}
