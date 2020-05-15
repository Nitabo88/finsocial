package co.com.red5g.finsonet.tasks;

import co.com.red5g.finsonet.tasks.factories.Consulta;
import co.com.red5g.finsonet.tasks.factories.Diligencia;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.red5g.finsonet.models.builders.CreditoBuilder.la;
import static co.com.red5g.finsonet.models.builders.IncorporacionBuilder.con;
import static co.com.red5g.finsonet.userinterfaces.IncorporacionPage.MNM_HAMBURGUESA;
import static co.com.red5g.finsonet.userinterfaces.OriginacionPage.MNM_NUEVO_ORIGINACION;

public class FormalizacionCreditoHuy implements Task {
    private static final String FORMALIZACION = "Formalización";

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Consulta.elCreditoEnIncorporacionHuy(la().informacionFormalizacionHuy()),
                Diligencia.laAprobacionDelCreditoEnIncorporacionHuy(con().aprobacion()),
                Click.on(MNM_HAMBURGUESA),
                Click.on(MNM_NUEVO_ORIGINACION.of(FORMALIZACION))
        );
    }
}
