package co.com.red5g.finsonet.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.red5g.finsonet.userinterfaces.MisCreditosPage.TBL_LISTADO_CREDITOS;
import static co.com.red5g.finsonet.userinterfaces.NuevoCreditoPage.BTN_OK;
import static co.com.red5g.finsonet.userinterfaces.NuevoCreditoPage.TBL_INFORMACION_CREDITOS;

public class Credito implements Question<Boolean> {

    public static Credito existe() {
        return new Credito();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return (TBL_LISTADO_CREDITOS.resolveFor(actor).isPresent());
    }
}
