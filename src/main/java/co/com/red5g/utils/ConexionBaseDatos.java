package co.com.red5g.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.thucydides.core.steps.StepInterceptor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ConexionBaseDatos {

  private static Statement statement;
  private static ResultSet resultSet;

  private static Logger getLogger() {
    return LoggerFactory.getLogger(StepInterceptor.class);
  }

  public static Connection conectarBaseDatos(
      String url, String usuario, String contrasena) {
    Connection conexion = null;
    try {
      conexion = DriverManager.getConnection(url, usuario, contrasena);
    } catch (SQLException e) {
      getLogger().info("No respondió la base de datos");
    }
    return conexion;
  }

  public static List<Map<String, String>> consultarBaseDatos(
      Connection conexion, String sql) throws SQLException {
    List<Map<String, String>> lstFila = new ArrayList<Map<String, String>>();
    try {
      statement = conexion.createStatement();
      resultSet = statement.executeQuery(sql);
      ResultSetMetaData metaData = resultSet.getMetaData();
      int columnas = metaData.getColumnCount();
      while (resultSet.next()) {
        Map<String, String> fila = new HashMap<String, String>(columnas);
        for (int i = 1; i <= columnas; ++i) {
          fila.put(metaData.getColumnName(i), resultSet.getString(i));
        }
        lstFila.add(fila);
      }
    } finally {
      resultSet.close();
      statement.close();
      conexion.close();
    }
    return lstFila;
  }
}
