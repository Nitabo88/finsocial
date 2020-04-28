package co.com.red5g.interacions;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import java.util.List;

import co.com.red5g.questions.finsonet.ObtenerUrl;
import co.com.red5g.tasks.finsonet.InformacionCreditoLibranza;
import co.com.red5g.userinterfaces.finsonet.MisCreditosPage;
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
        String numeroCedula = actor.recall(InformacionCreditoLibranza.CEDULA_ACTOR);
        String fecha = actor.recall(InformacionCreditoLibranza.FECHA);
        List<WebElementFacade> lstCredito = MisCreditosPage.LST_COLUMNA_FORMULARIO_SOLICITUD.of(numeroCedula, fecha).resolveAllFor(actor);
        actor.attemptsTo(
            Click.on(lstCredito.get(0))
        );
        String url = ObtenerUrl.obtenerUrl().answeredBy(actor);
        actor.remember(NUMERO_CREDITO, url);
    }
}