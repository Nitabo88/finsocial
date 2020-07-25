package co.com.red5g.finsonet.tasks;

import static co.com.red5g.utils.data.Constantes.NUMERO_CREDITO;
import static co.com.red5g.finsonet.userinterfaces.LlamadasPage.BTN_ACEPTAR;
import static co.com.red5g.finsonet.userinterfaces.LlamadasPage.BTN_ASIGNACION_LIBRANZA;
import static co.com.red5g.finsonet.userinterfaces.LlamadasPage.CHK_ID_LLAMADAS_LIBRANZA;
import static co.com.red5g.finsonet.userinterfaces.LlamadasPage.MNU_HAMBURGUESA_LLAMADAS;
import static co.com.red5g.finsonet.userinterfaces.LlamadasPage.MNU_LLAMADAS;
import static co.com.red5g.finsonet.userinterfaces.ReporteVentasPage.SPN_CARGANDO;
import static co.com.red5g.utils.data.ConstantesTiempo.TIEMPO_10;
import static co.com.red5g.utils.data.ConstantesTiempo.TIEMPO_120;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isNotVisible;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class AsignacionLlamadaLibranza implements Task {

    private static final String OPCION_MENU = "Listado de llamadas";

    @Override
    public <T extends Actor> void performAs(T actor) {
        String numeroCredito = actor.recall(NUMERO_CREDITO);
        actor.attemptsTo(
            Click.on(MNU_HAMBURGUESA_LLAMADAS),
            Click.on(MNU_LLAMADAS.of(OPCION_MENU)),
            WaitUntil.the(SPN_CARGANDO, isNotVisible()).forNoMoreThan(TIEMPO_120).seconds(),
            WaitUntil.the(CHK_ID_LLAMADAS_LIBRANZA.of(numeroCredito), isPresent()).forNoMoreThan(TIEMPO_10).seconds(),
            JavaScriptClick.on(CHK_ID_LLAMADAS_LIBRANZA.of(numeroCredito)),
            WaitUntil.the(BTN_ASIGNACION_LIBRANZA, isPresent()).forNoMoreThan(TIEMPO_10).seconds(),
            JavaScriptClick.on(BTN_ASIGNACION_LIBRANZA),
            WaitUntil.the(BTN_ACEPTAR, isPresent()).forNoMoreThan(TIEMPO_10).seconds(),
            JavaScriptClick.on(BTN_ACEPTAR)
        );
    }
}
