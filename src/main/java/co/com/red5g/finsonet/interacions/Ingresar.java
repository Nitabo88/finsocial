package co.com.red5g.finsonet.interacions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Click;

import java.util.List;

import static co.com.red5g.finsonet.questions.SeleccionarColumna.seleccionarColumna;
import static co.com.red5g.finsonet.tasks.InformacionCredito.CEDULA_ACTOR;
import static co.com.red5g.finsonet.tasks.InformacionCredito.FECHA_CREDITO;
import static co.com.red5g.finsonet.userinterfaces.MisCreditosPage.LST_FILA_CREDITOS;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Ingresar implements Interaction {

    public static Performable enFormularioDeSolicitud() {
        return instrumented(Ingresar.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        List<WebElementFacade> lstCredito = seleccionarColumna(LST_FILA_CREDITOS, actor.recall(CEDULA_ACTOR),actor.recall(FECHA_CREDITO)).answeredBy(actor);
        actor.attemptsTo(
            Click.on(lstCredito.get(2))
        );
    }
}