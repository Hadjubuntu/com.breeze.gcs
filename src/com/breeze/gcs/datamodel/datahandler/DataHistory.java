package com.breeze.gcs.datamodel.datahandler;

import java.util.HashMap;
import java.util.Map;

import com.breeze.gcs.datamodel.date.Date;

/**
 * Contains a map of date to data values
 * @author adrien
 *
 * @param <T>
 */
public class DataHistory<T> {
	protected Map<Date, T> _mapDateValue;
	
	/**
	 * Default constructor
	 */
	public DataHistory() {
		_mapDateValue = new HashMap<Date, T>();
	}
	
	/**
	 * Remove data older than x seconds
	 * @param pSeconds Seconds
	 */
	public void removeDataOlderThan(double pSeconds) {
		
	}
}
