# language: es

Característica:  Aprobación Crédito
  Como asesor de finsonet
  quiero tramitar la aprobación de un crédito
  para revisar que el proceso funcione correctamente

  @AprobacionCreditosFinsoamigos
  Escenario: Aprobación Finsoamigos - Aprobación chequeo de documentos
    Dado que un asesor esta en el paso de aprobación de créditos finsoamigo
    Cuando el asesor diligencia la información de aprobación de crédito finsoamigo
    Entonces deberá ver el crédito en el paso de tesorería de finsoamigos

  @AprobacionCreditosHuy
  Escenario:  Crédito Huy - Aprobación
    Dado que un asesor quiere aprobar un crédito huy en aprobación de créditos
    Cuando el asesor diligencia la información de aprobación de crédito huy
    Entonces el podrá ver el crédito en incorporación huy

  @AprobacionCreditosHuy
  Escenario:  Crédito Huy - Marcar el crédito como pendiente en aprobación de créditos
    Dado que un asesor quiere normalizar un crédito huy en aprobación de créditos
    Cuando el crédito se ponga en la lista de pendientes
    Entonces el podrá ver el crédito en pendiente por documentación
 #                                                          #
 # @AprobacionCreditosHuy
 # Escenario: credito huy - negar
 #   Dado que un asesor quiere negar un crédito huy en aprobación de créditos
 #   Cuando el asesor normalice el crédito
 #   Y niegue el crédito
 #   Entonces el podra ver el crédito en el listado de negado

  @AprobacionCreditos
  Escenario: Aprobación de Créditos - Aprobar el crédito desde aprobación de créditos
    Dado que un asesor esta en el paso de aprobación de créditos
    Cuando el asesor aprueba el crédito
    Entonces el asesor deberá ver el crédito en el paso de incorporación

  @AprobacionCreditos
  Escenario: Aprobacion de Creditos - Marcar el crédito como pendiente en aprobación de créditos
    Dado que un asesor esta en el paso de aprobación de créditos
    Cuando el asesor pone el crédito como pendiente
    Entonces el asesor deberá ver el crédito en aprobación de créditos en la lista de pendientes

  @AprobacionCreditos
  Escenario: Aprobacion de Creditos - Regresar el crédito desde aprobación de créditos
    Dado que un asesor esta en el paso de aprobación de créditos
    Cuando el asesor regresa el crédito a confirmación
    Entonces el asesor deberá ver el crédito en el paso de confirmación