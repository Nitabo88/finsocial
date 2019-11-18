package co.com.red5g.finsonet.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;

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
        Boolean fila = LST_FILA_CREDITOS.of(actor.recall(CEDULA_ACTOR),actor.recall(FECHA_CREDITO)).resolveFor(actor).isPresent();
        if(!fila){
            fila = LST_FILA_CREDITOS.of(actor.recall(CEDULA_ACTOR),masUnMinuto(actor.recall(FECHA_CREDITO))).resolveFor(actor).isPresent();
        }
        return fila;
    }
}
