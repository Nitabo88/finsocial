# language: es

Característica:  Formalización
  Como asesor de finsonet
  quiero tramitar el paso de formalización de un crédito
  para revisar que el proceso funcione correctamente

  @Formalizacion
  Escenario: Formalización - Aprobar el crédito desde formalización
    Dado que un asesor esta en el paso de formalización
    Cuando el asesor aprueba el crédito en formalización
    Entonces el asesor deberá ver el crédito en el paso de tesoreria

  @Formalizacion
  Escenario: Formalización - Regresar el crédito desde formalización
    Dado que un asesor esta en el paso de formalización
    Cuando el asesor regresa el crédito desde formalización
    Entonces el asesor deberá ver el crédito en el paso de incorporación

  @Formalizacion
  Escenario: Formalización - Marcar el crédito como pendiente en formalización
    Dado que un asesor esta en el paso de formalización
    Cuando el asesor pone el crédito como pendiente en formalización
    Entonces el asesor deberá ver el crédito en formalización en la lista de pendientes