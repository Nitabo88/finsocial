package co.com.red5g.bancoomeva.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
    features = "src/test/resources/features/bancoomeva/flujo_call_center.feature",
    glue = "co.com.red5g.bancoomeva.stepsdefinitions",
    snippets = SnippetType.CAMELCASE)
public class FlujoCallCenterRunner {}
