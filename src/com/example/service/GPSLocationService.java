package com.example.service;

import android.content.Context;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;

public class GPSLocationService {

	private static GPSLocationService gpsLocationService;

	/**
	 * No-args constructor
	 */
	private GPSLocationService() {

	}

	/**
	 * 
	 * 
	 * @param context
	 * @return String[] lat, long
	 */
	public String[] findCurrentLocation(Context context) {
		LocationManager locationManager = (LocationManager) context.getSystemService(Context.LOCATION_SERVICE);
		
		//locationManager.getLastKnownLocation(LocationManager.NETWORK_PROVIDER);
		LocationListenerService location = LocationListenerService.getInstance();
		String[] gpsLocation = {String.valueOf(location.getLatitude()), String.valueOf(location.getLongitude())};
		return gpsLocation;
	}

	public static GPSLocationService getInstance() {
		if (gpsLocationService == null) {
			gpsLocationService = new GPSLocationService();
		}
		return gpsLocationService;
	}
	
	public static class MyLocationListener implements LocationListener{

		public static double latitude;
		public static double longitude;
		
		@Override
		public void onLocationChanged(Location location) {
			
			latitude = location.getLatitude();
			longitude = location.getLongitude(); 
		}

		@Override
		public void onProviderDisabled(String provider) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void onProviderEnabled(String provider) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void onStatusChanged(String provider, int status, Bundle extras) {
			// TODO Auto-generated method stub
			
		}}
}
