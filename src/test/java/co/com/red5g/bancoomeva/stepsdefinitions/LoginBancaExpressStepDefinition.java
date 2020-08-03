package co.com.red5g.bancoomeva.stepsdefinitions;

import static co.com.red5g.bancoomeva.modelos.builders.CredencialesBuilder.con;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.equalTo;

import co.com.red5g.bancoomeva.questions.factories.Mensaje;
import co.com.red5g.bancoomeva.tasks.factories.Diligencia;
import co.com.red5g.bancoomeva.tasks.factories.Ingresa;
import cucumber.api.java.After;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;

public class LoginBancaExpressStepDefinition {

  private static final String mensajeError = "Usuario o Contraseña incorrecta, cantidad de reintentos disponibles:";
  private static final String mensajeErrorData = "Codigo de Cajero Invalido o NO Existe";

  @After("@LoginBancoomeva")
  public void loguearse() {
    theActorInTheSpotlight().attemptsTo(Diligencia.lasCredencialesDeAutenticacion(con().unColaborador()));
  }

  @Dado("^que (.*) quiere acceder a Banca Express$")
  public void ubicarsePagina(String actor) {
    theActorCalled(actor).wasAbleTo(Ingresa.aBancoomeva());
  }

  @Cuando("^ingresa su información de autenticación de Banca Express$")
  public void ingresarInformacionAutenticacion() {
    theActorInTheSpotlight().attemptsTo(Diligencia.lasCredencialesDeAutenticacion(con().unColaborador()));
  }

  @Entonces("^el debería poder ver el mensaje (.*) en Banca Express$")
  public void verificarIngreso(final String mensaje) {
    theActorInTheSpotlight().should(seeThat("El mensaje", Mensaje.deBienvenida(), equalTo(mensaje)));
  }

  @Cuando("^ingresa su información con clave incorrecta de Banca Express$")
  public void ingresarInformacionClaveErrada() {
    theActorInTheSpotlight().attemptsTo(Diligencia.lasCredencialesDeAutenticacion(con().claveIncorrecta()));
  }

  @Cuando("^ingresa su información con usuario incorrecto de Banca Express$")
  public void ingresarInformacionUsuarioErrado() {
    theActorInTheSpotlight().attemptsTo(Diligencia.lasCredencialesDeAutenticacion(con().usuarioIncorrecto()));
  }

  @Entonces("^el debería poder ver el mensaje de error$")
  public void verificarMensajeErrorContrasena() {
    theActorInTheSpotlight().should(seeThat("El mensaje", Mensaje.deError(), containsString(mensajeError)));
  }

  @Entonces("^el debería poder ver el mensaje de error de data$")
  public void verificarMensajeErrorUsuario() {
    theActorInTheSpotlight().should(seeThat("El mensaje", Mensaje.deError(), containsString(mensajeErrorData)));
  }

  @Cuando("^ingresa su información con datos incorrectos de Banca Express$")
  public void ingresarInformacionIncorrecta() {
    theActorInTheSpotlight().attemptsTo(Diligencia.lasCredencialesDeAutenticacion(con().datosIncorrectos()));
  }
}
