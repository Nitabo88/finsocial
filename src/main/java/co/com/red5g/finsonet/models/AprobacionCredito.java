package co.com.red5g.finsonet.models;

import co.com.red5g.finsonet.models.builders.AprobacionCreditoBuilder;

public class AprobacionCredito {

  private final String razonMotivo;
  private final String seleccionMotivo;


  public AprobacionCredito(final AprobacionCreditoBuilder aprobacionCreditoBuilder) {
    razonMotivo = aprobacionCreditoBuilder.getRazonMotivo();
    seleccionMotivo = aprobacionCreditoBuilder.getSeleccionMotivo();
  }

  public String getRazonMotivo() {
    return this.razonMotivo;
  }

  public String getSeleccionMotivo() {
    return this.seleccionMotivo;
  }
}