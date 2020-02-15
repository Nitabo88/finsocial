# language: es

   Caracteristica verificacion de estado en un credito nuevo
    Como asesor de finsonet
    Quiero asignar estado de pendiente, regresar y normalizar acorde a la documentacion
    Para los creditos de un cliente

      Escenario: marcar credito en estado pendiente
        Dado que un asesor quiere marcar pendiente un credito
        Cuando seleccione la accion  pendiente
        Entonces el podra marcar las novedades disponible de la documentacion

      Escenario: regresar credito por falta de documentacion
        Dado que un asesor quiere regresar un credito
        Cuando seleccione la accion de regresar
        Entonces el podra agregar una observacion en el credito

      Escenario:  normalizar credito huy
        Dado que un asesor quiere normalizar un credito
        Cuando seleccione la accion normalizar
        Entonces el podra enviar el credito hacia aprobacion huy
