# language: es

Característica: Creacion credito nuevo finsonet
  Como asesor de finsonet
  Quiero ingresar a la pagina de finsonet
  Para crear la solicitud de un nuevo credito para un cliente

  Escenario: Creacion nuevo credito
    Dado que un asesor quiere crear un credito
    Cuando el ingresa la cedula 10000060  con el valor 1000000 y a un plazo de "36" meses
    Entonces el podra ver un credito creado