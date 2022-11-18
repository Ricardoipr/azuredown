package com.LNS;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.client.RestTemplate;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.MatcherAssert.assertThat;
import com.LNS.Models.ModelsETApi.Provinces;
import com.LNS.Models.ModelsETApi.ProvincesData;

@SpringBootTest
class LnsApplicationTests {

	@Autowired
	RestTemplate restTemplate;

	@Test
	@DisplayName("Teste para verificar se os dados foram corretamente extraidos da api para a aplicação")
	void ProvincesToDataTest() {
		ProvincesData provincesTest1 = new ProvincesData("01", "Araba/Álava",
				"16", "País Vasco/Euskadi");
		ProvincesData provincesTest2 = new ProvincesData("08", "Barcelona",
				"09", "Cataluña/Catalunya");
		ProvincesData provincesTest3 = new ProvincesData("07", "Illes Balears",
				"04", "Palma de Mallorca");
		List<ProvincesData> provincesTests = new ArrayList<ProvincesData>();
		provincesTests.add(provincesTest1);
		provincesTests.add(provincesTest2);
		provincesTests.add(provincesTest3);
		Provinces provinces = Templates.restTemplateProvince(restTemplate);
		List<ProvincesData> test = provinces.getprovinces();

		assertThat(test,contains(provincesTests));
		
		//assertEquals(provincesTest1, test.get(0));
		//assert(test.contains(provincesTest1));
		//assert(test.contains(provincesTest2));
		//assert(test.contains(provincesTest3));
	}

}
