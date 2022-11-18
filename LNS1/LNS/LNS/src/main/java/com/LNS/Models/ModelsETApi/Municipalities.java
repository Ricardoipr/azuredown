package com.LNS.Models.ModelsETApi;

import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Municipalities {
    
    
    private HashMap<String, MunicipalitiesData> municipios;

    public Municipalities(){
    }

    public Municipalities(HashMap<String, MunicipalitiesData> municipios){
        this.municipios = municipios;
    }

    public HashMap<String, MunicipalitiesData> getMunicipios() {
        return municipios;
    }

    public void setMunicipios(HashMap<String, MunicipalitiesData> municipios) {
        this.municipios = municipios;
    }
}
