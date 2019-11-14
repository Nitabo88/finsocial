# language: es

Característica: Reportes de venta Finsonet
  Como asesor de finsonet
  Quiero ingresar a la seccion de reportes de venta
  Para revisar el estado de las ventas del mes

  Escenario: Reporte de venta - Originacion
    Dado que un asesor quiere consultar un reporte
    Cuando el ingresa al reporte del 2019-09 de originacion
    Entonces el observara que el consolidado y el detalle del reporte de originacion son consistentes

