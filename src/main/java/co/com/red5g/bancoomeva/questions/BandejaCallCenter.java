package co.com.red5g.bancoomeva.questions;

import static co.com.red5g.bancoomeva.tasks.FirmaPreAprobado.ID_GESTION;
import static co.com.red5g.bancoomeva.userinterfaces.BandejaCallCenterPage.BTN_FILTRO;
import static co.com.red5g.bancoomeva.userinterfaces.BandejaCallCenterPage.LBL_BANDEJA_CALL_CENTER;
import static co.com.red5g.bancoomeva.userinterfaces.BandejaCallCenterPage.LBL_FILA_TIPO;
import static co.com.red5g.bancoomeva.userinterfaces.BandejaCallCenterPage.TXT_FILTRO_ID;
import static co.com.red5g.bancoomeva.userinterfaces.BandejaFabricaPage.MNM_PUNTOS;
import static co.com.red5g.bancoomeva.userinterfaces.CallCenterPage.LBL_CALL_CENTER;
import static co.com.red5g.bancoomeva.userinterfaces.DashBoardPage.LBL_MENSAJE_DASHBOARD;
import static co.com.red5g.bancoomeva.userinterfaces.DashBoardPage.LNK_CALL_CENTER;

import co.com.red5g.bancoomeva.userinterfaces.CallCenterPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.ensure.Ensure;

public class BandejaCallCenter implements Question<String> {

  private static final String CALL_CENTER = "Banca Express + / Call center";
  private static final String BANDEJA_CALL_CENTER = "CallCenter";

  @Override
  public String answeredBy(Actor actor) {
    String idGestion = actor.recall(ID_GESTION);
    actor.attemptsTo(Click.on(MNM_PUNTOS));
    actor.attemptsTo(Ensure.that(LBL_MENSAJE_DASHBOARD).isDisplayed());
    actor.attemptsTo(Click.on(LNK_CALL_CENTER));
    actor.attemptsTo(Ensure.that(LBL_CALL_CENTER.resolveFor(actor).getText()).contains(CALL_CENTER));
    actor.attemptsTo(Click.on(CallCenterPage.LNK_CALL_CENTER));
    actor.attemptsTo(Ensure.that(LBL_BANDEJA_CALL_CENTER.resolveFor(actor).getText()).contains(BANDEJA_CALL_CENTER));
    actor.attemptsTo(Enter.theValue(idGestion).into(TXT_FILTRO_ID));
    actor.attemptsTo(Click.on(BTN_FILTRO));
    return LBL_FILA_TIPO.resolveFor(actor).getText();
  }
}
