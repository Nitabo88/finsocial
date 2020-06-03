package co.com.red5g.finsonet.tasks;

import static co.com.red5g.utils.conexionbd.ConexionBaseDatos.conectarBaseDatos;
import static co.com.red5g.utils.conexionbd.ConexionBaseDatos.getLogger;
import static co.com.red5g.utils.data.NumeroCreditoFinsoamigo.NUMERO_CREDITO_FINSOAMIGO;

import co.com.red5g.finsonet.models.CredencialesBD;
import co.com.red5g.utils.conexionbd.ConexionBaseDatos;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

public class ConsultaBD implements Task {

  public static final String RESULTADO_CONSULTA = "resultado consulta";
  CredencialesBD credencialesBD;
  String query;
  Connection conexion = null;
  String sql = "";
  List<Map<String, String>> resultadoConsulta = null;

  public ConsultaBD(CredencialesBD credencialesBD, String query) {
    this.credencialesBD = credencialesBD;
    this.query = query;
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    String numeroCredito = NUMERO_CREDITO_FINSOAMIGO.getNumeroCredito();
    try {
      conexion =
          conectarBaseDatos(
              credencialesBD.getUrl(),
              credencialesBD.getUsuario(),
              credencialesBD.getContrasena());
    } catch (SQLException e) {
      getLogger().info("Error conexion BD");
    }
    sql = String.format(query, numeroCredito);
    try {
      resultadoConsulta = ConexionBaseDatos.consultarBaseDatos(conexion, sql);
    } catch (SQLException e) {
      getLogger().info("Error SQL");
    }
    actor.remember(RESULTADO_CONSULTA, resultadoConsulta);
  }
}
