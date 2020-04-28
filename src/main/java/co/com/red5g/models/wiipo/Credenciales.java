package co.com.red5g.models.wiipo;

import co.com.red5g.models.builders.wiipo.CredencialesBuilder;

public class Credenciales {

  private final String usuario;
  private final String contrasena;
  private final String tipoDocumento;


  public Credenciales(CredencialesBuilder credencialesBuilder) {
    usuario = credencialesBuilder.getUsuario();
    contrasena = credencialesBuilder.getContrasena();
    tipoDocumento = credencialesBuilder.getTipoDocumento();
  }

  public String getUsuario() {
    return this.usuario;
  }

  public String getContrasena() {
    return this.contrasena;
  }

  public String getTipoDocumento() {
    return this.tipoDocumento;
  }
}
