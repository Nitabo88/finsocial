# language: es

Característica: Vetados
  Como asesor finsonet
  Quiero vetar a un cliente
  Para negar la creación de un nuevo credito

  @vetados
  Escenario: Asiganar veto interno
    Dado que el asesor quiere aginar un veto interno
    Cuando el asesor asigne un veto interno a un cliente
    Entonces el asesor deberia verlo en listado de vetos

