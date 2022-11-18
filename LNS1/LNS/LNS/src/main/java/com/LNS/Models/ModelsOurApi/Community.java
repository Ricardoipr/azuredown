package com.LNS.Models.ModelsOurApi;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Community {

	private List<CommunityData> comunidades;

	public Community() {
	}

	public Community(List<CommunityData> comunidades) {
		this.comunidades = comunidades;
	}

	public List<CommunityData> getcomunidades() {
		return comunidades;
	}

	public void setcomunidades(List<CommunityData> comunidades) {
		this.comunidades = comunidades;
	}

}
