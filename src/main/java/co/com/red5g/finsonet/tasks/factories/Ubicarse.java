package co.com.red5g.finsonet.tasks.factories;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import co.com.red5g.finsonet.tasks.EquipoSatisfaccion;
import co.com.red5g.finsonet.tasks.SolicitudCredito;
import co.com.red5g.finsonet.tasks.NuevoCredito;
import co.com.red5g.finsonet.tasks.NuevoCreditoHuy;
import co.com.red5g.finsonet.tasks.Vetados;
import net.serenitybdd.screenplay.Performable;

public class Ubicarse {

    private Ubicarse() {
    }

  public static Performable enNuevoCredito() {
    return instrumented(NuevoCredito.class);
  }

  public static Performable enElFormulario() {
    return instrumented(SolicitudCredito.class);
  }

  public static Performable enNuevoCreditoHuy() {
    return instrumented(NuevoCreditoHuy.class);
  }
    public static Performable enVetados() {
        return instrumented(Vetados.class);
    }

    public static Performable enContact() {
        return instrumented(EquipoSatisfaccion.class);
    }
}