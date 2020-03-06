package co.com.red5g.finsonet.models;

import co.com.red5g.finsonet.models.builders.CreditoBuilder;

public class Credito {
    private final String strNumeroDocumento;
    private final String strValorCuota;
    private final String strPlazo;

    public Credito(CreditoBuilder creditoBuilder) {
      this.strNumeroDocumento = creditoBuilder.getStrNumeroDocumento();
      this.strValorCuota = creditoBuilder.getStrValorCuota();
      this.strPlazo = creditoBuilder.getStrPlazo();
    }

    public String getNumeroDocumento() {
        return strNumeroDocumento;
    }

    public String getValorCuota() {
        return strValorCuota;
    }

    public String getPlazo() {
        return strPlazo;
    }
}
