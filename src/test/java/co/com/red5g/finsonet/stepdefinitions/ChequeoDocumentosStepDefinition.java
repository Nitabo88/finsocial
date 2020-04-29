package co.com.red5g.finsonet.stepdefinitions;

import static co.com.red5g.finsonet.models.builders.ChequeoDocumentoBuilder.con;
import static co.com.red5g.finsonet.models.builders.CreditoBuilder.la;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.containsString;

import co.com.red5g.finsonet.exceptions.ElCreditoNoFueRechazadoException;
import co.com.red5g.finsonet.exceptions.NoSeVeElCreditoException;
import co.com.red5g.finsonet.questions.QueAparece;
import co.com.red5g.finsonet.questions.QueElChequeoDeDocumentos;
import co.com.red5g.finsonet.questions.factories.ElCredito;
import co.com.red5g.finsonet.tasks.factories.Diligencia;
import co.com.red5g.finsonet.tasks.factories.Ingresa;
import co.com.red5g.finsonet.tasks.factories.Realiza;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.GivenWhenThen;

public class ChequeoDocumentosStepDefinition {

  private static final String ESTADO_NO_EXITOSO = "Para poder continuar es necesario diligenciar";

  @Dado("^que (.*) esta en el paso de chequeo de documentos de un crédito de libranza$")
  public void ingresarChequeoDocumentos(final String actor) {
    theActorCalled(actor).attemptsTo(
        Realiza.unChequeoDeDocumento(la().informacionDelCreditoChequeoDocumento())
    );
  }

  @Cuando("^el asesor decline el chequeo del crédito de libranza del cliente$")
  public void rechazarChequeoDocumentos() {
    theActorInTheSpotlight().attemptsTo(
        Ingresa.elRechazoDelCredito(con().motivo())
    );
  }

  @Cuando("^el asesor complete el chequeo de crédito del cliente$")
  public void diligenciarChequeoDocumentos() {
    theActorInTheSpotlight().attemptsTo(
        Diligencia.laInformacionIncompletaDeChequeoDeDocumentos(con().libranza())
    );
  }

  @Entonces("^deberá ver el mensaje de adjuntar información$")
  public void verificarNoCreacionCredito() {
    theActorInTheSpotlight().should(GivenWhenThen.seeThat(QueElChequeoDeDocumentos.noSeGuardo(), containsString(ChequeoDocumentosStepDefinition.ESTADO_NO_EXITOSO)));
  }

  @Cuando("^el asesor adjunta toda la información de el chequeo de documentos$")
  public void adjuntarDocumentos() {
    theActorInTheSpotlight().attemptsTo(
        Diligencia.laInformacionDeChequeoDeDocumentosLibranza(con().libranza())
    );
  }

  @Entonces("^deberá ver el crédito en el paso de confirmación$")
  public void verificarCreacionCredito() {
    theActorInTheSpotlight().should(seeThat(ElCredito.enConfirmacion()).orComplainWith(NoSeVeElCreditoException.class, NoSeVeElCreditoException.MENSAJE_CREDITO));
  }

  @Entonces("^el auxiliar de documentación debería verlo en su lista de chequeo de documentos$")
  public void verificarRevisionDocumentacion() {
    theActorInTheSpotlight().attemptsTo(Ingresa.conUsuarioDeDocumentacion());
    theActorInTheSpotlight().should(GivenWhenThen.seeThat(QueAparece.laSolicitudPendiente()).orComplainWith(ElCreditoNoFueRechazadoException.class, ElCreditoNoFueRechazadoException.MENSAJE_CREDITO_RECHAZADO));
  }
}