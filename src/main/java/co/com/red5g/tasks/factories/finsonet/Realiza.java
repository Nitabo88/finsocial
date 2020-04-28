package co.com.red5g.tasks.factories.finsonet;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import co.com.red5g.models.finsonet.Credito;
import co.com.red5g.tasks.finsonet.ChequeoDocumentoLibranza;
import co.com.red5g.tasks.finsonet.ModuloLlamada;
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
