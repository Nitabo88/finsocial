package co.com.red5g.finsonet.questions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import java.util.List;

import static co.com.red5g.finsonet.questions.SeleccionarColumna.seleccionarColumna;
import static co.com.red5g.finsonet.questions.SeleccionarFila.seleccionarFila;
import static co.com.red5g.finsonet.tasks.Diligenciar.FECHA_SOLICITUD_CREDITO;
import static co.com.red5g.finsonet.tasks.Ingresa.CEDULA_ACTOR;
import static co.com.red5g.finsonet.userinterfaces.ChequeoDocumentosPage.LST_COLUMNAS_CHEQUEO_DOCUMENTOS;
import static co.com.red5g.finsonet.userinterfaces.MisEstadosPage.LST_FILA_DOCUMENTOS;
import static co.com.red5g.finsonet.utils.UtileriaFechas.masUnMinuto;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

public class Estado implements Question<Boolean> {

    public static Credito actualizado() {
        return new Credito();
    }

    public static Estado noVisible() {
        return new Estado();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String cedula = actor.recall(CEDULA_ACTOR);
        SeleccionarFila respuesta = seleccionarFila(LST_COLUMNAS_CHEQUEO_DOCUMENTOS, cedula, actor.recall(FECHA_SOLICITUD_CREDITO));
        return respuesta.answeredBy(actor).isDisabled();
    }
}
