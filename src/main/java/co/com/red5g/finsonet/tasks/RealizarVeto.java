package co.com.red5g.finsonet.tasks;

import co.com.red5g.finsonet.models.Vetados;
import co.com.red5g.finsonet.userinterfaces.VetadosPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.red5g.finsonet.userinterfaces.ReporteVentasPage.SPN_CARGA;
import static co.com.red5g.finsonet.userinterfaces.VetadosPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isNotVisible;

public class RealizarVeto implements Task {
    private Vetados vetados;

    public RealizarVeto(Vetados vetados) {
        this.vetados = vetados;
    }

    public static Performable interno(Vetados vetados) {
        return instrumented(RealizarVeto.class, vetados);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(vetados.getDocumentoVetados()).into(TXT_DOCUMENTO_VETADOS),
                SelectFromOptions.byVisibleText("Sin motivo").from(LST_MOTIVO),
                Enter.theValue(vetados.getDetalleVetados()).into(TXT_DETALLE),
                Click.on(BTN_NUEVO_VETO),
                Click.on(BTN_ACEPTAR_VETO)
        );
    }
}
