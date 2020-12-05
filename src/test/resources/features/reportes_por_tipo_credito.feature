# language: es

Característica: Reportes por tipo de crédito
  Como asesor de finsonet
  Quiero ingresar a la sección de reportes
  Para revisar el estado de las ventas del mes por tipo de crédito

  Escenario: Reporte de venta - FinsoCrédito
    Dado que un asesor quiere consultar un reporte
    Cuando el ingresa al reporte del mes de FinsoCrédito
    Entonces el asesor observara que el valor consolidado y el número de créditos es igual a la suma del detalle de los reportes de FinsoCrédito

  Escenario: Reporte de venta - Venta Finsoamigo
    Dado que un asesor quiere consultar un reporte
    Cuando el ingresa al reporte del mes de Finsoamigo
    Entonces el asesor observara que el valor consolidado y el número de créditos es igual a la suma del detalle de los reportes de FinsoAmigo

  Escenario: Reporte de venta - FinsoProductivo
    Dado que un asesor quiere consultar un reporte
    Cuando el ingresa al reporte del mes de FinsoProductivo
    Entonces el asesor observara que el valor consolidado y el número de créditos es igual a la suma del detalle de los reportes de FinsoProductivo

  Escenario: Reporte de venta - Finsoalivio
    Dado que un asesor quiere consultar un reporte
    Cuando el ingresa al reporte del mes de Finsoalivio
    Entonces el asesor observara que el valor consolidado y el número de créditos es igual a la suma del detalle de los reportes de Finsoalivio

  Escenario: Reporte de venta - Tu tienda en casa
    Dado que un asesor quiere consultar un reporte
    Cuando el ingresa al reporte del mes de Tu tienda en casa
    Entonces el asesor observara que el valor consolidado y el número de créditos es igual a la suma del detalle de los reportes de Tu tienda en casa
