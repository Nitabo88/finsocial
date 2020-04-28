package co.com.red5g.models.finsonet;

import co.com.red5g.models.builders.finsonet.CreditoBuilder;

public class Credito {

    private final String strNumeroDocumento;
    private final String strValorCuota;
    private final String strPlazo;
    private final String strCodigoPapeleria;
    private final String strValorCredito;

    public Credito(CreditoBuilder creditoBuilder) {
        this.strNumeroDocumento = creditoBuilder.getStrNumeroDocumento();
        this.strValorCuota = creditoBuilder.getStrValorCuota();
        this.strPlazo = creditoBuilder.getStrPlazo();
        this.strCodigoPapeleria = creditoBuilder.getStrCodigoPapeleria();
        this.strValorCredito = creditoBuilder.getStrValorCredito();
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

    public String getCodigoPapeleria() {
        return strCodigoPapeleria;
    }

    public String getValorCredito() {
        return strValorCredito;
    }
}
