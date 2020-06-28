package co.com.red5g.finsonet.models.builders;

import co.com.red5g.finsonet.models.Formalizacion;
import co.com.red5g.utils.Builder;
import lombok.Getter;
import lombok.Setter;

public class FormalizacionBuilder implements Builder<Formalizacion> {

  private String accion;
  private String motivo;
  private String detalleMotivo;

  private FormalizacionBuilder() {
    this.accion = "";
    this.motivo = "";
    this.detalleMotivo = "";
  }

  public static FormalizacionBuilder con() {
    return new FormalizacionBuilder();
  }

  @Override
  public Formalizacion build() {
    return new Formalizacion(this);
  }

  public Formalizacion motivoRegreso() {
    this.accion("Regresar");
    this.motivo("El usuario tiene los documentos incompletos");
    return this.build();
  }

  public Formalizacion motivoPendiente() {
    this.accion("Pendiente");
    this.motivo("Espera de papeleria");
    this.detalleMotivo();
    return this.build();
  }

  private FormalizacionBuilder accion(String accion) {
    this.accion = accion;
    return this;
  }

  private FormalizacionBuilder motivo(String motivo) {
    this.motivo = motivo;
    return this;
  }

  private FormalizacionBuilder detalleMotivo() {
    this.detalleMotivo = "El usuario tiene los documentos incompletos";
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
}
