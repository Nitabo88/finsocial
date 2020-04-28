package co.com.red5g.tasks.factories.finsonet;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import co.com.red5g.models.finsonet.Credito;
import co.com.red5g.tasks.finsonet.LlamadaCrediHuy;
import co.com.red5g.tasks.finsonet.LlamadaFinsoamigo;
import co.com.red5g.tasks.finsonet.LlamadaLibranza;
import co.com.red5g.tasks.finsonet.NuevoCredito;
import co.com.red5g.tasks.finsonet.SolicitudCredito;
import co.com.red5g.tasks.finsonet.VetoCliente;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Tasks;

public final class Ubicarse {

    private Ubicarse() {
    }

  public static Performable enNuevoCredito() {
    return instrumented(NuevoCredito.class);
  }

  public static Performable enElFormulario(Credito credito) {
    return Tasks.instrumented(SolicitudCredito.class, credito);
  }

  public static Performable enVetados() {
    return instrumented(VetoCliente.class);
  }

  public static Performable enLlamada(Credito credito) {
    return Tasks.instrumented(LlamadaLibranza.class,credito);
  }

  public static Performable enLlamadaFinsoamigo() {
    return instrumented(LlamadaFinsoamigo.class);
  }

  public static Performable enLlamadaCrediHuy(Credito credito) {
    return instrumented(LlamadaCrediHuy.class, credito);
  }
}