package co.com.red5g.finsonet.models.builders;

import static co.com.red5g.utils.conexionbd.CredencialesBaseDatosBancoomeva.USUARIO_BD_EN_LINEA;
import static co.com.red5g.utils.conexionbd.CredencialesBaseDatosFinsocial.USUARIO_BD_CREDITOS;
import static co.com.red5g.utils.conexionbd.CredencialesBaseDatosFinsocial.USUARIO_BD_EN_LINEA_AUTOGESTION;

import co.com.red5g.finsonet.models.CredencialesBD;
import co.com.red5g.utils.Builder;

public class CredencialesBDBuilder implements Builder<CredencialesBD> {

  private String url;
  private String usuario;
  private String contrasena;

  public CredencialesBDBuilder() {
    this.url = "";
    this.usuario = "";
    this.contrasena = "";
  }

  @Override
  public CredencialesBD build() {
    return new CredencialesBD(this);
  }

  public static CredencialesBDBuilder con() {
    return new CredencialesBDBuilder();
  }

  private CredencialesBDBuilder conUrl(final String url) {
    this.url = url;
    return this;
  }

  private CredencialesBDBuilder conUsuario(final String usuario) {
    this.usuario = usuario;
    return this;
  }

  private CredencialesBDBuilder conContrasena(final String contrasena) {
    this.contrasena = contrasena;
    return this;
  }

  public String getUrl() {
    return url;
  }

  public String getUsuario() {
    return usuario;
  }

  public String getContrasena() {
    return contrasena;
  }

  public CredencialesBD bdEnLineaAutogestion() {
    conUrl(USUARIO_BD_EN_LINEA_AUTOGESTION.getUrl());
    conUsuario(USUARIO_BD_EN_LINEA_AUTOGESTION.getUsuario());
    conContrasena(USUARIO_BD_EN_LINEA_AUTOGESTION.getContrasena());
    return build();
  }

  public CredencialesBD bdCreditos() {
    conUrl(USUARIO_BD_CREDITOS.getUrl());
    conUsuario(USUARIO_BD_CREDITOS.getUsuario());
    conContrasena(USUARIO_BD_CREDITOS.getContrasena());
    return build();
  }

}
