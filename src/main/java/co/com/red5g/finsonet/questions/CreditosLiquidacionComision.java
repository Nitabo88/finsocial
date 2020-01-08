package co.com.red5g.finsonet.questions;

import static co.com.red5g.finsonet.userinterfaces.LiquidadorComisionesPage.BTN_CERRAR_DETALLE;
import static co.com.red5g.finsonet.userinterfaces.LiquidadorComisionesPage.BTN_DETALLE_CREDITOS;
import static co.com.red5g.finsonet.userinterfaces.LiquidadorComisionesPage.LBL_CIUDAD_DETALLE;
import static co.com.red5g.finsonet.userinterfaces.LiquidadorComisionesPage.LST_NUMERO_CREDITOS;
import static co.com.red5g.finsonet.userinterfaces.LiquidadorComisionesPage.LST_TOTALES_NUMERO_CREDITOS;
import static co.com.red5g.finsonet.utils.Utilerias.suma;

import java.util.List;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.JavaScriptClick;

public class CreditosLiquidacionComision implements Question<Boolean> {

  @Override
  public Boolean answeredBy(Actor actor) {
    boolean estadoCredito = true;
    List<WebElementFacade> lstCreditos = LST_NUMERO_CREDITOS.resolveAllFor(actor);
    List<WebElementFacade> lstCiudades = LBL_CIUDAD_DETALLE.resolveAllFor(actor);
    lstCiudades.remove(0);
    int i = 0;
    while (i < lstCreditos.size()) {
      String ciudad = lstCiudades.get(i).getText();
      String numeroCreditos = lstCreditos.get(i).getText().replaceAll("[^\\d]", "");
      actor.attemptsTo(JavaScriptClick.on(BTN_DETALLE_CREDITOS.of(ciudad)));
      List<WebElementFacade> lstDetalleCreditos = LST_TOTALES_NUMERO_CREDITOS.resolveAllFor(actor);
      lstDetalleCreditos.remove(0);
      estadoCredito = numeroCreditos.equals(String.valueOf(suma(lstDetalleCreditos)));
      if (estadoCredito) {
        actor.attemptsTo(JavaScriptClick.on(BTN_CERRAR_DETALLE.of(ciudad)));
      } else {
        i = lstCreditos.size();
      }
      i++;
    }
    return estadoCredito;
  }
}
