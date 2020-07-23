package co.com.red5g.finsonet.tasks;

import static co.com.red5g.finsonet.interacions.CambiarPestanaActual.cambiarPestanaActual;
import static co.com.red5g.finsonet.interacions.Ingresar.NUMERO_CREDITO;
import static co.com.red5g.finsonet.userinterfaces.CdasPage.BTN_ATRAS;
import static co.com.red5g.finsonet.userinterfaces.CdasPage.BTN_BUSQUEDA;
import static co.com.red5g.finsonet.userinterfaces.CdasPage.BTN_DETALLE_GESTION;
import static co.com.red5g.finsonet.userinterfaces.CdasPage.RDB_CRITERIO_BUSQUEDA;
import static co.com.red5g.finsonet.userinterfaces.CdasPage.TXT_VALOR_BUSQUEDA;
import static co.com.red5g.finsonet.userinterfaces.ReporteVentasPage.SPN_CARGANDO;
import static co.com.red5g.utils.data.ConstantesTiempo.TIEMPO_3;
import static co.com.red5g.utils.data.ConstantesTiempo.TIEMPO_60;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isNotVisible;

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

public class Cdas implements Task {

  private AccionCdas accionCdas;
  private static final String ID_CREDITO = "ID crédito";

  public Cdas(AccionCdas accionCdas) {
    this.accionCdas = accionCdas;
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    String numeroCredito = actor.recall(NUMERO_CREDITO);
    actor.attemptsTo(
        WaitFor.seconds(TIEMPO_3),
        JavaScriptClick.on(RDB_CRITERIO_BUSQUEDA.of(ID_CREDITO)),
        Enter.theValue(numeroCredito).into(TXT_VALOR_BUSQUEDA),
        Click.on(BTN_BUSQUEDA),
        WaitFor.seconds(TIEMPO_3),
        JavaScriptClick.on(BTN_DETALLE_GESTION.of(numeroCredito)),
        CerrarPestanaAnterior.cerrarPestanaAnterior(),
        cambiarPestanaActual(),
        WaitUntil.the(SPN_CARGANDO, isNotVisible()).forNoMoreThan(TIEMPO_60).seconds(),
        Completar.lasAccionesDeGestionCdas(accionCdas),
        WaitUntil.the(SPN_CARGANDO, isNotVisible()).forNoMoreThan(TIEMPO_60).seconds(),
        Click.on(BTN_ATRAS)
    );
  }
}
