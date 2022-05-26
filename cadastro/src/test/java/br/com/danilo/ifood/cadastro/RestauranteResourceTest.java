package br.com.danilo.ifood.cadastro;

import com.github.database.rider.cdi.api.DBRider;
import com.github.database.rider.core.api.configuration.DBUnit;
import com.github.database.rider.core.api.configuration.Orthography;
import com.github.database.rider.core.api.dataset.DataSet;

import org.approvaltests.Approvals;
import org.junit.jupiter.api.Test;

import io.quarkus.test.common.QuarkusTestResource;
import io.quarkus.test.junit.QuarkusTest;
import io.restassured.RestAssured;

@DBRider
@DBUnit(caseInsensitiveStrategy = Orthography.LOWERCASE)
@QuarkusTest
@QuarkusTestResource(CadastroTestLifecycleManager.class)
public class RestauranteResourceTest {
	
	@Test
	@DataSet("restaurantes-cenario1.yml")
	public void testBuscarRestaurantes() {
		String resultado = RestAssured.given()
				.when().get("/restaurantes")
				.then()
				.statusCode(200)
				.extract().asString();
		Approvals.verifyJson(resultado);
	}
		
}
