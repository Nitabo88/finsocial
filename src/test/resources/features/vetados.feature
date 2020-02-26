# language: es

Característica: Vetados
  Como asesor finsonet
  Quiero vetar a un cliente
  Para verlo en lista de vetados
  y negar la creacion de un credito

  @Vetados
  Escenario: Asignar veto interno persona natural
    Dado que el asesor quiere asignar un veto interno
    Cuando el asesor asigne un veto interno a un cliente
    Entonces el asesor deberia ver al cliente en el listado de vetados
    Y el asesor no deberia poder crear un credito con este usuario