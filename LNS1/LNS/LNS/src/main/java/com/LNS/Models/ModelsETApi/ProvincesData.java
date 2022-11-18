package com.LNS.Models.ModelsETApi;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ProvincesData {

	@JsonProperty("CODPROV")
	private String codProv;

	@JsonProperty("NOMBRE_PROVINCIA")
	private String nomeProvincia;

	@JsonProperty("CODAUTON")
	private String codAuton;

	@JsonProperty("COMUNIDAD_CIUDAD_AUTONOMA")
	private String comunidadeCidadeAutonoma;

	public ProvincesData() {
	}

	public ProvincesData(String codProv, String nomeProvincia, String codAuton, String comunidadeCidadeAutonoma) {

		this.codProv = codProv;
		this.nomeProvincia = nomeProvincia;
		this.codAuton = codAuton;
		this.comunidadeCidadeAutonoma = comunidadeCidadeAutonoma;
	}

	public String getCodProv() {
		return codProv;
	}

	public void setCodProv(String codProv) {
		this.codProv = codProv;
	}

	public String getNomeProvincia() {
		return nomeProvincia;
	}

	public void setNomeProvincia(String nomeProvincia) {
		this.nomeProvincia = nomeProvincia;
	}

	public String getCodAuton() {
		return codAuton;
	}

	public void setCodAuton(String codAuton) {
		this.codAuton = codAuton;
	}

	public String getComunidadeCidadeAutonoma() {
		return comunidadeCidadeAutonoma;
	}

	public void setComunidadeCidadeAutonoma(String comunidadeCidadeAutonoma) {
		this.comunidadeCidadeAutonoma = comunidadeCidadeAutonoma;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		ProvincesData provincesData = (ProvincesData) o;
		return codProv.equals(provincesData.codProv) &&
				nomeProvincia.equals(provincesData.nomeProvincia) &&
				codAuton.equals(provincesData.codAuton) &&
				comunidadeCidadeAutonoma.equals(provincesData.comunidadeCidadeAutonoma);
	}
}
