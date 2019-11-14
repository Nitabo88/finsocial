package co.com.red5g.finsonet.interacions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.targets.Target;

import static co.com.red5g.finsonet.userinterfaces.ReporteVentasPage.LBL_NUMERO_CREDITOS_ORIGINACION;
import static co.com.red5g.finsonet.userinterfaces.ReporteVentasPage.LBL_VALOR_ORIGINACION;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Observa implements Interaction {

    public static final String VALOR_ORIGINACION = "";
    public static final String CREDITOS_ORIGINACION = "";
    private Target strValor;
    private Target strNumeroCreditos;

    public static Performable losValoresConsolidados(Target strValor, Target strNumeroCreditos) {
        return instrumented(Observa.class,strValor,strNumeroCreditos);
    }

    public Observa(Target strValor, Target strNumeroCreditos) {
        this.strValor = strValor;
        this.strNumeroCreditos = strNumeroCreditos;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.remember(VALOR_ORIGINACION, strValor.resolveFor(actor).getText().replaceAll("[^\\d.]", ""));
        actor.remember(CREDITOS_ORIGINACION, strNumeroCreditos.resolveFor(actor).getText().replaceAll("[^\\d.]", ""));
    }
}
