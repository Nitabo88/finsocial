package co.com.red5g.finsonet.tasks;

import static co.com.red5g.finsonet.interacions.CambiarPestana.cambiarPestana;
import static co.com.red5g.finsonet.models.builders.ChequeoDocumentoBuilder.con;
import static co.com.red5g.finsonet.questions.PasoConfirmacionExitosa.CONFIRMACION;
import static co.com.red5g.finsonet.userinterfaces.ModulosAdministracionPage.LNK_HOME;
import static co.com.red5g.finsonet.userinterfaces.ModulosAdministracionPage.LNK_ORIGINACION;
import static co.com.red5g.finsonet.userinterfaces.OriginacionPage.MNU_ORIGINACION;
import static co.com.red5g.finsonet.userinterfaces.ReporteVentasPage.SPN_CARGA;
import static co.com.red5g.finsonet.userinterfaces.ReporteVentasPage.SPN_CARGANDO;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isNotVisible;

import co.com.red5g.finsonet.tasks.factories.Diligencia;
import co.com.red5g.finsonet.tasks.factories.Ubicarse;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class Consultar implements Task {

  public static Performable elCredito() {
    return instrumented(Consultar.class);
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(
        Ubicarse.enElFormulario(),
        Diligencia.laSolicitudDeCredito(),
        cambiarPestana(),
        Click.on(LNK_HOME),
        WaitUntil.the(SPN_CARGA, isNotVisible()).forNoMoreThan(10).seconds(),
        Click.on(LNK_ORIGINACION),
        Diligencia.laInformacionDeChequeoDeDocumentos(con().centralesDeRiesgo()),
        WaitUntil.the(SPN_CARGANDO, isNotVisible()).forNoMoreThan(4).seconds(),
        Click.on(MNU_ORIGINACION.of(CONFIRMACION))
    );
  }
}