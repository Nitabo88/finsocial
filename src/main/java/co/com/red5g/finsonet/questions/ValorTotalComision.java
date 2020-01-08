package co.com.red5g.finsonet.questions;

import static co.com.red5g.finsonet.userinterfaces.LiquidadorComisionesPage.BTN_CERRAR_DETALLE;
import static co.com.red5g.finsonet.userinterfaces.LiquidadorComisionesPage.BTN_DETALLE_CREDITOS;
import static co.com.red5g.finsonet.userinterfaces.LiquidadorComisionesPage.LBL_CIUDAD_DETALLE;
import static co.com.red5g.finsonet.userinterfaces.LiquidadorComisionesPage.LST_TOTAL_VALOR_LIQUIDACION;
import static co.com.red5g.finsonet.userinterfaces.LiquidadorComisionesPage.LST_VALOR_LIQUIDACION;

import java.util.List;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.JavaScriptClick;

public class ValorTotalComision implements Question<Boolean> {

  @Override
  public Boolean answeredBy(Actor actor) {
    boolean estadoCredito = true;
    List<WebElementFacade> lstValorLiquidacion = LST_VALOR_LIQUIDACION.resolveAllFor(actor);
    lstValorLiquidacion.remove(0);
    List<WebElementFacade> lstCiudades = LBL_CIUDAD_DETALLE.resolveAllFor(actor);
    lstCiudades.remove(0);
    int i = 0;
    while (i < lstValorLiquidacion.size()) {
      String valorComision = lstValorLiquidacion.get(i).getText().replaceAll("[^\\d]", "");
      String ciudad = lstCiudades.get(i).getText();
      actor.attemptsTo(JavaScriptClick.on(BTN_DETALLE_CREDITOS.of(ciudad)));
      estadoCredito = valorComision.equals(LST_TOTAL_VALOR_LIQUIDACION.resolveFor(actor).getText().replaceAll("[^\\d]", ""));
      if (estadoCredito) {
        actor.attemptsTo(JavaScriptClick.on(BTN_CERRAR_DETALLE.of(ciudad)));
      } else {
        break;
      }
      i++;
    }
    return estadoCredito;
  }
}
