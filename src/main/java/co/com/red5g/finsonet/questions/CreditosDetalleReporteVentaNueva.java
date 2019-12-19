package co.com.red5g.finsonet.questions;

import static co.com.red5g.finsonet.userinterfaces.ReporteVentasPage.LST_CREDITO_DETALLE_VENTA_NUEVA;
import static co.com.red5g.finsonet.utils.Utilerias.suma;

import java.util.List;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class CreditosDetalleReporteVentaNueva implements Question<String> {

  @Override
  public String answeredBy(Actor actor) {
    List<WebElementFacade> lstNumeroCredito = LST_CREDITO_DETALLE_VENTA_NUEVA.resolveAllFor(actor);
    lstNumeroCredito.remove(0);
    return String.valueOf(suma(lstNumeroCredito));
  }
}