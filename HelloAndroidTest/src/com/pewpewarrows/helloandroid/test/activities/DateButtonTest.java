package com.pewpewarrows.helloandroid.test.activities;

import static org.mockito.Mockito.*;
import android.test.ActivityInstrumentationTestCase2;
import android.test.UiThreadTest;
import android.widget.Button;

import com.jayway.android.robotium.solo.Solo;
import com.pewpewarrows.helloandroid.activities.DateButton;

public class DateButtonTest extends ActivityInstrumentationTestCase2<DateButton> {
	
	private Solo solo;
	private DateButton mActivity;
	private Button mButton;

	public DateButtonTest() {
		super("com.pewpewarrows.helloandroid", DateButton.class);
	}
	
	@Override
	protected void setUp() throws Exception {
		super.setUp();
		
		solo = new Solo(getInstrumentation(), getActivity());
		
		mActivity = this.getActivity();
		mButton = (Button) mActivity.findViewById(com.pewpewarrows.helloandroid.R.id.date_button);
	}

	public void testPreconditions() {
		assertNotNull(mButton);
	}

	public void testButton_byDefault_isEmpty() {
		assertEquals("", mButton.getText());
	}

	@UiThreadTest
	public void testButton_whenPushed_containsCurrentDate() {
		// TODO: this fails with a java.lang.ExceptionInInitializerError
		
		String exampleDate = "20110101";
		DateButton activitySpy = spy(mActivity);
		
		when(activitySpy.getCurrentDate()).thenReturn(exampleDate);
		
		solo.clickOnButton(mButton.getId());
		
		assertEquals(exampleDate, mButton.getText());
	}
	
}
