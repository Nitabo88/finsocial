package co.com.red5g.models.builders.finsonet;

import co.com.red5g.models.finsonet.Incorporacion;
import co.com.red5g.utils.Builder;

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
    this.solicitadoPor();
    this.razonMotivo("El usuario tiene los documentos incompletos");
    return this.build();
  }

  public Incorporacion motivoPendiente() {
    this.tipoDevolucion();
    this.motivo();
    this.razonMotivo("Prueba");
    return this.build();
  }

  public Incorporacion aprobacion() {
    this.seleccionarGestion();
    this.razonMotivo("Prueba");
    return this.build();
  }

  private IncorporacionBuilder razonMotivo(String razonMotivo) {
    this.razonMotivo = razonMotivo;
    return this;
  }

  private IncorporacionBuilder solicitadoPor() {
    this.solicitadoPor = "COORDINADOR-ZN2";
    return this;
  }

  private IncorporacionBuilder seleccionarGestion() {
    this.seleccionarGestion = "Incorporado";
    return this;
  }

  private IncorporacionBuilder tipoDevolucion() {
    this.tipoDevolucion = "Pendiente";
    return this;
  }

  private IncorporacionBuilder motivo() {
    this.motivo = "Otros";
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
