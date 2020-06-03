package co.com.red5g.finsonet.tasks.factories;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import co.com.red5g.finsonet.models.CredencialesBD;
import co.com.red5g.finsonet.tasks.ConsultaBD;
import co.com.red5g.finsonet.tasks.SeguroVidaMundialPDF;
import net.serenitybdd.screenplay.Performable;

public class Obtiene {

  private Obtiene() {
  }

  public static Performable laInformacionDelPdfSeguroDeVidaMundial() {
    return instrumented(SeguroVidaMundialPDF.class);
  }

  public static Performable laInformacionDeBDDeSeguroDeVidaMundial(CredencialesBD credencialesBD, String sql) {
    return instrumented(ConsultaBD.class, credencialesBD, sql);
  }
}
