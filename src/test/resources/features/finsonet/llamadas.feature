# language: es

Característica: Realizar gestion de llamada
  Como asesor de finsonet
  Quiero ingresar a la pagina de finsonet
  Para confirmar la llamada  realizada a un cliente para un nuevo credito

  @LlamadaFinsoamigo
  Escenario: Gestión llamada para nuevo crédito finsoamigo
    Dado que un asesor debe gestionar la llamada para un crédito finsoamigo
    Cuando el asesor se asigne la gestión de la llamada para un crédito finsoamigo
    Y posteriormente procese la llamada del crédito finsoamigo
    Entonces deberá ver que la gestión del credito finsoamigo fue exitosa

  @LlamadaLibranza
  Escenario: Gestión llamada para nuevo crédito de libranza
    Dado que un asesor debe gestionar la llamada para un crédito de libranza
    Cuando el asesor se asigne la gestión de la llamada del crédito de libranza
    Y posteriormente procese la llamada del crédito de libranza
    Entonces deberá ver que la gestión del credito libranza fue exitosa

  @LlamadaCrediHuy
  Escenario: Gestión llamada para nuevo CrediHuy
    Dado que un asesor debe gestionar la llamada para un crédito Huy
    Cuando el asesor se asigne la gestión de la llamada del crédito Huy
    Y posteriormente procese la llamada del crédito Huy
    Entonces deberá ver que la gestión del credito Huy fue exitosa