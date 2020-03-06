package co.com.red5g.finsonet.models;

import co.com.red5g.finsonet.models.builders.FormalizacionBuilder;

public class Formalizacion {

  private final String accion;
  private final String motivo;

  public Formalizacion(FormalizacionBuilder formalizacionBuilder) {
    this.accion = formalizacionBuilder.getAccion();
    this.motivo = formalizacionBuilder.getMotivo();
  }

  public String getMotivo() {
    return motivo;
  }

  public String getAccion() {
    return accion;
  }
}
