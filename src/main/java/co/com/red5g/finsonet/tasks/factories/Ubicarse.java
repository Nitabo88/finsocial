package co.com.red5g.finsonet.tasks.factories;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import co.com.red5g.finsonet.models.Credito;
import co.com.red5g.finsonet.tasks.ContactCenter;
import co.com.red5g.finsonet.tasks.EquipoSatisfaccion;
import co.com.red5g.finsonet.tasks.LlamadaCrediHuy;
import co.com.red5g.finsonet.tasks.LlamadaFinsoamigo;
import co.com.red5g.finsonet.tasks.LlamadaLibranza;
import co.com.red5g.finsonet.tasks.NuevoCredito;
import co.com.red5g.finsonet.tasks.SolicitudCredito;
import co.com.red5g.finsonet.tasks.SolicitudCreditoHuy;
import co.com.red5g.finsonet.tasks.VetoCliente;
import net.serenitybdd.screenplay.Performable;

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