package co.com.red5g.finsonet.tasks.factories;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import co.com.red5g.finsonet.tasks.ChequeoDocumentoLibranza;
import co.com.red5g.finsonet.tasks.ModuloLlamada;
import net.serenitybdd.screenplay.Performable;

public class Realiza {

  private Realiza() {
  }

  public static Performable unChequeoDeDocumento() {
    return instrumented(ChequeoDocumentoLibranza.class);
  }

  public static Performable laLlamada() {
    return instrumented(ModuloLlamada.class);
  }
}
