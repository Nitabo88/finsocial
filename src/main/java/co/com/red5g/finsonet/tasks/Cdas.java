package co.com.red5g.finsonet.tasks;

import static co.com.red5g.finsonet.interacions.CambiarPestanaActual.cambiarPestanaActual;
import static co.com.red5g.finsonet.interacions.CerrarPestana.cerrarPestana;
import static co.com.red5g.finsonet.interacions.Ingresar.NUMERO_CREDITO;
import static co.com.red5g.finsonet.userinterfaces.CdasPage.BTN_ACCION_CERTIFICACIONES;
import static co.com.red5g.finsonet.userinterfaces.CdasPage.BTN_ACCION_DOCUMENTACION;
import static co.com.red5g.finsonet.userinterfaces.CdasPage.BTN_ACCION_VOBO;
import static co.com.red5g.finsonet.userinterfaces.CdasPage.BTN_ATRAS;
import static co.com.red5g.finsonet.userinterfaces.CdasPage.BTN_BUSQUEDA;
import static co.com.red5g.finsonet.userinterfaces.CdasPage.BTN_CERRAR;
import static co.com.red5g.finsonet.userinterfaces.CdasPage.BTN_DETALLE_GESTION;
import static co.com.red5g.finsonet.userinterfaces.CdasPage.BTN_REGISTRAR;
import static co.com.red5g.finsonet.userinterfaces.CdasPage.LST_SELECCIONAR_GESTION;
import static co.com.red5g.finsonet.userinterfaces.CdasPage.RDB_CRITERIO_BUSQUEDA;
import static co.com.red5g.finsonet.userinterfaces.CdasPage.TXT_MOTIVO_GESTION;
import static co.com.red5g.finsonet.userinterfaces.CdasPage.TXT_VALOR_BUSQUEDA;

import co.com.red5g.finsonet.models.AccionCdas;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class Cdas implements Task {

  final AccionCdas accionCdas;

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
        JavaScriptClick.on(BTN_BUSQUEDA),
        JavaScriptClick.on(BTN_DETALLE_GESTION.of(numeroCredito)),
        cerrarPestana(),
        cambiarPestanaActual(),
        Click.on(BTN_ACCION_VOBO),
        SelectFromOptions.byVisibleText(accionCdas.getSeleccionarGestion()).from(LST_SELECCIONAR_GESTION),
        Enter.theValue(accionCdas.getDetalleGestion()).into(TXT_MOTIVO_GESTION),
        Click.on(BTN_REGISTRAR),
        Click.on(BTN_CERRAR),
        Click.on(BTN_ACCION_DOCUMENTACION),
        SelectFromOptions.byVisibleText(accionCdas.getSeleccionarGestion()).from(LST_SELECCIONAR_GESTION),
        Enter.theValue(accionCdas.getDetalleGestion()).into(TXT_MOTIVO_GESTION),
        Click.on(BTN_REGISTRAR),
        Click.on(BTN_CERRAR),
        Click.on(BTN_ACCION_CERTIFICACIONES),
        SelectFromOptions.byVisibleText(accionCdas.getSeleccionarGestion()).from(LST_SELECCIONAR_GESTION),
        Enter.theValue(accionCdas.getDetalleGestion()).into(TXT_MOTIVO_GESTION),
        Click.on(BTN_REGISTRAR),
        Click.on(BTN_CERRAR),
        Click.on(BTN_ATRAS)
    );
  }
}
