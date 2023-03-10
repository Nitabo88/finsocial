package co.com.red5g.finsonet.runners.regresion.general;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/login.feature", glue = "co.com.red5g.finsonet.stepdefinitions", snippets = SnippetType.CAMELCASE)

public class LoginFinsonetRunner {
}