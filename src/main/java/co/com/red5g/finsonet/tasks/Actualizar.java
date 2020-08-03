package co.com.red5g.finsonet.tasks;

import static co.com.red5g.utils.conexionbd.ConexionBaseDatos.conectarBaseDatos;
import static co.com.red5g.utils.conexionbd.ConexionBaseDatos.getLogger;
import static co.com.red5g.utils.data.Constantes.NUMERO_CREDITO;
import static net.serenitybdd.screenplay.Tasks.instrumented;

import co.com.red5g.finsonet.models.CredencialesBD;
import co.com.red5g.utils.conexionbd.ConexionBaseDatos;
import java.sql.Connection;
import java.sql.SQLException;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;

public class Actualizar implements Task {

  Connection conexion = null;
  String sql = "";
  CredencialesBD credencialesBD;
  String query;

  public Actualizar(CredencialesBD credencialesBD, String query) {
    this.credencialesBD = credencialesBD;
    this.query = query;
  }

  public static Performable laInformaciondeBD(CredencialesBD credencialesBD, String query) {
    return instrumented(Actualizar.class, credencialesBD, query);
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    String numeroCredito = actor.recall(NUMERO_CREDITO);
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
      ConexionBaseDatos.actualizarBaseDatos(conexion, sql);
    } catch (SQLException e) {
      getLogger().info("Error actualizando la BD");
    }
  }
}
