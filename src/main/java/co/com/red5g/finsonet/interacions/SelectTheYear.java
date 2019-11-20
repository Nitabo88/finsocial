package co.com.red5g.finsonet.interacions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.targets.Target;

import java.util.stream.IntStream;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class SelectTheYear implements Interaction {
    private Target arrowLeft;
    private Target arrowRight;
    private int numeroMovimientos;
    private String desplazamiento;

    public SelectTheYear(Target arrowLeft, Target arrowRight, int numeroMovimientos, String desplazamiento) {
        this.arrowLeft = arrowLeft;
        this.arrowRight = arrowRight;
        this.numeroMovimientos = numeroMovimientos;
        this.desplazamiento = desplazamiento;
    }

    public static SelectTheYear list(Target arrowLeft, Target arrowRight, int numeroMovimientos, String desplazamiento) {
        return new SelectTheYear (arrowLeft,arrowRight,numeroMovimientos,desplazamiento);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        if (desplazamiento.equals("left")) {
            IntStream.range(0, numeroMovimientos).forEach(i -> arrowLeft.resolveFor(theActorInTheSpotlight()).click());
        } else
            IntStream.range(0, numeroMovimientos).forEach(i -> arrowRight.resolveFor(theActorInTheSpotlight()).click());
    }
}