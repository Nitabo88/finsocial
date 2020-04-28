package co.com.red5g.models.builders.finsonet;

import co.com.red5g.models.finsonet.Tesoreria;
import co.com.red5g.utils.Builder;

public class TesoreriaBuilder implements Builder<Tesoreria> {

  private String accion;
  private String solicitadoPor;
  private String motivo;
  private String detalleMotivo;

  private TesoreriaBuilder() {
    this.accion = "";
    this.motivo = "";
    this.detalleMotivo = "";
    this.solicitadoPor = "";
  }

  public static TesoreriaBuilder con() {
    return new TesoreriaBuilder();
  }

  @Override
  public Tesoreria build() {
    return new Tesoreria(this);
  }

  public Tesoreria motivoRegreso() {
    this.accion("Regresar");
    this.solicitadoPor();
    this.motivo("llamada pendiente");
    return this.build();
  }

  public Tesoreria motivoPendiente() {
    this.accion("Pendiente");
    this.motivo("Pago pendiente por profesor");
    this.detalleMotivo();
    return this.build();
  }

  private TesoreriaBuilder accion(String accion) {
    this.accion = accion;
    return this;
  }

  private TesoreriaBuilder motivo(String motivo) {
    this.motivo = motivo;
    return this;
  }

  private TesoreriaBuilder solicitadoPor() {
    this.solicitadoPor = "ORLANDO NICOLAS CHINCHILLA VEGA";
    return this;
  }

  private TesoreriaBuilder detalleMotivo() {
    this.detalleMotivo = "Aun no se registra pago";
    return this;
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
