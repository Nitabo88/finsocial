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

  private CreditoBuilder conValorCuota(String strValorCuota) {
    this.strValorCuota = strValorCuota;
    return this;
  }

  private CreditoBuilder conCodigoPapeleria() {
    this.codigoPapeleria = "No tiene";
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

  public Credito informacionDelCreditoChequeoDocumento() {
    this.conDocumento("7447352");
    this.conValorCuota("1200000");
    this.a("48");
    this.conCodigoPapeleria();
    return this.build();
  }

  public Credito informacionDelCreditoFormulario() {
    this.conDocumento("19362753");
    this.conValorCuota("1200000");
    this.a("48");
    this.conCodigoPapeleria();
    return this.build();
  }

  public Credito informacionDelCreditoAprobacion() {
    this.conDocumento("19186577");
    this.conValorCuota("800000");
    this.a("60");
    this.conCodigoPapeleria();
    return this.build();
  }

  public Credito informacionDelCreditoConfirmacion() {
    this.conDocumento("1129573950");
    this.conValorCuota("400000");
    this.a("72");
    this.conCodigoPapeleria();
    return this.build();
  }

  public Credito informacionDelCreditoCdas() {
    this.conDocumento("64585528");
    this.conValorCuota("1050000");
    this.a("60");
    this.conCodigoPapeleria();
    return this.build();
  }

  public Credito informacionDelCreditoCdasCompleto() {
    this.conDocumento("8663397");
    this.conValorCuota("1020000");
    this.a("55");
    this.conCodigoPapeleria();
    return this.build();
  }

  public Credito informacionDelCreditoFormalizacion() {
    this.conDocumento("10094548");
    this.conValorCuota("1300000");
    this.a("60");
    this.conCodigoPapeleria();
    return this.build();
  }

  public Credito informacionDelCreditoIncorporacion() {
    this.conDocumento("12370816");
    this.conValorCuota("750000");
    this.a("50");
    this.conCodigoPapeleria();
    return this.build();
  }

  public Credito informacionDelCreditoTesoreria() {
    this.conDocumento("6615550");
    this.conValorCuota("580000");
    this.a("57");
    this.conCodigoPapeleria();
    return this.build();
  }

  public Credito informacionDelCreditoLlamadaLibranza() {
    this.conDocumento("24313904");
    this.conValorCuota("97000");
    this.a("48");
    this.conCodigoPapeleria();
    return this.build();
  }

  public Credito informacionDelCredito(String strNumeroDocumento, String strValorCuota, String strPlazo) {
    this.conDocumento(strNumeroDocumento);
    this.conValorCuota(strValorCuota);
    this.a(strPlazo);
    this.conCodigoPapeleria();
    return this.build();
  }

  public Credito informacionDelCreditoHuy() {
    this.conDocumento("10000622");
    this.a("72");
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