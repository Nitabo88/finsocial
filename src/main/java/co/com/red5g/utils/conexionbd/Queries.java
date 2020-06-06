package co.com.red5g.utils.conexionbd;

public enum Queries {
  SQL_FORMULARIO_SOLICITUD(
      "SELECT * FROM form_solicitud_web WHERE gestion_id = (SELECT id_gestion FROM gestion_pendiente WHERE id_cred_finsonet = '%s')"),
  SQL_ANALITICA_FILTRO(
      "SELECT t.* FROM analitica_filtro_web AS t INNER JOIN gestion_pendiente AS tr ON t.id = tr.id_gestion AND tr.id_cred_finsonet = '%s'"),
  SQL_ASEGURABILIDAD(
      "SELECT t.* FROM asegurabilidad AS t INNER JOIN gestion_pendiente AS tr ON t.id_gestion = tr.id_gestion AND tr.id_cred_finsonet = '%s'"),
  SQL_CIUDAD_RESIDENCIA(
      "SELECT ciudad FROM y_ciudad WHERE codigo= (SELECT t.ciudad_residencia FROM form_solicitud_web AS t INNER JOIN gestion_pendiente AS tr ON t.gestion_id = tr.id_gestion AND tr.id_cred_finsonet = '%s')"),
  SQL_LUGAR_NACIMIENTO(
      "SELECT ciudad FROM y_ciudad WHERE codigo= (SELECT t.lugar_nac FROM form_solicitud_web AS t INNER JOIN gestion_pendiente AS tr ON t.gestion_id = tr.id_gestion AND tr.id_cred_finsonet = '%s')"),
  SQL_LUGAR_EXPEDICION(
      "SELECT ciudad FROM y_ciudad WHERE codigo= (SELECT t.lugar_exp FROM form_solicitud_web AS t INNER JOIN gestion_pendiente AS tr ON t.gestion_id = tr.id_gestion AND tr.id_cred_finsonet = '%s')"),
  SQL_LINEA_CREDITO("SELECT linea_credito_id FROM creditos WHERE id = '%s'"),
  SQL_FS_MONEDA("SELECT * FROM fs_moneda_ext_web WHERE gestion_id = (SELECT id_gestion FROM gestion_pendiente WHERE id_cred_finsonet = '%s')"),
  SQL_ID_GESTION("SELECT id_gestion FROM gestion_pendiente WHERE id_cred_finsonet = '%s'");

  private final String sql;

  Queries(String sql) {
    this.sql = sql;
  }

  public String getSql() {
    return sql;
  }
}
