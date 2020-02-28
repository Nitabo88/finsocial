package co.com.red5g.finsonet.models.builders;

import co.com.red5g.finsonet.models.Formalizacion;
import co.com.red5g.finsonet.utils.Builder;

public class FormalizacionBuilder implements Builder<Formalizacion> {

  private String accion;
  private String motivo;

  private FormalizacionBuilder() {
    accion = "";
    motivo = "";
  }

  public static FormalizacionBuilder con() {
    return new FormalizacionBuilder();
  }

  @Override
  public Formalizacion build() {
    return new Formalizacion(this);
  }

  public Formalizacion motivoRegreso() {
    accion("Regresar");
    motivo("El usuario tiene los documentos incompletos");
    return build();
  }

  private FormalizacionBuilder accion(final String accion) {
    this.accion = accion;
    return this;
  }

  private FormalizacionBuilder motivo(final String motivo) {
    this.motivo = motivo;
    return this;
  }

  public String getMotivo() {
    return this.motivo;
  }

  public String getAccion() {
    return this.accion;
  }
}
