package co.com.red5g.tasks.finsonet;

import co.com.red5g.interacions.AbreLaPagina;
import co.com.red5g.interacions.IngresaAReporte;
import co.com.red5g.models.builders.finsonet.CredencialesBuilder;
import co.com.red5g.tasks.factories.finsonet.Ingresa;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

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