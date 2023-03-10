package co.com.red5g.finsonet.runners.regresion.finsoamigo;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/aprobacion_credito.feature", glue = "co.com.red5g.finsonet.stepdefinitions", tags = "@AprobacionCreditosFinsoamigos", snippets = SnippetType.CAMELCASE)

public class AprobacionCreditoFinsoamigoRunner {
}