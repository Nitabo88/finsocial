package co.com.red5g.finsonet.tasks;

import co.com.red5g.finsonet.models.Vetados;
import co.com.red5g.finsonet.tasks.factories.Ubicarse;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.conditions.Check;

import static co.com.red5g.finsonet.userinterfaces.ListadoVetadosPage.*;
import static co.com.red5g.finsonet.userinterfaces.ModulosAdministracionPage.BTN_MI_CUENTA;
import static co.com.red5g.finsonet.userinterfaces.ModulosAdministracionPage.MNM_MI_CUENTA;
import static co.com.red5g.finsonet.userinterfaces.VetadosPage.MNM_LST_VETADOS;
import static co.com.red5g.finsonet.userinterfaces.VetadosPage.MNM_RIESGOS;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Eliminar implements Task {

    private static final String SALIR = "Salir";
    final Vetados vetados;

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
                Click.on(MNM_RIESGOS),
                Click.on(MNM_LST_VETADOS));
        actor.attemptsTo(
                Check.whether(BTN_DETALLE_VETO.of(numeroDocumento).resolveFor(actor).isPresent())
                        .andIfSo(
                                Click.on(BTN_DETALLE_VETO.of(numeroDocumento)),
                                Click.on(BTN_ANULAR_VETO),
                                Click.on(BTN_ANULAR),
                                Click.on(BTN_ACEPTAR)));
        actor.attemptsTo(
                Click.on(BTN_MI_CUENTA),
                Click.on(MNM_MI_CUENTA.of(SALIR)));
    }
}
