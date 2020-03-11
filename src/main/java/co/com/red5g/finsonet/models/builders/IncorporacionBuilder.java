package co.com.red5g.finsonet.models.builders;

import co.com.red5g.finsonet.models.Incorporacion;
import co.com.red5g.finsonet.utils.Builder;

public final class IncorporacionBuilder implements Builder<Incorporacion> {

  private String razonMotivo;
  private String motivo;
  private String solicitadoPor;
  private String tipoDevolucion;
  private String seleccionarGestion;

  private IncorporacionBuilder() {
    this.razonMotivo = "";
    this.motivo = "";
    this.solicitadoPor = "";
    this.tipoDevolucion = "";
    this.seleccionarGestion = "";
  }

  public static IncorporacionBuilder con() {
    return new IncorporacionBuilder();
  }

  @Override
  public Incorporacion build() {
    return new Incorporacion(this);
  }

  public Incorporacion motivoRegreso() {
    this.solicitadoPor("COORDINADOR-ZN2");
    this.razonMotivo("El usuario tiene los documentos incompletos");
    return this.build();
  }

  public Incorporacion motivoPendiente() {
    this.tipoDevolucion("Pendiente");
    this.motivo("Otros");
    this.razonMotivo("Prueba");
    return this.build();
  }

  public Incorporacion aprobacion() {
    this.seleccionarGestion("Incorporado");
    this.razonMotivo("Prueba");
    return this.build();
  }

  private IncorporacionBuilder razonMotivo(String razonMotivo) {
    this.razonMotivo = razonMotivo;
    return this;
  }

  private IncorporacionBuilder solicitadoPor(String solicitadoPor) {
    this.solicitadoPor = solicitadoPor;
    return this;
  }

  private IncorporacionBuilder seleccionarGestion(String seleccionarGestion) {
    this.seleccionarGestion = seleccionarGestion;
    return this;
  }

  private IncorporacionBuilder tipoDevolucion(String tipoDevolucion) {
    this.tipoDevolucion = tipoDevolucion;
    return this;
  }

  private IncorporacionBuilder motivo(String motivo) {
    this.motivo = motivo;
    return this;
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
