package co.com.red5g.finsonet.models.builders;

import co.com.red5g.finsonet.models.Credito;
import co.com.red5g.finsonet.utils.Builder;

public final class CreditoBuilder implements Builder<Credito> {

  private String strNumeroDocumento;
  private String strValorCuota;
  private String strPlazo;
  private String codigoPapeleria;


  public static CreditoBuilder la() {
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

  private CreditoBuilder conCodigoPapeleria(String codigoPapeleria) {
    this.codigoPapeleria = codigoPapeleria;
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
    this.codigoPapeleria = "";
  }

  public Credito informacionDelCredito() {
    this.conDocumento("10000060");
    this.conValor("1200000");
    this.a("48");
    this.conCodigoPapeleria("No tiene");
    return this.build();
  }

  public Credito informacionDelCredito(String strNumeroDocumento, String strValorCuota, String strPlazo) {
    this.conDocumento(strNumeroDocumento);
    this.conValor(strValorCuota);
    this.a(strPlazo);
    this.conCodigoPapeleria("No tiene");
    return this.build();
  }

  public Credito informacionDelCreditoHuy() {
    this.conDocumento("10000622");
    this.a("48");
    return this.build();
  }

  @Override
  public Credito build() {
    return new Credito(this);
  }

  public String getCodigoPapeleria() {
    return codigoPapeleria;
  }
}