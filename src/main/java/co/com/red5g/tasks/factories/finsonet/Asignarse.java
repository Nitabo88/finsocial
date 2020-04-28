package co.com.red5g.tasks.factories.finsonet;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import co.com.red5g.tasks.finsonet.AsignacionLlamadaCrediHuy;
import co.com.red5g.tasks.finsonet.AsignacionLlamadaFinsoamigo;
import co.com.red5g.tasks.finsonet.AsignacionLlamadaLibranza;
import net.serenitybdd.screenplay.Performable;

public class Asignarse {

  private Asignarse() {
  }

  public static Performable laLlamadaDeLibranza() {
    return instrumented(AsignacionLlamadaLibranza.class);
  }

  public static Performable laLlamadaDeFinsoamigo() {
    return instrumented(AsignacionLlamadaFinsoamigo.class);
  }

  public static Performable laLlamadaCrediHuy() {
    return instrumented(AsignacionLlamadaCrediHuy.class);
  }
}
