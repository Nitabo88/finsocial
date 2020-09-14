package co.com.red5g.finsonet.interacions;

import static co.com.red5g.finsonet.userinterfaces.MisCreditosPage.LBL_ID;
import static co.com.red5g.finsonet.userinterfaces.MisCreditosPage.LBL_ID2;
import static co.com.red5g.finsonet.userinterfaces.ReporteVentasPage.SPN_CARGANDO;
import static co.com.red5g.utils.data.Constantes.CEDULA_ACTOR;
import static co.com.red5g.utils.data.Constantes.FECHA;
import static co.com.red5g.utils.data.Constantes.NUMERO_CREDITO;
import static co.com.red5g.utils.data.ConstantesTiempo.TIEMPO_60;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isNotVisible;

import co.com.red5g.finsonet.questions.ObtenerUrl;
import co.com.red5g.finsonet.userinterfaces.MisCreditosPage;
import java.util.List;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class Ingresar implements Interaction {

    public static Performable enFormularioDeSolicitud() {
        return instrumented(Ingresar.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        String numeroCedula = actor.recall(CEDULA_ACTOR);
        String fecha = actor.recall(FECHA);
        actor.attemptsTo(
            WaitUntil.the(SPN_CARGANDO, isNotVisible()).forNoMoreThan(TIEMPO_60).seconds(),
            Click.on(LBL_ID),
            WaitUntil.the(SPN_CARGANDO, isNotVisible()).forNoMoreThan(TIEMPO_60).seconds(),
            Click.on(LBL_ID2));
        List<WebElementFacade> lstCredito = MisCreditosPage.LST_COLUMNA_FORMULARIO_SOLICITUD.of(numeroCedula, fecha).resolveAllFor(actor);
        actor.attemptsTo(
            Click.on(lstCredito.get(0))
        );
        String url = ObtenerUrl.obtenerUrl().answeredBy(actor);
        actor.remember(NUMERO_CREDITO, url);
    }
}