package co.com.red5g.finsonet.tasks;

import co.com.devco.automation.mobile.actions.WaitFor;
import co.com.red5g.finsonet.interacions.CerrarPestanaAnterior;
import co.com.red5g.finsonet.interacions.Completar;
import co.com.red5g.finsonet.models.AccionCdas;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.red5g.finsonet.interacions.CambiarPestanaActual.cambiarPestanaActual;
import static co.com.red5g.finsonet.interacions.Ingresar.NUMERO_CREDITO;
import static co.com.red5g.finsonet.userinterfaces.CdasPage.*;
import static co.com.red5g.finsonet.userinterfaces.ReporteVentasPage.SPN_CARGANDO;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isNotVisible;

public class Cdas implements Task {

  private static final int TIEMPO = 300;
  private final AccionCdas accionCdas;
  private static final String ID_CREDITO = "ID crédito";

  public Cdas(AccionCdas accionCdas) {
    this.accionCdas = accionCdas;
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    String numeroCredito = actor.recall(NUMERO_CREDITO);
    actor.attemptsTo(
            WaitFor.seconds(2),
            JavaScriptClick.on(RDB_CRITERIO_BUSQUEDA.of(ID_CREDITO)),
            Enter.theValue(numeroCredito).into(TXT_VALOR_BUSQUEDA),
            Click.on(BTN_BUSQUEDA),
            WaitFor.seconds(2),
            JavaScriptClick.on(BTN_DETALLE_GESTION.of(numeroCredito)),
            CerrarPestanaAnterior.cerrarPestanaAnterior(),
            cambiarPestanaActual(),
            WaitUntil.the(SPN_CARGANDO, isNotVisible()).forNoMoreThan(TIEMPO).seconds(),
            Completar.lasAccionesDeGestionCdas(accionCdas),
            WaitUntil.the(SPN_CARGANDO, isNotVisible()).forNoMoreThan(TIEMPO).seconds(),
            Click.on(BTN_ATRAS)
    );
  }
}
