package co.com.red5g.finsonet.models.builder;

import co.com.red5g.finsonet.models.Credito;
import co.com.red5g.finsonet.utils.Builder;

public class CreditoBuilder implements Builder<Credito> {
    private String strNumeroDocumento;
    private String strValorCuota;
    private String strPlazo;

    public CreditoBuilder conDocumento(String strNumeroDocumento) {
        this.strNumeroDocumento = strNumeroDocumento;
        return this;
    }

    public CreditoBuilder conValor(String strValorCuota) {
        this.strValorCuota = strValorCuota;
        return this;
    }

    public CreditoBuilder a(String strPlazo) {
        this.strPlazo = strPlazo;
        return this;
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

    public CreditoBuilder() {
        this.strNumeroDocumento = "";
        this.strValorCuota = "";
        this.strPlazo = "";
    }

    public static CreditoBuilder informacionCredito(){
        return new CreditoBuilder();
    }

    @Override
    public Credito build() {
        return new Credito(this);
    }
}