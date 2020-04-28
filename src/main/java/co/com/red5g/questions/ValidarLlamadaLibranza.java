package co.com.red5g.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.red5g.interacions.Ingresar.NUMERO_CREDITO;
import static co.com.red5g.userinterfaces.finsonet.CdasPage.*;
import static co.com.red5g.userinterfaces.finsonet.ModulosAdministracionPage.IMG_FINSONET;
import static co.com.red5g.userinterfaces.finsonet.ModulosAdministracionPage.LNK_CDAS;
import static co.com.red5g.userinterfaces.finsonet.ReporteVentasPage.SPN_CARGANDO;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isNotVisible;

public class ValidarLlamadaLibranza implements Question<String> {

  private static final String LLAMADA = "Llamada";
  private static final int TIEMPO = 150;

  @Override
  public String answeredBy(final Actor actor) {
    String numeroCredito = actor.recall(NUMERO_CREDITO);
    actor.attemptsTo(
        WaitUntil.the(SPN_CARGANDO, isNotVisible()).forNoMoreThan(TIEMPO).seconds(),
        Click.on(IMG_FINSONET),
        Click.on(LNK_CDAS),
        Enter.theValue(numeroCredito).into(TXT_VALOR_BUSQUEDA),
        Click.on(BTN_BUSQUEDA),
        Click.on(BTN_ACCION.of(numeroCredito))
    );
    return FRM_REQUISITOS_GIRO.of(LLAMADA).resolveFor(actor).getText();
  }
}
