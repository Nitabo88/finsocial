package co.com.red5g.finsonet.interacions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.targets.Target;

import java.util.List;

public class SumaValorDetalle implements Interaction {
    public static final String SUMA_VALOR_CREDITOS = "suma valor creditos";

    private List<Target> lstValoresCredito;

    @Override
    public <T extends Actor> void performAs(T actor) {
        double suma = lstValoresCredito.stream().mapToDouble(target -> Double.parseDouble(target.resolveFor(actor).getText().replaceAll("[^\\d.]", ""))).sum();
        actor.remember(SUMA_VALOR_CREDITOS, suma);
    }
}
