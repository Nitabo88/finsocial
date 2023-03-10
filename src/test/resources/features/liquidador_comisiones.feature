# language: es

Característica: Liquidador de comisiones Finsonet
  Como asesor de finsonet
  Quiero ingresar a la seccion de liquidacion de comisiones
  Para revisar el estado de las comisiones del mes

  @Colocacion
  Esquema del escenario: Liquidador de Comisiones - Colocacion
    Dado que un asesor quiere consultar el reporte actual de liquidacion de comisiones
    Cuando el ingresa al reporte de liquidacion de comisiones - Venta Nueva del ciclo <Ciclo>
    Entonces el observara que el numero de creditos consolidado y el detalle del reporte de liquidacion de comisiones es consistente
    Y que el valor del consolidado y el detalle del reporte de liquidacion de comisiones es consistente

    Ejemplos:
      | Ciclo |
      | S1    |
      | S2    |
      | S3    |
      | S4    |

  @Reporte
  Escenario: Liquidador de comisiones - Global Venta Nueva
    Dado que un asesor quiere consultar un reporte
    Cuando el ingresa al reporte actual de venta nueva
    Entonces el observara que el valor de venta nueva es consistente
    Y que el numero de creditos de venta nueva es consistente

  @Reporte
  Escenario: Liquidador de comisiones - Global Venta Liberada
    Dado que un asesor quiere consultar un reporte
    Cuando el ingresa al reporte actual de venta liberada
    Entonces el observara que el valor de venta liberada es consistente
    Y que el numero de creditos de venta liberada es consistente

  @Liquidacion
  Esquema del escenario: : Liquidador de Comisiones - Liquidacion
    Dado que un asesor quiere consultar el reporte actual de liquidacion de comisiones
    Cuando el ingresa al reporte de liquidacion de comisiones - Venta Nueva del ciclo <Ciclo>
    Entonces el observara que el valor liquidado, corresponde al valor total del detalle
    Y que el detalle por asesor es el adecuado

    Ejemplos:
      | Ciclo |
      | S1    |
      | S2    |
      | S3    |
      | S4    |
