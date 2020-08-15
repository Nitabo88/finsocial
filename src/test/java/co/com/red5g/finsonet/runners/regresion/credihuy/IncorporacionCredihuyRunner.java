package co.com.red5g.finsonet.runners.regresion.credihuy;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/finsonet/incorporacion.feature", glue = "co.com.red5g.finsonet.stepdefinitions", tags = "@IncorporacionHuy", snippets = SnippetType.CAMELCASE)

public class IncorporacionCredihuyRunner {

}