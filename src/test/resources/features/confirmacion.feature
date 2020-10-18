# language: es

Característica: Confirmación
  Como asesor Finsonet
  Quiero tramitar la confirmación de un crédito
  Para revisar que el proceso funciona correctamente

  @Libranza
  @Confirmacion
  Escenario: Confirmación Libranza - Aprobación del paso de confirmación de un crédito
    Dado que un asesor esta en el paso de confirmación
    Cuando el asesor apruebe el paso de confirmación
    Entonces el asesor deberá ver el crédito en el paso de aprobación de créditos

  @Libranza
  @Confirmacion
  Escenario: Confirmación Libranza - Regresar el credito desde el paso de confirmación
    Dado que un asesor esta en el paso de confirmación
    Cuando el asesor regresa el crédito a chequeo de documentos
    Entonces el asesor deberá ver el crédito en el paso de chequeo de documentos

  @Libranza
  @Confirmacion
  Escenario:  Confirmación Libranza - Marcar como pendiente el crédito en el paso de confirmación
    Dado que un asesor esta en el paso de confirmación
    Cuando el asesor marque como pendiente el paso de confirmación
    Entonces el asesor deberá ver el crédito en confirmación de créditos en la lista de pendientes

  @LibranzaDigital @Pending
  @ConfirmacionLibranzaDigital
  Escenario: Confirmación Libranza Digital - Aprobación del paso de confirmación de un crédito
    Dado que un asesor esta en el paso de confirmación de libranza digital
    Cuando el asesor apruebe el paso de confirmación
    Entonces el asesor deberá ver el crédito en el paso de aprobación de créditos




