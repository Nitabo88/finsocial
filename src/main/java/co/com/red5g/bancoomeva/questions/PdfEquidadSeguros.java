package co.com.red5g.bancoomeva.questions;

import static co.com.red5g.bancoomeva.userinterfaces.GmailHomePage.LNK_ARCHIVO_0151;
import static co.com.red5g.general.interactions.CambiarPestanaActual.cambiarPestanaActual;

import java.util.HashMap;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.Open;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PdfEquidadSeguros implements Question<String> {

  private static final String REST_API_URL = "http://10.10.1.55:8082/test";

  @Override
  public String answeredBy(Actor actor) {
    ChromeOptions options = new ChromeOptions();
    HashMap<String, Object> chromeOptionsMap = new HashMap<String, Object>();
    chromeOptionsMap.put("plugins.plugins_disabled", new String[]{
        "Chrome PDF Viewer"
    });
    chromeOptionsMap.put("plugins.always_open_pdf_externally", true);
    options.setExperimentalOption("prefs", chromeOptionsMap);
    String downloadFilepath = "./src/test/resources/file";
    chromeOptionsMap.put("download.default_directory", downloadFilepath);
     String url = LNK_ARCHIVO_0151.resolveFor(actor).getAttribute("href");
    actor.attemptsTo(Open.url(url), cambiarPestanaActual());

    return "";
  }
}
