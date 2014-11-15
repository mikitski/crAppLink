package com.kbb.livedrive.processor;

import org.json.JSONException;
import org.json.JSONObject;

public class JsonProcessor {

	/**
	 * Process a String containing JSON into a JSONObject.
	 * @param data the JSON String
	 * @return the root JSON Object.
	 */
	public JSONObject getJsonFromString(String data) {		
		JSONObject jsonObject = null;
		
		try {
			jsonObject = new JSONObject(data);
		} catch (JSONException e) {

			e.printStackTrace();
		}
		
		return jsonObject;
	}	
}
