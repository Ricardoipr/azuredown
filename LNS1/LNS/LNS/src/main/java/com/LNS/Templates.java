package com.LNS;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import org.springframework.web.client.RestTemplate;

import com.LNS.Models.ModelsETApi.Municipalities;
import com.LNS.Models.ModelsETApi.MunicipalitiesData;
import com.LNS.Models.ModelsETApi.MunicipalitiesListCase;
import com.LNS.Models.ModelsETApi.Provinces;
import com.LNS.Models.ModelsOurApi.Community;
import com.LNS.Models.ModelsOurApi.Municipality;

public class Templates {

	public static Provinces restTemplateProvince(RestTemplate restTemplate) {
		String ProvinceCommunityURL = "https://www.el-tiempo.net/api/json/v2/provincias";

		Provinces province = restTemplate.getForObject(ProvinceCommunityURL, Provinces.class);

		return province;
	}

	public static Community restTemplateCommunity(RestTemplate restTemplate) {
		String ProvinceCommunityURL = "https://www.el-tiempo.net/api/json/v2/provincias";

		Community communities = restTemplate.getForObject(ProvinceCommunityURL, Community.class);

		return communities;
	}

	public static Municipalities restTemplateMunicipality(RestTemplate restTemplate, String code) {

		String ProvinceCommunityURL = "https://www.el-tiempo.net/api/json/v2/provincias/" + code + "/municipios";

		Municipalities municipalities = restTemplate.getForObject(ProvinceCommunityURL, Municipalities.class);

		return municipalities;
	}

	// public static MunicipalitiesListCase
	// restTemplateMunicipalityListCase(RestTemplate restTemplate) {

	// String ProvinceCommunityURL =
	// "https://www.el-tiempo.net/api/json/v2/provincias/01/municipios";

	// MunicipalitiesListCase municipalitiesListCase =
	// restTemplate.getForObject(ProvinceCommunityURL,
	// MunicipalitiesListCase.class);

	// return municipalitiesListCase;
	// }

	public static List<Municipality> restTemplateMunicipalityListCase(RestTemplate restTemplate) {

		String ProvinceCommunityURL = "https://www.el-tiempo.net/api/json/v2/provincias/01/municipios";

		MunicipalitiesListCase municipalitiesListCase = restTemplate.getForObject(ProvinceCommunityURL,
				MunicipalitiesListCase.class);

		List<Municipality> muni = new ArrayList<Municipality>();
		List<MunicipalitiesData> before = municipalitiesListCase.getMunicipios();
		before.sort(Comparator.comparing(MunicipalitiesData::getName));

		for (int i = 0; i < before.size(); i++) {

			MunicipalitiesData test = before.get(i);
			Municipality municipes = new Municipality(test.getCodeIne(), test.getName());
			muni.add(i, municipes);
		}

		return muni;
	}

}
