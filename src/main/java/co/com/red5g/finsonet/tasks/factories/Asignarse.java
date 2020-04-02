package co.com.red5g.finsonet.tasks.factories;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import co.com.red5g.finsonet.tasks.AsignacionLlamadaFinsoamigo;
import co.com.red5g.finsonet.tasks.AsignacionLlamadaLibranza;
import net.serenitybdd.screenplay.Performable;

public class Asignarse {

  public static Performable laLlamadaDeLibranza() {
    return instrumented(AsignacionLlamadaLibranza.class);
  }

  public static Performable laLlamadaDeFinsoamigo() {
    return instrumented(AsignacionLlamadaFinsoamigo.class);
  }
}
