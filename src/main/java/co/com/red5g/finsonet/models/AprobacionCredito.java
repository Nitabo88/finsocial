package co.com.red5g.finsonet.models;

import co.com.red5g.finsonet.models.builders.AprobacionCreditoBuilder;

public class AprobacionCredito {

  private String razonMotivo;
  private String seleccionMotivo;

  public AprobacionCredito(AprobacionCreditoBuilder aprobacionCreditoBuilder) {
    this.razonMotivo = aprobacionCreditoBuilder.getRazonMotivo();
    this.seleccionMotivo = aprobacionCreditoBuilder.getSeleccionMotivo();
  }

  public String getRazonMotivo() {
    return razonMotivo;
  }

  public String getSeleccionMotivo() {
    return seleccionMotivo;
  }

}