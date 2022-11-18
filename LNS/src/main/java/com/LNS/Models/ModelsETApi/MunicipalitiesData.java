package com.LNS.Models.ModelsETApi;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class MunicipalitiesData {
    
    @JsonProperty("CODIGOINE")
    private String codeIne;

    @JsonProperty("CODPROV")
    private String codeProv;

    @JsonProperty("NOMBRE")
    private String name;

    public MunicipalitiesData(){
    }

    public MunicipalitiesData(String codeIne, String codeProv, String name){
        this.codeIne = codeIne;
        this.codeProv = codeProv;
        this.name = name;
    }

    public String getCodeIne() {
        return codeIne;
    }

    public void setCodeIne(String codeIne) {
        this.codeIne = codeIne;
    }

    public String getCodeProv() {
        return codeProv;
    }

    public void setCodeProv(String codeProv) {
        this.codeProv = codeProv;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    
}
