# language: es

Característica: normalizar de credito
  Como Usuario
  Quiero normalizar un credito
  Para que quede aprobado ese credito en tesoreria

  Escenario:Normalizacion de credito
    Dado que Daniela quiere hacer una normalizacion
    Cuando se normalice el credito del usuario identificado con 8677757
    Entonces el crédito debe pasar a cartera