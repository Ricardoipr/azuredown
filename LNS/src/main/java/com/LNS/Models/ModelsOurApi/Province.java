package com.LNS.Models.ModelsOurApi;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Province {

    private List<ProvinceData> provincias;

	public Province(){
	}

	public Province(List<ProvinceData> provincias) {
		this.provincias = provincias;
	}

	public List<ProvinceData> getprovincias() {
		return provincias;
	}

	public void setprovincias(List<ProvinceData> provincias) {
		this.provincias = provincias;
	}
    
}
