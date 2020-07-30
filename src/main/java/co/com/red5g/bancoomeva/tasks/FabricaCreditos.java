package co.com.red5g.bancoomeva.tasks;

import static co.com.red5g.bancoomeva.tasks.FirmaPreAprobado.ID_GESTION;
import static co.com.red5g.bancoomeva.userinterfaces.BandejaFabricaPage.BTN_ACCION;
import static co.com.red5g.bancoomeva.userinterfaces.BandejaFabricaPage.BTN_FILTRO;
import static co.com.red5g.bancoomeva.userinterfaces.BandejaFabricaPage.LBL_BANDEJA_FABRICA;
import static co.com.red5g.bancoomeva.userinterfaces.BandejaFabricaPage.TXT_FILTRO_ID;
import static co.com.red5g.bancoomeva.userinterfaces.CreditoPage.BTN_APROBAR;
import static co.com.red5g.bancoomeva.userinterfaces.CreditoPage.LBL_CREDITO;
import static co.com.red5g.finsonet.models.builders.CredencialesBDBuilder.con;
import static co.com.red5g.utils.conexionbd.QueriesBancoomeva.SQL_ID_GESTION;

import co.com.red5g.bancoomeva.modelos.builders.CredencialesBuilder;
import co.com.red5g.bancoomeva.tasks.factories.Ingresa;
import co.com.red5g.finsonet.questions.factories.LaInformacion;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.ensure.Ensure;


public class FabricaCreditos implements Task {

  private static final String BANDEJA_FABRICA = "Bandeja de fábrica";
  private static final String CREDITO = "Crédito";

  @Override
  public <T extends Actor> void performAs(T actor) {
    String id = actor.recall(ID_GESTION);
    String sql = String.format(SQL_ID_GESTION.getSql(), id);
    String idGestion = actor.asksFor(LaInformacion.deBaseDeDatos(con().bdBancomevaEnLinea(), sql, "GESTION"));
    actor.attemptsTo(
        Ingresa.aLaFabricaDeCreditos(CredencialesBuilder.con().unColaborador()),
        Ensure.that(LBL_BANDEJA_FABRICA.resolveFor(actor).getText()).isEqualTo(BANDEJA_FABRICA),
        Enter.theValue(idGestion).into(TXT_FILTRO_ID),
        Click.on(BTN_FILTRO),
        Click.on(BTN_ACCION),
        Ensure.that(LBL_CREDITO.resolveFor(actor).getText()).isEqualTo(CREDITO),
        Scroll.to(BTN_APROBAR),
        Click.on(BTN_APROBAR));
  }
}
