# language: es

Característica: confirmacion de credito
  Como Usuario
  Quiero confirmar un credito
  Para que quede aprobado ese credito en confirmacion

Escenario:
    Dado que Daniela quiere hacer una confirmacion
    Cuando se confirme el credito del usuario identificado con cedula
    Entonces el crédito debe pasar a aprobacion credito

