package co.com.red5g.finsonet.models.builders;

import static co.com.red5g.finsonet.utils.Credenciales.USUARIO_DOCUMENTOS;
import static co.com.red5g.finsonet.utils.Credenciales.USUARIO_FINSOCIAL;

import co.com.red5g.finsonet.models.Credenciales;
import co.com.red5g.finsonet.utils.Builder;

public class CredencialesBuilder implements Builder<Credenciales> {

    private String usuario;
    private String contrasena;
    private String codigo;

    @Override
    public Credenciales build() {
        return new Credenciales(this);
    }

    private CredencialesBuilder() {
      usuario = "";
      contrasena = "";
      codigo = "";
    }

    public static CredencialesBuilder de(){
       return new CredencialesBuilder();
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
        return build();
    }

    public Credenciales unUsuarioDeDocumentacion() {
      conUsuario(USUARIO_DOCUMENTOS.getUsuario());
      conContrasena(USUARIO_DOCUMENTOS.getContrasena());
      conCodigo(USUARIO_DOCUMENTOS.getCodigo());
        return build();
    }

    public Credenciales unUsuarioBasico(final String usuario, final String contrasena, final String codigo) {
      conUsuario(usuario);
      conContrasena(contrasena);
      conCodigo(codigo);
        return build();
    }
}