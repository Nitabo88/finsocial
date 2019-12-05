package co.com.red5g.finsonet.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.red5g.finsonet.tasks.Diligenciar.FECHA_SOLICITUD_CREDITO;
import static co.com.red5g.finsonet.tasks.Ingresa.CEDULA_ACTOR;
import static co.com.red5g.finsonet.userinterfaces.MisEstadosPage.LST_FILA_DOCUMENTOS;
import static co.com.red5g.finsonet.utils.UtileriaFechas.masUnMinuto;

public class Estado implements Question<Boolean> {

    public static Credito actualizado() {
        return new Credito();
    }
    public static Estado noVisible() {
        return new Estado();
    }
    public Boolean answeredBy(Actor actor) {
        boolean columna = LST_FILA_DOCUMENTOS.of(actor.recall(CEDULA_ACTOR),actor.recall(FECHA_SOLICITUD_CREDITO)).resolveFor(actor).isPresent();
        if(!columna){
            columna =  LST_FILA_DOCUMENTOS.of(actor.recall(CEDULA_ACTOR),masUnMinuto(actor.recall(FECHA_SOLICITUD_CREDITO))).resolveFor(actor).isPresent();
        }
        return columna;
    }
}
