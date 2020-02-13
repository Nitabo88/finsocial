package co.com.red5g.finsonet.tasks;

import co.com.red5g.finsonet.models.Vetados;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.red5g.finsonet.userinterfaces.ChequeoDocumentosPage.*;
import static co.com.red5g.finsonet.userinterfaces.VetadosPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;
import static co.com.red5g.finsonet.userinterfaces.ReporteVentasPage.SPN_CARGA;
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
                Enter.theValue(vetados.getDetalleVetados()).into(TXT_DETALLE),
                WaitUntil.the(SPN_CARGA, isNotVisible()).forNoMoreThan(2).seconds(),
                Click.on(LST_TXT_MOTIVO),
                Click.on(LST_TXT_MOTIVO1),
                Click.on(BTN_NUEVO_VETO),
                Click.on(BTN_ACEPTAR_VETO)
        );
    }
}
