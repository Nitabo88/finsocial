package co.com.red5g.finsonet.tasks;

import co.com.red5g.finsonet.interacions.AbreLaPagina;
import co.com.red5g.finsonet.interacions.IngresaAReporte;
import co.com.red5g.finsonet.models.builders.CredencialesBuilder;
import co.com.red5g.finsonet.tasks.factories.Ingresa;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ReporteLiquidacionComisiones implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                AbreLaPagina.finsonet(),
                Ingresa.lasCredenciales(CredencialesBuilder.de().unUsuarioBasico()),
                IngresaAReporte.liquidacionDeComisiones()
        );
    }
}