package com.example.gpslocator;

import com.example.service.GPSLocationService;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

public class FindGPS extends Activity {

	private GPSLocationService gpsLocationService;

	public static String LATITUDE_STRING = "com.example.gpslocator.latitude";
	public static String LONGITUDE_STRING = "com.example.gpslocator.longitude";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_find_gps);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.find_g, menu);
		return true;
	}

	/**
	 * Changes current activity to show GPS current location
	 * 
	 * @param view
	 */
	public void showCurrentLocation(View view) {
		Intent intent = new Intent(this, GPSLocation.class);
		String[] latLong = gpsLocationService.findCurrentLocation(this);
		intent.putExtra(LATITUDE_STRING, latLong[0]);
		intent.putExtra(LONGITUDE_STRING, latLong[0]);
		startActivity(intent);
	}
	/**
	 * No-args constructor
	 */
	public FindGPS() {
		// get/set singleton for gpsLocationService
		gpsLocationService = GPSLocationService.getInstance();
	}

}
