package co.com.red5g.tasks.finsonet;

import static co.com.red5g.models.builders.finsonet.CredencialesBuilder.de;
import static co.com.red5g.userinterfaces.finsonet.AuxiliarOperativoPage.LNK_CHEQUEO_DOCUMENTOS;
import static co.com.red5g.userinterfaces.finsonet.ChequeoDocumentosPage.LBL_CHEQUEO_DOCUMENTOS;
import static co.com.red5g.userinterfaces.finsonet.ModulosAdministracionPage.BTN_MI_CUENTA;
import static co.com.red5g.userinterfaces.finsonet.ModulosAdministracionPage.LNK_AUXILIAR_OPERATIVO;
import static co.com.red5g.userinterfaces.finsonet.ModulosAdministracionPage.MNM_MI_CUENTA;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

import co.com.devco.automation.mobile.actions.WaitFor;
import co.com.red5g.tasks.factories.finsonet.Ingresa;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class LoguinUsuarioDocumentacion implements Task {

  private static final String OPCION_SALIR = "Salir";
  private static final Integer TIEMPO = 10;

  @Override
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(
        Click.on(BTN_MI_CUENTA),
        Click.on(MNM_MI_CUENTA.of(OPCION_SALIR)),
        Ingresa.lasCredenciales(de().unUsuarioDeDocumentacion()),
        WaitFor.seconds(3),
        Click.on(LNK_AUXILIAR_OPERATIVO),
        WaitUntil.the(LNK_CHEQUEO_DOCUMENTOS, isEnabled()).forNoMoreThan(TIEMPO).seconds(),
        Click.on(LNK_CHEQUEO_DOCUMENTOS),
        WaitUntil.the(LBL_CHEQUEO_DOCUMENTOS, isVisible()).forNoMoreThan(TIEMPO).seconds()
    );
  }
}