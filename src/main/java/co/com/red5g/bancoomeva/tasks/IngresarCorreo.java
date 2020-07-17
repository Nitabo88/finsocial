package co.com.red5g.bancoomeva.tasks;

import static co.com.red5g.bancoomeva.questions.CodigoBancoomeva.numeroCodigo;
import static co.com.red5g.bancoomeva.userinterfaces.GmailHomePage.TXT_BUSCAR_CORREO;
import static co.com.red5g.utils.data.ConstantesTiempo.TIEMPO_10;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

public class IngresarCorreo implements Task {

  private static final String BUSQUEDA = "Bancoomeva en Linea <bancoomeva_en_linea@coomeva.com.co>";
  public static final String CODIGO = "Codigo para seguir con el prestamo";

  public static Performable buscarCorreo() {
    return instrumented(IngresarCorreo.class);
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(
        WaitUntil.the(TXT_BUSCAR_CORREO, isPresent()).forNoMoreThan(TIEMPO_10).seconds(),
        Enter.theValue(BUSQUEDA).into(TXT_BUSCAR_CORREO).thenHit(Keys.ENTER)
    );
    actor.remember(CODIGO, actor.asksFor(numeroCodigo()));
  }
}
