package com.LNS.Models.ModelsETApi;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class MunicipalitiesListCase {
    
    private List<MunicipalitiesData> municipios;

    public MunicipalitiesListCase(){
    }

    public MunicipalitiesListCase(List<MunicipalitiesData> municipios){
        this.municipios = municipios;
    }

    public List<MunicipalitiesData> getMunicipios() {
        return municipios;
    }

    public void setMunicipios(List<MunicipalitiesData> municipios) {
        this.municipios = municipios;
    }
}
