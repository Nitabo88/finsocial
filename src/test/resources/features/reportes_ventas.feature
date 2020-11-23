# language: es

Característica: Reportes de venta Finsonet
  Como asesor de finsonet
  Quiero ingresar a la sección de reportes de venta
  Para revisar el estado de las ventas del mes

  Escenario: Reporte de venta - Venta Finsoamigo
    Dado que un asesor quiere consultar un reporte
    Cuando el ingresa al reporte del mes de finsoamigo
    Entonces el observara que el valor consolidado y el detalle del reporte de finsoamigo son consistentes
    Y que el numero de creditos consolidado y el detalle del reporte de finsoamigo son consistentes

  Escenario: Reporte de venta - Antecartera
    Dado que un asesor quiere consultar un reporte
    Cuando el ingresa al reporte del mes de antecartera
    Entonces el observara que el numero de creditos consolidado y el detalle del reporte de antecartera son consistentes

  Escenario: Reporte de venta - Originacion
    Dado que un asesor quiere consultar un reporte
    Cuando el ingresa al reporte del mes de originacion
    Entonces el observara que el valor consolidado y el detalle del reporte de originacion son consistentes
    Y que el numero de creditos consolidado y el detalle del reporte de originacion son consistentes

  Escenario: Reporte de venta - Venta Nueva
    Dado que un asesor quiere consultar un reporte
    Cuando el ingresa al reporte del mes de venta nueva
    Entonces el observara que el valor consolidado y el detalle del reporte de venta nueva son consistentes
    Y que el numero de creditos consolidado y el detalle del reporte de venta nueva son consistentes

  Escenario: Reporte de venta - Venta Liberada
    Dado que un asesor quiere consultar un reporte
    Cuando el ingresa al reporte del mes de venta liberada
    Entonces el observara que el valor consolidado y el detalle del reporte de venta liberada son consistentes
    Y que el numero de creditos consolidado y el detalle del reporte de venta liberada son consistentes