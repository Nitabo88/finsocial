package co.com.red5g.finsonet.tasks;

import co.com.red5g.finsonet.models.Credito;
import co.com.red5g.finsonet.tasks.factories.Consulta;
import co.com.red5g.finsonet.tasks.factories.Diligencia;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.conditions.Check;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.red5g.finsonet.models.builders.IncorporacionBuilder.con;
import static co.com.red5g.finsonet.userinterfaces.IncorporacionPage.LBL_INCORPORACION;
import static co.com.red5g.finsonet.userinterfaces.OriginacionPage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class Formalizacion implements Task {

  private static final String MNM_FORMALIZACION = "Formalización";
  private static final int TIEMPO = 200;

  private final Credito credito;

  public Formalizacion(Credito credito) {
    this.credito = credito;
  }

  @Override
  public <T extends Actor> void performAs(final T actor) {
    actor.attemptsTo(
        Consulta.elCreditoEnIncorporacion(credito),
        Diligencia.laAprobacionDelCreditoEnIncorporacion(con().aprobacion()));
    actor.attemptsTo(
        Check.whether(!LBL_INCORPORACION.resolveFor(actor).isVisible())
            .andIfSo(
                Click.on(MNM_ORIGINACION.of(MNM_FORMALIZACION))
            ).otherwise(
            WaitUntil.the(LBL_INCORPORACION, isVisible()).forNoMoreThan(TIEMPO).seconds(),
            Click.on(MNM_HAMBURGUESA),
            Click.on(MNM_NUEVO_ORIGINACION.of(MNM_FORMALIZACION))));
  }
}
