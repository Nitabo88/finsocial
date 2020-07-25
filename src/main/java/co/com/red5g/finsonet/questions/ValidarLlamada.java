package co.com.red5g.finsonet.questions;

import static co.com.red5g.utils.data.Constantes.NUMERO_CREDITO;
import static co.com.red5g.finsonet.userinterfaces.BusquedaGestionPage.LBL_GESTION;
import static co.com.red5g.finsonet.userinterfaces.BusquedaGestionPage.RDB_CRITERIO_BUSQUEDA;
import static co.com.red5g.finsonet.userinterfaces.BusquedaGestionPage.TXT_BUSQUEDA;
import static co.com.red5g.finsonet.userinterfaces.ReporteVentasPage.SPN_CARGANDO;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isNotVisible;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

public class ValidarLlamada implements Question<String> {

  private static final String CRITERIO_BUSQUEDA = "ID";
  private static final int TIEMPO = 150;

  @Override
  public String answeredBy(Actor actor) {
    String numeroCredito = actor.recall(NUMERO_CREDITO);
    actor.attemptsTo(
        Click.on(RDB_CRITERIO_BUSQUEDA.of(CRITERIO_BUSQUEDA)),
        Enter.theValue(numeroCredito).into(TXT_BUSQUEDA).thenHit(Keys.ENTER),
        WaitUntil.the(SPN_CARGANDO, isNotVisible()).forNoMoreThan(TIEMPO).seconds()
    );
    return LBL_GESTION.resolveFor(actor).getText();
  }
}
