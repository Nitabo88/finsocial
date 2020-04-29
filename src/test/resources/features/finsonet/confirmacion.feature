# language: es

Característica: Confirmación
  Como asesor finsonet
  Quiero tramitar la confirmación de un crédito
  Para revisar que el proceso funciona correctamente

  @Confirmacion
  Escenario: Confirmación - Aprobación del paso de confirmación de un crédito
    Dado que un asesor esta en el paso de confirmación
    Cuando el asesor apruebe el paso de confirmación
    Entonces el asesor deberá ver el crédito en el paso de aprobación de creditos

  @Confirmacion
  Escenario: Confirmación - Regresar el credito desde el paso de confirmación
    Dado que un asesor esta en el paso de confirmación
    Cuando el asesor regresa el crédito a chequeo de documentos
    Entonces el asesor deberá ver el crédito en el paso de chequeo de documentos

  @Confirmacion
  Escenario:  Confirmación - Marcar como pendiente el crédito en el paso de confirmación
    Dado que un asesor esta en el paso de confirmación
    Cuando el asesor marque como pendiente el paso de confirmación
    Entonces el asesor deberá ver el crédito en confirmación de créditos en la lista de pendientes




