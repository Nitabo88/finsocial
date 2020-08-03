package co.com.red5g.utils.conexionbd;

public enum CredencialesBaseDatosBancoomeva {
  USUARIO_BD_EN_LINEA("jdbc:mysql://localhost:3306/ENLINEA", "root", "Qazwsx123!");

  private final String url;
  private final String usuario;
  private final String contrasena;

  CredencialesBaseDatosBancoomeva(String url, String usuario, String contrasena) {
    this.url = url;
    this.usuario = usuario;
    this.contrasena = contrasena;
  }

  public String getUsuario() {
    return usuario;
  }

  public String getContrasena() {
    return contrasena;
  }

  public String getUrl() {
    return url;
  }
}
