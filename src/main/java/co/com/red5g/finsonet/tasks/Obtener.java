package co.com.red5g.finsonet.tasks;

import static co.com.red5g.utils.LeerPdf.leerPdf;
import static net.serenitybdd.screenplay.Tasks.instrumented;

import co.com.devco.automation.mobile.actions.WaitFor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;

public class Obtener implements Task {

  private static final String INFORMACION_PDF = "Informacion Pdf";

  public static Performable laInformacionDelPdf() {
    return instrumented(Obtener.class);
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(
        WaitFor.seconds(5)
    );
    actor.remember(INFORMACION_PDF, leerPdf());
  }
}
