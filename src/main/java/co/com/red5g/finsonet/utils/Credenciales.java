package co.com.red5g.finsonet.utils;

public enum Credenciales {
    USUARIO_FINSOCIAL ("ochinchilla" ,"Nicolas32@", "123456"),
    USUARIO_DOCUMENTOS ("mvargas", "Nicolas32@","a"),
    USUARIO_APROBACION_CREDITOS ("jcastro", "Nicolas32@","a");

    private final String usuario;
    private final String contrasena;
    private final String codigo;

    Credenciales(String usuario, String contrasena, String codigo) {
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.codigo = codigo;
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
}