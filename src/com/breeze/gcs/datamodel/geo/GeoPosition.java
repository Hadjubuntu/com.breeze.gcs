package com.breeze.gcs.datamodel.geo;

public class GeoPosition {
	private double _latitude;
	private double _longitude;
	private int _altitudeCm;
	
	/**
	 * Default constructor
	 * @param pLat
	 * @param pLon
	 * @param pAltCm
	 */
	public GeoPosition(double pLat, double pLon, int pAltCm) {
		_latitude = pLat;
		_longitude = pLon;
		_altitudeCm = pAltCm;
	}

	public double getLat() {
		return _latitude;
	}

	public void setLat(double lat) {
		_latitude = lat;
	}

	public double getLon() {
		return _longitude;
	}

	public void setLon(double lon) {
		_longitude = lon;
	}

	public int getAltCm() {
		return _altitudeCm;
	}

	public void setAltCm(int altCm) {
		_altitudeCm = altCm;
	}	
}
