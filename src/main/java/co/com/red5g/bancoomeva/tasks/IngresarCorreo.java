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

  String busqueda;

  public static final String CODIGO = "Codigo para seguir con el prestamo";

  public IngresarCorreo(String busqueda) {
   this.busqueda = busqueda;
  }

  public static Performable buscarCorreo(String busqueda) {
    return instrumented(IngresarCorreo.class, busqueda);
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(
        WaitUntil.the(TXT_BUSCAR_CORREO, isPresent()).forNoMoreThan(TIEMPO_10).seconds(),
        Enter.theValue(busqueda).into(TXT_BUSCAR_CORREO).thenHit(Keys.ENTER)
    );
    actor.remember(CODIGO, actor.asksFor(numeroCodigo(busqueda)));
  }
}
