package co.com.red5g.finsonet.models;

import co.com.red5g.finsonet.models.builders.IncorporacionBuilder;

public class Incorporacion {

  private final String razonMotivo;
  private final String motivo;
  private final String solicitadoPor;
  private final String tipoDevolucion;

  public Incorporacion(final IncorporacionBuilder incorporacionBuilder) {
    tipoDevolucion = incorporacionBuilder.getTipoDevolucion();
    razonMotivo = incorporacionBuilder.getRazonMotivo();
    motivo = incorporacionBuilder.getMotivo();
    solicitadoPor = incorporacionBuilder.getSolicitadoPor();
  }

  public String getRazonMotivo() {
    return this.razonMotivo;
  }

  public String getSolicitadoPor() {
    return this.solicitadoPor;
  }

  public String getTipoDevolucion() {
    return this.tipoDevolucion;
  }

  public String getMotivo() {
    return this.motivo;
  }
}
