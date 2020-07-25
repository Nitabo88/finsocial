package co.com.red5g.finsonet.runners.smokeTest.finsoamigo.pdfs;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/finsonet/soportes_tesoreria_finsoamigo.feature", tags = "@DesafiliacionActival",glue = "co.com.red5g.finsonet.stepdefinitions", snippets =
    SnippetType.CAMELCASE)

public class PdfDesafiliacionActivalRunner {

}