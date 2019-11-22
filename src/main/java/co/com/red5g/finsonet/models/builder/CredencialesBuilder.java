package co.com.red5g.finsonet.models.builder;

import co.com.red5g.finsonet.models.Credenciales;
import co.com.red5g.finsonet.utils.Builder;

import static co.com.red5g.finsonet.utils.Credenciales.USUARIO_FINSOCIAL;

public class CredencialesBuilder implements Builder<Credenciales> {
    private String usuario;
    private String contrasena;
    private String codigo;

    @Override
    public Credenciales build() {
        return new Credenciales(this);
    }

    private CredencialesBuilder() {
        this.usuario = "";
        this.contrasena = "";
        this.codigo = "";
    }

    public static CredencialesBuilder de(){
       return new CredencialesBuilder();
    }

    private CredencialesBuilder conUsuario(String usuario) {
        this.usuario = USUARIO_FINSOCIAL.getUsuario();
        return this;
    }

    private CredencialesBuilder conContrasena(String contrasena) {
        this.contrasena = USUARIO_FINSOCIAL.getContrasena();
        return this;
    }

    private CredencialesBuilder conCodigo(String codigo) {
        this.codigo = USUARIO_FINSOCIAL.getCodigo();
        return this;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public String getCodigo() {
        return codigo;
    }

    public Credenciales unUsuarioBasico() {
        this.conUsuario(USUARIO_FINSOCIAL.getUsuario());
        this.conContrasena(USUARIO_FINSOCIAL.getContrasena());
        this.conCodigo(USUARIO_FINSOCIAL.getCodigo());
        return this.build();
    }

    public Credenciales unUsuarioBasico(String usuario, String contrasena, String codigo) {
        this.conUsuario(usuario);
        this.conContrasena(contrasena);
        this.conCodigo(codigo);
        return this.build();
    }
}