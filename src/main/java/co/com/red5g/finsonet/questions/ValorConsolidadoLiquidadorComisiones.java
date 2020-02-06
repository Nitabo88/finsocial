package co.com.red5g.finsonet.questions;

import static co.com.red5g.finsonet.userinterfaces.LiquidadorComisionesPage.BTN_CERRAR_DETALLE;
import static co.com.red5g.finsonet.userinterfaces.LiquidadorComisionesPage.BTN_DETALLE_CREDITOS;
import static co.com.red5g.finsonet.userinterfaces.LiquidadorComisionesPage.LBL_CIUDAD_DETALLE;
import static co.com.red5g.finsonet.userinterfaces.LiquidadorComisionesPage.LST_TOTALES_VALORES_CREDITOS;
import static co.com.red5g.finsonet.userinterfaces.LiquidadorComisionesPage.LST_VALOR_CREDITOS;
import static co.com.red5g.finsonet.userinterfaces.ReporteVentasPage.SPN_CARGANDO;
import static co.com.red5g.finsonet.utils.Utilerias.suma;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isNotVisible;

import java.util.List;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class ValorConsolidadoLiquidadorComisiones implements Question<Boolean> {

  @Override
  public Boolean answeredBy(Actor actor) {
    boolean estadoCredito = true;
    actor.attemptsTo(WaitUntil.the(SPN_CARGANDO, isNotVisible()).forNoMoreThan(300).seconds());
    List<WebElementFacade> lstValorCreditos = LST_VALOR_CREDITOS.resolveAllFor(actor);
    lstValorCreditos.remove(0);
    List<WebElementFacade> lstCiudades = LBL_CIUDAD_DETALLE.resolveAllFor(actor);
    lstCiudades.remove(0);
    int i = 0;
    while (i < lstValorCreditos.size()) {
      String valorCreditos = lstValorCreditos.get(i).getText().replaceAll("[^\\d]", "");
      String ciudad = lstCiudades.get(i).getText();
      actor.attemptsTo(JavaScriptClick.on(BTN_DETALLE_CREDITOS.of(ciudad)),
          WaitUntil.the(SPN_CARGANDO, isNotVisible()).forNoMoreThan(60).seconds());
      List<WebElementFacade> lstValorDetalleCreditos = LST_TOTALES_VALORES_CREDITOS.resolveAllFor(actor);
      lstValorDetalleCreditos.remove(0);
      estadoCredito = valorCreditos.equals(String.valueOf(suma(lstValorDetalleCreditos)));
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