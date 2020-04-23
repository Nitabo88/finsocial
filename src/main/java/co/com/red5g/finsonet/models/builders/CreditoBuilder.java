package co.com.red5g.finsonet.models.builders;

import static co.com.red5g.finsonet.utils.InformacionCreditoHuy.*;
import static co.com.red5g.finsonet.utils.InformacionCreditoLibranza.INFORMACION_APROBACION_LIBRANZA;
import static co.com.red5g.finsonet.utils.InformacionCreditoLibranza.INFORMACION_CDAS_COMPLETO_LIBRANZA;
import static co.com.red5g.finsonet.utils.InformacionCreditoLibranza.INFORMACION_CDAS_INCOMPLETO_LIBRANZA;
import static co.com.red5g.finsonet.utils.InformacionCreditoLibranza.INFORMACION_CHEQUEO_LIBRANZA;
import static co.com.red5g.finsonet.utils.InformacionCreditoLibranza.INFORMACION_CONFIRMACION_LIBRANZA;
import static co.com.red5g.finsonet.utils.InformacionCreditoLibranza.INFORMACION_FORMALIZACION_LIBRANZA;
import static co.com.red5g.finsonet.utils.InformacionCreditoLibranza.INFORMACION_FORMULARIO_LIBRANZA;
import static co.com.red5g.finsonet.utils.InformacionCreditoLibranza.INFORMACION_INCORPORACION_LIBRANZA;
import static co.com.red5g.finsonet.utils.InformacionCreditoLibranza.INFORMACION_LLAMADA_LIBRANZA;
import static co.com.red5g.finsonet.utils.InformacionCreditoLibranza.INFORMACION_TESORERIA_LIBRANZA;

import co.com.red5g.finsonet.models.Credito;
import co.com.red5g.finsonet.utils.Builder;

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
    this.conDocumento(INFORMACION_FORMULARIO_LIBRANZA.getNumeroDocumento());
    this.conValorCuota(INFORMACION_FORMULARIO_LIBRANZA.getValorCuota());
    this.a(INFORMACION_FORMULARIO_LIBRANZA.getNumeroCuotas());
    this.conCodigoPapeleria();
    return this.build();
  }

  public Credito informacionDelCreditoChequeoDocumento() {
    this.conDocumento(INFORMACION_CHEQUEO_LIBRANZA.getNumeroDocumento());
    this.conValorCuota(INFORMACION_CHEQUEO_LIBRANZA.getValorCuota());
    this.a(INFORMACION_CHEQUEO_LIBRANZA.getNumeroCuotas());
    this.conCodigoPapeleria();
    return this.build();
  }

  public Credito informacionDelCreditoConfirmacion() {
    this.conDocumento(INFORMACION_CONFIRMACION_LIBRANZA.getNumeroDocumento());
    this.conValorCuota(INFORMACION_CONFIRMACION_LIBRANZA.getValorCuota());
    this.a(INFORMACION_CONFIRMACION_LIBRANZA.getNumeroCuotas());
    this.conCodigoPapeleria();
    return this.build();
  }

  public Credito informacionDelCreditoAprobacion() {
    this.conDocumento(INFORMACION_APROBACION_LIBRANZA.getNumeroDocumento());
    this.conValorCuota(INFORMACION_APROBACION_LIBRANZA.getValorCuota());
    this.a(INFORMACION_APROBACION_LIBRANZA.getNumeroCuotas());
    this.conCodigoPapeleria();
    return this.build();
  }

  public Credito informacionDelCreditoIncorporacion() {
    this.conDocumento(INFORMACION_INCORPORACION_LIBRANZA.getNumeroDocumento());
    this.conValorCuota(INFORMACION_INCORPORACION_LIBRANZA.getValorCuota());
    this.a(INFORMACION_INCORPORACION_LIBRANZA.getNumeroCuotas());
    this.conCodigoPapeleria();
    return this.build();
  }

  public Credito informacionDelCreditoFormalizacion() {
    this.conDocumento(INFORMACION_FORMALIZACION_LIBRANZA.getNumeroDocumento());
    this.conValorCuota(INFORMACION_FORMALIZACION_LIBRANZA.getValorCuota());
    this.a(INFORMACION_FORMALIZACION_LIBRANZA.getNumeroCuotas());
    this.conCodigoPapeleria();
    return this.build();
  }

  public Credito informacionDelCreditoTesoreria() {
    this.conDocumento(INFORMACION_TESORERIA_LIBRANZA.getNumeroDocumento());
    this.conValorCuota(INFORMACION_TESORERIA_LIBRANZA.getValorCuota());
    this.a(INFORMACION_TESORERIA_LIBRANZA.getNumeroCuotas());
    this.conCodigoPapeleria();
    return this.build();
  }

  public Credito informacionDelCreditoCdas() {
    this.conDocumento(INFORMACION_CDAS_INCOMPLETO_LIBRANZA.getNumeroDocumento());
    this.conValorCuota(INFORMACION_CDAS_INCOMPLETO_LIBRANZA.getValorCuota());
    this.a(INFORMACION_CDAS_INCOMPLETO_LIBRANZA.getNumeroCuotas());
    this.conCodigoPapeleria();
    return this.build();
  }

  public Credito informacionDelCreditoCdasCompleto() {
    this.conDocumento(INFORMACION_CDAS_COMPLETO_LIBRANZA.getNumeroDocumento());
    this.conValorCuota(INFORMACION_CDAS_COMPLETO_LIBRANZA.getValorCuota());
    this.a(INFORMACION_CDAS_COMPLETO_LIBRANZA.getNumeroCuotas());
    this.conCodigoPapeleria();
    return this.build();
  }

  public Credito informacionDelCreditoLlamadaLibranza() {
    this.conDocumento(INFORMACION_LLAMADA_LIBRANZA.getNumeroDocumento());
    this.conValorCuota(INFORMACION_LLAMADA_LIBRANZA.getValorCuota());
    this.a(INFORMACION_LLAMADA_LIBRANZA.getNumeroCuotas());
    this.conCodigoPapeleria();
    return this.build();
  }

  public Credito informacionChequeoHuy() {
    this.conDocumento(INFORMACION_CHEQUEO_HUY.getNumeroDocumento());
    this.a(INFORMACION_CHEQUEO_HUY.getNumeroCuotas());
    this.conValorCredito(INFORMACION_CHEQUEO_HUY.getValorCredito());
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
    this.conDocumento(INFORMACION_CREDITO_HUY.getNumeroDocumento());
    this.a(INFORMACION_CREDITO_HUY.getNumeroCuotas());
    this.conValorCredito(INFORMACION_CREDITO_HUY.getValorCredito());
    return this.build();
  }

  public Credito informacionAprobacionHuy() {
    this.conDocumento(INFORMACION_APROBACION_HUY.getNumeroDocumento());
    this.a(INFORMACION_APROBACION_HUY.getNumeroCuotas());
    this.conValorCredito(INFORMACION_APROBACION_HUY.getValorCredito());
    return this.build();
  }

  public Credito informacionIncorporacionHuy() {
    this.conDocumento(INFORMACION_INCORPORACION_HUY.getNumeroDocumento());
    this.a(INFORMACION_INCORPORACION_HUY.getNumeroCuotas());
    this.conValorCredito(INFORMACION_INCORPORACION_HUY.getValorCredito());
    return this.build();
  }

  public Credito informacionDelCreditoLlamadaCrediHuy() {
    this.conDocumento(INFORMACION_LLAMADA_HUY.getNumeroDocumento());
    this.a(INFORMACION_LLAMADA_HUY.getNumeroCuotas());
    this.conValorCredito(INFORMACION_LLAMADA_HUY.getValorCredito());
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