package co.com.red5g.finsonet.models.builders;

import co.com.red5g.finsonet.models.Formalizacion;
import co.com.red5g.finsonet.utils.Builder;

public class FormalizacionBuilder implements Builder<Formalizacion> {

  private String accion;
  private String motivo;

  private FormalizacionBuilder() {
    this.accion = "";
    this.motivo = "";
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

  private FormalizacionBuilder accion(String accion) {
    this.accion = accion;
    return this;
  }

  private FormalizacionBuilder motivo(String motivo) {
    this.motivo = motivo;
    return this;
  }

  public String getMotivo() {
    return motivo;
  }

  public String getAccion() {
    return accion;
  }
}
