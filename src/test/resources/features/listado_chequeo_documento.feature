# language: es

Característica: Chequeo de documento
  Como asesor finsonet
  Quiero realizar una gestion en listado de chequeo
  Este se debe llenar para que el credito pase a confirmacion

  Escenario: Chequeo de documentos aprobado
    Dado que el asesor quiere realizar el chequeo de un documento
    Cuando el asesor realice el chequeo de los documento del cliente con cedula .*
    Entonces el asesor no deberia verlo en chequeo de documentos

