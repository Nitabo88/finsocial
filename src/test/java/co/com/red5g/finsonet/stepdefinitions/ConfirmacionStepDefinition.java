package co.com.red5g.finsonet.stepdefinitions;

import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;

public class ConfirmacionStepDefinition {

  @Dado("^que (.*) quiere realizar una aprobacion de un credito$")
  public void queUnAsesorQuiereRealizarUnaAprobacionDeUnCredito(String actor) {

  }

  @Entonces("^el crédito debe pasar a incorporacion$")
  public void elCréditoDebePasarAIncorporacion() {
  }

  @Cuando("^se apruebe el credito del usuario$")
  public void seApruebeElCreditoDelUsuario() {
  }
}
