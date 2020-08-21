package co.com.red5g.finsonet.tasks;


import static co.com.red5g.finsonet.userinterfaces.IncorporacionPage.BTN_APROBAR;
import static co.com.red5g.finsonet.userinterfaces.IncorporacionPage.BTN_OK;
import static co.com.red5g.finsonet.userinterfaces.IncorporacionPage.LST_INCORPORACION_NOMBRE;
import static co.com.red5g.finsonet.userinterfaces.PlanillaOriginacionPage.BTN_ACTUALIZAR_GESTION;
import static co.com.red5g.finsonet.userinterfaces.PlanillaOriginacionPage.BTN_REGISTRAR;
import static co.com.red5g.finsonet.userinterfaces.PlanillaOriginacionPage.LBL_DATOS_LIBRANZA;
import static co.com.red5g.finsonet.userinterfaces.PlanillaOriginacionPage.LNK_FILE_UPLOAD;
import static co.com.red5g.finsonet.userinterfaces.PlanillaOriginacionPage.LST_ANIO_DESCUENTO;
import static co.com.red5g.finsonet.userinterfaces.PlanillaOriginacionPage.LST_MES_DESCUENTO;
import static co.com.red5g.finsonet.userinterfaces.PlanillaOriginacionPage.LST_SELECCIONAR_GESTION;
import static co.com.red5g.finsonet.userinterfaces.PlanillaOriginacionPage.TXT_DETALLE_GESTION;
import static co.com.red5g.finsonet.userinterfaces.PlanillaOriginacionPage.TXT_FECHA_LIQUIDACION_CREDITO;
import static co.com.red5g.utils.data.Constantes.NUMERO_CREDITO;
import static co.com.red5g.utils.data.ConstantesTiempo.TIEMPO_10;
import static co.com.red5g.utils.data.ConstantesTiempo.TIEMPO_3;
import static co.com.red5g.utils.data.ConstantesTiempo.TIEMPO_60;
import static co.com.red5g.utils.string.UtileriaFechas.sumarRestarDias;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

import co.com.devco.automation.mobile.actions.WaitFor;
import co.com.red5g.finsonet.interacions.SeleccionarFecha;
import co.com.red5g.finsonet.models.Incorporacion;
import co.com.red5g.utils.string.UtileriaFechas;
import java.nio.file.Path;
import java.nio.file.Paths;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.actions.MoveMouse;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.actions.Upload;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class AprobacionIncorporacion implements Task {

  private final Incorporacion incorporacion;

  public AprobacionIncorporacion(Incorporacion incorporacion) {
    this.incorporacion = incorporacion;
  }

  @Override
  public <T extends Actor> void performAs(final T actor) {
    Path path = Paths.get("./src/test/resources/file/prueba.pdf");
    String numeroCredito = actor.recall(NUMERO_CREDITO);
    String fechaPosterior = sumarRestarDias(1);
    actor.attemptsTo(
        WaitUntil.the(LST_INCORPORACION_NOMBRE.of(numeroCredito), isVisible()).forNoMoreThan(TIEMPO_60).seconds(),
        JavaScriptClick.on(LST_INCORPORACION_NOMBRE.of(numeroCredito)),
        WaitUntil.the(BTN_ACTUALIZAR_GESTION, isVisible()).forNoMoreThan(TIEMPO_60).seconds(),
        MoveMouse.to(BTN_ACTUALIZAR_GESTION),
        Click.on(BTN_ACTUALIZAR_GESTION),
        WaitUntil.the(LST_SELECCIONAR_GESTION, isVisible()).forNoMoreThan(TIEMPO_60).seconds(),
        SelectFromOptions.byVisibleText(this.incorporacion.getSeleccionarGestion()).from(LST_SELECCIONAR_GESTION),
        Enter.theValue(this.incorporacion.getRazonMotivo()).into(TXT_DETALLE_GESTION),
        Upload.theFile(path).to(LNK_FILE_UPLOAD),
        WaitUntil.the(BTN_REGISTRAR, isVisible()).forNoMoreThan(TIEMPO_60).seconds(),
        JavaScriptClick.on(BTN_REGISTRAR),
        WaitFor.seconds(TIEMPO_3),
        WaitUntil.the(LST_ANIO_DESCUENTO, isVisible()).forNoMoreThan(TIEMPO_10).seconds(),
        MoveMouse.to(LST_ANIO_DESCUENTO),
        SelectFromOptions.byVisibleText(UtileriaFechas.obtenerPeriodoActual().split("-")[0]).from(LST_ANIO_DESCUENTO),
        SelectFromOptions.byValue(UtileriaFechas.obtenerPeriodoActual().split("-")[1]).from(LST_MES_DESCUENTO),
        MoveMouse.to(LBL_DATOS_LIBRANZA),
        SeleccionarFecha.deConsulta(TXT_FECHA_LIQUIDACION_CREDITO, fechaPosterior),
        WaitFor.seconds(TIEMPO_3));
    actor.attemptsTo(
        WaitUntil.the(BTN_APROBAR, isVisible()).forNoMoreThan(TIEMPO_10).seconds(),
        Scroll.to(BTN_APROBAR).andAlignToBottom(),
        Click.on(BTN_APROBAR),
        WaitFor.seconds(TIEMPO_3),
        Click.on(BTN_OK));
  }
}
