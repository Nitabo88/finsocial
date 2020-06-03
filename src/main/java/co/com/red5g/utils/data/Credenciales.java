package co.com.red5g.utils.data;

public enum Credenciales {
    USUARIO_FINSOCIAL("ochinchilla", "Nicolas32@", "1234"),
    USUARIO_DOCUMENTOS("mvargas", "Nicolas32@", "5678"),
    USUARIO_APROBACION_CREDITOS("jcastro", "Nicolas32@", "abcd"),
    USUARIO_PQRS("kcampo", "Nicolas32@", "adf"),
    USUARIO_WIIPO("1045705851", "qazwsx123", "");

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