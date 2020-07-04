package co.com.red5g.finsonet.runners.smokeTest.general;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/liquidador_comisiones.feature", glue = "co.com.red5g.finsonet.stepdefinitions", tags = "@Reporte", snippets = SnippetType.CAMELCASE)

public class LiquidadorComisionesReportesRunner {
}