package co.com.red5g.utils;

public enum Queries {
  SQL_FORMULARIO_SOLICITUD(
      "SELECT t.* FROM form_solicitud_web AS t INNER JOIN gestion_pendiente AS tr ON t.gestion_id = tr.id_gestion AND tr.id_cred_finsonet = '%s'");

  private final String sql;

  Queries(String sql) {
    this.sql = sql;
  }

  public String getSql() {
    return sql;
  }
}
