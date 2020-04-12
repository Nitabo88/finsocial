package co.com.red5g.finsonet.interacions;

import static co.com.red5g.finsonet.questions.ObtenerUrl.obtenerUrl;
import static co.com.red5g.finsonet.questions.SeleccionarColumna.seleccionarColumna;
import static co.com.red5g.finsonet.tasks.InformacionCreditoLibranza.CEDULA_ACTOR;
import static co.com.red5g.finsonet.tasks.InformacionCreditoLibranza.FECHA_CREDITO;
import static co.com.red5g.finsonet.userinterfaces.MisCreditosPage.LST_FILA_CREDITO_LIBRANZA;
import static net.serenitybdd.screenplay.Tasks.instrumented;

import java.util.List;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Click;

public class Ingresar implements Interaction {

    public static final String NUMERO_CREDITO = "numero credito";

    public static Performable enFormularioDeSolicitud() {
        return instrumented(Ingresar.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        List<WebElementFacade> lstCredito = seleccionarColumna(LST_FILA_CREDITO_LIBRANZA, actor.recall(CEDULA_ACTOR), actor.recall(FECHA_CREDITO)).answeredBy(actor);
        actor.attemptsTo(
            Click.on(lstCredito.get(2))
        );
        String url = obtenerUrl().answeredBy(actor);
        actor.remember(NUMERO_CREDITO, url);
    }
}