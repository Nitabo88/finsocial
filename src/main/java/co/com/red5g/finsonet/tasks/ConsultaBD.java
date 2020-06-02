package co.com.red5g.finsonet.tasks;

import static co.com.red5g.utils.ConexionBaseDatos.conectarBaseDatos;
import static co.com.red5g.utils.ConexionBaseDatos.getLogger;
import static co.com.red5g.utils.CredencialesBaseDatos.USUARIO_BD_FINSOCIAL;

import co.com.red5g.utils.ConexionBaseDatos;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.HashMap;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

public class ConsultaBD implements Task {

  public static final String RESULTADO_CONSULTA = "resultado consulta";
  String query;
  Connection conexion = null;
  String sql = "";
  HashMap<String, String> resultadoConsulta = null;

  public ConsultaBD(String query) {
    this.query = query;
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    String numeroCredito = "99527";
    conexion =
        conectarBaseDatos(
            USUARIO_BD_FINSOCIAL.getUrl(),
            USUARIO_BD_FINSOCIAL.getUsuario(),
            USUARIO_BD_FINSOCIAL.getContrasena());
    sql = String.format(query, numeroCredito);
    try {
      resultadoConsulta = ConexionBaseDatos.consultarBaseDatos(conexion, sql);
    } catch (SQLException e) {
      getLogger().info("Error SQL");
    }
    actor.remember(RESULTADO_CONSULTA, resultadoConsulta);
  }
}
