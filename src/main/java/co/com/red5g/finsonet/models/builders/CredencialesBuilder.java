package co.com.red5g.finsonet.models.builders;

import static co.com.red5g.finsonet.utils.Credenciales.USUARIO_APROBACION_CREDITOS;
import static co.com.red5g.finsonet.utils.Credenciales.USUARIO_DOCUMENTOS;
import static co.com.red5g.finsonet.utils.Credenciales.USUARIO_FINSOCIAL;

import co.com.red5g.finsonet.models.Credenciales;
import co.com.red5g.finsonet.utils.Builder;

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

  private CredencialesBuilder conCelular(final String celular) {
    this.celular = celular;
    return this;
  }

  private CredencialesBuilder conEmail(final String email) {
    this.email = email;
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
    conUsuario(USUARIO_FINSOCIAL.getUsuario());
    conContrasena(USUARIO_FINSOCIAL.getContrasena());
    conCodigo(USUARIO_FINSOCIAL.getCodigo());
    conCelular("3014573510");
    conEmail("sqa4@finsocial.co");
    return build();
  }

  public Credenciales unUsuarioDeDocumentacion() {
    conUsuario(USUARIO_DOCUMENTOS.getUsuario());
    conContrasena(USUARIO_DOCUMENTOS.getContrasena());
    conCodigo(USUARIO_DOCUMENTOS.getCodigo());
    conCelular("3014573510");
    conEmail("sqa4@finsocial.co");
    return build();
  }

  public Credenciales unUsuarioBasico(final String usuario, final String contrasena, final String codigo) {
    conUsuario(usuario);
    conContrasena(contrasena);
    conCodigo(codigo);
    conCelular("3014573510");
    conEmail("sqa4@finsocial.co");
    return build();
  }

  public Credenciales unUsuarioDeAprobacionCreditos() {
    this.conUsuario(USUARIO_APROBACION_CREDITOS.getUsuario());
    this.conContrasena(USUARIO_APROBACION_CREDITOS.getContrasena());
    this.conCodigo(USUARIO_APROBACION_CREDITOS.getCodigo());
    conCelular("3014573510");
    conEmail("sqa4@finsocial.co");
    return this.build();
  }
}