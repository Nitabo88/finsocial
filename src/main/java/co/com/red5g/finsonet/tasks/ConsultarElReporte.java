package co.com.red5g.finsonet.tasks;

import co.com.red5g.finsonet.interacions.AbreLaPagina;
import co.com.red5g.finsonet.interacions.IngresaAReporte;
import co.com.red5g.finsonet.models.builder.CredencialesBuilder;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ConsultarElReporte implements Task {

    public static ConsultarElReporte deLiquidacionDeComisiones() {
        return instrumented(ConsultarElReporte.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                AbreLaPagina.finsonet(),
                SeAutentica.conCredenciales(CredencialesBuilder.de().unUsuarioBasico()),
                IngresaAReporte.liquidacionDeComisiones()
        );
    }
}