package co.com.red5g.finsonet.questions;

import static co.com.red5g.finsonet.userinterfaces.LiquidadorComisionesPage.BTN_DETALLE_CREDITOS;
import static co.com.red5g.finsonet.userinterfaces.LiquidadorComisionesPage.LST_NOMBRE_ASESOR;

import java.util.List;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.JavaScriptClick;

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
        JavaScriptClick.on(BTN_DETALLE_CREDITOS.of(ciudad)));
    List<WebElementFacade> lstNombreAsesor = LST_NOMBRE_ASESOR.resolveAllFor(actor);
    lstNombreAsesor.remove(lstNombreAsesor.size() - 1);
    return lstNombreAsesor;
  }
}
