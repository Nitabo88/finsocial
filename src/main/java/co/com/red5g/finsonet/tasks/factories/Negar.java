package co.com.red5g.finsonet.tasks.factories;

import co.com.red5g.finsonet.models.AprobacionCredito;
import co.com.red5g.finsonet.tasks.NegacionCreditoHuy;
import co.com.red5g.finsonet.tasks.NegacionCreditoLibranza;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Tasks;

public class Negar {

    private Negar() {
    }

    public static Performable laAprobacionDelCreditoHuy(AprobacionCredito motivoNegacionCredito) {
        return Tasks.instrumented(NegacionCreditoHuy.class, motivoNegacionCredito);
    }

    public static Performable laAprobacionDelCreditoDeLibranza(AprobacionCredito motivoNegacionCredito) {
        return Tasks.instrumented(NegacionCreditoLibranza.class, motivoNegacionCredito);
    }
}
