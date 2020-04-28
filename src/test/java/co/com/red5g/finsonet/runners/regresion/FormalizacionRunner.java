package co.com.red5g.finsonet.runners.regresion;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/finsonet/formalizacion.feature", glue = "co.com.red5g.finsonet.stepdefinitions", tags = "@Formalizacion", snippets = SnippetType.CAMELCASE)

public class FormalizacionRunner {
}