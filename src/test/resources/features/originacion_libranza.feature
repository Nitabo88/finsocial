# language: es

Característica: Originacion
  Como asesor finsonet
  Quiero tramitar un credito
  Para revisar el proceso de originacion

  @Confirmacion
  Escenario: Confirmacion - Aprobacion del paso de confirmacion de un credito
    Dado que un asesor esta en el paso de confirmacion
    Cuando el asesor apruebe el paso de confirmacion
    Entonces el asesor deberia ver el crédito en el paso de aprobacion de creditos

  @Confirmacion
  Escenario: Confirmacion - Regresar el credito desde el paso de confirmacion
    Dado que un asesor esta en el paso de confirmacion
    Cuando el asesor regresa el credito a chequeo de documentos
    Entonces el asesor debera ver el credito en el paso de chequeo de documentos

  @Confirmacion
  Escenario:  Confirmacion - Marcar como pendiente el credito en el paso de confirmacion
    Dado que un asesor esta en el paso de confirmacion
    Cuando el asesor marque como pendiente el paso de confirmacion
    Entonces el asesor deberia ver el crédito en confirmacion de creditos en la lista de pendientes

  @Incorporacion
  Escenario: Incorporacion - Aprobar el credito desde incorporacion
    Dado que un asesor esta en el paso de incorporacion
    Cuando el asesor aprueba el credito en incorporacion
    Entonces el asesor debera ver el credito en el paso de formalizacion

  @Incorporacion
  Escenario: Incorporacion - Marcar el credito como pendiente en incorporacion
    Dado que un asesor esta en el paso de incorporacion
    Cuando el asesor pone el credito como pendiente en incorporacion
    Entonces el asesor debera ver el credito en incorporacion en la lista de pendientes

  @Incorporacion
  Escenario: Incorporacion - Regresar el credito desde incorporacion
    Dado que un asesor esta en el paso de incorporacion
    Cuando el asesor regresa el credito a aprobacion de creditos
    Entonces el asesor debera ver el credito en el paso de aprobacion de creditos

  @Formalizacion
  Escenario: Formalización - Aprobar el crédito desde formalización
    Dado que un asesor esta en el paso de formalización
    Cuando el asesor aprueba el crédito en formalización
    Entonces el asesor deberá ver el crédito en el paso de tesoreria

  @Formalizacion
  Escenario: Formalización - Regresar el crédito desde formalización
    Dado que un asesor esta en el paso de formalización
    Cuando el asesor regresa el crédito desde formalización
    Entonces el asesor deberá ver el crédito en el paso de incorporación

  @Formalizacion
  Escenario: Formalización - Marcar el crédito como pendiente en formalización
    Dado que un asesor esta en el paso de formalización
    Cuando el asesor pone el crédito como pendiente en formalización
    Entonces el asesor deberá ver el crédito en formalización en la lista de pendientes

  @Tesoreria
  Escenario: Tesoreria - Regresar el credito desde tesoreria
    Dado que un asesor esta en el paso de tesoreria
    Cuando el asesor regresa el credito desde tesoreria
    Entonces el asesor debera ver el credito en el paso de formalizacion

  @Tesoreria
  Escenario: Tesoreria - Marcar el credito como pendiente en tesoreria
    Dado que un asesor esta en el paso de tesoreria
    Cuando el asesor pone el credito como pendiente en tesoreria
    Entonces el asesor debera ver el credito en tesoreria en la lista de pendientes