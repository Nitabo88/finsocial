package co.com.red5g.finsonet.tasks;

import static co.com.red5g.finsonet.userinterfaces.FormularioSolicitudPaso1Page.BTN_AGENCIA_VINCULACION;
import static co.com.red5g.finsonet.userinterfaces.FormularioSolicitudPaso1Page.BTN_CIUDADES;
import static co.com.red5g.finsonet.userinterfaces.FormularioSolicitudPaso1Page.FILTRO_AGENCIA_VINCULACION;
import static co.com.red5g.finsonet.userinterfaces.FormularioSolicitudPaso1Page.FILTRO_CIUDADES;
import static co.com.red5g.finsonet.userinterfaces.FormularioSolicitudPaso1Page.RDB_INSTRUCCIONES;
import static co.com.red5g.finsonet.userinterfaces.FormularioSolicitudPaso1Page.TXT_CALIFICACION;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;

import co.com.red5g.finsonet.models.DocumentosRequeridos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

public class FormularioDocumentosRequeridos implements Task {
    private final DocumentosRequeridos documentosRequeridos;

    public FormularioDocumentosRequeridos(DocumentosRequeridos documentosRequeridos) {
        this.documentosRequeridos = documentosRequeridos;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(RDB_INSTRUCCIONES.of(documentosRequeridos.getStrTipoSolicitud())),
                WaitUntil.the(BTN_CIUDADES,isEnabled()).forNoMoreThan(3).seconds(),
                Click.on(BTN_CIUDADES),
                Enter.theValue(documentosRequeridos.getStrCiudad()).into(FILTRO_CIUDADES).thenHit(Keys.ENTER),
                Click.on(BTN_AGENCIA_VINCULACION),
                Click.on(FILTRO_AGENCIA_VINCULACION.of(documentosRequeridos.getStrAgenciaVinculacion())),
                Enter.theValue(documentosRequeridos.getStrCalificacion()).into(TXT_CALIFICACION),
                Click.on(RDB_INSTRUCCIONES.of(documentosRequeridos.getStrVinculacion()))
                );
    }
}