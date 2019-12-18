package co.com.red5g.finsonet.models.builders;

import co.com.red5g.finsonet.models.Credito;
import co.com.red5g.finsonet.utils.Builder;

import static co.com.red5g.finsonet.utils.InformacionCredito.INFORMACION_CREDITO;

public class CreditoBuilder implements Builder<Credito> {
    private String strNumeroDocumento;
    private String strValorCuota;
    private String strPlazo;

    public static CreditoBuilder la(){
        return new CreditoBuilder();
    }

    private CreditoBuilder conDocumento(String strNumeroDocumento) {
        this.strNumeroDocumento = strNumeroDocumento;
        return this;
    }

    private CreditoBuilder conValor(String strValorCuota) {
        this.strValorCuota = strValorCuota;
        return this;
    }

    private CreditoBuilder a(String strPlazo) {
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

    private CreditoBuilder() {
        this.strNumeroDocumento = "";
        this.strValorCuota = "";
        this.strPlazo = "";
    }

    public Credito informacionDelCredito() {
        this.conDocumento(INFORMACION_CREDITO.getNumeroDocumento());
        this.conValor(INFORMACION_CREDITO.getValorCuota());
        this.a(INFORMACION_CREDITO.getNumeroCuotas());
        return this.build();
    }

    public Credito informacionDelCredito(String strNumeroDocumento, String strValorCuota, String strPlazo) {
        this.conDocumento(strNumeroDocumento);
        this.conValor(strValorCuota);
        this.a(strPlazo);
        return this.build();
    }

    @Override
    public Credito build() {
        return new Credito(this);
    }
}