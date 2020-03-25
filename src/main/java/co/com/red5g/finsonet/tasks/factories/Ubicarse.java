package co.com.red5g.finsonet.tasks.factories;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import co.com.red5g.finsonet.tasks.NuevoCredito;
import co.com.red5g.finsonet.tasks.NuevoCreditoHuy;
import co.com.red5g.finsonet.tasks.SolicitudCredito;
import co.com.red5g.finsonet.tasks.VetoCliente;
import co.com.red5g.finsonet.tasks.Llamada;
import net.serenitybdd.screenplay.Performable;

public final class Ubicarse {

    private Ubicarse() {
    }

  public static Performable enNuevoCredito() {
    return instrumented(NuevoCredito.class);
  }

  public static Performable enElFormulario() {
    return instrumented(SolicitudCredito.class);
  }

  public static Performable enNuevoCreditoHuy() { return instrumented(NuevoCreditoHuy.class); }

  public static Performable enVetados() { return instrumented(VetoCliente.class); }

    public static Performable enLlamada() { return instrumented(Llamada.class); }
}