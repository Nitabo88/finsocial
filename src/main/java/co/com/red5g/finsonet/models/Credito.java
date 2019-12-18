package co.com.red5g.finsonet.models;

import co.com.red5g.finsonet.models.builders.CreditoBuilder;

public class Credito {
    private String strNumeroDocumento;
    private String strValorCuota;
    private String strPlazo;

    public Credito(CreditoBuilder creditoBuilder) {
        this.strNumeroDocumento = creditoBuilder.getStrNumeroDocumento();
        this.strValorCuota = creditoBuilder.getStrValorCuota();
        this.strPlazo = creditoBuilder.getStrPlazo();
    }

    public String getStrNumeroDocumento() {
        return strNumeroDocumento;
    }

    public String getStrValorCuota() {
        return strValorCuota;
    }

    public String getStrPlazo() {
        return strPlazo;
    }
}
