package co.com.red5g.wiipo.models.builders;

import co.com.red5g.utils.Builder;
import co.com.red5g.wiipo.models.Credenciales;

import static co.com.red5g.utils.Credenciales.USUARIO_WIIPO;

public class CredencialesBuilder implements Builder<Credenciales> {

  private String usuario;
  private String contrasena;
  private String tipoDocumento;

  @Override
  public Credenciales build() {
    return new Credenciales(this);
  }

  private CredencialesBuilder() {
    usuario = "";
    contrasena = "";
    tipoDocumento = "";
  }

  public static CredencialesBuilder de() {
    return new CredencialesBuilder();
  }

  private CredencialesBuilder conUsuario(String usuario) {
    this.usuario = usuario;
    return this;
  }

  private CredencialesBuilder conContrasena(String contrasena) {
    this.contrasena = contrasena;
    return this;
  }

  private CredencialesBuilder conTipoDocumento(String tipoDocumento) {
    this.tipoDocumento = tipoDocumento;
    return this;
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

  public Credenciales unUsuarioWiipo() {
    conUsuario(USUARIO_WIIPO.getUsuario());
    conContrasena(USUARIO_WIIPO.getContrasena());
    conTipoDocumento("Cédula Ciudadana");
    return build();
  }
}
