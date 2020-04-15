# language: es

Característica: Originacion - Huy
  Como asesor finsonet
  Quiero tramitar un credito tipo Huy
  Para revisar el proceso de originacion

  @ChequeoDocumentosHuy
  Escenario: Chequeo Documentos Huy - Aprobación chequeo de documentos
    Dado que un asesor quiere aprobar un chequeo de documentos de un crédito huy
    Cuando ingrese toda la información del chequeo de documentos del crédito huy
    Entonces deberá ver el crédito en el paso de aprobación créditos Huy

  @AprobacionCreditosHuy
  Escenario:  Crédito Huy - Aprobación
    Dado que un asesor quiere aprobar un crédito huy en aprobación de créditos
    Cuando el asesor diligencia la información de aprobación de crédito huy
    Entonces el podrá ver el crédito en incorporación huy

#  @AprobacionCreditosHuy
#  Escenario:  credito huy - pendiente
#    Dado que un asesor quiere normalizar un crédito huy en aprobación de créditos
#    Cuando el asesor normalice el crédito
#    Y el crédito se ponga en la lista de pendientes
#    Entonces el podra ver el crédito en pendiente por documentacion
                                                           #
#  @AprobacionCreditosHuy
#  Escenario: credito huy - negar
#    Dado que un asesor quiere negar un crédito huy en aprobación de créditos
#    Cuando el asesor normalice el crédito
#    Y niegue el crédito
#    Entonces el podra ver el crédito en el listado de negado