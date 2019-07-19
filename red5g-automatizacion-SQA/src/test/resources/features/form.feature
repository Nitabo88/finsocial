# language: es

Característica: formalizacion de credito
  Como Usuario
  Quiero formalizar un credito
  Para que quede aprobado ese credito en formalizacion de credito

Escenario:
    Dado que Daniela quiere hacer una formalizacion
    Cuando se formalice el credito del usuario identificado con cedula
    Entonces el crédito debe pasar a tesoreria
