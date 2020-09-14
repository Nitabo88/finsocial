package co.com.red5g.utils.conexionbd;

public enum QueriesFinsonet {
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
  SQL_COOPERATIVA("SELECT * FROM creditos WHERE id = '%s'"),
  SQL_ID_GESTION("SELECT id_gestion FROM gestion_pendiente WHERE id_cred_finsonet = '%s'"),
  SQL_ASIGNAR_CREDITO("UPDATE creditos SET id_vendedor = 2256 WHERE id ='%s'"),
  SQL_CONSULTAR_CREDITO_FINSOAMIGO("Select * from creditos where sufi= 2 AND estado = 'INGRESO' AND finsoamigo_externo='0' ORDER BY RAND() LIMIT 1"),
  SQL_CONSULTAR_CREDITO_FINSOPRODUCTIVO("SELECT * FROM creditos WHERE sufi= 2 AND estado = 'INGRESO' AND finsoamigo_externo='1' ORDER BY RAND() LIMIT 1"),
  SQL_CONSULTAR_CREDITO_FINSOALIVIO("SELECT * FROM creditos WHERE sufi= 4 AND estado = 'INGRESO' ORDER BY RAND() LIMIT 1"),
  SQL_CONSULTAR_CREDITO_FINSOTIENDA("SELECT * FROM creditos WHERE sufi= 5 AND estado = 'INGRESO' AND credito_enlinea = 1 ORDER BY RAND() LIMIT 1"),
  SQL_CONSULTAR_CREDITO_LIBRANZA_DIGITAL("SELECT * FROM creditos WHERE sufi= 0 AND estado = 'INGRESO' AND credito_enlinea = 1 ORDER BY RAND() LIMIT 1");

  private final String sql;

  QueriesFinsonet(String sql) {
    this.sql = sql;
  }

  public String getSql() {
    return sql;
  }
}
