package co.com.red5g.utils.data;

public enum Emails {
  OTP_BANCOMEVA("https://accounts.google.com/signin","bancomevaotp@gmail.com","Nicolas32@" )
  ;

  private final String url;
  private final String email;
  private final String contrasena;

  Emails(String url, String email, String contrasena) {
    this.url = url;
    this.email = email;
    this.contrasena = contrasena;
  }

  public String getUrl() {
    return url;
  }

  public String getEmail() {
    return email;
  }

  public String getContrasena() {
    return contrasena;
  }
}
