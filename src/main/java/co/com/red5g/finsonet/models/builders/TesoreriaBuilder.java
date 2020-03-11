package co.com.red5g.finsonet.models.builders;

import co.com.red5g.finsonet.models.Formalizacion;
import co.com.red5g.finsonet.models.Tesoreria;
import co.com.red5g.finsonet.utils.Builder;

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
    this.solicitadoPor("ORLANDO NICOLAS CHINCHILLA VEGA");
    this.motivo("llamada pendiente");
    return this.build();
  }

  public Tesoreria motivoPendiente() {
    this.accion("Pendiente");
    this.motivo("Pago pendiente por profesor");
    this.detalleMotivo("Aun no se registra pago");
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

  private TesoreriaBuilder solicitadoPor(String solicitadoPor) {
    this.solicitadoPor = solicitadoPor;
    return this;
  }

  private TesoreriaBuilder detalleMotivo(String detalleMotivo) {
    this.detalleMotivo = detalleMotivo;
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
