package co.com.red5g.finsonet.utils;

public enum Credenciales {
    USUARIO_FINSOCIAL ("ochinchilla" , "123456"),
    USUARIO_DOCUMENTOS ("mvargas", "a"),
    USUARIO_APROBACION_CREDITOS ("jcastro", "a");

    private final String usuario;
    private final String contrasena;
    private final String codigo;

    Credenciales(String usuario, String codigo) {
        this.usuario = usuario;
        this.contrasena = "Nicolas32@";
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