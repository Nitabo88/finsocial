package co.com.red5g.finsonet.tasks.factories;

import co.com.red5g.finsonet.tasks.EquipoSatisfaccion;
import co.com.red5g.finsonet.tasks.SolicitudCredito;
import co.com.red5g.finsonet.tasks.NuevoCredito;
import co.com.red5g.finsonet.tasks.Vetados;
import net.serenitybdd.screenplay.Performable;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Ubicarse {

    public static Performable enNuevoCredito() {
        return instrumented(NuevoCredito.class);
    }

    public static Performable enElFormulario() {
        return instrumented(SolicitudCredito.class);
    }

    public static Performable enVetados() {
        return instrumented(Vetados.class);
    }

    public static Performable enContact() {
        return instrumented(EquipoSatisfaccion.class);
    }


}