package co.com.red5g.finsonet.tasks.factories;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import co.com.red5g.finsonet.models.Credito;
import co.com.red5g.finsonet.tasks.ChequeoDocumentoLibranza;
import co.com.red5g.finsonet.tasks.ModuloLlamada;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Tasks;

public class Realiza {

  private Realiza() {
  }

  public static Performable unChequeoDeDocumento(Credito credito) {
    return Tasks.instrumented(ChequeoDocumentoLibranza.class, credito);
  }

  public static Performable laLlamada() {
    return instrumented(ModuloLlamada.class);
  }
}
