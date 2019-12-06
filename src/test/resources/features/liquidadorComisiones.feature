# language: es

Característica: Reportes de comisiones Finsonet
  Como asesor de finsonet
  Quiero ingresar a la seccion de reportes de liquidacion de comisiones
  Para revisar el estado de las comisiones del mes

  Escenario: Reporte de venta - Venta Nueva
    Dado que un asesor quiere consultar un reporte
    Cuando el ingresa a liquidacion de comisiones del mes de originacion
    Entonces el observara que el consolidado y el detalle del reporte de originacion son consistentes

  Escenario: Reporte de venta - Venta Liberada
    Dado que un asesor quiere consultar un reporte
    Cuando el ingresa al reporte del mes de antecartera
    Entonces el observara que el consolidado y el detalle del reporte de antecartera son consistentes