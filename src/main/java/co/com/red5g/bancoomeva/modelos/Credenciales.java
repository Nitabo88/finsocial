package co.com.red5g.bancoomeva.modelos;


import co.com.red5g.bancoomeva.modelos.builders.CredencialesBuilder;

public class Credenciales {

  private String usuario;
  private String contrasena;

  public Credenciales(final CredencialesBuilder credencialesBuilder) {
    usuario = credencialesBuilder.getUsuario();
    contrasena = credencialesBuilder.getContrasena();
  }

  public String getUsuario() {
    return usuario;
  }

  public String getContrasena() {
    return contrasena;
  }
}
