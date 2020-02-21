package co.com.red5g.finsonet.models.builders;

import co.com.red5g.finsonet.models.Incorporacion;
import co.com.red5g.finsonet.utils.Builder;

public class IncorporacionBuilder implements Builder<Incorporacion> {

  private String razonMotivo;
  private String motivo;
  private String solicitadoPor;
  private String tipoDevolucion;

  private IncorporacionBuilder() {
    razonMotivo = "";
    motivo = "";
    solicitadoPor = "";
    tipoDevolucion = "";
  }

  public static IncorporacionBuilder con() {
    return new IncorporacionBuilder();
  }

  @Override
  public Incorporacion build() {
    return new Incorporacion(this);
  }

  public Incorporacion motivoRegreso() {
    solicitadoPor("COORDINADOR-ZN2");
    razonMotivo("El usuario tiene los documentos incompletos");
    return build();
  }

  public Incorporacion motivoPendiente() {
    tipoDevolucion("Pendiente");
    motivo("Otros");
    razonMotivo("Prueba");
    return build();
  }

  private IncorporacionBuilder razonMotivo(final String razonMotivo) {
    this.razonMotivo = razonMotivo;
    return this;
  }

  private IncorporacionBuilder solicitadoPor(final String solicitadoPor) {
    this.solicitadoPor = solicitadoPor;
    return this;
  }

  private IncorporacionBuilder tipoDevolucion(final String tipoDevolucion) {
    this.tipoDevolucion = tipoDevolucion;
    return this;
  }

  private IncorporacionBuilder motivo(final String motivo) {
    this.motivo = motivo;
    return this;
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
