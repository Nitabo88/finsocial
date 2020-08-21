# language: es

Característica:  Validación Soportes Nuevos
  Como asesor de finsonet
  quiero validar que la información de los soportes nuevos
  para evitar enviar data erronea.

  @SolicitudCredito
  Esquema del escenario: PDF Solicitud de Crédito Finsocial
    Dado que un asesor esta en el pdf de Solicitud Crédito Finsocial del crédito <numero credito>
    Cuando el asesor obtiene la información del pdf
    Entonces el asesor deberá ver que la información de Solicitud de Crédito corresponde a la de BD
    Ejemplos:
      | numero credito |
      | 103317         |
      | 104445         |
      | 105084         |
      | 105193         |
      | 104877         |
      | 105066         |
      | 104817         |
      | 105858         |
      | 105884         |
      | 106139         |
      | 106076         |
      | 106062         |
      | 106174         |
      | 105691         |

  @Actival
  Esquema del escenario: PDF Formulario conocimiento actival
    Dado que un asesor esta en el pdf de Formulario conocimiento actival del crédito <numero credito>
    Cuando el asesor obtiene la información del pdf
    Entonces el asesor deberá ver que la información del Formulario conocimiento actival corresponde a la de BD
    Ejemplos:
      | numero credito |
      | 103317         |
      | 104445         |
      | 105084         |
      | 105193         |
      | 104877         |
      | 105066         |
      | 104817         |
      | 105858         |
      | 105884         |
      | 106139         |
      | 106076         |
      | 106062         |
      | 106174         |
      | 105691         |


  @Cooperativa
  Esquema del escenario:  PDF Solicitud de Afiliación Cooperativa
    Dado que un asesor esta en el pdf de Solicitud de Afiliación Cooperativa del crédito <numero credito>
    Cuando el asesor obtiene la información del pdf
    Entonces el asesor deberá ver que la información de Solicitud de Afiliación Cooperativa corresponde a la de BD
    Ejemplos:
      | numero credito |
      | 103317         |
      | 104445         |
      | 105084         |
      | 105193         |
      | 104877         |
      | 105066         |
      | 104817         |
      | 105858         |
      | 105884         |
      | 106139         |
      | 106076         |
      | 106062         |
      | 106174         |
      | 105691         |

  @Costos
  Esquema del escenario:  PDF Boletín de Costos
    Dado que un asesor esta en el pdf de Boletín de Costos del crédito <numero credito>
    Cuando el asesor obtiene la información del pdf
    Entonces el asesor deberá ver que la información del Boletín de Costos corresponde a la de BD
    Ejemplos:
      | numero credito |
      | 103317         |
      | 104445         |
      | 105084         |
      | 105193         |
      | 104877         |
      | 105066         |
      | 104817         |
      | 105858         |
      | 105884         |
      | 106139         |
      | 106076         |
      | 106062         |
      | 106174         |
      | 105691         |

  @SeguroSura
  Esquema del escenario:  PDF Seguro de Vida Sura
    Dado que un asesor esta en el pdf de Seguro de Vida Sura del crédito <numero credito>
    Cuando el asesor obtiene la información del pdf
    Entonces el asesor deberá ver que la información del Formato Seguro de Vida Sura corresponde a la de BD
    Ejemplos:
      | numero credito |
      | 103317         |
      | 104445         |
      | 105084         |
      | 105193         |
      | 104877         |
      | 105066         |
      | 104817         |
      | 105858         |
      | 105884         |
      | 106139         |
      | 106076         |
      | 106062         |
      | 106174         |
      | 105691         |

  @SeguroVidaMundial
  Esquema del escenario:  PDF Seguro de Vida Mundial
    Dado que un asesor esta en el pdf de Seguro de Vida Mundial del crédito <numero credito>
    Cuando el asesor obtiene la información del pdf
    Entonces el asesor deberá ver que la información del Formato Seguro de Vida Mundial corresponde a la de BD
    Ejemplos:
      | numero credito |
      | 103317         |
      | 104445         |
      | 105084         |
      | 105193         |
      | 104877         |
      | 105066         |
      | 104817         |
      | 105858         |
      | 105884         |
      | 106139         |
      | 106076         |
      | 106062         |
      | 106174         |
      | 105691         |

  @PagareFinsocial
  Esquema del escenario: PDF Pagaré Finsocial
    Dado que un asesor esta en el pdf de Pagaré Finsocial del crédito <numero credito>
    Cuando el asesor obtiene la información del pdf
    Entonces el asesor deberá ver que la información del Pagaré Finsocial corresponde a la de BD
    Ejemplos:
      | numero credito |
      | 103317         |
      | 104445         |
      | 105084         |
      | 105193         |
      | 104877         |
      | 105066         |
      | 104817         |
      | 105858         |
      | 105884         |
      | 106139         |
      | 106076         |
      | 106062         |
      | 106174         |
      | 105691         |

  @PagareCoophumana
  Esquema del escenario: PDF Pagaré Coophumana
    Dado que un asesor esta en el pdf de Pagaré Coophumana del crédito <numero credito>
    Cuando el asesor obtiene la información del pdf
    Entonces el asesor deberá ver que la información del Pagaré Coophumana corresponde a la de BD
    Ejemplos:
      | numero credito |
      | 103317         |
      | 104445         |
      | 105084         |
      | 105193         |
      | 104877         |
      | 105066         |
      | 104817         |
      | 105858         |
      | 105884         |
      | 106139         |
      | 106076         |
      | 106062         |
      | 106174         |
      | 105691         |

  @DesafiliacionCoophumana
  Esquema del escenario: PDF Desafiliación Coophumana
    Dado que un asesor esta en el pdf de Desafiliación Coophumana del crédito <numero credito>
    Cuando el asesor obtiene la información del pdf
    Entonces el asesor deberá ver que la información de Desafiliación corresponde a la de BD
    Ejemplos:
      | numero credito |
      | 103317         |
      | 104445         |
      | 105084         |
      | 105193         |
      | 104877         |
      | 105066         |
      | 104817         |
      | 105858         |
      | 105884         |
      | 106139         |
      | 106076         |
      | 106062         |
      | 106174         |
      | 105691         |

  @DesafiliacionActival
  Esquema del escenario: PDF Desafiliación Actival
    Dado que un asesor esta en el pdf de Desafiliación Actival del crédito <numero credito>
    Cuando el asesor obtiene la información del pdf
    Entonces el asesor deberá ver que la información de Desafiliación corresponde a la de BD
    Ejemplos:
      | numero credito |
      | 103317         |
      | 104445         |
      | 105084         |
      | 105193         |
      | 104877         |
      | 105066         |
      | 104817         |
      | 105858         |
      | 105884         |
      | 106139         |
      | 106076         |
      | 106062         |
      | 106174         |
      | 105691         |
