package co.com.red5g.finsonet.tasks;

import co.com.red5g.finsonet.models.DocumentosRequeridos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import static co.com.red5g.finsonet.userinterfaces.FormularioSolicitudPaso1Page.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;

public class FormularioDocumentosRequeridos implements Task {
    private final DocumentosRequeridos documentosRequeridos;

    public FormularioDocumentosRequeridos(final DocumentosRequeridos documentosRequeridos) {
        this.documentosRequeridos = documentosRequeridos;
    }



    @Override
    public <T extends Actor> void performAs(final T actor) {
        actor.attemptsTo(
                Click.on(RBN_INSTRUCCIONES.of(this.documentosRequeridos.getStrTipoSolicitud())),
                WaitUntil.the(BTN_CIUDADES,isEnabled()).forNoMoreThan(3).seconds(),
                Click.on(BTN_CIUDADES),
                Enter.theValue(this.documentosRequeridos.getStrCiudad()).into(FILTRO_CIUDADES).thenHit(Keys.ENTER),
                Click.on(BTN_AGENCIA_VINCULACION),
                Click.on(FILTRO_AGENCIA_VINCULACION.of(this.documentosRequeridos.getStrAgenciaVinculacion())),
                Enter.theValue(this.documentosRequeridos.getStrCalificacion()).into(TXT_CALIFICACION),
                Click.on(RBN_INSTRUCCIONES.of(this.documentosRequeridos.getStrVinculacion()))
                );
    }
}