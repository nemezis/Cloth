package com.nemezis.cloth.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Dmitry Kostyrev on 29/09/15
 */
public class Organization {
	private String id;
	private String alias;
	private String name;
	@SerializedName("api_key")
	private String apiKey;

	public String getId() {
		return id;
	}

	public String getAlias() {
		return alias;
	}

	public String getName() {
		return name;
	}

	public String getApiKey() {
		return apiKey;
	}
}
