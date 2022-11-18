package com.LNS.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.LNS.Templates;
import com.LNS.Models.ModelsETApi.Municipalities;
import com.LNS.Models.ModelsETApi.MunicipalitiesListCase;
import com.LNS.Models.ModelsETApi.Provinces;
import com.LNS.Models.ModelsOurApi.Community;
import com.LNS.Models.ModelsOurApi.Municipality;


@Service
public class ProvinceService {

	@Autowired
	private RestTemplate restTemplate;

	//Obtem todas as provincias
	public Provinces getAllProvinces() {

		Provinces listOfProvinces = Templates.restTemplateProvince(restTemplate);
		return listOfProvinces;
	}

	//Obtem todas as comunidades
	public Community getAllCommunities() {

		Community listOfCommunities = Templates.restTemplateCommunity(restTemplate);
		return listOfCommunities;
	}

	//Obtem todas os municipios
	public Municipalities getAllMunicipalities(String code) {

		Municipalities listOfMunicipalities = Templates.restTemplateMunicipality(restTemplate, code);
		return listOfMunicipalities;
	}

	//Obtem o municipio 01
	public List<Municipality> getAllMunicipalitiesCase() {

		List<Municipality> listOfMunicipalities = Templates.restTemplateMunicipalityListCase(restTemplate);
		return listOfMunicipalities;
	}
}
