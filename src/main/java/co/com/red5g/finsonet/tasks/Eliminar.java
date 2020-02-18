package co.com.red5g.finsonet.tasks;

import static co.com.red5g.finsonet.userinterfaces.ListadoVetadosPage.BTN_ANULAR_VETO;
import static co.com.red5g.finsonet.userinterfaces.ListadoVetadosPage.BTN_DETALLE_VETO;
import static co.com.red5g.finsonet.userinterfaces.ModulosAdministracionPage.BTN_MI_CUENTA;
import static co.com.red5g.finsonet.userinterfaces.ModulosAdministracionPage.MNU_MI_CUENTA;
import static co.com.red5g.finsonet.userinterfaces.VetadosPage.MNU_LST_VETADOS;
import static co.com.red5g.finsonet.userinterfaces.VetadosPage.MNU_RIESGOS;
import static net.serenitybdd.screenplay.Tasks.instrumented;

import co.com.red5g.finsonet.models.Vetados;
import co.com.red5g.finsonet.tasks.factories.Ubicarse;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.conditions.Check;

public class Eliminar implements Task {

    private static final String MNU_SALIR = "Salir";
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
            Click.on(MNU_LST_VETADOS),
            Check.whether(BTN_DETALLE_VETO.of(numeroDocumento).resolveFor(actor).isVisible()).andIfSo(
                Click.on(BTN_DETALLE_VETO.of(numeroDocumento)),
                Click.on(BTN_ANULAR_VETO)),
            Click.on(BTN_MI_CUENTA),
            Click.on(MNU_MI_CUENTA.of(MNU_SALIR))
        );
    }
}
