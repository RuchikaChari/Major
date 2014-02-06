package com.example.eduhub;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;

public class CalendarActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_calendar);
		
		Intent i= new Intent();
		ComponentName cn= new ComponentName("com.android.calendar", "com.android.calendar.LaunchActivity");
		
		i.setComponent(cn);
		startActivity(i);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.calendar, menu);
		return true;
	}

}
