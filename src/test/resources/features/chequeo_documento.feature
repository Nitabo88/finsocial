# language: es

Característica: Chequeo de documento
  Como asesor finsonet
  Quiero rechazar un credito por falta de documentación
  Este se debe chequear para que el credito quede rechazado

  Escenario: Chequeo de documentos rechazado
    Dado que el asesor quiere realizar el chequeo de un documento
    Cuando el asesor decline el chequeo del credito del cliente
    Entonces el asesor no deberia verlo en chequeo de documentos

