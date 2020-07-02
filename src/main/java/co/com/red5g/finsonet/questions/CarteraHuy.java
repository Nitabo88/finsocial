package co.com.red5g.finsonet.questions;

import static co.com.red5g.finsonet.interacions.Ingresar.NUMERO_CREDITO;
import static co.com.red5g.finsonet.tasks.InformacionCreditoHuy.CEDULA_ACTOR;
import static co.com.red5g.finsonet.userinterfaces.CarteraPage.LST_FILA_CARTERA;
import static co.com.red5g.finsonet.userinterfaces.CarteraPage.TXT_CEDULA;
import static co.com.red5g.finsonet.userinterfaces.OriginacionPage.MNM_HAMBURGUESA;
import static co.com.red5g.finsonet.userinterfaces.OriginacionPage.MNM_NUEVO_ORIGINACION;
import static co.com.red5g.finsonet.userinterfaces.ReporteVentasPage.SPN_CARGANDO;
import static co.com.red5g.utils.data.Constantes.TIEMPO_60;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isNotVisible;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.actions.MoveMouse;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

public class CarteraHuy implements Question<Boolean> {

  private static final String CARTERA = "Cartera";

  @Override
  public Boolean answeredBy(Actor actor) {
    String numeroCredito = actor.recall(NUMERO_CREDITO);
    String numeroCedula = actor.recall(CEDULA_ACTOR);
    actor.attemptsTo(
        JavaScriptClick.on(MNM_HAMBURGUESA),
        JavaScriptClick.on(MNM_NUEVO_ORIGINACION.of(CARTERA)),
        WaitUntil.the(SPN_CARGANDO, isNotVisible()).forNoMoreThan(TIEMPO_60).seconds(),
        Enter.theValue(numeroCedula).into(TXT_CEDULA).thenHit(Keys.ENTER),
        WaitUntil.the(SPN_CARGANDO, isNotVisible()).forNoMoreThan(TIEMPO_60).seconds(),
        MoveMouse.to(LST_FILA_CARTERA.of(numeroCredito))
    );
    return LST_FILA_CARTERA.of(numeroCredito).resolveFor(actor).isPresent();
  }
}
