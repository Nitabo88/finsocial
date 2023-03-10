package co.com.red5g.utils.conexionbd;

public enum CredencialesBaseDatosFinsocial {
  USUARIO_BD_EN_LINEA_AUTOGESTION("jdbc:mysql://localhost:3306/enlinea_autogestion", "root", "finsocial123"),
  USUARIO_BD_CREDITOS("jdbc:mysql://localhost:3306/creditos", "root", "finsocial123");

  private final String url;
  private final String usuario;
  private final String contrasena;

  CredencialesBaseDatosFinsocial(String url, String usuario, String contrasena) {
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
