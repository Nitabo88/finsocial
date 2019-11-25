package co.com.red5g.finsonet.tasks;

import co.com.red5g.finsonet.models.DocumentosRequeridos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import static co.com.red5g.finsonet.userinterfaces.FormularioSolicitudPaso1Page.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;

public class EscribeLosDocumentosRequeridos implements Task {
    private DocumentosRequeridos documentosRequeridos;

    public EscribeLosDocumentosRequeridos(DocumentosRequeridos documentosRequeridos) {
        this.documentosRequeridos = documentosRequeridos;
    }

    public static Performable en(DocumentosRequeridos documentosRequeridos) {
        return instrumented(EscribeLosDocumentosRequeridos.class, documentosRequeridos);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(RBN_INSTRUCCIONES.of(documentosRequeridos.getStrTipoSolicitud())),
                WaitUntil.the(BTN_CIUDADES,isEnabled()).forNoMoreThan(3).seconds(),
                Click.on(BTN_CIUDADES),
                Enter.theValue(documentosRequeridos.getStrCiudad()).into(FILTRO_CIUDADES).thenHit(Keys.ENTER),
                Click.on(BTN_AGENCIA_VINCULACION),
                Click.on(FILTRO_AGENCIA_VINCULACION.of(documentosRequeridos.getStrAgenciaVinculacion())),
                Enter.theValue(documentosRequeridos.getStrCalificacion()).into(TXT_CALIFICACION),
                Click.on(RBN_INSTRUCCIONES.of(documentosRequeridos.getStrVinculacion()))
                );
    }
}