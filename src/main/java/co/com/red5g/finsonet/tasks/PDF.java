package co.com.red5g.finsonet.tasks;

import static co.com.red5g.finsonet.models.builders.CredencialesBDBuilder.con;
import static co.com.red5g.general.interactions.ChangeUrl.onBrowser;
import static co.com.red5g.utils.conexionbd.QueriesFinsonet.SQL_ID_GESTION;
import static co.com.red5g.utils.data.Constantes.NUMERO_CREDITO;

import co.com.red5g.finsonet.questions.factories.LaInformacion;
import co.com.red5g.finsonet.userinterfaces.LoginFinsonetPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class PDF implements Task {

  LoginFinsonetPage loginFinsonetPage;
  String url;
  String numeroCredito;

  public PDF(String url, String numeroCredito) {
    this.url = url;
    this.numeroCredito = numeroCredito;
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    actor.remember(NUMERO_CREDITO, numeroCredito);
    String numeroGestion =
        actor.asksFor(
            LaInformacion.deBaseDeDatos(
                con().bdEnLineaAutogestion(), SQL_ID_GESTION.getSql(), "id_gestion"));
    String pdf = String.format(url, numeroGestion);
    actor.attemptsTo(Open.browserOn(loginFinsonetPage), onBrowser(pdf));
  }
}
