package com.LNS.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.LNS.Models.ModelsETApi.Municipalities;
import com.LNS.Models.ModelsETApi.MunicipalitiesListCase;
import com.LNS.Models.ModelsETApi.Provinces;
import com.LNS.Models.ModelsOurApi.Community;
import com.LNS.Models.ModelsOurApi.Municipality;
import com.LNS.Service.ProvinceService;

@RestController
public class ShowcaseController {

	@Autowired
	private ProvinceService provinceService;

	//Mapeamento para provincias
	@GetMapping("/provinces")
	public Provinces getAllProvinces() {

		return provinceService.getAllProvinces();

	}

	//Mapeamento para comunidades
	@GetMapping("/communities")
	public Community getAllCommunities() {

		return provinceService.getAllCommunities();

	}

	//Mapeamento para municipios
	@GetMapping("/municipalities/{codeMun}")

	public Municipalities getAllMunicipalities(@PathVariable String codeMun) {

		return provinceService.getAllMunicipalities(codeMun);

	}

	//Mapeamento no caso de ser o municipio 01
	@GetMapping("/municipalities/01")

	public List<Municipality> getAllMunicipalitiesListCase() {

		return provinceService.getAllMunicipalitiesCase();

	}
}