package com.breeze.gcs.datamodel.date;

public class Date {
	protected long _dtSinceStartMs;

	/**
	 * Default constructor
	 * @param pDtSinceStartMs Delay since starting time of gcs
	 */
	public Date(long pDtSinceStartMs) {
		_dtSinceStartMs = pDtSinceStartMs;
	}
}
