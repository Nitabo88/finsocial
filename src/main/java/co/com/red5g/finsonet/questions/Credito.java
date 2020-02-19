package co.com.red5g.finsonet.questions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.red5g.finsonet.questions.SeleccionarFila.seleccionarFila;
import static co.com.red5g.finsonet.tasks.InformacionCredito.CEDULA_ACTOR;
import static co.com.red5g.finsonet.tasks.InformacionCredito.FECHA_CREDITO;
import static co.com.red5g.finsonet.userinterfaces.MisCreditosPage.LST_FILA_CREDITOS;

public class Credito implements Question<Boolean> {

    public static Credito existe() {
        return new Credito();
    }

    @Override
    public Boolean answeredBy(final Actor actor) {
        final WebElementFacade lstFila = seleccionarFila(LST_FILA_CREDITOS,actor.recall(CEDULA_ACTOR),actor.recall(FECHA_CREDITO)).answeredBy(actor);
        return lstFila.isPresent();
    }
}
