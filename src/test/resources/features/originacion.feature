# language: es

Característica: Chequeo de documento
  Como asesor finsonet
  Quiero tramitar un credito
  Para revisar el proceso de originacion

  Escenario: Chequeo de documentos rechazado
    Dado que el asesor quiere realizar el chequeo de un documento
    Cuando el asesor decline el chequeo del credito del cliente
    Entonces el asesor no deberia verlo en chequeo de documentos

  Escenario: Actualizacion chequeo documentos no exitosa
    Dado que el asesor quiere realizar el chequeo de un documento
    Cuando el asesor complete el chequeo de credito del cliente
    Entonces deberia ver el mensaje de adjuntar informacion

