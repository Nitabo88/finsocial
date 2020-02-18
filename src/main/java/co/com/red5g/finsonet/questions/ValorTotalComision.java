package co.com.red5g.finsonet.questions;

import static co.com.red5g.finsonet.userinterfaces.LiquidadorComisionesPage.BTN_CERRAR_DETALLE;
import static co.com.red5g.finsonet.userinterfaces.LiquidadorComisionesPage.BTN_DETALLE_CREDITOS;
import static co.com.red5g.finsonet.userinterfaces.LiquidadorComisionesPage.LBL_CIUDAD_DETALLE;
import static co.com.red5g.finsonet.userinterfaces.LiquidadorComisionesPage.LST_TOTAL_VALOR_LIQUIDACION;
import static co.com.red5g.finsonet.userinterfaces.LiquidadorComisionesPage.LST_VALOR_LIQUIDACION;
import static co.com.red5g.finsonet.userinterfaces.ReporteVentasPage.SPN_CARGANDO;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isNotVisible;

import java.util.List;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class ValorTotalComision implements Question<Boolean> {

  private static final int TIEMPO = 300;

  @Override
  public Boolean answeredBy(final Actor actor) {
    boolean estadoCredito = true;
    final List<WebElementFacade> lstValorLiquidacion = LST_VALOR_LIQUIDACION.resolveAllFor(actor);
    lstValorLiquidacion.remove(0);
    final List<WebElementFacade> lstCiudades = LBL_CIUDAD_DETALLE.resolveAllFor(actor);
    lstCiudades.remove(0);
    for (int i = 0; i < lstValorLiquidacion.size(); i++) {
      final String valorComision = lstValorLiquidacion.get(i).getText().replaceAll("[^\\d]", "");
      final String ciudad = lstCiudades.get(i).getText();
      actor.attemptsTo(
          JavaScriptClick.on(BTN_DETALLE_CREDITOS.of(ciudad)),
          WaitUntil.the(SPN_CARGANDO, isNotVisible()).forNoMoreThan(TIEMPO).seconds());
      estadoCredito = valorComision.equals(LST_TOTAL_VALOR_LIQUIDACION.resolveFor(actor).getText().replaceAll("[^\\d]", ""));
      if (estadoCredito) {
        actor.attemptsTo(JavaScriptClick.on(BTN_CERRAR_DETALLE.of(ciudad)));
      } else {
        i = lstValorLiquidacion.size();
      }
    }
    return estadoCredito;
  }
}