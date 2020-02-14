package co.com.red5g.finsonet.models;

import co.com.red5g.finsonet.models.builders.IncorporacionBuilder;

public class Incorporacion {

  private final String razonMotivo;
  private final String solicitadoPor;


  public Incorporacion(final IncorporacionBuilder incorporacionBuilder) {
    razonMotivo = incorporacionBuilder.getRazonMotivo();
    solicitadoPor = incorporacionBuilder.getSolicitadoPor();
  }

  public String getRazonMotivo() {
    return this.razonMotivo;
  }

  public String getSolicitadoPor() {
    return this.solicitadoPor;
  }
}
