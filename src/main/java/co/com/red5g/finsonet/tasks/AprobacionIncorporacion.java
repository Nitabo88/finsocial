package co.com.red5g.finsonet.tasks;


import static co.com.red5g.finsonet.interacions.Ingresar.NUMERO_CREDITO;
import static co.com.red5g.finsonet.userinterfaces.IncorporacionPage.BTN_APROBAR;
import static co.com.red5g.finsonet.userinterfaces.IncorporacionPage.BTN_OK;
import static co.com.red5g.finsonet.userinterfaces.IncorporacionPage.LST_INCORPORACION_NOMBRE;
import static co.com.red5g.finsonet.userinterfaces.PlanillaOriginacionPage.BTN_ACTUALIZAR_GESTION;
import static co.com.red5g.finsonet.userinterfaces.PlanillaOriginacionPage.BTN_REGISTRAR;
import static co.com.red5g.finsonet.userinterfaces.PlanillaOriginacionPage.BTN_SELECCIONE_ARCHIVO;
import static co.com.red5g.finsonet.userinterfaces.PlanillaOriginacionPage.LST_SELECCIONAR_GESTION;
import static co.com.red5g.finsonet.userinterfaces.PlanillaOriginacionPage.TXT_DETALLE_GESTION;

import co.com.red5g.finsonet.models.Incorporacion;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class AprobacionIncorporacion implements Task {

  Logger logger;

  private Incorporacion incorporacion;

  public AprobacionIncorporacion(final Incorporacion incorporacion) {
    this.incorporacion = incorporacion;
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    final String numeroCredito = actor.recall(NUMERO_CREDITO);
    actor.attemptsTo(
        JavaScriptClick.on(LST_INCORPORACION_NOMBRE.of(numeroCredito)),
        JavaScriptClick.on(BTN_ACTUALIZAR_GESTION),
        SelectFromOptions.byVisibleText(incorporacion.getSeleccionarGestion()).from(LST_SELECCIONAR_GESTION),
        Enter.theValue(incorporacion.getRazonMotivo()).into(TXT_DETALLE_GESTION),
        JavaScriptClick.on(BTN_SELECCIONE_ARCHIVO));
    try {
      final String RUTA_SCRIPT = "C:/Users/Licet/Documents/sqa_code/src/test/resources/scripts/FileUpload.exe";
      Runtime.getRuntime().exec(RUTA_SCRIPT);
    } catch (final IOException e) {
      this.logger.log(Level.INFO, String.valueOf(e));
    }
    actor.attemptsTo(
        JavaScriptClick.on(BTN_REGISTRAR),
        JavaScriptClick.on(BTN_APROBAR),
        JavaScriptClick.on(BTN_OK)
    );
  }
}
