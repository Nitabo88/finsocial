# language: es

Característica: Originacion
  Como asesor finsonet
  Quiero tramitar un credito
  Para revisar el proceso de originacion

  @ChequeoDocumentos
  Escenario: Chequeo Documentos - Aprobacion chequeo de documentos
    Dado que un asesor esta en el paso de chequeo de un documentos
    Cuando el asesor adjunta toda la informacion de el chequeo de documentos
    Entonces deberia ver el credito en el paso de confirmacion

  @ChequeoDocumentos
  Escenario: Chequeo Documentos - Aprobacion chequeo documentos no exitosa
    Dado que el asesor esta en el paso de chequeo de un documentos
    Cuando el asesor complete el chequeo de credito del cliente
    Entonces deberia ver el mensaje de adjuntar informacion

  @ChequeoDocumentos
  Escenario: Chequeo Documentos - Chequeo de documentos estado Pendiente
    Dado que un asesor esta en el paso de chequeo de un documentos
    Cuando el asesor decline el chequeo del credito del cliente
    Entonces el auxiliar de documentacion deberia verlo

  @Confirmacion
  Escenario: Confirmacion - Aprobacion del paso de confirmacion de un credito
    Dado que un asesor esta en el paso de confirmacion
    Cuando el asesor apruebe el paso de confirmacion
    Entonces el asesor deberia ver el crédito en el paso de aprobacion de creditos

  @Confirmacion
  Escenario: Confirmacion - Regresar el credito desde el paso de confirmacion
    Dado que un asesor esta en el paso de confirmacion
    Cuando el asesor regresa el credito a chequeo de documentos
    Entonces el asesor debera ver el credito en el paso de chequeo de documentos

  @Confirmacion
  Escenario:  Confirmacion - Marcar como pendiente el credito en el paso de confirmacion
    Dado que un asesor esta en el paso de confirmacion
    Cuando el asesor marque como pendiente el paso de confirmacion
    Entonces el asesor deberia ver el crédito en confirmacion de creditos en la lista de pendientes

  @AprobacionCreditos
  Escenario: Aprobacion de Creditos - Aprobar el credito desde aprobacion de creditos
    Dado que un asesor esta en el paso de aprobacion de creditos
    Cuando el asesor aprueba el credito
    Entonces el asesor debera ver el credito en el paso de incorporacion

  @AprobacionCreditos
  Escenario: Aprobacion de Creditos - Marcar el credito como pendiente en aprobacion de creditos
    Dado que un asesor esta en el paso de aprobacion de creditos
    Cuando el asesor pone el credito como pendiente
    Entonces el asesor debera ver el credito en aprobacion de creditos en la lista de pendientes

  @AprobacionCreditos
  Escenario: Aprobacion de Creditos - Regresar el credito desde aprobacion de creditos
    Dado que un asesor esta en el paso de aprobacion de creditos
    Cuando el asesor regresa el credito a confirmacion
    Entonces el asesor debera ver el credito en el paso de confirmacion

  @Incorporacion
  Escenario: Incorporacion - Aprobar el credito desde incorporacion
    Dado que un asesor esta en el paso de incorporacion
    Cuando el asesor aprueba el credito en incorporacion
    Entonces el asesor debera ver el credito en el paso de formalizacion

  @Incorporacion
  Escenario: Incorporacion - Marcar el credito como pendiente en incorporacion
    Dado que un asesor esta en el paso de incorporacion
    Cuando el asesor pone el credito como pendiente en incorporacion
    Entonces el asesor debera ver el credito en incorporacion en la lista de pendientes

  @Incorporacion
  Escenario: Incorporacion - Regresar el credito desde incorporacion
    Dado que un asesor esta en el paso de incorporacion
    Cuando el asesor regresa el credito a aprobacion de creditos
    Entonces el asesor debera ver el credito en el paso de aprobacion de creditos

  @Formalizacion
  Escenario: Formalizacion - Aprobar el credito desde formalizacion
    Dado que un asesor esta en el paso de formalizacion
    Cuando el asesor aprueba el credito en formalizacion
    Entonces el asesor debera ver el credito en el paso de tesoreria

  @Formalizacion
  Escenario: Formalizacion - Regresar el credito desde formalizacion
    Dado que un asesor esta en el paso de formalizacion
    Cuando el asesor regresa el credito desde formalizacion
    Entonces el asesor debera ver el credito en el paso de incorporacion

  @Formalizacion
  Escenario: Formalizacion - Marcar el credito como pendiente en formalizacion
    Dado que un asesor esta en el paso de formalizacion
    Cuando el asesor pone el credito como pendiente en formalizacion
    Entonces el asesor debera ver el credito en formalizacion en la lista de pendientes

  @Tesoreria
  Escenario: Tesoreria - Regresar el credito desde tesoreria
    Dado que un asesor esta en el paso de tesoreria
    Cuando el asesor regresa el credito desde tesoreria
    Entonces el asesor debera ver el credito en el paso de formalizacion

  @Tesoreria
  Escenario: Tesoreria - Marcar el credito como pendiente en tesoreria
    Dado que un asesor esta en el paso de tesoreria
    Cuando el asesor pone el credito como pendiente en tesoreria
    Entonces el asesor debera ver el credito en tesoreria en la lista de pendientes