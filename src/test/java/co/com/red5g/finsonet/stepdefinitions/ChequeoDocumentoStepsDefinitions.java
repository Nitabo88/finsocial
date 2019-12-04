package co.com.red5g.finsonet.stepdefinitions;


import co.com.red5g.finsonet.exceptions.NoSeVeElCreditoCreadoException;
import co.com.red5g.finsonet.interacions.Abrir;
import co.com.red5g.finsonet.questions.Credito;
import co.com.red5g.finsonet.tasks.Estado;
import co.com.red5g.finsonet.tasks.Ingresar;
import co.com.red5g.finsonet.tasks.SeDirige;
import co.com.red5g.finsonet.userinterfaces.LoginFinsocialPage;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;



import static co.com.red5g.finsonet.exceptions.NoSeVeElCreditoCreadoException.MENSAJE_CREDITO;
import static co.com.red5g.finsonet.models.builder.ChequeDocumentoBuilder.con;
import static co.com.red5g.finsonet.models.builder.CredencialesBuilder.de;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class ChequeoDocumentoStepsDefinitions {
        private LoginFinsocialPage loginFinsocialPage;
        private static final String  CEDULA = "cedula";

        @Managed(driver = "chrome")
        private WebDriver navegador;

        @Dado("que (.*) quiere realizar el chequeo de un documento")
        public void ChequeoDocumentos(String nombreActor) {
            theActorCalled(nombreActor).can(BrowseTheWeb.with(navegador));
            theActorInTheSpotlight().attemptsTo(
                    Abrir.laPaginaPrincipal(),
                    Ingresar.lasCredenciales(de().unUsuarioBasico()),
                    SeDirige.AChequeoDocumento());
        }

        @Cuando("(.*) decline el chequeo del credito del cliente")
        public void RachazodeCreditoPorDocumentacion() {
            theActorInTheSpotlight().remember(cedula, CEDULA);
            theActorInTheSpotlight().attemptsTo(co.com.red5g.finsonet.questions.Estado.actualizado()),
            theActorInTheSpotlight().attemptsTo(Estado.diligenciar(con().motivo()));
        }

        @Entonces("cuando (.*) devuelva el credito del cliente este no deberia verlo en chequeo de documentos")
        public void verificarCreacionCredito() {
            theActorInTheSpotlight().should(seeThat(co.com.red5g.finsonet.questions.Estado.noVisible()));

        }
    }