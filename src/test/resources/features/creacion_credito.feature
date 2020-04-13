# language: es

Característica: Creacion credito nuevo finsonet
  Como asesor de finsonet
  Quiero ingresar a la pagina de finsonet
  Para crear la solicitud de un nuevo credito para un cliente

  Escenario: Creacion nuevo credito
    Dado que un asesor quiere crear un crédito de libranza
    Cuando el ingresa el número de documento 12000092 con el valor 2500000 y a un plazo de "48" meses
    Entonces el podrá ver un crédito de libranza creado

 # Escenario:  Creación nuevo crédito - Campos faltantes
 #   Dado que un asesor quiere crear un crédito de libranza
  #  Cuando el ingresa el número de documento 23604517 con el valor 1500000 y a un plazo de "38" meses
   # Entonces el no podrá crear un crédito de libranza

  Escenario: Creación nuevo crédito Huy
    Dado que un asesor debe crear un crédito Huy
    Cuando el asesor ingresa la información del crédito
    Entonces el podrá ver un crédito Huy creado
