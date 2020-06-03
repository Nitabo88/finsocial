package co.com.red5g.finsonet.models;

import co.com.red5g.finsonet.models.builders.CredencialesBDBuilder;

public class CredencialesBD {

  private String url;
  private String usuario;
  private String contrasena;

  public CredencialesBD(final CredencialesBDBuilder credencialesBDBuilder) {
    url = credencialesBDBuilder.getUrl();
    usuario = credencialesBDBuilder.getUsuario();
    contrasena = credencialesBDBuilder.getContrasena();
  }

  public String getUrl() {
    return url;
  }

  public String getUsuario() {
    return usuario;
  }

  public String getContrasena() {
    return contrasena;
  }
}
