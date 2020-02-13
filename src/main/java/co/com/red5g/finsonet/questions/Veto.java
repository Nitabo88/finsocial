package co.com.red5g.finsonet.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.red5g.finsonet.questions.SeleccionarFila.seleccionarFila;
import static co.com.red5g.finsonet.tasks.InformacionVeto.CEDULA_ACTOR;
import static co.com.red5g.finsonet.tasks.InformacionCredito.FECHA_CREDITO;
import static co.com.red5g.finsonet.userinterfaces.VerificarVetoPage.LST_FILA_VETOS;

public class Veto implements Question<Boolean> {
    public static Veto existe() {
        return new Veto();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        SeleccionarFila lstFila = seleccionarFila(LST_FILA_VETOS,actor.recall(CEDULA_ACTOR),actor.recall(FECHA_CREDITO));
        return lstFila.answeredBy(actor).isPresent();
    }
}
