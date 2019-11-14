package co.com.red5g.finsonet.stepdefinitions;

import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;

public class TesoreriaStepDefinition {

    @Dado("que Daniela quiere hacer una normalizacion")
    public void realizarNormalizacion() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Cuando("se normalice el credito del usuario identificado con {int}")
    public void nomalizarCreditoUsuario(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Entonces("el crédito debe pasar a cartera")
    public void verificarCreditoCartera() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }
}