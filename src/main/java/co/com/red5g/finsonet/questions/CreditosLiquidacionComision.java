package co.com.red5g.finsonet.questions;

import static co.com.red5g.finsonet.userinterfaces.LiquidadorComisionesPage.BTN_CERRAR_DETALLE;
import static co.com.red5g.finsonet.userinterfaces.LiquidadorComisionesPage.BTN_DETALLE_CREDITOS;
import static co.com.red5g.finsonet.userinterfaces.LiquidadorComisionesPage.LBL_CIUDAD_DETALLE;
import static co.com.red5g.finsonet.userinterfaces.LiquidadorComisionesPage.LST_NUMERO_CREDITOS;
import static co.com.red5g.finsonet.userinterfaces.LiquidadorComisionesPage.LST_TOTALES_NUMERO_CREDITOS;
import static co.com.red5g.finsonet.userinterfaces.ReporteVentasPage.SPN_CARGANDO;
import static co.com.red5g.utils.Utilerias.suma;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isNotVisible;

import java.util.List;
import java.util.regex.Pattern;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class CreditosLiquidacionComision implements Question<Boolean> {

  private static final int TIEMPO = 60;
  private static final Pattern FORMATO = Pattern.compile("[^\\d]");

  @Override
  public Boolean answeredBy(Actor actor) {
    boolean estadoCredito = true;
    List<WebElementFacade> lstCreditos = LST_NUMERO_CREDITOS.resolveAllFor(actor);
    List<WebElementFacade> lstCiudades = LBL_CIUDAD_DETALLE.resolveAllFor(actor);
    lstCiudades.remove(0);
    int i = 0;
    while (i < lstCreditos.size()) {
      String ciudad = lstCiudades.get(i).getText();
      String numeroCreditos = FORMATO.matcher(lstCreditos.get(i).getText()).replaceAll("");
      actor.attemptsTo(JavaScriptClick.on(BTN_DETALLE_CREDITOS.of(ciudad)),
          WaitUntil.the(SPN_CARGANDO, isNotVisible()).forNoMoreThan(TIEMPO).seconds());
      List<WebElementFacade> lstDetalleCreditos = LST_TOTALES_NUMERO_CREDITOS.resolveAllFor(actor);
      lstDetalleCreditos.remove(0);
      estadoCredito = numeroCreditos.equals(String.valueOf(suma(lstDetalleCreditos)));
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
