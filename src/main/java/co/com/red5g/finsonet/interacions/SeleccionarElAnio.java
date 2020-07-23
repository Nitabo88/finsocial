package co.com.red5g.finsonet.interacions;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import java.util.stream.IntStream;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.targets.Target;

public class SeleccionarElAnio implements Interaction {
    private static final String LEFT = "izquierda";
    private final Target flechaIzquierda;
    private final Target flechaDerecha;
    private final int numeroMovimientos;
    private final String desplazamiento;

    public SeleccionarElAnio(Target arrowLeft, Target flechaDerecha, int numeroMovimientos, String desplazamiento) {
      this.flechaIzquierda = arrowLeft;
        this.flechaDerecha = flechaDerecha;
        this.numeroMovimientos = numeroMovimientos;
        this.desplazamiento = desplazamiento;
    }

    public static SeleccionarElAnio list(Target arrowLeft, Target arrowRight, int numeroMovimientos, String desplazamiento) {
        return new SeleccionarElAnio(arrowLeft,arrowRight,numeroMovimientos,desplazamiento);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        if (desplazamiento.equals(LEFT)) {
            IntStream.range(0, numeroMovimientos).forEach(i -> flechaIzquierda.resolveFor(theActorInTheSpotlight()).click());
        } else
            IntStream.range(0, numeroMovimientos).forEach(i -> flechaDerecha.resolveFor(theActorInTheSpotlight()).click());
    }
}