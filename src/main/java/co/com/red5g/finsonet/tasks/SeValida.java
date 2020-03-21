package co.com.red5g.finsonet.tasks;

import static co.com.red5g.finsonet.interacions.Ingresar.NUMERO_CREDITO;
import static co.com.red5g.finsonet.userinterfaces.LlamadasPage.BTN_ESTADO_CDAS_GESTION_LLAMADA;
import static co.com.red5g.finsonet.userinterfaces.LlamadasPage.TXT_BUSCAR_CDAS;
import static co.com.red5g.finsonet.userinterfaces.ModulosAdministracionPage.IMG_FINSONET;
import static co.com.red5g.finsonet.userinterfaces.ModulosAdministracionPage.LNK_CDAS;
import static co.com.red5g.finsonet.userinterfaces.ReporteVentasPage.SPN_CARGANDO;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isNotVisible;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class SeValida implements Task {

    private final static int TIEMPO = 120;

    public static Performable queLaLlamada() {
        return instrumented(SeValida.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        String numeroCredito = theActorInTheSpotlight().recall(NUMERO_CREDITO);
        theActorInTheSpotlight().attemptsTo(
            WaitUntil.the(SPN_CARGANDO, isNotVisible()).forNoMoreThan(TIEMPO).seconds(),
            Click.on(IMG_FINSONET),
            Click.on(LNK_CDAS),
            Enter.theValue(numeroCredito).into(TXT_BUSCAR_CDAS),
            Click.on(BTN_ESTADO_CDAS_GESTION_LLAMADA)
        );
    }
}
