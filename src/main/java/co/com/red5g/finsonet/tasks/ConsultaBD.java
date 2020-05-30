package co.com.red5g.finsonet.tasks;

import static co.com.red5g.utils.ConexionBaseDatos.conectarBaseDatos;
import static co.com.red5g.utils.CredencialesBaseDatos.USUARIO_BD_FINSOCIAL;
import static co.com.red5g.utils.Queries.SQL_FORMULARIO_SOLICITUD;

import co.com.red5g.utils.ConexionBaseDatos;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

public class ConsultaBD implements Task {

  Connection conexion = null;
  String numeroCredito = null;
  String sql = "";
  List<Map<String, String>> resultadoConsulta = null;


  @Override
  public <T extends Actor> void performAs(T actor) {
    String numeroCredito ="99527" ;
      conexion =
          conectarBaseDatos(
              USUARIO_BD_FINSOCIAL.getUrl(),
              USUARIO_BD_FINSOCIAL.getUsuario(),
              USUARIO_BD_FINSOCIAL.getContrasena());
      sql = String.format(SQL_FORMULARIO_SOLICITUD.getSql(), numeroCredito);
    try {
      resultadoConsulta = ConexionBaseDatos.consultarBaseDatos(conexion, sql);
    } catch (SQLException throwables) {
      throwables.printStackTrace();
    }
  }
}
