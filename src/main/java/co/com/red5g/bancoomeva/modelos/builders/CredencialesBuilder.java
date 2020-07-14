package co.com.red5g.bancoomeva.modelos.builders;

import co.com.red5g.bancoomeva.modelos.Credenciales;
import co.com.red5g.utils.Builder;

public class CredencialesBuilder implements Builder<Credenciales> {

  private String usuario;
  private String contrasena;

  public static CredencialesBuilder con() {
    return new CredencialesBuilder();
  }

  @Override
  public Credenciales build() {
    return new Credenciales(this);
  }

  private CredencialesBuilder() {
    usuario = "";
    contrasena = "";
  }

  public String getUsuario() {
    return usuario;
  }

  public String getContrasena() {
    return contrasena;
  }

  public CredencialesBuilder conUsuario() {
    this.usuario = "smart01";
    return this;
  }

  public CredencialesBuilder conContrasena() {
    this.contrasena = "Ago%2020";
    return this;
  }

  public Credenciales unColaborador() {
    conUsuario();
    conContrasena();
    return build();
  }
}
