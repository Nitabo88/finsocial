package co.com.red5g.finsonet.runners.jubiladas.credihuy;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/finsonet/formulario_solicitud_credito.feature", glue = "co.com.red5g.finsonet.stepdefinitions", tags = "@FormularioCredihuy",snippets = SnippetType.CAMELCASE)

public class FormularioSolicitudCredihuyRunner {
}
