package co.com.red5g.finsonet.tasks;

import co.com.red5g.finsonet.models.AprobacionCredito;
import net.serenitybdd.screenplay.Performable;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Negar {

    private Negar() {
    }

    public static Performable laAprobacionDelCreditoHuy(AprobacionCredito motivoNegacionCredito) {
        return instrumented(NegacionCreditoHuy.class, motivoNegacionCredito);
    }

    public static Performable laAprobacionDelCreditoDeLibranza(AprobacionCredito motivoNegacionCredito) {
        return instrumented(NegacionCreditoLibranza.class, motivoNegacionCredito);
    }
}
