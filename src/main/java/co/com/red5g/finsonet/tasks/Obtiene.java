package co.com.red5g.finsonet.tasks;

import static co.com.red5g.finsonet.interacions.CambiarPestanaActual.cambiarPestanaActual;
import static co.com.red5g.finsonet.interacions.ModificarUrl.modificarUrl;
import static co.com.red5g.finsonet.userinterfaces.SoportesNuevosPage.LBL_SOPORTES_NUEVOS;
import static co.com.red5g.finsonet.userinterfaces.SoportesNuevosPage.LNK_FORMATO;
import static co.com.red5g.utils.conexionbd.ConexionBaseDatos.getLogger;
import static co.com.red5g.utils.pdf.LeerPdf.leerPdf;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

import java.io.IOException;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class Obtiene implements Task {

  public static final String INFORMACION_PDF = "Informacion Pdf";
  private static final int TIEMPO = 60;
  private String pdf;

  public Obtiene(String pdf) {
    this.pdf = pdf;
  }

  public static Performable laInformacionDelPdf(String pdf) {
    return instrumented(Obtiene.class, pdf);
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(
        WaitUntil.the(LBL_SOPORTES_NUEVOS, isPresent()).forNoMoreThan(TIEMPO).seconds(),
        Click.on(LNK_FORMATO.of(pdf)),
        cambiarPestanaActual(),
        modificarUrl());
    try {
      actor.remember(INFORMACION_PDF, leerPdf());
    } catch (IOException e) {
      getLogger().info("No respondió la base de datos");
    }
  }
}
