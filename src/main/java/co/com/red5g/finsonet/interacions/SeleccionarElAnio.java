package co.com.red5g.finsonet.interacions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.targets.Target;

import java.util.stream.IntStream;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class SeleccionarElAnio implements Interaction {
    private static final String LEFT = "izquierda";
    private final Target flechaIzquierda;
    private final Target flechaDerecha;
    private final int numeroMovimientos;
    private final String desplazamiento;

    public SeleccionarElAnio(final Target arrowLeft, final Target flechaDerecha, final int numeroMovimientos, final String desplazamiento) {
      flechaIzquierda = arrowLeft;
        this.flechaDerecha = flechaDerecha;
        this.numeroMovimientos = numeroMovimientos;
        this.desplazamiento = desplazamiento;
    }

    public static SeleccionarElAnio list(final Target arrowLeft, final Target arrowRight, final int numeroMovimientos, final String desplazamiento) {
        return new SeleccionarElAnio(arrowLeft,arrowRight,numeroMovimientos,desplazamiento);
    }

    @Override
    public <T extends Actor> void performAs(final T actor) {
        if (this.desplazamiento.equals(SeleccionarElAnio.LEFT)) {
            IntStream.range(0, this.numeroMovimientos).forEach(i -> this.flechaIzquierda.resolveFor(theActorInTheSpotlight()).click());
        } else
            IntStream.range(0, this.numeroMovimientos).forEach(i -> this.flechaDerecha.resolveFor(theActorInTheSpotlight()).click());
    }
}