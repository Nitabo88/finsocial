package co.com.red5g.bancoomeva.questions;

import static co.com.red5g.bancoomeva.tasks.LoginGmail.ingresarEnGmail;
import static co.com.red5g.bancoomeva.userinterfaces.GmailHomePage.LBL_CORREO_CARTA_COMERCIAL;
import static co.com.red5g.bancoomeva.userinterfaces.GmailHomePage.TBL_PRODUCTO_CORREO;
import static co.com.red5g.utils.data.Emails.OTP_BANCOMEVA;

import java.util.List;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.JavaScriptClick;

public class CartaComercial implements Question<String> {

  @Override
  public String answeredBy(Actor actor) {
    actor.attemptsTo(
        ingresarEnGmail(OTP_BANCOMEVA));
    List<WebElementFacade> correo = LBL_CORREO_CARTA_COMERCIAL.resolveAllFor(actor);
    actor.attemptsTo(
        JavaScriptClick.on(correo.get(0)));
    return TBL_PRODUCTO_CORREO.resolveFor(actor).getTextContent();
  }
}
