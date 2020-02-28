package co.com.red5g.finsonet.models;

import co.com.red5g.finsonet.models.builders.FormalizacionBuilder;

public class Formalizacion {

  private final String accion;
  private final String motivo;

  public Formalizacion(final FormalizacionBuilder formalizacionBuilder) {
    accion = formalizacionBuilder.getAccion();
    motivo = formalizacionBuilder.getMotivo();
  }

  public String getMotivo() {
    return this.motivo;
  }

  public String getAccion() {
    return this.accion;
  }
}
