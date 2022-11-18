package com.LNS.Models.ModelsETApi;


import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Provinces {
    
	@JsonProperty("provincias")
    private List<ProvincesData> provinces;

	public Provinces(){
	}

	public Provinces(List<ProvincesData> provinces) {
		this.provinces = provinces;
	}

	public List<ProvincesData> getprovinces() {
		return provinces;
	}

	public void setprovinces(List<ProvincesData> provinces) {
		this.provinces = provinces;
	}
}
