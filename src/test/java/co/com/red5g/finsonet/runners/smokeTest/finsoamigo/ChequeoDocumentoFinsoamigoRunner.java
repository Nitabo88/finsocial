package co.com.red5g.finsonet.runners.smokeTest.finsoamigo;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
    features = "src/test/resources/features/finsonet/chequeo_documento.feature",
    glue = "co.com.red5g.finsonet.stepdefinitions",
    tags = " @ChequeoDocumentosFinsoamigos",
    snippets = SnippetType.CAMELCASE)

public class ChequeoDocumentoFinsoamigoRunner {
}