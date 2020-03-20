package co.com.red5g.finsonet.stepdefinitions;

import static co.com.red5g.finsonet.exceptions.ElCreditoNoFueRechazadoException.MENSAJE_CREDITO_RECHAZADO;
import static co.com.red5g.finsonet.exceptions.NoSeVeElCreditoException.MENSAJE_CREDITO;
import static co.com.red5g.finsonet.models.builders.ChequeoDocumentoBuilder.con;
import static co.com.red5g.finsonet.models.builders.CredencialesBuilder.de;
import static co.com.red5g.finsonet.userinterfaces.ChequeoDocumentosPage.LST_CHEQUEO_DOCUMENTOS_NOMBRE;
import static co.com.red5g.finsonet.userinterfaces.ModulosAdministracionPage.LNK_ORIGINACION;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.containsString;

import co.com.red5g.finsonet.exceptions.ElCreditoNoFueRechazadoException;
import co.com.red5g.finsonet.exceptions.NoSeVeElCreditoException;
import co.com.red5g.finsonet.interacions.AbreLaPagina;
import co.com.red5g.finsonet.interacions.Subir;
import co.com.red5g.finsonet.questions.QueAparece;
import co.com.red5g.finsonet.questions.QueElChequeoDeDocumentos;
import co.com.red5g.finsonet.questions.factories.ElCredito;
import co.com.red5g.finsonet.tasks.Realizar;
import co.com.red5g.finsonet.tasks.factories.Diligencia;
import co.com.red5g.finsonet.tasks.factories.Ingresa;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.JavaScriptClick;

public class ChequeoDocumentosStepDefinition {

  private static final String ESTADO_NO_EXITOSO = "Para poder continuar es necesario diligenciar";

  @Dado("^que (.*) esta en el paso de chequeo de un documentos$")
  public void ingresarChequeo(final String actor) {
    theActorCalled(actor).attemptsTo(
        Realizar.unChequeoDeDocumento()
    );
  }

  @Cuando("^el asesor decline el chequeo del credito del cliente$")
  public void rechazarChequeoDocumentos() {
    theActorInTheSpotlight().attemptsTo(
        Ingresa.elRechazoDelCredito(con().motivo())
    );
  }

  @Cuando("^el asesor complete el chequeo de credito del cliente$")
  public void diligenciarChequeoDocumentos() {
    theActorInTheSpotlight().attemptsTo(
        Diligencia.laInformacionIncompletaDeChequeoDeDocumentos(con().centralesDeRiesgo())
    );
  }

  @Entonces("^deberia ver el mensaje de adjuntar informacion$")
  public void verificarNoCreacionCredito() {
    theActorInTheSpotlight().should(seeThat(QueElChequeoDeDocumentos.noSeGuardo(), containsString(ChequeoDocumentosStepDefinition.ESTADO_NO_EXITOSO)));
  }

  @Cuando("^el asesor adjunta toda la informacion de el chequeo de documentos$")
  public void adjuntarDocumentos() {
    theActorInTheSpotlight().attemptsTo(
        Diligencia.laInformacionDeChequeoDeDocumentos(con().centralesDeRiesgo())
    );
  }

  @Entonces("^deberia ver el credito en el paso de confirmacion$")
  public void verificarCreacionCredito() {
    theActorInTheSpotlight().should(seeThat(ElCredito.enConfirmacion()).orComplainWith(NoSeVeElCreditoException.class, MENSAJE_CREDITO));
  }

  @Entonces("^el auxiliar de documentacion deberia verlo$")
  public void verificarRevisionDocumentacion() {
    theActorInTheSpotlight().attemptsTo(Ingresa.conUsuarioDeDocumentacion());
    theActorInTheSpotlight().should(seeThat(QueAparece.laSolicitudPendiente()).orComplainWith(ElCreditoNoFueRechazadoException.class, MENSAJE_CREDITO_RECHAZADO));
  }

  @Dado("^que un asesor esta en el paso de chequeo de un credito numero (.*)$")
  public void queUnAsesorEstaEnElPasoDeChequeoDeUnCreditoNumero(String numeroCredito) {
    theActorCalled("prueba").attemptsTo(
        AbreLaPagina.finsonet(),
        Ingresa.lasCredenciales(de().unUsuarioBasico()),
        Click.on(LNK_ORIGINACION),
        JavaScriptClick.on(LST_CHEQUEO_DOCUMENTOS_NOMBRE.of(numeroCredito))
    );
    theActorInTheSpotlight().attemptsTo(Subir.losArchivos());
  }
}