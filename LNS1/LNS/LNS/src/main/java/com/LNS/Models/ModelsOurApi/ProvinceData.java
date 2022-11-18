package com.LNS.Models.ModelsOurApi;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;


@JsonIgnoreProperties(ignoreUnknown = true)
public class ProvinceData {

    @JsonProperty("Code")
    private String code;

    @JsonProperty("Name")
	private String name;

	public ProvinceData(){
	}

	public ProvinceData(String code, String name){
        this.code = code;
        this.name = name; 
	}

    public String getcode() {
        return code;
    }

    public void setcode(String code) {
        this.code = code;
    }

    public String getname() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }
}
