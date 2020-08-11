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

  public CredencialesBuilder conUsuario(String usuario) {
    this.usuario = usuario;
    return this;
  }

  public CredencialesBuilder conContrasena(String contrasena) {
    this.contrasena = contrasena;
    return this;
  }

  public Credenciales unColaborador() {
    conUsuario("smart01");
    conContrasena("Ago01%2020");
    return build();
  }

  public Credenciales claveIncorrecta() {
    conUsuario("smart01");
    conContrasena("smart01");
    return build();
  }

  public Credenciales usuarioIncorrecto() {
    conUsuario("smart010");
    conContrasena("Ago%2020");
    return build();
  }

  public Credenciales datosIncorrectos() {
    conUsuario("prueba");
    conContrasena("prueba");
    return build();
  }
}
