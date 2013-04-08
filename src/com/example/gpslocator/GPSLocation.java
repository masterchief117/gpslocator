package com.example.gpslocator;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.widget.TextView;

public class GPSLocation extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Intent intent = getIntent();
		String lat = intent.getStringExtra(FindGPS.LATITUDE_STRING);
		String lon = intent.getStringExtra(FindGPS.LONGITUDE_STRING);
		TextView text = new TextView(this);
		text.setText(lat);
		text.setTextSize(45);
		setContentView(text);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.gpslocation, menu);
		return true;
	}

}
