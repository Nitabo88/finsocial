package co.com.red5g.finsonet.questions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import java.util.List;

import static co.com.red5g.finsonet.userinterfaces.ReporteVentasPage.*;
import static co.com.red5g.finsonet.utils.Utilerias.suma;

public class CreditosReporteVentaNueva implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        return LBL_NUMERO_CREDITOS_VENTA_NUEVA.resolveFor(actor).getText().replaceAll("[^\\d]", "");
    }
}