package co.com.red5g.finsonet.models;

import co.com.red5g.finsonet.models.builders.CredencialesBuilder;

public class Credenciales {

  private final String usuario;
  private final String contrasena;
  private final String codigo;
  private final String celular;
  private final String email;

  public Credenciales(final CredencialesBuilder credencialesBuilder) {
    usuario = credencialesBuilder.getUsuario();
    contrasena = credencialesBuilder.getContrasena();
    codigo = credencialesBuilder.getCodigo();
    celular = credencialesBuilder.getCelular();
    email = credencialesBuilder.getEmail();
  }

  public String getCelular() {
    return celular;
  }

  public String getEmail() {
    return email;
  }

  public String getUsuario() {
    return this.usuario;
  }

  public String getContrasena() {
    return this.contrasena;
  }

  public String getCodigo() {
    return this.codigo;
  }
}
