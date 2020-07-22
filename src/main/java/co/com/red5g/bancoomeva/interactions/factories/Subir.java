package co.com.red5g.bancoomeva.interactions.factories;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import co.com.red5g.bancoomeva.interactions.SubirDocumentos;
import net.serenitybdd.screenplay.Performable;

public class Subir {

  public static Performable documentosCallCenter() {
    return instrumented(SubirDocumentos.class);
  }
}
