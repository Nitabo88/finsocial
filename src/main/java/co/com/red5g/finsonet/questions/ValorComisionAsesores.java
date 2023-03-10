package co.com.red5g.finsonet.questions;

import static co.com.red5g.general.interactions.CambiarPestanaActual.cambiarPestanaActual;
import static co.com.red5g.general.interactions.CerrarPestana.cerrarPestana;
import static co.com.red5g.finsonet.questions.EstadoCredito.estadoCredito;
import static co.com.red5g.finsonet.questions.MontoAsesor.montoAsesor;
import static co.com.red5g.finsonet.questions.NombreAsesores.obtenerNombres;
import static co.com.red5g.finsonet.questions.ValorComision.valorComision;
import static co.com.red5g.finsonet.userinterfaces.LiquidadorComisionesPage.BTN_CERRAR_DETALLE;
import static co.com.red5g.finsonet.userinterfaces.LiquidadorComisionesPage.BTN_VER_DETALLE_LIQUIDACION;
import static co.com.red5g.finsonet.userinterfaces.LiquidadorComisionesPage.LBL_CIUDAD_DETALLE;
import static co.com.red5g.finsonet.userinterfaces.ReporteVentasPage.SPN_CARGANDO;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isNotVisible;

import java.util.List;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class ValorComisionAsesores implements Question<Boolean> {

  private static final int TIEMPO = 300;

  @Override
  public Boolean answeredBy(Actor actor) {
    boolean respuestaCredito = true;
    List<WebElementFacade> lstCiudades = LBL_CIUDAD_DETALLE.resolveAllFor(actor);
    lstCiudades.remove(0);
    for (WebElementFacade lstCiudade : lstCiudades) {
      String ciudad = lstCiudade.getText();
      List<WebElementFacade> lstNombreAsesor = obtenerNombres(ciudad).answeredBy(actor);
      for (WebElementFacade webElementFacade : lstNombreAsesor) {
        String nombreAsesor = webElementFacade.getText();
        Long montoTotalAsesor = montoAsesor(nombreAsesor).answeredBy(actor);
        Double valorComisionAsesor = valorComision(nombreAsesor).answeredBy(actor);
        actor.attemptsTo(
            JavaScriptClick.on(BTN_VER_DETALLE_LIQUIDACION.of(nombreAsesor)));
        actor.attemptsTo(
            cambiarPestanaActual());
        respuestaCredito = estadoCredito(montoTotalAsesor, valorComisionAsesor).answeredBy(actor);
        if (respuestaCredito) {
          actor.attemptsTo(
              cerrarPestana(),
              cambiarPestanaActual());
        } else {
          break;
        }
      }
      actor.attemptsTo(
          JavaScriptClick.on(BTN_CERRAR_DETALLE.of(ciudad)),
          WaitUntil.the(SPN_CARGANDO, isNotVisible()).forNoMoreThan(TIEMPO).seconds()
      );
    }
    return respuestaCredito;
  }
}