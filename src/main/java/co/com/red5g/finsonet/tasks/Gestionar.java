package co.com.red5g.finsonet.tasks;

import static co.com.red5g.finsonet.interacions.CambiarPestanaActual.cambiarPestanaActual;
import static co.com.red5g.finsonet.interacions.CerrarPestana.cerrarPestana;
import static co.com.red5g.finsonet.interacions.Ingresar.NUMERO_CREDITO;
import static co.com.red5g.finsonet.userinterfaces.BusquedaGestionPage.BTN_GESTIONAR;
import static co.com.red5g.finsonet.userinterfaces.BusquedaGestionPage.RDB_CRITERIO_BUSQUEDA;
import static co.com.red5g.finsonet.userinterfaces.BusquedaGestionPage.TXT_BUSQUEDA;
import static co.com.red5g.finsonet.userinterfaces.ConfirmacionLLamadasPage.BTN_ACEPTAR;
import static co.com.red5g.finsonet.userinterfaces.ConfirmacionLLamadasPage.BTN_GUARDAR;
import static co.com.red5g.finsonet.userinterfaces.ConfirmacionLLamadasPage.CHK_RESPUESTA_CUATRO;
import static co.com.red5g.finsonet.userinterfaces.ConfirmacionLLamadasPage.CHK_RESPUESTA_QUINTO;
import static co.com.red5g.finsonet.userinterfaces.ConfirmacionLLamadasPage.TXT_OBSERVACION_LLAMADA;
import static co.com.red5g.finsonet.userinterfaces.LlamadasPage.MNU_HAMBURGUESA_LLAMADAS;
import static co.com.red5g.finsonet.userinterfaces.LlamadasPage.MNU_LLAMADAS;
import static co.com.red5g.finsonet.userinterfaces.ReporteVentasPage.SPN_CARGANDO;
import static co.com.red5g.utils.data.Constantes.TIEMPO_10;
import static co.com.red5g.utils.data.Constantes.TIEMPO_120;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isNotVisible;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

import co.com.red5g.finsonet.interacions.CerrarPestanaAnterior;
import co.com.red5g.utils.Utilerias;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

public class Gestionar implements Task {

  private static final String BUSQUEDA_GESTION = "Búsqueda de gestión";
  private static final String CRITERIO_BUSQUEDA = "ID";
  private static final String LLAMADA = "Llamada Verificada";

  public static Performable laLlamada() {
    return instrumented(Gestionar.class);
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    String numeroCredito = actor.recall(NUMERO_CREDITO);
    String respuestaCuatro = String.valueOf(Utilerias.random(1, 4));
    String respuestaCinco = String.valueOf(Utilerias.random(7, 10));
    actor.attemptsTo(
        WaitUntil.the(SPN_CARGANDO, isNotVisible()).forNoMoreThan(TIEMPO_120).seconds(),
        Click.on(MNU_HAMBURGUESA_LLAMADAS),
        Click.on(MNU_LLAMADAS.of(BUSQUEDA_GESTION)),
        WaitUntil.the(TXT_BUSQUEDA, isVisible()).forNoMoreThan(TIEMPO_10).seconds(),
        Click.on(RDB_CRITERIO_BUSQUEDA.of(CRITERIO_BUSQUEDA)),
        Enter.theValue(numeroCredito).into(TXT_BUSQUEDA).thenHit(Keys.ENTER),
        WaitUntil.the(SPN_CARGANDO, isNotVisible()).forNoMoreThan(TIEMPO_120).seconds(),
        Click.on(BTN_GESTIONAR.of(numeroCredito)),
        CerrarPestanaAnterior.cerrarPestanaAnterior(),
        cambiarPestanaActual(),
        Click.on(CHK_RESPUESTA_CUATRO.of(respuestaCuatro)),
        Click.on(CHK_RESPUESTA_QUINTO.of(respuestaCinco)),
        Enter.theValue(LLAMADA).into(TXT_OBSERVACION_LLAMADA.of(numeroCredito)),
        Click.on(BTN_GUARDAR.of(numeroCredito)),
        Click.on(BTN_ACEPTAR),
        cerrarPestana()
    );
  }
}
