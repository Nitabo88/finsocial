package co.com.red5g.finsonet.interacions;

import co.com.red5g.finsonet.models.AccionCdas;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import static co.com.red5g.finsonet.userinterfaces.CdasPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Completar implements Interaction {

  private final AccionCdas accionCdas;

  public Completar(AccionCdas accionCdas) {
    this.accionCdas = accionCdas;
  }

  public static Performable lasAccionesDeGestionCdas(AccionCdas accionCdas) {
    return instrumented(Completar.class, accionCdas);
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    for (int i = 0; i < BTN_ACCION_GESTION.resolveAllFor(actor).size(); i++) {
      actor.attemptsTo(
              Click.on(BTN_ACCION_GESTION.resolveAllFor(actor).get(i)),
              SelectFromOptions.byVisibleText(accionCdas.getSeleccionarGestion()).from(LST_SELECCIONAR_GESTION),
              Enter.theValue(accionCdas.getDetalleGestion()).into(TXT_MOTIVO_GESTION),
              Click.on(BTN_REGISTRAR),
              Click.on(BTN_CERRAR));
    }
  }
}
