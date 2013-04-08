package com.example.service;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;

public class LocationListenerService implements LocationListener {

	private double longitude;
	private  double latitude;

	private static LocationListenerService locationListenerService;

	private LocationListenerService() {
		Location location = new Location("aString");
		longitude = location.getLongitude();
		latitude = location.getLatitude();
	}

	public static LocationListenerService getInstance() {
		if (locationListenerService == null) {
			locationListenerService = new LocationListenerService();
		}
		return locationListenerService;

	}

	@Override
	public void onLocationChanged(Location location) {
		this.longitude = location.getLongitude();
		this.latitude = location.getLatitude();
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

	}

	/**
	 * @return the longitude
	 */
	public double getLongitude() {
		return longitude;
	}

	/**
	 * @param longitude
	 *            the longitude to set
	 */
	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	/**
	 * @return the latitude
	 */
	public double getLatitude() {
		return this.latitude;
	}

	/**
	 * @param latitude
	 *            the latitude to set
	 */
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

}
