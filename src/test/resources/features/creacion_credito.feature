# language: es

Característica: Creacion credito nuevo finsonet
  Como asesor de finsonet
  Quiero ingresar a la pagina de finsonet
  Para crear la solicitud de un nuevo credito para un cliente

  @Libranza
  Escenario: Creacion nuevo credito
    Dado que un asesor quiere crear un crédito de libranza
    Cuando el ingresa el número de documento 4390231 con el valor 2500000 y a un plazo de "75" meses
    Entonces el podrá ver un crédito de libranza creado

  @Libranza
  Escenario:  Creación nuevo crédito - Campos faltantes
    Dado que un asesor quiere crear un crédito de libranza
    Cuando el diligencia el número de documento 26774662 con el valor 1500000 y a un plazo de "75" meses
    Entonces el no podrá crear un crédito de libranza

  @Credihuy
  Escenario: Creación nuevo crédito Huy
    Dado que un asesor debe crear un crédito Huy
    Cuando el asesor ingresa la información del crédito
    Entonces el podrá ver un crédito Huy creado
