package co.com.red5g.finsonet.tasks;

import co.com.red5g.finsonet.models.builder.InformacionBalancePersonalBuilder;
import co.com.red5g.finsonet.models.builder.InformacionFinancieraBuilder;
import co.com.red5g.finsonet.userinterfaces.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.red5g.finsonet.models.builder.ActividadLaboralBuilder.es;
import static co.com.red5g.finsonet.models.builder.DescripcionActivosBuilder.por;
import static co.com.red5g.finsonet.models.builder.DocumentoRequeridosBuilder.los;
import static co.com.red5g.finsonet.models.builder.InformacionConyugueBuilder.e;
import static co.com.red5g.finsonet.models.builder.InformacionPersonalBuilder.cualEs;
import static co.com.red5g.finsonet.models.builder.InformacionPrestamoBuilder.la;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Diligenciar implements Task {

    public static Performable laSolicitudDeCredito() {
        return instrumented(Diligenciar.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                EscribeLosDocumentosRequeridos.en(los().documentosSolicitante()),
                EscribeLaInformacionDelPrestamo.con(la().informacionPrestamo()),
                Click.on(FormularioSolicitudPaso1Page.BTN_GUARDAR_CONTINUAR),
                EscribeLaInformacionPersonal.la(cualEs().informacionPersonal()),
                Click.on(FormularioSolicitudPaso2Page.BTN_GUARDAR_CONTINUAR),
                EscribeLaInformacionLaboral.laCual(es().actividadLaboral()),
                Click.on(FormularioSolicitudPaso3Page.BTN_GUARDAR_CONTINUAR),
                EscribeLaInformacionDelBalancePersonal.de(InformacionBalancePersonalBuilder.la().persona()),
                EscribeLaInformacionDeLosActivos.dada(por().laPersona()),
                EscribeElDetalleDeLaInformacionFinanciera.de(InformacionFinancieraBuilder.la().persona()),
                Click.on(FormularioSolicitudPaso4Page.BTN_GUARDAR_CONTINUAR),
                EscribeLaInformacionDelConyugue.la(cualEs().informacionPersonalConyugue(), e().informacionLaboralConyugue()),
                Click.on(FormularioSolicitudPaso5Page.BTN_GUARDAR_CONTINUAR)
                );
    }
}
