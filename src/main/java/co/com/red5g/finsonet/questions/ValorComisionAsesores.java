package co.com.red5g.finsonet.questions;

import static co.com.red5g.finsonet.questions.NombreAsesores.obtenerNombres;
import static co.com.red5g.finsonet.userinterfaces.LiquidadorComisionesPage.BTN_ATRAS;
import static co.com.red5g.finsonet.userinterfaces.LiquidadorComisionesPage.BTN_CERRAR_DETALLE;
import static co.com.red5g.finsonet.userinterfaces.LiquidadorComisionesPage.BTN_VER_DETALLE_LIQUIDACION;
import static co.com.red5g.finsonet.userinterfaces.LiquidadorComisionesPage.LBL_CIUDAD_DETALLE;
import static co.com.red5g.finsonet.userinterfaces.LiquidadorComisionesPage.LBL_PORCENTAJE_COMISION;
import static co.com.red5g.finsonet.userinterfaces.LiquidadorComisionesPage.LST_MONTO_ASESOR;
import static co.com.red5g.finsonet.userinterfaces.LiquidadorComisionesPage.LST_TOTALES_VALORES_LIQUIDACION;
import static co.com.red5g.finsonet.userinterfaces.ReporteVentasPage.SPN_CARGA;
import static co.com.red5g.finsonet.utils.Utilerias.suma;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isNotVisible;

import java.util.List;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class ValorComisionAsesores implements Question<Boolean> {

  @Override
  public Boolean answeredBy(Actor actor) {
    boolean estadoCredito = true;
    List<WebElementFacade> lstCiudades = LBL_CIUDAD_DETALLE.resolveAllFor(actor);
    lstCiudades.remove(0);
    int i = 0;
    while (i < lstCiudades.size()) {
      String ciudad = lstCiudades.get(i).getText();
      List<WebElementFacade> lstNombreAsesor = obtenerNombres(ciudad).answeredBy(actor);
      for (int j = 0; j < lstNombreAsesor.size(); j++) {
        List<WebElementFacade> lstDetalleAsesores = (LST_MONTO_ASESOR.of(lstNombreAsesor.get(j).getText())).resolveAllFor(actor);
        lstDetalleAsesores.remove(0);
        long sumaDetalleMonto = suma(lstDetalleAsesores);
        String valorComision = LST_TOTALES_VALORES_LIQUIDACION.resolveAllFor(actor).get(j).getText().replaceAll("[^\\d]", "");
        actor.attemptsTo(
            JavaScriptClick.on(BTN_VER_DETALLE_LIQUIDACION.of(lstNombreAsesor.get(j).getText()))
        );
        double porcentajeComision = Double.parseDouble(String.valueOf(LBL_PORCENTAJE_COMISION.resolveFor(actor).getText().split(" %")[0]));
        estadoCredito = valorComision.equals(String.valueOf(Long.valueOf((long) Math.floor(sumaDetalleMonto * porcentajeComision / 100))));
        if (estadoCredito) {
          actor.attemptsTo(
              JavaScriptClick.on(BTN_ATRAS)
          );
        } else {
          break;
        }
      }
      actor.attemptsTo(JavaScriptClick.on(BTN_CERRAR_DETALLE.of(ciudad)),
          WaitUntil.the(SPN_CARGA, isNotVisible()).forNoMoreThan(30).seconds());
      i++;
    }
    return estadoCredito;
  }
}