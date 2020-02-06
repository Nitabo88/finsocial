# language: es

Característica: Originacion
  Como asesor finsonet
  Quiero tramitar un credito
  Para revisar el proceso de originacion

  @ChequeoDocumentos
  Escenario: No aprobacion de chequeo de documentos
    Dado que un asesor esta en el paso de chequeo de un documentos
    Cuando el asesor decline el chequeo del credito del cliente
    Entonces el asesor no deberia verlo en chequeo de documentos
    Y el auxiliar de documentacion deberia verlo

  @ChequeoDocumentos
  Escenario: Actualizacion chequeo documentos
    Dado que un asesor esta en el paso de chequeo de un documentos
    Cuando el asesor adjunta toda la informacion de el chequeo de documentos
    Entonces deberia ver el credito en el paso de confirmacion

  @ChequeoDocumentos
  Escenario: Actualizacion chequeo documentos no exitosa
    Dado que el asesor esta en el paso de chequeo de un documentos
    Cuando el asesor complete el chequeo de credito del cliente
    Entonces deberia ver el mensaje de adjuntar informacion

  @Confirmacion
  Escenario: aprobacion del paso de confirmacion de un credito
    Dado que un asesor esta en el paso de confirmacion
    Cuando el asesor apruebe el paso de confirmacion
    Entonces el asesor deberia ver el crédito en el paso de aprobacion de creditos

  @Confirmacion
  Escenario: regresar el credito desde confirmacion
    Dado que un asesor esta en el paso de confirmacion
    Cuando el asesor regresa el credito a chequeo de documentos
    Entonces el asesor debera ver el credito en el paso de chequeo de documentos

  @AprobacionCreditos
  Escenario: Marcar el credito como pendiente en aprobacion de creditos
    Dado que un asesor esta en el paso de aprobacion de creditos
    Cuando el asesor pone el credito como pendiente
    Entonces el asesor debera ver el credito en aprobacion de creditos en la lista de pendientes

  @AprobacionCreditos
  Escenario: regresar el credito desde aprobacion de creditos
    Dado que un asesor esta en el paso de aprobacion de creditos
    Cuando el asesor regresa el credito a confirmacion
    Entonces el asesor debera ver el credito en el paso de confirmacion

  @AprobacionCreditos
  Escenario: Marcar el credito como pendiente en aprobacion de creditos
    Dado que un asesor esta en el paso de aprobacion de creditos
    Cuando el asesor pone el credito como pendiente
    Entonces el asesor debera ver el credito en aprobacion de creditos en la lista de pendientes

  @AprobacionCreditos
  Escenario: aprobar el credito desde aprobacion de creditos
    Dado que un asesor esta en el paso de aprobacion de creditos
    Cuando el asesor aprueba el credito
    Entonces el asesor debera ver el credito en el paso de incorporacion
