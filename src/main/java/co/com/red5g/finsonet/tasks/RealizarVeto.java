package co.com.red5g.finsonet.tasks;

import static co.com.red5g.finsonet.userinterfaces.ReporteVentasPage.SPN_CARGANDO;
import static co.com.red5g.finsonet.userinterfaces.VetadosPage.BTN_ACEPTAR_VETO;
import static co.com.red5g.finsonet.userinterfaces.VetadosPage.BTN_NUEVO_VETO;
import static co.com.red5g.finsonet.userinterfaces.VetadosPage.LST_MOTIVO;
import static co.com.red5g.finsonet.userinterfaces.VetadosPage.TXT_DETALLE;
import static co.com.red5g.finsonet.userinterfaces.VetadosPage.TXT_DOCUMENTO_VETADOS;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isNotVisible;

import co.com.red5g.finsonet.models.Vetados;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class RealizarVeto implements Task {
    private static final int TIEMPO = 1;
    private final Vetados vetados;

    public RealizarVeto(Vetados vetados) {
        this.vetados = vetados;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
            Enter.theValue(vetados.getDocumentoVetados()).into(TXT_DOCUMENTO_VETADOS),
            SelectFromOptions.byVisibleText(vetados.getListaVetados()).from(LST_MOTIVO),
            WaitUntil.the(SPN_CARGANDO, isNotVisible()).forNoMoreThan(TIEMPO).seconds(),
            Enter.theValue(vetados.getDetalleVetados()).into(TXT_DETALLE),
            JavaScriptClick.on(BTN_NUEVO_VETO),
            JavaScriptClick.on(BTN_ACEPTAR_VETO)
        );
    }
}
