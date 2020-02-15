package co.com.red5g.finsonet.questions;

import static co.com.red5g.finsonet.userinterfaces.LiquidadorComisionesPage.BTN_DETALLE_CREDITOS;
import static co.com.red5g.finsonet.userinterfaces.LiquidadorComisionesPage.LST_NOMBRE_ASESOR;
import static co.com.red5g.finsonet.userinterfaces.ReporteVentasPage.SPN_CARGANDO;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isNotVisible;

import java.util.List;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class NombreAsesores implements Question<List<WebElementFacade>> {

  private String ciudad;

  public NombreAsesores(String ciudad) {
    this.ciudad = ciudad;
  }

  public static NombreAsesores obtenerNombres(String ciudad) {
    return new NombreAsesores(ciudad);
  }

  @Override
  public List<WebElementFacade> answeredBy(Actor actor) {
    actor.attemptsTo(
        JavaScriptClick.on(BTN_DETALLE_CREDITOS.of(ciudad)),
        WaitUntil.the(SPN_CARGANDO, isNotVisible()).forNoMoreThan(30).seconds());
    List<WebElementFacade> lstNombreAsesor = LST_NOMBRE_ASESOR.resolveAllFor(actor);
    lstNombreAsesor.remove(lstNombreAsesor.size() - 1);
    return lstNombreAsesor;
  }
}
