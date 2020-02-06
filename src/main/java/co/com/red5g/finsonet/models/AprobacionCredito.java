package co.com.red5g.finsonet.models;

import co.com.red5g.finsonet.models.builders.AprobacionCreditoBuilder;

public class AprobacionCredito {

  private String razonMotivo;
  private String seleccionMotivo;
  private String perfilRiesgo;


  public AprobacionCredito(AprobacionCreditoBuilder aprobacionCreditoBuilder) {
    this.razonMotivo = aprobacionCreditoBuilder.getRazonMotivo();
    this.seleccionMotivo = aprobacionCreditoBuilder.getSeleccionMotivo();
    this.perfilRiesgo = aprobacionCreditoBuilder.getPerfilRiesgo();
  }

  public String getRazonMotivo() {
    return razonMotivo;
  }

  public String getSeleccionMotivo() {
    return seleccionMotivo;
  }

  public String getPerfilRiesgo() {
    return perfilRiesgo;
  }
}