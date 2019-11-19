package co.com.red5g.finsonet.tasks;

import co.com.red5g.finsonet.userinterfaces.FormularioSolicitudPaso1Page;
import co.com.red5g.finsonet.userinterfaces.FormularioSolicitudPaso2Page;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.red5g.finsonet.models.builder.DocumentoRequeridosBuilder.los;
import static co.com.red5g.finsonet.models.builder.InformacionPersonalBuilder.laCualEs;
import static co.com.red5g.finsonet.models.builder.PrestamoBuilder.con;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Diligenciar implements Task {

    public static Performable laSolicitudDeCredito() {
        return instrumented(Diligenciar.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Tramitar.documentosRequeridos(los().documentosSolicitante()),
                Escribir.laInformacionDelPrestamo(con().informacionPrestamo()),
                Click.on(FormularioSolicitudPaso1Page.BTN_GUARDAR_CONTINUAR),
                EscribirLaInformacion.personal(laCualEs().informacionPersonal()),
                Click.on(FormularioSolicitudPaso2Page.BTN_GUARDAR_CONTINUAR)
        );
    }
}
