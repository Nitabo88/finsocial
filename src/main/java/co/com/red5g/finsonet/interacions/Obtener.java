package co.com.red5g.finsonet.interacions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.red5g.utils.NumeroCreditoFinsoamigo.*;

public class Obtener implements Question<String> {
    private String perfilRiesgo;
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
        if (perfilRiesgo.equals("estándar")) {
            numeroCredito = APROBACION_CREDITO_RIESGO_ESTANDAR.getNumeroCredito();
        } else if (perfilRiesgo.equals("50%+IVA")) {
            numeroCredito = APROBACION_CREDITO_RIESGO_50_IVA.getNumeroCredito();
        } else {
            numeroCredito = APROBACION_CREDITO_RIESGO_150_IVA.getNumeroCredito();
        }
        return numeroCredito;
    }
}
