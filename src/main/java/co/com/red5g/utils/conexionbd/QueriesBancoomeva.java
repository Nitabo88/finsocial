package co.com.red5g.utils.conexionbd;

public enum QueriesBancoomeva {
  SQL_CLIENTE_APROBADO(
      " SELECT * FROM BASE INNER JOIN TEST ON BASE.DOCUMENTO = TEST.DOCUMENTO AND TEST.DOCUMENTO IN (SELECT DOCUMENTO FROM TEST WHERE ACTIVO =1 AND CUENTA= 1 AND TIENE_PAGARE=1 AND PAGARE_32 = 1 AND PAGARE_33 = 1) AND ID_CAMPANA IN (SELECT ID FROM CAMPANAS WHERE ESTADO = 1 AND FECHA_VIGENCIA >= NOW()) AND BASE.TIPO_BASE = 1 ORDER BY TEST.DOCUMENTO LIMIT 1"),
  SQL_PROPORCIONAL_SEGURO("Select * FROM CUO_MEN_SEG_VID_DEU"),
  SQL_FACTOR_DESEMPLEO("SELECT * from FACTOR_DESEMPLEO"),
  SQL_ID_GESTION("SELECT * FROM CORREOS WHERE ID = '%s'"),
  SQL_CLIENTE_PRE_APROBADO(
      " SELECT * FROM BASE INNER JOIN TEST ON BASE.DOCUMENTO = TEST.DOCUMENTO AND TEST.DOCUMENTO IN (SELECT DOCUMENTO FROM TEST WHERE ACTIVO =1 AND CUENTA= 1 AND TIENE_PAGARE=1 AND PAGARE_32 = 1 "
          + "AND PAGARE_33 = 1) AND ID_CAMPANA IN (SELECT ID FROM CAMPANAS WHERE ESTADO = 1 AND FECHA_VIGENCIA >= NOW()) AND BASE.TIPO_BASE = 2 ORDER BY TEST.DOCUMENTO LIMIT 1"),
  ;

  private final String sql;

  QueriesBancoomeva(String sql) {
    this.sql = sql;
  }

  public String getSql() {
    return sql;
  }
}
