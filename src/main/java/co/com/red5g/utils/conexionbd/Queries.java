package co.com.red5g.utils.conexionbd;

public enum Queries {
  SQL_FORMULARIO_SOLICITUD(
      "SELECT t.* FROM form_solicitud_web AS t INNER JOIN gestion_pendiente AS tr ON t.gestion_id = tr.id_gestion AND tr.id_cred_finsonet = '%s'"),
  SQL_ANALITICA_FILTRO(
      "SELECT t.* FROM analitica_filtro_web AS t INNER JOIN gestion_pendiente AS tr ON t.id = tr.id_gestion AND tr.id_cred_finsonet = '%s'"),
  SQL_ASEGURABILIDAD(
      "SELECT t.* FROM asegurabilidad AS t INNER JOIN gestion_pendiente AS tr ON t.id_gestion = tr.id_gestion AND tr.id_cred_finsonet = '%s'"),
  SQL_CIUDAD(
      "SELECT ciudad FROM y_ciudad WHERE codigo= (SELECT t.ciudad_residencia FROM form_solicitud_web AS t INNER JOIN gestion_pendiente AS tr ON t.gestion_id = tr.id_gestion AND tr.id_cred_finsonet = '%s')"),
  SQL_LINEA_CREDITO("SELECT linea_credito_id FROM creditos WHERE id = '%s'");

  private final String sql;

  Queries(String sql) {
    this.sql = sql;
  }

  public String getSql() {
    return sql;
  }
}
