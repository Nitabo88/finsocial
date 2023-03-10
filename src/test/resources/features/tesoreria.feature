# language: es

Característica:  Tesorería
  Como asesor de finsonet
  quiero tramitar el paso de tesorería de un crédito
  para revisar que el proceso funcione correctamente

  @Libranza @Pending
  @Tesoreria
  Escenario: Tesorería - Regresar el crédito desde tesorería
    Dado que un asesor esta en el paso de tesorería
    Cuando el asesor regresa el crédito desde tesorería
    Entonces el asesor deberá ver el crédito en el paso de formalización

  @Libranza @Pending
  @Tesoreria
  Escenario: Tesorería - Marcar el crédito como pendiente en tesorería
    Dado que un asesor esta en el paso de tesorería
    Cuando el asesor pone el crédito como pendiente en tesorería
    Entonces el asesor deberá ver el crédito en tesorería en la lista de pendientes

  @Libranza @Pending
  @Tesoreria
  Escenario: Tesorería - Aprobación del crédito en tesorería
    Dado que un asesor esta en el paso de tesorería
    Cuando el asesor aprueba el crédito en tesorería
    Entonces el asesor deberá ver el crédito en antecartera

  @Credihuy
  @TesoreriaHuy
  Escenario: Tesorería CrediHuy - Aprobación del crédito en tesorería
    Dado que un asesor esta en el paso de tesorería credihuy
    Cuando el asesor aprueba el crédito en tesorería credihuy
    Entonces el asesor deberá ver el crédito en cartera

  @Finsoamigo
  @TesoreriaFinsoamigo
  Escenario: Tesorería Finsoamigo - Aprobación del crédito en tesorería
    Dado que un asesor esta en el paso de tesorería finsoamigos
    Cuando el asesor aprueba el crédito en tesorería finsoamigos
    Entonces el asesor deberá ver el crédito en antecartera
