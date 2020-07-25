package co.com.red5g.utils.conexionbd;

public enum QueriesBancoomeva {
  SQL_TEST_USUARIO_IDEAL(
      "SELECT * FROM BASE INNER JOIN TEST ON BASE.DOCUMENTO = TEST.DOCUMENTO AND TEST.DOCUMENTO IN (SELECT DOCUMENTO FROM TEST WHERE ACTIVO =1 AND CUENTA= 1 AND TIENE_PAGARE=1 AND PAGARE_32 = 1 AND"
          + " PAGARE_33 = 1) AND ID_CAMPANA IN (SELECT ID FROM CAMPANAS WHERE ESTADO = 1 AND FECHA_VIGENCIA >= NOW()) LIMIT 1;");

  private final String sql;

  QueriesBancoomeva(String sql) {
    this.sql = sql;
  }

  public String getSql() {
    return sql;
  }
}
