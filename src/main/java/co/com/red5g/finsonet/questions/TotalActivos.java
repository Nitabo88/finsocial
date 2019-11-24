package co.com.red5g.finsonet.questions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import java.util.ArrayList;
import java.util.List;

import static co.com.red5g.finsonet.userinterfaces.FormularioSolicitudPaso4Page.*;

public class TotalActivos implements Question<Boolean> {

    public static TotalActivos esCorrecto() {
        return new TotalActivos();
    }


    @Override
    public Boolean answeredBy(Actor actor) {
        List<WebElementFacade> lstActivos = new ArrayList<>();
        lstActivos.add (TXT_ACTIVOS_CORRIENTES.resolveFor(actor));
        lstActivos.add( TXT_ACTIVOS_FIJOS.resolveFor(actor));
        lstActivos.add(TXT_OTROS_ACTIVOS.resolveFor(actor));
        Double valorTotalActivos= Double.parseDouble(TXT_TOTAL_ACTIVOS.resolveFor(actor).getText().replaceAll("[^\\d]", ""));
        return true;
    }
}
