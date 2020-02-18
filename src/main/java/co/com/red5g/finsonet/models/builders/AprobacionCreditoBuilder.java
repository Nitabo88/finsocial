package co.com.red5g.finsonet.models.builders;

import co.com.red5g.finsonet.models.AprobacionCredito;
import co.com.red5g.finsonet.utils.Builder;

public class AprobacionCreditoBuilder implements Builder<AprobacionCredito> {

  private String seleccionMotivo;
  private String razonMotivo;

  public String getSeleccionMotivo() {
    return this.seleccionMotivo;
  }

  public String getRazonMotivo() {
    return this.razonMotivo;
  }


  private AprobacionCreditoBuilder() {
    razonMotivo = "";
    seleccionMotivo = "";
  }

  public static AprobacionCreditoBuilder con() {
    return new AprobacionCreditoBuilder();
  }

  @Override
  public AprobacionCredito build() {
    return new AprobacionCredito(this);
  }

  public AprobacionCredito motivoRegreso() {
    conRazonMotivo("El usuario tiene los documentos incompletos");
    return build();
  }

  public AprobacionCredito motivoPendiente() {
    conSeleccionMotivo("Pendiente Certificaciones");
    conRazonMotivo("El usuario aun no entrega los certificados");
    return build();
  }

  private AprobacionCreditoBuilder conRazonMotivo(final String razonMotivo) {
    this.razonMotivo = razonMotivo;
    return this;
  }

  private AprobacionCreditoBuilder conSeleccionMotivo(final String seleccionMotivo) {
    this.seleccionMotivo = seleccionMotivo;
    return this;
  }
}