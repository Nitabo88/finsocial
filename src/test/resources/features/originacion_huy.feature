# language: es

Característica: Originacion - Huy
  Como asesor finsonet
  Quiero tramitar un credito tipo Huy
  Para revisar el proceso de originacion

  @ChequeoDocumentosHuy
  Escenario: Chequeo Documentos Huy - Aprobación chequeo de documentos
    Dado que un asesor quiere  aprobar un chequeo de documentos de un crédito huy
    Cuando ingrese toda la información del chequeo de documentos del crédito huy
    Entonces deberá ver el crédito en el paso de aprobación créditos Huy

  @AprobacionCreditosHuy
  Escenario:  credito huy - aprobacion
    Dado que un asesor quiere aprobar un credito huy
    Cuando el asesor normalice el credito
    Y apruebe el credito
    Entonces el podra ver el credito en incorporacion

  @AprobacionCreditosHuy
  Escenario:  credito huy - pendiente
    Dado que un asesor quiere normalizar un credito
    Cuando normalice el credito
    Y el credito se ponga en la lista de pendientes
    Entonces el podra ver el credito en pendiente por documentacion

  @AprobacionCreditosHuy
  Escenario: credito huy - negar
    Dado que un asesor quiere negar un credito huy
    Cuando el asesor normalice el credito Y niegue el credito
    Entonces el podra ver el credito en el listado de negado