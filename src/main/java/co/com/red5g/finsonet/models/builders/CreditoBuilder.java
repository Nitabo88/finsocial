package co.com.red5g.finsonet.models.builders;

import co.com.red5g.finsonet.models.Credito;
import co.com.red5g.utils.Builder;
import co.com.red5g.utils.InformacionCreditoHuy;
import co.com.red5g.utils.InformacionCreditoLibranza;

public final class CreditoBuilder implements Builder<Credito> {

  private String strNumeroDocumento;
  private String strValorCuota;
  private String strPlazo;
  private String strCodigoPapeleria;
  private String strValorCredito;

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
    this.strCodigoPapeleria = "No tiene";
    return this;
  }

  private CreditoBuilder conValorCredito(String strValorCredito) {
    this.strValorCredito = strValorCredito;
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

  public String getStrValorCredito() {
    return strValorCredito;
  }

  private CreditoBuilder() {
    this.strNumeroDocumento = "";
    this.strValorCuota = "";
    this.strPlazo = "";
    this.strCodigoPapeleria = "";
    this.strValorCredito = "";
  }

  public Credito informacionDelCreditoFormulario() {
    this.conDocumento(InformacionCreditoLibranza.INFORMACION_FORMULARIO_LIBRANZA.getNumeroDocumento());
    this.conValorCuota(InformacionCreditoLibranza.INFORMACION_FORMULARIO_LIBRANZA.getValorCuota());
    this.a(InformacionCreditoLibranza.INFORMACION_FORMULARIO_LIBRANZA.getNumeroCuotas());
    this.conCodigoPapeleria();
    return this.build();
  }

  public Credito informacionDelCreditoChequeoDocumento() {
    this.conDocumento(InformacionCreditoLibranza.INFORMACION_CHEQUEO_LIBRANZA.getNumeroDocumento());
    this.conValorCuota(InformacionCreditoLibranza.INFORMACION_CHEQUEO_LIBRANZA.getValorCuota());
    this.a(InformacionCreditoLibranza.INFORMACION_CHEQUEO_LIBRANZA.getNumeroCuotas());
    this.conCodigoPapeleria();
    return this.build();
  }

  public Credito informacionDelCreditoConfirmacion() {
    this.conDocumento(InformacionCreditoLibranza.INFORMACION_CONFIRMACION_LIBRANZA.getNumeroDocumento());
    this.conValorCuota(InformacionCreditoLibranza.INFORMACION_CONFIRMACION_LIBRANZA.getValorCuota());
    this.a(InformacionCreditoLibranza.INFORMACION_CONFIRMACION_LIBRANZA.getNumeroCuotas());
    this.conCodigoPapeleria();
    return this.build();
  }

  public Credito informacionDelCreditoAprobacion() {
    this.conDocumento(InformacionCreditoLibranza.INFORMACION_APROBACION_LIBRANZA.getNumeroDocumento());
    this.conValorCuota(InformacionCreditoLibranza.INFORMACION_APROBACION_LIBRANZA.getValorCuota());
    this.a(InformacionCreditoLibranza.INFORMACION_APROBACION_LIBRANZA.getNumeroCuotas());
    this.conCodigoPapeleria();
    return this.build();
  }

  public Credito informacionDelCreditoIncorporacion() {
    this.conDocumento(InformacionCreditoLibranza.INFORMACION_INCORPORACION_LIBRANZA.getNumeroDocumento());
    this.conValorCuota(InformacionCreditoLibranza.INFORMACION_INCORPORACION_LIBRANZA.getValorCuota());
    this.a(InformacionCreditoLibranza.INFORMACION_INCORPORACION_LIBRANZA.getNumeroCuotas());
    this.conCodigoPapeleria();
    return this.build();
  }

  public Credito informacionDelCreditoFormalizacion() {
    this.conDocumento(InformacionCreditoLibranza.INFORMACION_FORMALIZACION_LIBRANZA.getNumeroDocumento());
    this.conValorCuota(InformacionCreditoLibranza.INFORMACION_FORMALIZACION_LIBRANZA.getValorCuota());
    this.a(InformacionCreditoLibranza.INFORMACION_FORMALIZACION_LIBRANZA.getNumeroCuotas());
    this.conCodigoPapeleria();
    return this.build();
  }

  public Credito informacionDelCreditoTesoreria() {
    this.conDocumento(InformacionCreditoLibranza.INFORMACION_TESORERIA_LIBRANZA.getNumeroDocumento());
    this.conValorCuota(InformacionCreditoLibranza.INFORMACION_TESORERIA_LIBRANZA.getValorCuota());
    this.a(InformacionCreditoLibranza.INFORMACION_TESORERIA_LIBRANZA.getNumeroCuotas());
    this.conCodigoPapeleria();
    return this.build();
  }

  public Credito informacionDelCreditoCdas() {
    this.conDocumento(InformacionCreditoLibranza.INFORMACION_CDAS_INCOMPLETO_LIBRANZA.getNumeroDocumento());
    this.conValorCuota(InformacionCreditoLibranza.INFORMACION_CDAS_INCOMPLETO_LIBRANZA.getValorCuota());
    this.a(InformacionCreditoLibranza.INFORMACION_CDAS_INCOMPLETO_LIBRANZA.getNumeroCuotas());
    this.conCodigoPapeleria();
    return this.build();
  }

  public Credito informacionDelCreditoCdasCompleto() {
    this.conDocumento(InformacionCreditoLibranza.INFORMACION_CDAS_COMPLETO_LIBRANZA.getNumeroDocumento());
    this.conValorCuota(InformacionCreditoLibranza.INFORMACION_CDAS_COMPLETO_LIBRANZA.getValorCuota());
    this.a(InformacionCreditoLibranza.INFORMACION_CDAS_COMPLETO_LIBRANZA.getNumeroCuotas());
    this.conCodigoPapeleria();
    return this.build();
  }

  public Credito informacionDelCreditoLlamadaLibranza() {
    this.conDocumento(InformacionCreditoLibranza.INFORMACION_LLAMADA_LIBRANZA.getNumeroDocumento());
    this.conValorCuota(InformacionCreditoLibranza.INFORMACION_LLAMADA_LIBRANZA.getValorCuota());
    this.a(InformacionCreditoLibranza.INFORMACION_LLAMADA_LIBRANZA.getNumeroCuotas());
    this.conCodigoPapeleria();
    return this.build();
  }

  public Credito informacionChequeoHuy() {
    this.conDocumento(InformacionCreditoHuy.INFORMACION_CHEQUEO_HUY.getNumeroDocumento());
    this.a(InformacionCreditoHuy.INFORMACION_CHEQUEO_HUY.getNumeroCuotas());
    this.conValorCredito(InformacionCreditoHuy.INFORMACION_CHEQUEO_HUY.getValorCredito());
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
    this.conDocumento(InformacionCreditoHuy.INFORMACION_CREDITO_HUY.getNumeroDocumento());
    this.a(InformacionCreditoHuy.INFORMACION_CREDITO_HUY.getNumeroCuotas());
    this.conValorCredito(InformacionCreditoHuy.INFORMACION_CREDITO_HUY.getValorCredito());
    return this.build();
  }

  public Credito informacionAprobacionHuy() {
    this.conDocumento(InformacionCreditoHuy.INFORMACION_APROBACION_HUY.getNumeroDocumento());
    this.a(InformacionCreditoHuy.INFORMACION_APROBACION_HUY.getNumeroCuotas());
    this.conValorCredito(InformacionCreditoHuy.INFORMACION_APROBACION_HUY.getValorCredito());
    return this.build();
  }

  public Credito informacionIncorporacionHuy() {
    this.conDocumento(InformacionCreditoHuy.INFORMACION_INCORPORACION_HUY.getNumeroDocumento());
    this.a(InformacionCreditoHuy.INFORMACION_INCORPORACION_HUY.getNumeroCuotas());
    this.conValorCredito(InformacionCreditoHuy.INFORMACION_INCORPORACION_HUY.getValorCredito());
    return this.build();
  }

  public Credito informacionDelCreditoLlamadaCrediHuy() {
    this.conDocumento(InformacionCreditoHuy.INFORMACION_LLAMADA_HUY.getNumeroDocumento());
    this.a(InformacionCreditoHuy.INFORMACION_LLAMADA_HUY.getNumeroCuotas());
    this.conValorCredito(InformacionCreditoHuy.INFORMACION_LLAMADA_HUY.getValorCredito());
    return this.build();
  }

  @Override
  public Credito build() {
    return new Credito(this);
  }

  public String getStrCodigoPapeleria() {
    return strCodigoPapeleria;
  }


}