package co.com.red5g.bancoomeva.tasks;

import static co.com.red5g.bancoomeva.questions.NumeroGestionCredito.numeroGestion;
import static co.com.red5g.bancoomeva.tasks.CodigoRecuperacion.obtenerCodigoDeRecuperacion;
import static co.com.red5g.bancoomeva.tasks.CodigoVerificacionFirma.obtenerCodigoVerificacionFirma;
import static co.com.red5g.bancoomeva.tasks.FirmaPreAprobado.ID_GESTION;
import static co.com.red5g.bancoomeva.tasks.IngresarCorreo.CODIGO;
import static co.com.red5g.bancoomeva.userinterfaces.BancoomevaHomePage.LNK_CODIGO_RECUPERACION;
import static co.com.red5g.bancoomeva.userinterfaces.FirmaPage.BTN_ACEPTAR_Y_CONTINUAR;
import static co.com.red5g.bancoomeva.userinterfaces.FirmaPage.BTN_ACEPTO_TERMINOS_Y_CONDICIONES;
import static co.com.red5g.bancoomeva.userinterfaces.FirmaPage.BTN_CONTINUAR;
import static co.com.red5g.bancoomeva.userinterfaces.FirmaPage.CHK_TERMINOS_Y_CONDICIONES;
import static co.com.red5g.bancoomeva.userinterfaces.FirmaPage.LBL_TERMINOS_Y_CONDICIONES;
import static co.com.red5g.bancoomeva.userinterfaces.FirmaPage.TXT_CODIGO_RECUPERACION;
import static co.com.red5g.finsonet.models.builders.CredencialesBDBuilder.con;
import static co.com.red5g.general.interactions.CerrarPestana.cerrarPestana;
import static co.com.red5g.utils.conexionbd.QueriesBancoomeva.SQL_ID_GESTION;
import static co.com.red5g.utils.data.ConstantesTiempo.TIEMPO_120;
import static co.com.red5g.utils.data.ConstantesTiempo.TIEMPO_3;

import co.com.devco.automation.mobile.actions.WaitFor;
import co.com.red5g.bancoomeva.userinterfaces.BancoomevaHomePage;
import co.com.red5g.finsonet.questions.factories.LaInformacion;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actions.Scroll;

public class FirmaAprobado implements Task {

  BancoomevaHomePage bancoomevaHomePage;
  private static final String MENSAJE_FELICITACIONES = "¡Felicitaciones!";


  @Override
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(obtenerCodigoDeRecuperacion());
    String id = actor.asksFor(numeroGestion());
    String sql = String.format(SQL_ID_GESTION.getSql(), id);
    String idGestion = actor.asksFor(LaInformacion.deBaseDeDatos(con().bdBancomevaEnLinea(), sql, "GESTION"));
    actor.remember(ID_GESTION, idGestion);
    String codigo = actor.recall(CODIGO);
    actor.attemptsTo(
        cerrarPestana(),
        Open.browserOn(bancoomevaHomePage),
        JavaScriptClick.on(LNK_CODIGO_RECUPERACION),
        Enter.theValue(codigo).into(TXT_CODIGO_RECUPERACION),
        WaitFor.seconds(TIEMPO_3),
        JavaScriptClick.on(CHK_TERMINOS_Y_CONDICIONES),
        Scroll.to(LBL_TERMINOS_Y_CONDICIONES),
        Click.on(BTN_ACEPTO_TERMINOS_Y_CONDICIONES),
        WaitFor.seconds(TIEMPO_3),
        JavaScriptClick.on(BTN_CONTINUAR),
        WaitFor.seconds(TIEMPO_3),
        JavaScriptClick.on(BTN_ACEPTAR_Y_CONTINUAR),
        obtenerCodigoVerificacionFirma()
    );
    FirmaPreAprobado.codigo(actor, TIEMPO_120, MENSAJE_FELICITACIONES);
  }
}
