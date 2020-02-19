package co.com.red5g.finsonet.tasks;

import static co.com.red5g.finsonet.models.builders.CredencialesBuilder.de;
import static co.com.red5g.finsonet.userinterfaces.AuxiliarOperativoPage.LNK_CHEQUEO_DOCUMENTOS;
import static co.com.red5g.finsonet.userinterfaces.ChequeoDocumentosPage.LBL_CHEQUEO_DOCUMENTOS;
import static co.com.red5g.finsonet.userinterfaces.ModulosAdministracionPage.BTN_MI_CUENTA;
import static co.com.red5g.finsonet.userinterfaces.ModulosAdministracionPage.LNK_AUXILIAR_OPERATIVO;
import static co.com.red5g.finsonet.userinterfaces.ModulosAdministracionPage.MNU_MI_CUENTA;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

import co.com.red5g.finsonet.tasks.factories.Ingresa;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class LoguinUsuarioDocumentacion implements Task {

  private static final String OPCION_SALIR = "Salir";

  @Override
  public <T extends Actor> void performAs(final T actor) {
    actor.attemptsTo(
        Click.on(BTN_MI_CUENTA),
        Click.on(MNU_MI_CUENTA.of(LoguinUsuarioDocumentacion.OPCION_SALIR)),
        Ingresa.lasCredenciales(de().unUsuarioDeDocumentacion()),
        WaitUntil.the(LNK_AUXILIAR_OPERATIVO, isEnabled()).forNoMoreThan(10).seconds(),
        Click.on(LNK_AUXILIAR_OPERATIVO),
        WaitUntil.the(LNK_CHEQUEO_DOCUMENTOS, isEnabled()).forNoMoreThan(10).seconds(),
        Click.on(LNK_CHEQUEO_DOCUMENTOS),
        WaitUntil.the(LBL_CHEQUEO_DOCUMENTOS, isVisible()).forNoMoreThan(10).seconds()
    );
  }
}