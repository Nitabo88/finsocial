# language: es

Característica: Creacion credito nuevo finsonet
  Como asesor de finsonet
  Quiero ingresar a la pagina de finsonet
  Para crear la solicitud de un nuevo credito para un cliente

  Escenario: Creacion nuevo credito sin los campos obligatorios del cliente
    Dado que un asesor quiere crear un credito
    Cuando el ingresa el numero de documento 23604517 con el valor 1500000 y a un plazo de "38" meses
    Entonces el no podra crear un credito

  Escenario: Creacion nuevo credito
    Dado que un asesor quiere crear un credito
    Cuando el ingresa el numero de documento 12000092 con el valor 2500000 y a un plazo de "48" meses
    Entonces el podra ver un credito creado