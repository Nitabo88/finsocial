package co.com.red5g.finsonet.models.builders;

import static co.com.red5g.utils.data.Credenciales.USUARIO_FINSOCIAL;
import static co.com.red5g.utils.data.Credenciales.USUARIO_FINSOCIAL_CONTRASENA_ERRADA;
import static co.com.red5g.utils.data.Credenciales.USUARIO_FINSOCIAL_DATA_ERRADA;
import static co.com.red5g.utils.data.Credenciales.USUARIO_FINSOCIAL_USUARIO_ERRADO;

import co.com.red5g.finsonet.models.Credenciales;
import co.com.red5g.utils.Builder;

public class CredencialesBuilder implements Builder<Credenciales> {

  private String usuario;
  private String codigoUsuario;
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
    codigoUsuario = "";
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

  private CredencialesBuilder conCodigoUsuario() {
    this.codigoUsuario = "2256";
    return this;
  }

  public String getUsuario() {
    return usuario;
  }

  public String getCodigoUsuario() {
    return codigoUsuario;
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
    conCelular();
    conEmail();
    return build();
  }

  public Credenciales unUsuarioContrasenaInvalida() {
    conUsuario(USUARIO_FINSOCIAL_CONTRASENA_ERRADA.getUsuario());
    conContrasena(USUARIO_FINSOCIAL_CONTRASENA_ERRADA.getContrasena());
       return build();
  }

  public Credenciales unUsuarioInvalido() {
    conUsuario(USUARIO_FINSOCIAL_USUARIO_ERRADO.getUsuario());
    conContrasena(USUARIO_FINSOCIAL_USUARIO_ERRADO.getContrasena());
       return build();
  }

  public Credenciales unUsuarioDataInvalida() {
    conUsuario(USUARIO_FINSOCIAL_DATA_ERRADA.getUsuario());
    conContrasena(USUARIO_FINSOCIAL_DATA_ERRADA.getContrasena());
    return build();
  }

  public Credenciales unUsuarioPQRS() {
    conUsuario(co.com.red5g.utils.data.Credenciales.USUARIO_PQRS.getUsuario());
    conContrasena(co.com.red5g.utils.data.Credenciales.USUARIO_PQRS.getContrasena());
    conCodigo(co.com.red5g.utils.data.Credenciales.USUARIO_PQRS.getCodigo());
    conCelular();
    conEmail();
    return build();
  }

  public Credenciales unUsuarioDeDocumentacion() {
    conUsuario(co.com.red5g.utils.data.Credenciales.USUARIO_DOCUMENTOS.getUsuario());
    conContrasena(co.com.red5g.utils.data.Credenciales.USUARIO_DOCUMENTOS.getContrasena());
    conCodigo(co.com.red5g.utils.data.Credenciales.USUARIO_DOCUMENTOS.getCodigo());
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
    this.conUsuario(co.com.red5g.utils.data.Credenciales.USUARIO_APROBACION_CREDITOS.getUsuario());
    this.conContrasena(co.com.red5g.utils.data.Credenciales.USUARIO_APROBACION_CREDITOS.getContrasena());
    this.conCodigo(co.com.red5g.utils.data.Credenciales.USUARIO_APROBACION_CREDITOS.getCodigo());
    conCelular();
    conEmail();
    return this.build();
  }

  public Credenciales unUsuarioAdministrador() {
    this.conUsuario(USUARIO_FINSOCIAL.getUsuario());
    this.conContrasena(USUARIO_FINSOCIAL.getContrasena());
    this.conCodigo(USUARIO_FINSOCIAL.getCodigo());
    conCodigoUsuario();
    return this.build();
  }
}