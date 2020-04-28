package co.com.red5g.finsonet.models;

import co.com.red5g.finsonet.models.builders.IncorporacionBuilder;

public class Incorporacion {

  private final String razonMotivo;
  private final String motivo;
  private final String solicitadoPor;
  private final String tipoDevolucion;
  private final String seleccionarGestion;

  public Incorporacion(IncorporacionBuilder incorporacionBuilder) {
    this.tipoDevolucion = incorporacionBuilder.getTipoDevolucion();
    this.razonMotivo = incorporacionBuilder.getRazonMotivo();
    this.motivo = incorporacionBuilder.getMotivo();
    this.solicitadoPor = incorporacionBuilder.getSolicitadoPor();
    this.seleccionarGestion = incorporacionBuilder.getSeleccionarGestion();
  }

  public String getRazonMotivo() {
    return razonMotivo;
  }

  public String getSolicitadoPor() {
    return solicitadoPor;
  }

  public String getTipoDevolucion() {
    return tipoDevolucion;
  }

  public String getMotivo() {
    return motivo;
  }

  public String getSeleccionarGestion() {
    return seleccionarGestion;
  }
}
