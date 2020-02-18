package co.com.red5g.finsonet.tasks;

import static co.com.red5g.finsonet.interacions.CambiarPestana.cambiarPestana;
import static co.com.red5g.finsonet.models.builders.ChequeoDocumentoBuilder.con;
import static co.com.red5g.finsonet.questions.PasoConfirmacionExitosa.CONFIRMACION;
import static co.com.red5g.finsonet.userinterfaces.ModulosAdministracionPage.LNK_HOME;
import static co.com.red5g.finsonet.userinterfaces.ModulosAdministracionPage.LNK_ORIGINACION;
import static co.com.red5g.finsonet.userinterfaces.OriginacionPage.MNU_ORIGINACION;
import static co.com.red5g.finsonet.userinterfaces.ReporteVentasPage.SPN_CARGANDO;
import static co.com.red5g.finsonet.userinterfaces.ReporteVentasPage.SPN_FINSONET;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isNotVisible;

import co.com.red5g.finsonet.tasks.factories.Diligencia;
import co.com.red5g.finsonet.tasks.factories.Ubicarse;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class Confirmacion implements Task {

  private static final int TIEMPO = 10;

  @Override
  public <T extends Actor> void performAs(final T actor) {
    actor.attemptsTo(
        Ubicarse.enElFormulario(),
        Diligencia.laSolicitudDeCredito(),
        cambiarPestana(),
        Click.on(LNK_HOME),
        WaitUntil.the(SPN_FINSONET, isNotVisible()).forNoMoreThan(Confirmacion.TIEMPO).seconds(),
        Click.on(LNK_ORIGINACION),
        Diligencia.laInformacionDeChequeoDeDocumentos(con().centralesDeRiesgo()),
        WaitUntil.the(SPN_CARGANDO, isNotVisible()).forNoMoreThan(Confirmacion.TIEMPO).seconds(),
        Click.on(MNU_ORIGINACION.of(CONFIRMACION))
    );
  }
}