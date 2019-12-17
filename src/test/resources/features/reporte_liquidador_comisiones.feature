# language: es

Característica: Reportes de comisiones Finsonet
  Como asesor de finsonet
  Quiero ingresar a la seccion de reportes de liquidacion de comisiones
  Para revisar el estado de las comisiones del mes

  Esquema del escenario: : Reporte de venta - Venta Nueva
    Dado que un asesor quiere consultar el reporte actual de liquidacion de comisiones
    Cuando el ingresa al reporte de liquidacion de comisiones - Venta Nueva del ciclo <Ciclo>
    Entonces el observara que el consolidado y el detalle del reporte de originacion liquidacion de comisiones - Venta Nueva es consistente

    Ejemplos:
      | Ciclo |
      | S1    |
      | S2    |
      | S3    |
      | S4    |

  Esquema del escenario: : Reporte de venta - Venta Liberada
    Dado que un asesor quiere consultar el reporte actual de liquidacion de comisiones
    Cuando el ingresa al reporte de liquidacion de comisiones - Venta Liberada del ciclo <Ciclo>
    Entonces el observara que el consolidado y el detalle del reporte de originacion liquidacion de comisiones - Venta Liberada es consistente

    Ejemplos:
      | Ciclo |
      | S1    |
      | S2    |
      | S3    |
      | S4    |