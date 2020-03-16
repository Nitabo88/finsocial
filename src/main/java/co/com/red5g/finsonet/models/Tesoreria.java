package co.com.red5g.finsonet.models;

import co.com.red5g.finsonet.models.builders.TesoreriaBuilder;

public class Tesoreria {

  private final String accion;
  private final String motivo;
  private final String detalleMotivo;
  private final String solicitadoPor;

  public Tesoreria(TesoreriaBuilder tesoreriaBuilder) {
    this.accion = tesoreriaBuilder.getAccion();
    this.motivo = tesoreriaBuilder.getMotivo();
    this.detalleMotivo = tesoreriaBuilder.getDetalleMotivo();
    this.solicitadoPor = tesoreriaBuilder.getSolicitadoPor();
  }

  public String getMotivo() {
    return motivo;
  }

  public String getAccion() {
    return accion;
  }

  public String getDetalleMotivo() {
    return this.detalleMotivo;
  }

  public String getSolicitadoPor() {
    return solicitadoPor;
  }
}
