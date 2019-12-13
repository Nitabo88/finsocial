package co.com.red5g.finsonet.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/reporte_liquidador_comisiones.feature",
        glue = {"co.com.red5g.finsonet.stepdefinitions"},
        snippets = SnippetType.CAMELCASE
)

public class ReporteLiquidacionComisionesRunner {
}