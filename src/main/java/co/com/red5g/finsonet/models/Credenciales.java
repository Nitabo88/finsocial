package co.com.red5g.finsonet.models;

import co.com.red5g.finsonet.models.builders.CredencialesBuilder;

public class Credenciales {
    private final String usuario;
    private final String contrasena;
    private final String codigo;

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
