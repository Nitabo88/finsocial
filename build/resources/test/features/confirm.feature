# language: es

Característica: confirmacion de credito
  Como Usuario
  Quiero confirmar un credito
  Para que quede aprobado ese credito en confirmacion

Escenario:
    Dado que Daniela quiere hacer una Confirmación
    Cuando se confirme el credito del usuario identificado con 51821772
    Entonces Daniela deberia ver "CRÉDITO CONFIRMADO" en la pagina

  