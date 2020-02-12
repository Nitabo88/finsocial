package co.com.red5g.finsonet.utils;

public enum Credenciales {
    USUARIO_FINSOCIAL ("ochinchilla" ,"Nicolas32@", "123456");

    private final String usuario;
    private final String contrasena;
    private final String codigo;

    Credenciales(final String usuario, final String contrasena, final String codigo) {
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.codigo = codigo;
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
}