# language: es

Característica: realizar gestion de llamada
  Como asesor de finsonet
  Quiero ingresar a la pagina de finsonet
  Para confirmar la llamada de un nuevo credito para un cliente

  Escenario: asignar una llamada para nuevo credito
    Dado que un asesor quiere asignar una llamada para el credito
    Cuando el ingresa el numero del credito 84688 realiza el proceso de asignacion
    Entonces el credito quedara asignado al asesor

  Escenario: confirmar una llamada para un nuevo credito
    Dado que un asesor quiere confirmar una llamada para el credito
    Cuando el ingresa el numero del credito 84688 realiza el proceso de gestion
    Entonces el podra ver un credito creado