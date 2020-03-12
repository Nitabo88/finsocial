package co.com.red5g.finsonet.tasks;

import static co.com.red5g.finsonet.userinterfaces.ListadoVetadosPage.BTN_ACEPTAR;
import static co.com.red5g.finsonet.userinterfaces.ListadoVetadosPage.BTN_ANULAR;
import static co.com.red5g.finsonet.userinterfaces.ListadoVetadosPage.BTN_ANULAR_VETO;
import static co.com.red5g.finsonet.userinterfaces.ListadoVetadosPage.BTN_DETALLE_VETO;
import static co.com.red5g.finsonet.userinterfaces.ModulosAdministracionPage.BTN_MI_CUENTA;
import static co.com.red5g.finsonet.userinterfaces.ModulosAdministracionPage.MNU_MI_CUENTA;
import static co.com.red5g.finsonet.userinterfaces.VetadosPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;

import co.com.red5g.finsonet.models.Vetados;
import co.com.red5g.finsonet.tasks.factories.Ubicarse;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.conditions.Check;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class Eliminar implements Task {

    private static final String SALIR = "Salir";
    Vetados vetados;

    public Eliminar(final Vetados vetados) {
        this.vetados = vetados;
    }

    public static Eliminar elVeto(Vetados vetados) {
        return instrumented(Eliminar.class, vetados);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        String numeroDocumento = vetados.getDocumentoVetados();
        actor.attemptsTo(
            Ubicarse.enVetados(),
            Click.on(MNU_RIESGOS),
            Click.on(MNU_LST_VETADOS));
        actor.attemptsTo(
            Check.whether(BTN_DETALLE_VETO.of(numeroDocumento).resolveFor(actor).isPresent())
                .andIfSo(
                    JavaScriptClick.on(BTN_DETALLE_VETO.of(numeroDocumento)),
                    JavaScriptClick.on(BTN_ANULAR_VETO),
                    Click.on(BTN_ANULAR),
                    Click.on(BTN_ACEPTAR),
                    WaitUntil.the(BTN_MI_CUENTA, isClickable()),
                    JavaScriptClick.on(BTN_MI_CUENTA),
                    JavaScriptClick.on(MNU_MI_CUENTA.of(SALIR)))
                .otherwise(
                    JavaScriptClick.on(BTN_MI_CUENTA),
                    JavaScriptClick.on(MNU_MI_CUENTA.of(SALIR))
                ));
    }
}
