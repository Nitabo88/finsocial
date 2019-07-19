package co.com.red5g.task;

import co.com.red5g.Interaction.IngresoPorEstado;
import co.com.red5g.userinterfaces.OriginacionPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AbrirEstadoOrig implements Task {


    private String estadoOrig;

    public AbrirEstadoOrig(String estadoOrig) {
        this.estadoOrig = estadoOrig;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(IngresoPorEstado.elIngreso(estadoOrig));
    }

    public static AbrirEstadoOrig elEstado(String estadoOrig) {
        return instrumented(AbrirEstadoOrig.class, estadoOrig);
    }

}



