# language: es

Característica:  Incorporación
  Como asesor de finsonet
  quiero tramitar el paso de incorporación de un crédito
  para revisar que el proceso funcione correctamente

  @Libranza
  @Incorporacion
  Escenario: Incorporación - Aprobar el crédito desde incorporación
    Dado que un asesor esta en el paso de incorporación
    Cuando el asesor aprueba el crédito en incorporación
    Entonces el asesor deberá ver el crédito en el paso de formalización

  @Libranza
  @Incorporacion
  Escenario: Incorporación - Marcar el crédito como pendiente en incorporación
    Dado que un asesor esta en el paso de incorporación
    Cuando el asesor pone el crédito como pendiente en incorporación
    Entonces el asesor deberá ver el crédito en incorporación en la lista de pendientes

  @Libranza
  @Incorporacion
  Escenario: Incorporación - Regresar el crédito desde incorporación
    Dado que un asesor esta en el paso de incorporación
    Cuando el asesor regresa el crédito a aprobación de créditos
    Entonces el asesor deberá ver el crédito en el paso de aprobación de creditos

   @Credihuy
   @IncorporacionHuy
   Escenario: Incorporación CrediHuy - Aprobar el crédito huy desde incorporación
     Dado que un asesor quiere aprobar un crédito huy en incoporación de créditos
     Cuando el asesor aprueba el crédito en incorporación huy
     Entonces el asesor deberá ver el crédito en el paso de tesorería crediHuy