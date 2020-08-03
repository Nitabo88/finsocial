package co.com.red5g.finsonet.interacions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class Obtener implements Question<String> {
    private final String perfilRiesgo;
    private String numeroCredito;

    public Obtener(String perfilRiesgo, String numeroCredito) {
        this.perfilRiesgo = perfilRiesgo;
        this.numeroCredito = numeroCredito;
    }

    public static Obtener numeroCredito(String perfilRiesgo, String numeroCredito) {
        return new Obtener(perfilRiesgo, numeroCredito);
    }

    @Override
    public String answeredBy(Actor actor) {

        return numeroCredito;
    }
}
