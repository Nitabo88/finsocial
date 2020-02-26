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

    private CreditoBuilder conDocumento(final String strNumeroDocumento) {
        this.strNumeroDocumento = strNumeroDocumento;
        return this;
    }

    private CreditoBuilder conValor(final String strValorCuota) {
        this.strValorCuota = strValorCuota;
        return this;
    }

    private CreditoBuilder a(final String strPlazo) {
        this.strPlazo = strPlazo;
        return this;
    }

    public String getStrNumeroDocumento() {
        return this.strNumeroDocumento;
    }

    public String getStrValorCuota() {
        return this.strValorCuota;
    }

    public String getStrPlazo() {
        return this.strPlazo;
    }

    private CreditoBuilder() {
      strNumeroDocumento = "";
      strValorCuota = "";
      strPlazo = "";
    }

    public Credito informacionDelCredito() {
      conDocumento(INFORMACION_CREDITO.getNumeroDocumento());
      conValor(INFORMACION_CREDITO.getValorCuota());
      a(INFORMACION_CREDITO.getNumeroCuotas());
        return build();
    }

    public Credito informacionDelCredito(final String strNumeroDocumento, final String strValorCuota, final String strPlazo) {
      conDocumento(strNumeroDocumento);
      conValor(strValorCuota);
      a(strPlazo);
        return build();
    }

  public Credito informacionDelCreditoHuy() {
    conDocumento("10000622");
    a("48");
    return build();
  }

    @Override
    public Credito build() {
        return new Credito(this);
    }
}