package co.com.red5g.finsonet.tasks.factories;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import co.com.red5g.finsonet.tasks.ChequeoDocumento;
import net.serenitybdd.screenplay.Performable;

public class Realizar {

  public static Performable unChequeoDeDocumento() {
    return instrumented(ChequeoDocumento.class);
  }

  public static Performable laLlamada() {return instrumented()
  }
}
