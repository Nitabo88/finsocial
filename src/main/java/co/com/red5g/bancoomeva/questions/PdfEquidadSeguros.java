package co.com.red5g.bancoomeva.questions;

import static co.com.red5g.bancoomeva.userinterfaces.GmailHomePage.LNK_ARCHIVO_0151;
import static co.com.red5g.general.interactions.CambiarPestanaActual.cambiarPestanaActual;
import static co.com.red5g.utils.pdf.LeerPdf.leerPdf;

import java.io.IOException;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.Click;

public class PdfEquidadSeguros implements Question<String> {

  @Override
  public String answeredBy(Actor actor) {
    actor.attemptsTo(
        Click.on(LNK_ARCHIVO_0151),
        cambiarPestanaActual()
    );
    try {
      return leerPdf();
    } catch (IOException e) {
      e.printStackTrace();
    }
    return "";
  }
}
