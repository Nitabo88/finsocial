package co.com.red5g.finsonet.models.builders;

import co.com.red5g.finsonet.models.Incorporacion;
import co.com.red5g.finsonet.utils.Builder;

public class IncorporacionBuilder implements Builder<Incorporacion> {

  private String razonMotivo;
  private String solicitadoPor;

  private IncorporacionBuilder() {
    razonMotivo = "";
    solicitadoPor = "";
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
    razonMotivo("El usuario tiene los documentos incompletos");
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

  public String getRazonMotivo() {
    return this.razonMotivo;
  }

  public String getSolicitadoPor() {
    return this.solicitadoPor;
  }
}
