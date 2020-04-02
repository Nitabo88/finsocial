# language: es

Característica: Originación - Finsoamigo
  Como asesor finsonet
  Quiero tramitar un credito tipo finsoamigo
  Para revisar el proceso de originación

  @ChequeoDocumentosFinsoamigos
  Escenario: Chequeo Documentos Finsoamigos - Aprobación chequeo de documentos
    Dado que un asesor esta en el paso de chequeo de documentos finsoamigo
    Cuando el asesor adjunta toda la información de el chequeo de documentos finsoamigo
    Entonces el asesor deberá ver el crédito en el paso de aprobación créditos finsoamigos

  @AprobacionCreditosFinsoamigos
  Escenario: Aprobación Finsoamigos - Aprobación chequeo de documentos
    Dado que un asesor esta en el paso de aprobación de créditos finsoamigo
    Cuando el asesor diligencia la información de aprobación de crédito finsoamigo
    Entonces deberá ver el crédito en el paso de tesorería de finsoamigos

