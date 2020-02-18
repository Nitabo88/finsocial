package co.com.red5g.finsonet.tasks.factories;

import co.com.red5g.finsonet.tasks.Llamada;
import co.com.red5g.finsonet.tasks.SolicitudCredito;
import co.com.red5g.finsonet.tasks.NuevoCredito;
import net.serenitybdd.screenplay.Performable;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Ubicarse {

    private Ubicarse() {
    }

    public static Performable enNuevoCredito() {
        return instrumented(NuevoCredito.class);
    }

    public static Performable enElFormulario() {
        return instrumented(SolicitudCredito.class);
    }

    public static Performable enLlamada() {
        return instrumented(Llamada.class);
    }
}