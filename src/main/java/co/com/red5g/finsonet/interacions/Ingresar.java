package co.com.red5g.finsonet.interacions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Click;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import static co.com.red5g.finsonet.tasks.Ingresa.CEDULA_ACTOR;
import static co.com.red5g.finsonet.tasks.Ingresa.FECHA_CREDITO;
import static co.com.red5g.finsonet.userinterfaces.MisCreditosPage.LST_FILA_CREDITOS;
import static co.com.red5g.finsonet.utils.UtileriaFechas.masUnMinuto;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Ingresar implements Interaction {

    public static Performable enFormularioDeSolicitud() {
        return instrumented(Ingresar.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        List<WebElementFacade> lstCredito = LST_FILA_CREDITOS.of(actor.recall(CEDULA_ACTOR),actor.recall(FECHA_CREDITO)).resolveAllFor(actor);
        if(lstCredito.size()==0){
         lstCredito = LST_FILA_CREDITOS.of(actor.recall(CEDULA_ACTOR),masUnMinuto(actor.recall(FECHA_CREDITO))).resolveAllFor(actor);
        }
        actor.attemptsTo(
            Click.on(lstCredito.get(0))
        );
    }
}