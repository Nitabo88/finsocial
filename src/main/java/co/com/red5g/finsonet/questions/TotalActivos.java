package co.com.red5g.finsonet.questions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import java.util.ArrayList;
import java.util.List;

import static co.com.red5g.finsonet.userinterfaces.FormularioSolicitudPaso4Page.*;
import static co.com.red5g.finsonet.utils.Utilerias.sumaValores;

public class TotalActivos implements Question<Boolean> {

    public static TotalActivos esCorrecto() {
        return new TotalActivos();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        List<String> lstValorActivos = new ArrayList<>();
        lstValorActivos.add (TXT_ACTIVOS_CORRIENTES.resolveFor(actor).getText());
        lstValorActivos.add( TXT_ACTIVOS_FIJOS.resolveFor(actor).getText());
        lstValorActivos.add(TXT_OTROS_ACTIVOS.resolveFor(actor).getText());
        return (sumaValores(lstValorActivos)) == Double.parseDouble(TXT_TOTAL_ACTIVOS.resolveFor(actor).getText().replaceAll("[^\\d]", ""));
    }
}
