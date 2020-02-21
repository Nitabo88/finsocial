# language: es

Característica: Vetados
  Como asesor finsonet
  Quiero vetar a un cliente
  Para negar la creación de un nuevo credito

  @Vetados
  Escenario: Asignar veto interno persona natural
    Dado que el asesor quiere asignar un veto interno
    Cuando el asesor asigne un veto interno a un cliente
    Entonces el asesor deberia verlo en listado de vetados