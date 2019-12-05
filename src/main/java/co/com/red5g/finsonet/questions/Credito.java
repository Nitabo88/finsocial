package co.com.red5g.finsonet.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.red5g.finsonet.questions.SeleccionarFila.seleccionarFila;
import static co.com.red5g.finsonet.tasks.Ingresa.CEDULA_ACTOR;
import static co.com.red5g.finsonet.tasks.Ingresa.FECHA_CREDITO;
import static co.com.red5g.finsonet.userinterfaces.MisCreditosPage.LST_FILA_CREDITOS;
import static co.com.red5g.finsonet.utils.UtileriaFechas.masUnMinuto;

public class Credito implements Question<Boolean> {

    public static Credito existe() {
        return new Credito();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        SeleccionarFila lstFila = seleccionarFila(LST_FILA_CREDITOS,actor.recall(CEDULA_ACTOR),actor.recall(FECHA_CREDITO));
        return lstFila.answeredBy(actor).isPresent();
    }
}
