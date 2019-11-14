package co.com.red5g.finsonet.models;

import co.com.red5g.finsonet.models.builder.CredencialesBuilder;

public class Credenciales {
    private String usuario;
    private String contrasena;
    private String codigo;

    public Credenciales(CredencialesBuilder credencialesBuilder) {
        this.usuario = credencialesBuilder.getUsuario();
        this.contrasena = credencialesBuilder.getContrasena();
        this.codigo = credencialesBuilder.getCodigo();
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
