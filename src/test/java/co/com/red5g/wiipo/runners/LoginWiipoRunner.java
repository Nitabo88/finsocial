package co.com.red5g.wiipo.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/wiipo/login.feature", glue = "co.com.red5g.wiipo.stepdefinitions", snippets = SnippetType.CAMELCASE)

public class LoginWiipoRunner {
}