package co.com.red5g.finsonet.models;

import co.com.red5g.finsonet.models.builders.CreditoBuilder;

public class Credito {
    private final String strNumeroDocumento;
    private final String strValorCuota;
    private final String strPlazo;

    public Credito(final CreditoBuilder creditoBuilder) {
      strNumeroDocumento = creditoBuilder.getStrNumeroDocumento();
      strValorCuota = creditoBuilder.getStrValorCuota();
      strPlazo = creditoBuilder.getStrPlazo();
    }

    public String getNumeroDocumento() {
        return this.strNumeroDocumento;
    }

    public String getValorCuota() {
        return this.strValorCuota;
    }

    public String getPlazo() {
        return this.strPlazo;
    }
}
