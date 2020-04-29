# language: es

Característica:  Tesorería
  Como asesor de finsonet
  quiero tramitar el paso de tesorería de un crédito
  para revisar que el proceso funcione correctamente

  @Tesoreria
  Escenario: Tesorería - Regresar el crédito desde tesorería
    Dado que un asesor esta en el paso de tesorería
    Cuando el asesor regresa el crédito desde tesorería
    Entonces el asesor deberá ver el crédito en el paso de formalización

  @Tesoreria
  Escenario: Tesorería - Marcar el crédito como pendiente en tesorería
    Dado que un asesor esta en el paso de tesorería
    Cuando el asesor pone el crédito como pendiente en tesorería
    Entonces el asesor deberá ver el crédito en tesorería en la lista de pendientes