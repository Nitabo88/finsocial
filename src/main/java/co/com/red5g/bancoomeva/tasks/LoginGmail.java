package co.com.red5g.bancoomeva.tasks;

import static co.com.red5g.general.interactions.ChangeUrl.onBrowser;
import static co.com.red5g.bancoomeva.userinterfaces.GmailLoginPage.BTN_SIGUIENTE_CONTRASENA;
import static co.com.red5g.bancoomeva.userinterfaces.GmailLoginPage.BTN_SIGUIENTE_EMAIL;
import static co.com.red5g.bancoomeva.userinterfaces.GmailLoginPage.TXT_CONTRASENA;
import static co.com.red5g.bancoomeva.userinterfaces.GmailLoginPage.TXT_EMAIL;
import static co.com.red5g.utils.data.ConstantesTiempo.TIEMPO_3;
import static net.serenitybdd.screenplay.Tasks.instrumented;

import co.com.devco.automation.mobile.actions.WaitFor;
import co.com.red5g.general.interactions.OpenNewTab;
import co.com.red5g.utils.data.Emails;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.conditions.Check;

public class LoginGmail implements Task {

  Emails emails;
  public static final String EMAIL = "https://mail.google.com/mail/";

  public LoginGmail(Emails emails) {
    this.emails = emails;
  }

  public static Performable ingresarEnGmail(Emails emails) {
    return instrumented(LoginGmail.class, emails);
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(
        OpenNewTab.onBrowser(emails.getUrl()));
    actor.attemptsTo(
        Check.whether(TXT_EMAIL.resolveFor(actor).isPresent()).andIfSo(
            Enter.theValue(emails.getEmail()).into(TXT_EMAIL),
            Click.on(BTN_SIGUIENTE_EMAIL),
            Enter.theValue(emails.getContrasena()).into(TXT_CONTRASENA),
            Click.on(BTN_SIGUIENTE_CONTRASENA),
            WaitFor.seconds(TIEMPO_3),
            onBrowser(EMAIL)
        ).otherwise(onBrowser(EMAIL)));
  }
}
