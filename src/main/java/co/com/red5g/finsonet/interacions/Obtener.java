package co.com.red5g.finsonet.interacions;

import static co.com.red5g.utils.data.NumeroCreditoFinsoamigo.APROBACION_CREDITO_RIESGO_150_FR;
import static co.com.red5g.utils.data.NumeroCreditoFinsoamigo.APROBACION_CREDITO_RIESGO_150_IVA;
import static co.com.red5g.utils.data.NumeroCreditoFinsoamigo.APROBACION_CREDITO_RIESGO_50_FR;
import static co.com.red5g.utils.data.NumeroCreditoFinsoamigo.APROBACION_CREDITO_RIESGO_50_IVA;
import static co.com.red5g.utils.data.NumeroCreditoFinsoamigo.APROBACION_CREDITO_RIESGO_ESTANDAR;

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
        switch (perfilRiesgo) {
            case "estándar":
                numeroCredito = APROBACION_CREDITO_RIESGO_ESTANDAR.getNumeroCredito();
                break;
            case "50%+IVA":
                numeroCredito = APROBACION_CREDITO_RIESGO_50_IVA.getNumeroCredito();
                break;
            case "150%+IVA":
                numeroCredito = APROBACION_CREDITO_RIESGO_150_IVA.getNumeroCredito();
                break;
            case "50%_fr":
                numeroCredito = APROBACION_CREDITO_RIESGO_50_FR.getNumeroCredito();
                break;
            case "150%_fr":
                numeroCredito = APROBACION_CREDITO_RIESGO_150_FR.getNumeroCredito();
                break;
            default:
                numeroCredito = "";
                break;
        }
        return numeroCredito;
    }
}
