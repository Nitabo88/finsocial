# language: es

Característica: Vetados
  Como asesor finsonet
  Quiero vetar a un cliente
  Para verlo en lista de vetados
  y negar la creación de un crédito

  @Vetados
  Escenario: Asignar veto interno persona natural
    Dado que el asesor quiere asignar un veto interno
    Cuando el asesor asigne un veto interno a un cliente
    Entonces el asesor deberá ver al cliente en el listado de vetados
    Y el asesor no deberá poder crear un crédito con este usuario