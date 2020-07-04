package co.com.red5g.finsonet.tasks;

import static co.com.red5g.finsonet.interacions.CambiarPestana.cambiarPestana;
import static co.com.red5g.finsonet.interacions.CambiarPestanaActual.cambiarPestanaActual;
import static co.com.red5g.finsonet.interacions.CerrarPestana.cerrarPestana;
import static co.com.red5g.finsonet.interacions.Ingresar.NUMERO_CREDITO;
import static co.com.red5g.finsonet.userinterfaces.FormalizacionPage.BTN_GUARDAR_DATOS;
import static co.com.red5g.finsonet.userinterfaces.FormalizacionPage.BTN_OK;
import static co.com.red5g.finsonet.userinterfaces.FormalizacionPage.BTN_SUBIR_DOCUMENTOS;
import static co.com.red5g.finsonet.userinterfaces.FormalizacionPage.LBL_FORMALIZACION;
import static co.com.red5g.finsonet.userinterfaces.FormalizacionPage.LST_COLUMNA_NOMBRE_FORMALIZACION;
import static co.com.red5g.utils.data.ConstantesTiempo.TIEMPO_60;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

import co.com.red5g.finsonet.interacions.factories.Subir;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.MoveMouse;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class AprobacionFormalizacion implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        String numeroCredito = actor.recall(NUMERO_CREDITO);
        actor.attemptsTo(
            WaitUntil.the(LBL_FORMALIZACION, isPresent()).forNoMoreThan(TIEMPO_60).seconds(),
            MoveMouse.to(LST_COLUMNA_NOMBRE_FORMALIZACION.of(numeroCredito)));
        actor.attemptsTo(
            Click.on(LST_COLUMNA_NOMBRE_FORMALIZACION.of(numeroCredito)),
            Click.on(BTN_SUBIR_DOCUMENTOS),
            cambiarPestanaActual(),
            Subir.losArchivosDeFormalizacion(),
            cerrarPestana(),
            cambiarPestana(),
            Click.on(BTN_GUARDAR_DATOS),
            WaitUntil.the(BTN_OK, isVisible()).forNoMoreThan(TIEMPO_60).seconds(),
            Click.on(BTN_OK)
        );
    }
}