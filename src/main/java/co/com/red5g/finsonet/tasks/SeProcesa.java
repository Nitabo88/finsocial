package co.com.red5g.finsonet.tasks;

import static co.com.red5g.finsonet.interacions.CambiarPestanaActual.cambiarPestanaActual;
import static co.com.red5g.finsonet.interacions.CerrarPestanaAnterior.cerrarPestanaAnterior;
import static co.com.red5g.finsonet.interacions.Ingresar.NUMERO_CREDITO;
import static co.com.red5g.finsonet.userinterfaces.BusquedaGestionPage.TXT_BUSQUEDA;
import static co.com.red5g.finsonet.userinterfaces.ConfirmacionLLamadasPage.BTN_ACEPTAR;
import static co.com.red5g.finsonet.userinterfaces.ConfirmacionLLamadasPage.BTN_CERTIFICACION_LLAMADAS;
import static co.com.red5g.finsonet.userinterfaces.ConfirmacionLLamadasPage.BTN_GUARDAR;
import static co.com.red5g.finsonet.userinterfaces.ConfirmacionLLamadasPage.CHK_RESPUESTA_CUATRO;
import static co.com.red5g.finsonet.userinterfaces.ConfirmacionLLamadasPage.CHK_RESPUESTA_QUINTO;
import static co.com.red5g.finsonet.userinterfaces.ConfirmacionLLamadasPage.TXT_OBSERVACION_LLAMADA;
import static co.com.red5g.finsonet.userinterfaces.LlamadasPage.LST_FILA_LLAMADAS;
import static co.com.red5g.finsonet.userinterfaces.LlamadasPage.MNU_HAMBURGUESA_LLAMADAS;
import static co.com.red5g.finsonet.userinterfaces.LlamadasPage.MNU_LLAMADAS;
import static co.com.red5g.finsonet.userinterfaces.ReporteVentasPage.SPN_CARGANDO;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isNotVisible;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class SeProcesa implements Task {

    private static final String BUSQUEDA_GESTION = "Búsqueda de gestión";
    private static final String LLAMADA = "Proceso Exitoso";
    private static final int TIEMPO = 300;
    public static Performable laLlamadaLibranza() {
        return instrumented(SeProcesa.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        String numeroCredito = actor.recall(NUMERO_CREDITO);
        theActorInTheSpotlight().attemptsTo(
            WaitUntil.the(SPN_CARGANDO, isNotVisible()).forNoMoreThan(TIEMPO).seconds(),
            WaitUntil.the(LST_FILA_LLAMADAS.of(numeroCredito), isVisible()),
            JavaScriptClick.on(LST_FILA_LLAMADAS.of(numeroCredito)),
            cerrarPestanaAnterior(),
            cambiarPestanaActual(),
            Click.on(CHK_RESPUESTA_CUATRO.of(numeroCredito)),
            Click.on(CHK_RESPUESTA_QUINTO.of(numeroCredito)),
            Enter.theValue(LLAMADA).into(TXT_OBSERVACION_LLAMADA.of(numeroCredito)),
            Click.on(BTN_GUARDAR.of(numeroCredito)),
            Click.on(BTN_ACEPTAR),
            Click.on(BTN_CERTIFICACION_LLAMADAS),
            Click.on(BTN_ACEPTAR),
            WaitUntil.the(SPN_CARGANDO, isNotVisible()).forNoMoreThan(TIEMPO).seconds(),
            Click.on(MNU_HAMBURGUESA_LLAMADAS),
            Click.on(MNU_LLAMADAS.of(BUSQUEDA_GESTION)),
            WaitUntil.the(TXT_BUSQUEDA, isVisible()).forNoMoreThan(TIEMPO).seconds()
        );
    }
}