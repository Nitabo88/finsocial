package co.com.red5g.finsonet.questions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import java.util.List;

import static co.com.red5g.finsonet.userinterfaces.LiquidadorComisionesPage.LST_CREDITOS_VENTA_DIRECTA;
import static co.com.red5g.finsonet.utils.Utilerias.suma;

public class ReporteLiquidacionComisionesVentaNueva implements Question <String> {
    public static ReporteLiquidacionComisionesVentaNueva esCorrecto() {
        return new ReporteLiquidacionComisionesVentaNueva();
    }

    @Override
    public String answeredBy(Actor actor) {
        List<WebElementFacade> lstNumeroCredito=LST_CREDITOS_VENTA_DIRECTA.resolveAllFor(actor);
        Double numeroCreditosDetalle = suma (lstNumeroCredito);
        return String.valueOf(numeroCreditosDetalle);
    }
}
