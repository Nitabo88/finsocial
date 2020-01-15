# language: es

Característica: Chequeo de documento
  Como asesor finsonet
  Quiero tramitar un credito
  Para revisar el proceso de originacion

  @ChequeoDocumentos
  Escenario: Actualizacion chequeo documentos
    Dado que el asesor quiere realizar el chequeo de un documento
    Cuando el asesor adjunta toda la informacion de el chequeo de documentos
    Entonces deberia ver el credito en el paso de confirmacion

  @ChequeoDocumentos
  Escenario: No aprobacion de chequeo de documentos
    Dado que el asesor quiere realizar el chequeo de un documento
    Cuando el asesor decline el chequeo del credito del cliente
    Entonces el asesor no deberia verlo en chequeo de documentos

  @ChequeoDocumentos
  Escenario: Actualizacion chequeo documentos no exitosa
    Dado que el asesor quiere realizar el chequeo de un documento
    Cuando el asesor complete el chequeo de credito del cliente
    Entonces deberia ver el mensaje de adjuntar informacion

  @Confirmacion
  Escenario: aprobacion del paso de confirmacion de un credito
    Dado que un asesor quiere realizar una aprobacion de un credito
    Cuando se apruebe el paso de confirmacion
    Entonces deberia ver el crédito en el paso de aprobacion de creditos

  @Confirmacion
  Escenario: regresar el credito desde aprobacion
    Dado que un asesor quiere regresar un credito de aprobacion
    Cuando se regresa el credito del usuario identificado con 6808119
    Entonces el crédito debe pasar a confirmacion