package co.com.red5g.runners.regresion.finsonet;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/finsonet/login.feature", glue = "co.com.red5g.stepdefinitions", snippets = SnippetType.CAMELCASE)

public class LoginFinsonetRunner {
}