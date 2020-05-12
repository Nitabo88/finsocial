package co.com.red5g.finsonet.models.builders;

import co.com.red5g.finsonet.models.AprobacionCredito;
import co.com.red5g.utils.Builder;

public final class AprobacionCreditoBuilder implements Builder<AprobacionCredito> {

  private String seleccionMotivo;
  private String razonMotivo;

  public String getSeleccionMotivo() {
    return seleccionMotivo;
  }

  public String getRazonMotivo() {
    return razonMotivo;
  }


  private AprobacionCreditoBuilder() {
    this.razonMotivo = "";
    this.seleccionMotivo = "";
  }

  public static AprobacionCreditoBuilder con() {
    return new AprobacionCreditoBuilder();
  }

  @Override
  public AprobacionCredito build() {
    return new AprobacionCredito(this);
  }

  public AprobacionCredito motivoRegresoLibranza() {
    this.conRazonMotivo("El usuario tiene los documentos incompletos");
    return this.build();
  }

  public AprobacionCredito motivoPendiente() {
    this.conSeleccionMotivo("Pendiente Certificaciones");
    this.conRazonMotivo("El usuario aun no entrega los certificados");
    return this.build();
  }

  public AprobacionCredito motivoNegacionCreditoHuy() {
    this.conSeleccionMotivo("ALTO RIESGO");
    this.conRazonMotivo("El usuario es de alto riesgo");
    return this.build();
  }

  private AprobacionCreditoBuilder conRazonMotivo(String razonMotivo) {
    this.razonMotivo = razonMotivo;
    return this;
  }

  private AprobacionCreditoBuilder conSeleccionMotivo(String seleccionMotivo) {
    this.seleccionMotivo = seleccionMotivo;
    return this;
  }

    public AprobacionCredito motivoNegacionCreditoLibranza() {
      this.conSeleccionMotivo("CREDITO NO VIABLE");
      this.conRazonMotivo("No es posible dar el credito");
      return this.build();
    }

    public AprobacionCredito motivoRegresoCrediHuy() {
      this.conRazonMotivo("El usuario tiene los documentos incompletos");
      return this.build();
    }
}