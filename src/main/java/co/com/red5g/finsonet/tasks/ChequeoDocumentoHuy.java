package co.com.red5g.finsonet.tasks;

import static co.com.red5g.finsonet.interacions.CambiarPestanaActual.cambiarPestanaActual;
import static co.com.red5g.finsonet.interacions.CerrarPestana.cerrarPestana;
import static co.com.red5g.finsonet.interacions.Ingresar.NUMERO_CREDITO;
import static co.com.red5g.finsonet.models.builders.CreditoBuilder.la;
import static co.com.red5g.finsonet.questions.ObtenerUrl.obtenerUrl;
import static co.com.red5g.finsonet.questions.SeleccionarFila.seleccionarFila;
import static co.com.red5g.finsonet.tasks.InformacionCredito.CEDULA_ACTOR;
import static co.com.red5g.finsonet.tasks.InformacionCredito.FECHA_CREDITO;
import static co.com.red5g.finsonet.userinterfaces.MisCreditosPage.LST_FILA_CREDITOS;
import static co.com.red5g.finsonet.userinterfaces.ModulosAdministracionPage.IMG_FINSONET;
import static co.com.red5g.finsonet.userinterfaces.ModulosAdministracionPage.LNK_ORIGINACION;
import static co.com.red5g.finsonet.userinterfaces.OriginacionPage.MNM_HAMBURGUESA;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

import co.com.red5g.finsonet.tasks.factories.Ingresa;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class ChequeoDocumentoHuy implements Task {

  private static final int TIEMPO = 100;

  @Override
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(
        Ingresa.enNuevoCreditoHuy(),
        Ingresa.laInformacionDelCreditoHuy(la().informacionDelCreditoHuy()));
    actor.attemptsTo(
        Click.on(seleccionarFila(
            LST_FILA_CREDITOS, actor.recall(CEDULA_ACTOR), actor.recall(FECHA_CREDITO)).answeredBy(actor)),
        cambiarPestanaActual());
    actor.remember(NUMERO_CREDITO, obtenerUrl().answeredBy(actor));
    actor.attemptsTo(
        cerrarPestana(),
        Click.on(MNM_HAMBURGUESA),
        Click.on(IMG_FINSONET),
        WaitUntil.the(LNK_ORIGINACION, isVisible()).forNoMoreThan(TIEMPO).seconds(),
        Click.on(LNK_ORIGINACION));
  }
}
