package co.com.red5g.stepdefinitions.finsonet;

import co.com.red5g.exceptions.finsonet.NoSeVeElCreditoException;
import co.com.red5g.questions.factories.ElCredito;
import co.com.red5g.tasks.factories.finsonet.Consulta;
import co.com.red5g.tasks.factories.finsonet.Diligencia;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;

import static co.com.red5g.models.builders.finsonet.CreditoBuilder.la;
import static co.com.red5g.models.builders.finsonet.IncorporacionBuilder.con;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class IncorporacionHuyStepDefinition {

    @Dado("^que (.*) quiere aprobar un crédito huy en incoporación de créditos$")
    public void ingresarIncorporacionHuy(String actor) {
        theActorCalled(actor).attemptsTo(
                Consulta.elCreditoEnIncorporacionHuy(la().informacionIncorporacionHuy())
        );
    }

    @Cuando("^el asesor aprueba el crédito en incorporación huy$")
    public void aprobarIncorporacionHuy() {
        theActorInTheSpotlight().attemptsTo(
                Diligencia.laAprobacionDelCreditoEnIncorporacionHuy(con().aprobacion()));
    }

    @Entonces("^el asesor deberá ver el crédito en el paso de formalización huy$")
    public void verificarCredito() {
        theActorInTheSpotlight().should(seeThat(ElCredito.enLaListDeFormalizacion()).orComplainWith(NoSeVeElCreditoException.class, NoSeVeElCreditoException.MENSAJE_CREDITO));
    }
}
