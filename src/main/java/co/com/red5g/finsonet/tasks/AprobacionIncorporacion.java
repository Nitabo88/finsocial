package co.com.red5g.finsonet.tasks;


import co.com.devco.automation.mobile.actions.WaitFor;
import co.com.red5g.finsonet.interacions.SeleccionarFecha;
import co.com.red5g.finsonet.models.Incorporacion;
import co.com.red5g.utils.UtileriaFechas;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.nio.file.Path;
import java.nio.file.Paths;

import static co.com.red5g.finsonet.interacions.Ingresar.NUMERO_CREDITO;
import static co.com.red5g.finsonet.userinterfaces.DataPickerPage.DTP_DIA;
import static co.com.red5g.finsonet.userinterfaces.IncorporacionPage.*;
import static co.com.red5g.finsonet.userinterfaces.PlanillaOriginacionPage.*;
import static co.com.red5g.utils.UtileriaFechas.manana;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class AprobacionIncorporacion implements Task {

  private static final int TIEMPO = 200;
  private final Incorporacion incorporacion;

  public AprobacionIncorporacion(Incorporacion incorporacion) {
    this.incorporacion = incorporacion;
  }

  @Override
  public <T extends Actor> void performAs(final T actor) {
    Path path = Paths.get("./src/test/resources/file/prueba.pdf");
    String numeroCredito = actor.recall(NUMERO_CREDITO);
    String diaManana = manana();
    actor.attemptsTo(
            WaitUntil.the(LST_INCORPORACION_NOMBRE.of(numeroCredito), isVisible()).forNoMoreThan(TIEMPO).seconds(),
            JavaScriptClick.on(LST_INCORPORACION_NOMBRE.of(numeroCredito)),
            WaitUntil.the(BTN_ACTUALIZAR_GESTION, isVisible()).forNoMoreThan(TIEMPO).seconds(),
            MoveMouse.to(BTN_ACTUALIZAR_GESTION),
            Click.on(BTN_ACTUALIZAR_GESTION),
            WaitUntil.the(LST_SELECCIONAR_GESTION, isVisible()).forNoMoreThan(TIEMPO).seconds(),
            SelectFromOptions.byVisibleText(this.incorporacion.getSeleccionarGestion()).from(LST_SELECCIONAR_GESTION),
            Enter.theValue(this.incorporacion.getRazonMotivo()).into(TXT_DETALLE_GESTION),
            Upload.theFile(path).to(LNK_FILE_UPLOAD),
            WaitUntil.the(BTN_REGISTRAR, isVisible()).forNoMoreThan(AprobacionIncorporacion.TIEMPO).seconds(),
            JavaScriptClick.on(BTN_REGISTRAR),
            WaitFor.seconds(3),
            WaitUntil.the(LST_ANIO_DESCUENTO, isVisible()).forNoMoreThan(AprobacionIncorporacion.TIEMPO).seconds(),
            MoveMouse.to(LST_ANIO_DESCUENTO),
            SelectFromOptions.byVisibleText(UtileriaFechas.obtenerPeriodoActual().split("-")[0]).from(LST_ANIO_DESCUENTO),
            SelectFromOptions.byValue(UtileriaFechas.obtenerPeriodoActual().split("-")[1]).from(LST_MES_DESCUENTO),
            MoveMouse.to(TXT_FECHA_LIQUIDACION_CREDITO),
            WaitFor.seconds(4));
    actor.attemptsTo(
            Click.on(TXT_FECHA_LIQUIDACION_CREDITO));
    actor.attemptsTo(
            Click.on(DTP_DIA.of(diaManana)));
    actor.attemptsTo(
            MoveMouse.to(BTN_APROBAR),
            Click.on(BTN_APROBAR),
            WaitFor.seconds(3),
            WaitUntil.the(BTN_OK, isVisible()).forNoMoreThan(TIEMPO).seconds(),
            Click.on(BTN_OK));
  }
}
