package co.com.red5g.finsonet.tasks;

import co.com.red5g.finsonet.models.DocumentosRequeridos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.red5g.finsonet.userinterfaces.FormularioSolicitudPaso1Page.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class Tramitar implements Task {
    private DocumentosRequeridos documentosRequeridos;

    public Tramitar(DocumentosRequeridos documentosRequeridos) {
        this.documentosRequeridos = documentosRequeridos;
    }

    public static Performable documentosRequeridos(DocumentosRequeridos documentosRequeridos) {
        return instrumented(Tramitar.class, documentosRequeridos);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(RBN_INSTRUCCIONES.of(documentosRequeridos.getStrTipoSolicitud())),
                WaitUntil.the(LST_CIUDADES,isEnabled()).forNoMoreThan(3).seconds(),
                SelectFromOptions.byVisibleText(documentosRequeridos.getStrCiudad()).from(LST_CIUDADES));
        actor.attemptsTo(
                SelectFromOptions.byVisibleText(documentosRequeridos.getStrAgenciaVinculacion()).from(LST_AGENCIA_VINCULACION));
        actor.attemptsTo(
                Enter.theValue(documentosRequeridos.getStrCalificacion()).into(TXT_CALIFICACION));
        actor.attemptsTo(
                Click.on(RBN_INSTRUCCIONES.of(documentosRequeridos.getStrVinculacion()))
                );
    }
}