package co.com.red5g.finsonet.tasks;

import static co.com.red5g.finsonet.models.builders.CredencialesBuilder.de;
import static co.com.red5g.finsonet.userinterfaces.AuxiliarOperativoPage.LNK_CHEQUEO_DOCUMENTOS;
import static co.com.red5g.finsonet.userinterfaces.ChequeoDocumentosPage.LBL_CHEQUEO_DOCUMENTOS;
import static co.com.red5g.finsonet.userinterfaces.ModulosAdministracionPage.BTN_MI_CUENTA;
import static co.com.red5g.finsonet.userinterfaces.ModulosAdministracionPage.LNK_AUXILIAR_OPERATIVO;
import static co.com.red5g.finsonet.userinterfaces.ModulosAdministracionPage.MNM_MI_CUENTA;
import static co.com.red5g.utils.data.Constantes.TIEMPO_10;
import static co.com.red5g.utils.data.Constantes.TIEMPO_3;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

import co.com.devco.automation.mobile.actions.WaitFor;
import co.com.red5g.finsonet.tasks.factories.Ingresa;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class LoguinUsuarioDocumentacion implements Task {

  private static final String OPCION_SALIR = "Salir";

  @Override
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(
        Click.on(BTN_MI_CUENTA),
        Click.on(MNM_MI_CUENTA.of(OPCION_SALIR)),
        Ingresa.lasCredenciales(de().unUsuarioDeDocumentacion()),
        WaitFor.seconds(TIEMPO_3),
        Click.on(LNK_AUXILIAR_OPERATIVO),
        WaitUntil.the(LNK_CHEQUEO_DOCUMENTOS, isEnabled()).forNoMoreThan(TIEMPO_10).seconds(),
        Click.on(LNK_CHEQUEO_DOCUMENTOS),
        WaitUntil.the(LBL_CHEQUEO_DOCUMENTOS, isVisible()).forNoMoreThan(TIEMPO_10).seconds()
    );
  }
}