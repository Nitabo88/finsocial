package co.com.red5g.finsonet.tasks;


import static co.com.red5g.finsonet.interacions.Ingresar.NUMERO_CREDITO;
import static co.com.red5g.finsonet.userinterfaces.IncorporacionPage.BTN_APROBAR;
import static co.com.red5g.finsonet.userinterfaces.IncorporacionPage.BTN_OK;
import static co.com.red5g.finsonet.userinterfaces.IncorporacionPage.LST_INCORPORACION_NOMBRE;
import static co.com.red5g.finsonet.userinterfaces.PlanillaOriginacionPage.BTN_ACTUALIZAR_GESTION;
import static co.com.red5g.finsonet.userinterfaces.PlanillaOriginacionPage.BTN_REGISTRAR;
import static co.com.red5g.finsonet.userinterfaces.PlanillaOriginacionPage.LNK_FILE_UPLOAD;
import static co.com.red5g.finsonet.userinterfaces.PlanillaOriginacionPage.LST_ANIO_DESCUENTO;
import static co.com.red5g.finsonet.userinterfaces.PlanillaOriginacionPage.LST_MES_DESCUENTO;
import static co.com.red5g.finsonet.userinterfaces.PlanillaOriginacionPage.LST_SELECCIONAR_GESTION;
import static co.com.red5g.finsonet.userinterfaces.PlanillaOriginacionPage.TXT_DETALLE_GESTION;
import static co.com.red5g.finsonet.utils.UtileriaFechas.obtenerPeriodoActual;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

import co.com.red5g.finsonet.models.Incorporacion;
import java.nio.file.Path;
import java.nio.file.Paths;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.actions.Upload;
import net.serenitybdd.screenplay.waits.WaitUntil;

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
    actor.attemptsTo(
        WaitUntil.the(LST_INCORPORACION_NOMBRE.of(numeroCredito), isVisible()).forNoMoreThan(TIEMPO).seconds(),
        JavaScriptClick.on(LST_INCORPORACION_NOMBRE.of(numeroCredito)),
        WaitUntil.the(BTN_ACTUALIZAR_GESTION, isVisible()).forNoMoreThan(TIEMPO).seconds(),
        JavaScriptClick.on(BTN_ACTUALIZAR_GESTION),
        WaitUntil.the(LST_SELECCIONAR_GESTION, isVisible()).forNoMoreThan(TIEMPO).seconds(),
        SelectFromOptions.byVisibleText(this.incorporacion.getSeleccionarGestion()).from(LST_SELECCIONAR_GESTION),
        Enter.theValue(this.incorporacion.getRazonMotivo()).into(TXT_DETALLE_GESTION),
        Upload.theFile(path).to(LNK_FILE_UPLOAD),
        WaitUntil.the(BTN_REGISTRAR, isVisible()).forNoMoreThan(AprobacionIncorporacion.TIEMPO).seconds(),
        JavaScriptClick.on(BTN_REGISTRAR),
        WaitUntil.the(LST_ANIO_DESCUENTO, isVisible()).forNoMoreThan(AprobacionIncorporacion.TIEMPO).seconds(),
        SelectFromOptions.byVisibleText(obtenerPeriodoActual().split("-")[0]).from(LST_ANIO_DESCUENTO),
        SelectFromOptions.byValue(obtenerPeriodoActual().split("-")[1]).from(LST_MES_DESCUENTO),
        JavaScriptClick.on(BTN_APROBAR),
        WaitUntil.the(BTN_OK, isVisible()).forNoMoreThan(AprobacionIncorporacion.TIEMPO).seconds(),
        Click.on(BTN_OK)
    );
  }
}
