# language: es

Característica: Originacion
  Como asesor finsonet
  Quiero tramitar un credito
  Para revisar el proceso de originacion

  @ChequeoDocumentos
  Escenario: Aprobacion chequeo documentos no exitosa
    Dado que el asesor esta en el paso de chequeo de un documentos
    Cuando el asesor complete el chequeo de credito del cliente
    Entonces deberia ver el mensaje de adjuntar informacion

  @ChequeoDocumentos
  Escenario: Aprobacion chequeo de documentos
    Dado que un asesor esta en el paso de chequeo de un documentos
    Cuando el asesor adjunta toda la informacion de el chequeo de documentos
    Entonces deberia ver el credito en el paso de confirmacion

  @ChequeoDocumentos
  Escenario: Chequeo de documentos estado Pendiente
    Dado que un asesor esta en el paso de chequeo de un documentos
    Cuando el asesor decline el chequeo del credito del cliente
    Entonces el asesor no deberia verlo en chequeo de documentos
    Y el auxiliar de documentacion deberia verlo

  @Confirmacion
  Escenario: Regresar el credito desde el paso de confirmacion
    Dado que un asesor esta en el paso de confirmacion
    Cuando el asesor regresa el credito a chequeo de documentos
    Entonces el asesor debera ver el credito en el paso de chequeo de documentos

  @Confirmacion
  Escenario: Aprobacion del paso de confirmacion de un credito
    Dado que un asesor esta en el paso de confirmacion
    Cuando el asesor apruebe el paso de confirmacion
    Entonces el asesor deberia ver el crédito en el paso de aprobacion de creditos

  @AprobacionCreditos
  Escenario: Aprobar el credito desde aprobacion de creditos
    Dado que un asesor esta en el paso de aprobacion de creditos
    Cuando el asesor aprueba el credito
    Entonces el asesor debera ver el credito en el paso de incorporacion

  @AprobacionCreditos
  Escenario: Marcar el credito como pendiente en aprobacion de creditos
    Dado que un asesor esta en el paso de aprobacion de creditos
    Cuando el asesor pone el credito como pendiente
    Entonces el asesor debera ver el credito en aprobacion de creditos en la lista de pendientes

  @AprobacionCreditos
  Escenario: Regresar el credito desde aprobacion de creditos
    Dado que un asesor esta en el paso de aprobacion de creditos
    Cuando el asesor regresa el credito a confirmacion
    Entonces el asesor debera ver el credito en el paso de confirmacion

  @AprobacionCreditos
  Escenario:  credito huy - aprobacion
    Dado que un asesor quiere aprobar un credito huy
    Cuando el asesor normalice el credito
    Y apruebe el credito
    Entonces

  @AprobacionCreditos
  Escenario:  credito huy - pendiente
    Dado que un asesor quiere normalizar un credito
    Cuando normalice el credito
    Y el credito se ponga en la lista de pendientes
    Entonces

  @Incorporacion
  Escenario: Regresar el credito desde incorporacion
    Dado que un asesor esta en el paso de incorporacion
    Cuando el asesor regresa el credito a aprobacion de creditos
    Entonces el asesor debera ver el credito en el paso de aprobacion de creditos

  @Incorporacion
  Escenario: Marcar el credito como pendiente en incorporacion
    Dado que un asesor esta en el paso de incorporacion
    Cuando el asesor pone el credito como pendiente en incorporacion
    Entonces el asesor debera ver el credito en incorporacion en la lista de pendientes

  @Incorporacion
  Escenario: Aprobar el credito desde incorporacion
    Dado que un asesor esta en el paso de incorporacion
    Cuando el asesor aprueba el credito en incorporacion
    Entonces el asesor debera ver el credito en el paso de formalizacion
