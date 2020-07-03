package co.com.red5g.finsonet.tasks.factories;

import co.com.red5g.finsonet.models.Credito;
import co.com.red5g.finsonet.tasks.*;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public final class Ubicarse {

    private Ubicarse() {
    }

  public static Performable enNuevoCredito() {
    return instrumented(NuevoCredito.class);
  }

  public static Performable enElFormulario(Credito credito) {
    return instrumented(SolicitudCredito.class, credito);
  }

  public static Performable enVetados() {
    return instrumented(VetoCliente.class);
  }

  public static Performable enLlamada(Credito credito) {
    return instrumented(LlamadaLibranza.class, credito);
  }

  public static Performable enLlamadaFinsoamigo() {
    return instrumented(LlamadaFinsoamigo.class);
  }

  public static Performable enLlamadaCrediHuy(Credito credito) {
    return instrumented(LlamadaCrediHuy.class, credito);
  }

  public static Performable enElModuloEquipoSatisfaccion() {
    return instrumented(EquipoSatisfaccion.class);
  }

  public static Performable enContactCenter() {
    return instrumented(ContactCenter.class);
  }

  public static Performable enElFormularioCrediHuy(Credito credito) {
    return instrumented(SolicitudCreditoHuy.class, credito);
  }
}