# language: es

Característica: Chequeo documento
  Como asesor de finsonet
  quiero tramitar el chequeo documentos de un credito
  para revisar que el proceso funcione correctamente

  @ChequeoDocumentos
  Escenario: Chequeo Documentos - Aprobación chequeo de documentos
    Dado que un asesor esta en el paso de chequeo de documentos de un crédito de libranza
    Cuando el asesor adjunta toda la información de el chequeo de documentos
    Entonces deberá ver el crédito en el paso de confirmación

  @ChequeoDocumentos
  Escenario: Chequeo Documentos - Chequeo de documentos estado pendiente
    Dado que un asesor esta en el paso de chequeo de documentos de un crédito de libranza
    Cuando el asesor decline el chequeo del crédito de libranza del cliente
    Entonces el auxiliar de documentación debería verlo en su lista de chequeo de documentos

  @ChequeoDocumentos
  Escenario: Chequeo Documentos - Aprobación chequeo documentos no exitosa
    Dado que un asesor esta en el paso de chequeo de documentos de un crédito de libranza
    Cuando el asesor complete el chequeo de crédito del cliente
    Entonces deberá ver el mensaje de adjuntar información

  @ChequeoDocumentosHuy
  Escenario: Chequeo Documentos Huy - Aprobación chequeo de documentos
    Dado que un asesor quiere aprobar un chequeo de documentos de un crédito huy
    Cuando ingrese toda la información del chequeo de documentos del crédito huy
    Entonces deberá ver el crédito en el paso de aprobación créditos Huy

  @ChequeoDocumentosHuy
  Escenario: Chequeo Documentos Huy - Chequeo de documentos estado pendiente
    Dado que un asesor quiere marcar como pendiente un chequeo de documentos de un crédito huy
    Cuando el asesor decline el chequeo del crédito huy del cliente
    Entonces el auxiliar de documentación debería verlo en su lista de chequeo de documentos

  @ChequeoDocumentosHuy
  Escenario: Chequeo Documentos Huy - Negacion chequeo documentos
    Dado que un asesor quiere negar un chequeo de documentos de un crédito huy
    Cuando el asesor niegue el chequeo de documentos del crédito huy
    Entonces el podrá ver el crédito en estado RECHAZADO

  @ChequeoDocumentosFinsoamigos
  Escenario: Chequeo Documentos Finsoamigos - Aprobación chequeo de documentos
    Dado que un asesor esta en el paso de chequeo de documentos finsoamigo
    Cuando el asesor adjunta toda la información de el chequeo de documentos finsoamigo
    Entonces el asesor deberá ver el crédito en el paso de aprobación créditos finsoamigos