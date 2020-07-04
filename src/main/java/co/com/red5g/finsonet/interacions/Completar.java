package co.com.red5g.finsonet.interacions;

import static co.com.red5g.finsonet.userinterfaces.CdasPage.BTN_ACCION_GESTION;
import static co.com.red5g.finsonet.userinterfaces.CdasPage.BTN_CERRAR;
import static co.com.red5g.finsonet.userinterfaces.CdasPage.BTN_REGISTRAR;
import static co.com.red5g.finsonet.userinterfaces.CdasPage.LST_SELECCIONAR_GESTION;
import static co.com.red5g.finsonet.userinterfaces.CdasPage.TXT_MOTIVO_GESTION;
import static co.com.red5g.finsonet.userinterfaces.ReporteVentasPage.SPN_CARGANDO;
import static co.com.red5g.utils.data.ConstantesTiempo.TIEMPO_60;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isNotVisible;

import co.com.red5g.finsonet.models.AccionCdas;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.waits.WaitUntil;

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
          WaitUntil.the(SPN_CARGANDO, isNotVisible()).forNoMoreThan(TIEMPO_60).seconds(),
          Click.on(BTN_ACCION_GESTION.resolveAllFor(actor).get(i)),
          SelectFromOptions.byVisibleText(accionCdas.getSeleccionarGestion()).from(LST_SELECCIONAR_GESTION),
          Enter.theValue(accionCdas.getDetalleGestion()).into(TXT_MOTIVO_GESTION),
          Click.on(BTN_REGISTRAR),
          Click.on(BTN_CERRAR));
    }
  }
}
