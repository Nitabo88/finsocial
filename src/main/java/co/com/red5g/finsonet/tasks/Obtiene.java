package co.com.red5g.finsonet.tasks;

import static co.com.red5g.utils.conexionbd.ConexionBaseDatos.getLogger;
import static co.com.red5g.utils.pdf.LeerPdf.leerPdf;
import static co.com.red5g.utils.pdf.LeerPdf.procesarPdf;
import static net.serenitybdd.screenplay.Tasks.instrumented;

import java.io.IOException;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;

public class Obtiene implements Task {

  public static final String INFORMACION_PDF = "Informacion Pdf";
  public static final String NUMERO_FILAS = "numero filas";

  public static Performable laInformacionDelPdf() {
    return instrumented(Obtiene.class);
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    try {
      actor.remember(INFORMACION_PDF, leerPdf());
      actor.remember(NUMERO_FILAS, procesarPdf(leerPdf()).size());
    } catch (IOException e) {
      getLogger().info("No hay información del pdf");
    }
  }
}
