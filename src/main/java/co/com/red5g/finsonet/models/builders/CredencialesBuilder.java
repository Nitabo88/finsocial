package co.com.red5g.finsonet.models.builders;

import co.com.red5g.finsonet.models.Credenciales;
import co.com.red5g.utils.Builder;

public class CredencialesBuilder implements Builder<Credenciales> {

  private String usuario;
  private String contrasena;
  private String codigo;
  private String celular;
  private String email;

  @Override
  public Credenciales build() {
    return new Credenciales(this);
  }

  private CredencialesBuilder() {
    usuario = "";
    contrasena = "";
    codigo = "";
    celular = "";
    email = "";
  }

  public static CredencialesBuilder de() {
    return new CredencialesBuilder();
  }

  private CredencialesBuilder conCelular() {
    this.celular = "3014573510";
    return this;
  }

  private CredencialesBuilder conEmail() {
    this.email = "sqa4@finsocial.co";
    return this;
  }

  private CredencialesBuilder conUsuario(final String usuario) {
    this.usuario = usuario;
    return this;
  }

  private CredencialesBuilder conContrasena(final String contrasena) {
    this.contrasena = contrasena;
    return this;
  }

  private CredencialesBuilder conCodigo(final String codigo) {
    this.codigo = codigo;
    return this;
  }

  public String getUsuario() {
    return this.usuario;
  }

  public String getCelular() {
    return celular;
  }

  public String getEmail() {
    return email;
  }

  public String getContrasena() {
    return this.contrasena;
  }

  public String getCodigo() {
    return this.codigo;
  }

  public Credenciales unUsuarioBasico() {
    conUsuario(co.com.red5g.utils.Credenciales.USUARIO_FINSOCIAL.getUsuario());
    conContrasena(co.com.red5g.utils.Credenciales.USUARIO_FINSOCIAL.getContrasena());
    conCodigo(co.com.red5g.utils.Credenciales.USUARIO_FINSOCIAL.getCodigo());
    conCelular();
    conEmail();
    return build();
  }

  public Credenciales unUsuarioPQRS() {
    conUsuario(co.com.red5g.utils.Credenciales.USUARIO_PQRS.getUsuario());
    conContrasena(co.com.red5g.utils.Credenciales.USUARIO_PQRS.getContrasena());
    conCodigo(co.com.red5g.utils.Credenciales.USUARIO_PQRS.getCodigo());
    conCelular();
    conEmail();
    return build();
  }

  public Credenciales unUsuarioDeDocumentacion() {
    conUsuario(co.com.red5g.utils.Credenciales.USUARIO_DOCUMENTOS.getUsuario());
    conContrasena(co.com.red5g.utils.Credenciales.USUARIO_DOCUMENTOS.getContrasena());
    conCodigo(co.com.red5g.utils.Credenciales.USUARIO_DOCUMENTOS.getCodigo());
    conCelular();
    conEmail();
    return build();
  }

  public Credenciales unUsuarioBasico(final String usuario, final String contrasena, final String codigo) {
    conUsuario(usuario);
    conContrasena(contrasena);
    conCodigo(codigo);
    conCelular();
    conEmail();
    return build();
  }

  public Credenciales unUsuarioDeAprobacionCreditos() {
    this.conUsuario(co.com.red5g.utils.Credenciales.USUARIO_APROBACION_CREDITOS.getUsuario());
    this.conContrasena(co.com.red5g.utils.Credenciales.USUARIO_APROBACION_CREDITOS.getContrasena());
    this.conCodigo(co.com.red5g.utils.Credenciales.USUARIO_APROBACION_CREDITOS.getCodigo());
    conCelular();
    conEmail();
    return this.build();
  }
}