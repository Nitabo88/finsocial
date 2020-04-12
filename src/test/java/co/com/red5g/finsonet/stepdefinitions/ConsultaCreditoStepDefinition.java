package co.com.red5g.finsonet.stepdefinitions;

import cucumber.api.java.Before;
import io.restassured.RestAssured;
import net.serenitybdd.junit.runners.SerenityRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

import static net.serenitybdd.rest.SerenityRest.given;

@RunWith(SerenityRunner.class)
public class ConsultaCreditoStepDefinition {

    @Before
    public void prepare_rest_config() {
        RestAssured.baseURI = "http://192.168.0.48:82";
    }

    @Test
    public void should_return_name_and_sector() {
        String newClient = "{\"user\":\"ochinchilla\",\"pass\":\"Nicolas32@\"}\n";
        given().body(newClient).when().post("/login.php")
                .then().statusCode(200);
    }
}
