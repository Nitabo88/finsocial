package co.com.red5g.tasks.finsonet;

import static co.com.red5g.interacions.finsonet.CambiarPestanaActual.cambiarPestanaActual;
import static co.com.red5g.interacions.finsonet.Ingresar.NUMERO_CREDITO;
import static co.com.red5g.userinterfaces.finsonet.CdasPage.BTN_ATRAS;
import static co.com.red5g.userinterfaces.finsonet.CdasPage.BTN_BUSQUEDA;
import static co.com.red5g.userinterfaces.finsonet.CdasPage.BTN_DETALLE_GESTION;
import static co.com.red5g.userinterfaces.finsonet.CdasPage.RDB_CRITERIO_BUSQUEDA;
import static co.com.red5g.userinterfaces.finsonet.CdasPage.TXT_VALOR_BUSQUEDA;

import co.com.red5g.interacions.finsonet.Completar;
import co.com.red5g.models.finsonet.AccionCdas;
import co.com.red5g.interacions.finsonet.CerrarPestanaAnterior;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.JavaScriptClick;

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
        JavaScriptClick.on(RDB_CRITERIO_BUSQUEDA.of(ID_CREDITO)),
        Enter.theValue(numeroCredito).into(TXT_VALOR_BUSQUEDA),
        Click.on(BTN_BUSQUEDA),
        JavaScriptClick.on(BTN_DETALLE_GESTION.of(numeroCredito)),
        CerrarPestanaAnterior.cerrarPestanaAnterior(),
        cambiarPestanaActual(),
        Completar.lasAccionesDeGestionCdas(accionCdas),
        Click.on(BTN_ATRAS)
    );
  }
}
