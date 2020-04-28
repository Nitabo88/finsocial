package co.com.red5g.questions.finsonet;

import static co.com.red5g.interacions.finsonet.Ingresar.NUMERO_CREDITO;
import static co.com.red5g.userinterfaces.finsonet.CdasPage.BTN_BUSQUEDA;
import static co.com.red5g.userinterfaces.finsonet.CdasPage.LBL_GESTION_DOCUMENTAL;
import static co.com.red5g.userinterfaces.finsonet.CdasPage.RDB_CRITERIO_BUSQUEDA;
import static co.com.red5g.userinterfaces.finsonet.CdasPage.TXT_VALOR_BUSQUEDA;
import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getProxiedDriver;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.JavaScriptClick;

public class GestionDocumental implements Question<String> {

  private static final String ID_CREDITO = "ID crédito";

  public static Question<String> estado() {
    return new GestionDocumental();
  }

  @Override
  public String answeredBy(Actor actor) {
    String numeroCredito = actor.recall(NUMERO_CREDITO);
    getProxiedDriver().navigate().refresh();
    actor.attemptsTo(
        JavaScriptClick.on(RDB_CRITERIO_BUSQUEDA.of(ID_CREDITO)),
        Enter.theValue(numeroCredito).into(TXT_VALOR_BUSQUEDA),
        Click.on(BTN_BUSQUEDA));
    return LBL_GESTION_DOCUMENTAL.of(numeroCredito).resolveFor(actor).getText();
  }
}