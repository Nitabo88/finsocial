# language: es

Característica:  Validación Soportes Nuevos
  Como asesor de finsonet
  quiero validar que la información de los soportes nuevos
  para evitar enviar data erronea.

  @Actival
  Esquema del escenario: PDF Formulario conocimiento actival
    Dado que un asesor esta en el pdf de Formulario conocimiento actival del crédito <numero credito>
    Cuando el asesor obtiene la información del pdf
    Entonces el asesor deberá ver que la información del Formulario conocimiento actival corresponde a la de BD

    Ejemplos:
      | numero credito |
      | 100205         |
      | 102019         |
      | 99039          |
      | 103317         |
      | 103382         |
      | 103630         |
      | 103582         |
      | 103708         |
      | 103805         |
      | 103821         |
      | 103809         |
      | 103867         |
      | 104007         |
      | 103447         |
      | 103883         |
      | 103999         |
      | 104095         |
      | 104151         |
      | 103918         |
      | 103934         |
      | 103989         |
      | 104125         |
      | 104115         |
      | 104248         |
      | 104259         |
      | 104298         |
      | 104258         |
      | 104302         |
      | 104123         |
      | 104279         |
      | 104199         |
      | 104339         |
      | 104254         |
      | 104218         |
      | 104268         |
      | 104409         |
      | 104385         |
      | 104272         |
      | 104376         |
      | 104466         |
      | 104468         |
      | 104240         |
      | 104450         |
      | 104467         |
      | 104191         |
      | 104492         |
      | 104304         |
      | 103694         |
      | 104511         |
      | 104506         |
      | 102769         |
      | 104519         |
      | 104503         |
      | 104480         |
      | 102725         |
      | 104446         |
      | 104536         |
      | 104532         |
      | 104461         |
      | 104477         |
      | 104530         |
      | 104542         |
      | 104527         |
      | 104354         |
      | 104483         |
      | 104541         |
      | 104540         |
      | 104543         |
      | 104448         |
      | 103799         |
      | 104118         |
      | 103906         |
      | 104189         |
      | 104365         |
      | 104296         |
      | 104346         |
      | 104284         |
      | 104397         |
      | 104252         |

  @Cooperativa
  Esquema del escenario:  PDF Solicitud de Afiliación Cooperativa
    Dado que un asesor esta en el pdf de Solicitud de Afiliación Cooperativa del crédito <numero credito>
    Cuando el asesor obtiene la información del pdf
    Entonces el asesor deberá ver que la información de Solicitud de Afiliación Cooperativa corresponde a la de BD

    Ejemplos:
      | numero credito |
      | 100205         |
      | 102019         |
      | 99039          |
      | 103317         |
      | 103382         |
      | 103630         |
      | 103582         |
      | 103708         |
      | 103805         |
      | 103821         |
      | 103809         |
      | 103867         |
      | 104007         |
      | 103447         |
      | 103883         |
      | 103999         |
      | 104095         |
      | 104151         |
      | 103918         |
      | 103934         |
      | 103989         |
      | 104125         |
      | 104115         |
      | 104248         |
      | 104259         |
      | 104298         |
      | 104258         |
      | 104302         |
      | 104123         |
      | 104279         |
      | 104199         |
      | 104339         |
      | 104254         |
      | 104218         |
      | 104268         |
      | 104409         |
      | 104385         |
      | 104272         |
      | 104376         |
      | 104466         |
      | 104468         |
      | 104240         |
      | 104450         |
      | 104467         |
      | 104191         |
      | 104492         |
      | 104304         |
      | 103694         |
      | 104511         |
      | 104506         |
      | 102769         |
      | 104519         |
      | 104503         |
      | 104480         |
      | 102725         |
      | 104446         |
      | 104536         |
      | 104532         |
      | 104461         |
      | 104477         |
      | 104530         |
      | 104542         |
      | 104527         |
      | 104354         |
      | 104483         |
      | 104541         |
      | 104540         |
      | 104543         |
      | 104448         |
      | 103799         |
      | 104118         |
      | 103906         |
      | 104189         |
      | 104365         |
      | 104296         |
      | 104346         |
      | 104284         |
      | 104397         |
      | 104252         |

  @Costos
  Esquema del escenario:  PDF Boletín de Costos
    Dado que un asesor esta en el pdf de Boletín de Costos del crédito <numero credito>
    Cuando el asesor obtiene la información del pdf
    Entonces el asesor deberá ver que la información del Boletín de Costos corresponde a la de BD

    Ejemplos:
      | numero credito |
      | 100205         |
      | 102019         |
      | 99039          |
      | 103317         |
      | 103382         |
      | 103630         |
      | 103582         |
      | 103708         |
      | 103805         |
      | 103821         |
      | 103809         |
      | 103867         |
      | 104007         |
      | 103447         |
      | 103883         |
      | 103999         |
      | 104095         |
      | 104151         |
      | 103918         |
      | 103934         |
      | 103989         |
      | 104125         |
      | 104115         |
      | 104248         |
      | 104259         |
      | 104298         |
      | 104258         |
      | 104302         |
      | 104123         |
      | 104279         |
      | 104199         |
      | 104339         |
      | 104254         |
      | 104218         |
      | 104268         |
      | 104409         |
      | 104385         |
      | 104272         |
      | 104376         |
      | 104466         |
      | 104468         |
      | 104240         |
      | 104450         |
      | 104467         |
      | 104191         |
      | 104492         |
      | 104304         |
      | 103694         |
      | 104511         |
      | 104506         |
      | 102769         |
      | 104519         |
      | 104503         |
      | 104480         |
      | 102725         |
      | 104446         |
      | 104536         |
      | 104532         |
      | 104461         |
      | 104477         |
      | 104530         |
      | 104542         |
      | 104527         |
      | 104354         |
      | 104483         |
      | 104541         |
      | 104540         |
      | 104543         |
      | 104448         |
      | 103799         |
      | 104118         |
      | 103906         |
      | 104189         |
      | 104365         |
      | 104296         |
      | 104346         |
      | 104284         |
      | 104397         |
      | 104252         |

  @SeguroSura
  Esquema del escenario:  PDF Seguro de Vida Sura
    Dado que un asesor esta en el pdf de Seguro de Vida Sura del crédito <numero credito>
    Cuando el asesor obtiene la información del pdf
    Entonces el asesor deberá ver que la información del Formato Seguro de Vida Sura corresponde a la de BD

    Ejemplos:
      | numero credito |
      | 100205         |
      | 102019         |
      | 99039          |
      | 103317         |
      | 103382         |
      | 103630         |
      | 103582         |
      | 103708         |
      | 103805         |
      | 103821         |
      | 103809         |
      | 103867         |
      | 104007         |
      | 103447         |
      | 103883         |
      | 103999         |
      | 104095         |
      | 104151         |
      | 103918         |
      | 103934         |
      | 103989         |
      | 104125         |
      | 104115         |
      | 104248         |
      | 104259         |
      | 104298         |
      | 104258         |
      | 104302         |
      | 104123         |
      | 104279         |
      | 104199         |
      | 104339         |
      | 104254         |
      | 104218         |
      | 104268         |
      | 104409         |
      | 104385         |
      | 104272         |
      | 104376         |
      | 104466         |
      | 104468         |
      | 104240         |
      | 104450         |
      | 104467         |
      | 104191         |
      | 104492         |
      | 104304         |
      | 103694         |
      | 104511         |
      | 104506         |
      | 102769         |
      | 104519         |
      | 104503         |
      | 104480         |
      | 102725         |
      | 104446         |
      | 104536         |
      | 104532         |
      | 104461         |
      | 104477         |
      | 104530         |
      | 104542         |
      | 104527         |
      | 104354         |
      | 104483         |
      | 104541         |
      | 104540         |
      | 104543         |
      | 104448         |
      | 103799         |
      | 104118         |
      | 103906         |
      | 104189         |
      | 104365         |
      | 104296         |
      | 104346         |
      | 104284         |
      | 104397         |
      | 104252         |

  @SolicitudCredito
  Esquema del escenario: PDF Solicitud de Crédito Finsocial
    Dado que un asesor esta en el pdf de Solicitud Crédito Finsocial del crédito <numero credito>
    Cuando el asesor obtiene la información del pdf
    Entonces el asesor deberá ver que la información de Solicitud de Crédito corresponde a la de BD

    Ejemplos:
      | numero credito |
      | 100205         |
      | 102019         |
      | 99039          |
      | 103317         |
      | 103382         |
      | 103630         |
      | 103582         |
      | 103708         |
      | 103805         |
      | 103821         |
      | 103809         |
      | 103867         |
      | 104007         |
      | 103447         |
      | 103883         |
      | 103999         |
      | 104095         |
      | 104151         |
      | 103918         |
      | 103934         |
      | 103989         |
      | 104125         |
      | 104115         |
      | 104248         |
      | 104259         |
      | 104298         |
      | 104258         |
      | 104302         |
      | 104123         |
      | 104279         |
      | 104199         |
      | 104339         |
      | 104254         |
      | 104218         |
      | 104268         |
      | 104409         |
      | 104385         |
      | 104272         |
      | 104376         |
      | 104466         |
      | 104468         |
      | 104240         |
      | 104450         |
      | 104467         |
      | 104191         |
      | 104492         |
      | 104304         |
      | 103694         |
      | 104511         |
      | 104506         |
      | 102769         |
      | 104519         |
      | 104503         |
      | 104480         |
      | 102725         |
      | 104446         |
      | 104536         |
      | 104532         |
      | 104461         |
      | 104477         |
      | 104530         |
      | 104542         |
      | 104527         |
      | 104354         |
      | 104483         |
      | 104541         |
      | 104540         |
      | 104543         |
      | 104448         |
      | 103799         |
      | 104118         |
      | 103906         |
      | 104189         |
      | 104365         |
      | 104296         |
      | 104346         |
      | 104284         |
      | 104397         |
      | 104252         |

  @SeguroVidaMundial
  Esquema del escenario:  PDF Seguro de Vida Mundial
    Dado que un asesor esta en el pdf de Seguro de Vida Mundial del crédito <numero credito>
    Cuando el asesor obtiene la información del pdf
    Entonces el asesor deberá ver que la información del Formato Seguro de Vida Mundial corresponde a la de BD

    Ejemplos:
      | numero credito |
      | 100205         |
      | 102019         |
      | 99039          |
      | 103317         |
      | 103382         |
      | 103630         |
      | 103582         |
      | 103708         |
      | 103805         |
      | 103821         |
      | 103809         |
      | 103867         |
      | 104007         |
      | 103447         |
      | 103883         |
      | 103999         |
      | 104095         |
      | 104151         |
      | 103918         |
      | 103934         |
      | 103989         |
      | 104125         |
      | 104115         |
      | 104248         |
      | 104259         |
      | 104298         |
      | 104258         |
      | 104302         |
      | 104123         |
      | 104279         |
      | 104199         |
      | 104339         |
      | 104254         |
      | 104218         |
      | 104268         |
      | 104409         |
      | 104385         |
      | 104272         |
      | 104376         |
      | 104466         |
      | 104468         |
      | 104240         |
      | 104450         |
      | 104467         |
      | 104191         |
      | 104492         |
      | 104304         |
      | 103694         |
      | 104511         |
      | 104506         |
      | 102769         |
      | 104519         |
      | 104503         |
      | 104480         |
      | 102725         |
      | 104446         |
      | 104536         |
      | 104532         |
      | 104461         |
      | 104477         |
      | 104530         |
      | 104542         |
      | 104527         |
      | 104354         |
      | 104483         |
      | 104541         |
      | 104540         |
      | 104543         |
      | 104448         |
      | 103799         |
      | 104118         |
      | 103906         |
      | 104189         |
      | 104365         |
      | 104296         |
      | 104346         |
      | 104284         |
      | 104397         |
      | 104252         |

  @PagareFinsocial
  Esquema del escenario: PDF Pagaré Finsocial
    Dado que un asesor esta en el pdf de Pagaré Finsocial del crédito <numero credito>
    Cuando el asesor obtiene la información del pdf
    Entonces el asesor deberá ver que la información del Pagaré Finsocial corresponde a la de BD

    Ejemplos:
      | numero credito |
      | 100205         |
      | 102019         |
      | 99039          |
      | 103317         |
      | 103382         |
      | 103630         |
      | 103582         |
      | 103708         |
      | 103805         |
      | 103821         |
      | 103809         |
      | 103867         |
      | 104007         |
      | 103447         |
      | 103883         |
      | 103999         |
      | 104095         |
      | 104151         |
      | 103918         |
      | 103934         |
      | 103989         |
      | 104125         |
      | 104115         |
      | 104248         |
      | 104259         |
      | 104298         |
      | 104258         |
      | 104302         |
      | 104123         |
      | 104279         |
      | 104199         |
      | 104339         |
      | 104254         |
      | 104218         |
      | 104268         |
      | 104409         |
      | 104385         |
      | 104272         |
      | 104376         |
      | 104466         |
      | 104468         |
      | 104240         |
      | 104450         |
      | 104467         |
      | 104191         |
      | 104492         |
      | 104304         |
      | 103694         |
      | 104511         |
      | 104506         |
      | 102769         |
      | 104519         |
      | 104503         |
      | 104480         |
      | 102725         |
      | 104446         |
      | 104536         |
      | 104532         |
      | 104461         |
      | 104477         |
      | 104530         |
      | 104542         |
      | 104527         |
      | 104354         |
      | 104483         |
      | 104541         |
      | 104540         |
      | 104543         |
      | 104448         |
      | 103799         |
      | 104118         |
      | 103906         |
      | 104189         |
      | 104365         |
      | 104296         |
      | 104346         |
      | 104284         |
      | 104397         |
      | 104252         |

  @PagareCoophumana
  Esquema del escenario: PDF Pagaré Coophumana
    Dado que un asesor esta en el pdf de Pagaré Coophumana del crédito <numero credito>
    Cuando el asesor obtiene la información del pdf
    Entonces el asesor deberá ver que la información del Pagaré Coophumana corresponde a la de BD

    Ejemplos:
      | numero credito |
      | 100205         |
      | 102019         |
      | 99039          |
      | 103317         |
      | 103382         |
      | 103630         |
      | 103582         |
      | 103708         |
      | 103805         |
      | 103821         |
      | 103809         |
      | 103867         |
      | 104007         |
      | 103447         |
      | 103883         |
      | 103999         |
      | 104095         |
      | 104151         |
      | 103918         |
      | 103934         |
      | 103989         |
      | 104125         |
      | 104115         |
      | 104248         |
      | 104259         |
      | 104298         |
      | 104258         |
      | 104302         |
      | 104123         |
      | 104279         |
      | 104199         |
      | 104339         |
      | 104254         |
      | 104218         |
      | 104268         |
      | 104409         |
      | 104385         |
      | 104272         |
      | 104376         |
      | 104466         |
      | 104468         |
      | 104240         |
      | 104450         |
      | 104467         |
      | 104191         |
      | 104492         |
      | 104304         |
      | 103694         |
      | 104511         |
      | 104506         |
      | 102769         |
      | 104519         |
      | 104503         |
      | 104480         |
      | 102725         |
      | 104446         |
      | 104536         |
      | 104532         |
      | 104461         |
      | 104477         |
      | 104530         |
      | 104542         |
      | 104527         |
      | 104354         |
      | 104483         |
      | 104541         |
      | 104540         |
      | 104543         |
      | 104448         |
      | 103799         |
      | 104118         |
      | 103906         |
      | 104189         |
      | 104365         |
      | 104296         |
      | 104346         |
      | 104284         |
      | 104397         |
      | 104252         |

  @DesafiliacionCoophumana
  Esquema del escenario: PDF Desafiliación Coophumana
    Dado que un asesor esta en el pdf de Desafiliación Coophumana del crédito <numero credito>
    Cuando el asesor obtiene la información del pdf
    Entonces el asesor deberá ver que la información de Desafiliación Coophumana corresponde a la de BD

    Ejemplos:
      | numero credito |
      | 100205         |
      | 102019         |
      | 99039          |
      | 103317         |
      | 103382         |
      | 103630         |
      | 103582         |
      | 103708         |
      | 103805         |
      | 103821         |
      | 103809         |
      | 103867         |
      | 104007         |
      | 103447         |
      | 103883         |
      | 103999         |
      | 104095         |
      | 104151         |
      | 103918         |
      | 103934         |
      | 103989         |
      | 104125         |
      | 104115         |
      | 104248         |
      | 104259         |
      | 104298         |
      | 104258         |
      | 104302         |
      | 104123         |
      | 104279         |
      | 104199         |
      | 104339         |
      | 104254         |
      | 104218         |
      | 104268         |
      | 104409         |
      | 104385         |
      | 104272         |
      | 104376         |
      | 104466         |
      | 104468         |
      | 104240         |
      | 104450         |
      | 104467         |
      | 104191         |
      | 104492         |
      | 104304         |
      | 103694         |
      | 104511         |
      | 104506         |
      | 102769         |
      | 104519         |
      | 104503         |
      | 104480         |
      | 102725         |
      | 104446         |
      | 104536         |
      | 104532         |
      | 104461         |
      | 104477         |
      | 104530         |
      | 104542         |
      | 104527         |
      | 104354         |
      | 104483         |
      | 104541         |
      | 104540         |
      | 104543         |
      | 104448         |
      | 103799         |
      | 104118         |
      | 103906         |
      | 104189         |
      | 104365         |
      | 104296         |
      | 104346         |
      | 104284         |
      | 104397         |
      | 104252         |


  @DesafiliacionActival
  Esquema del escenario: PDF Desafiliación Actival
    Dado que un asesor esta en el pdf de Desafiliación Actival del crédito <numero credito>
    Cuando el asesor obtiene la información del pdf
    Entonces el asesor deberá ver que la información de Desafiliación Actival corresponde a la de BD

    Ejemplos:
      | numero credito |
      | 100205         |
      | 102019         |
      | 99039          |
      | 103317         |
      | 103382         |
      | 103630         |
      | 103582         |
      | 103708         |
      | 103805         |
      | 103821         |
      | 103809         |
      | 103867         |
      | 104007         |
      | 103447         |
      | 103883         |
      | 103999         |
      | 104095         |
      | 104151         |
      | 103918         |
      | 103934         |
      | 103989         |
      | 104125         |
      | 104115         |
      | 104248         |
      | 104259         |
      | 104298         |
      | 104258         |
      | 104302         |
      | 104123         |
      | 104279         |
      | 104199         |
      | 104339         |
      | 104254         |
      | 104218         |
      | 104268         |
      | 104409         |
      | 104385         |
      | 104272         |
      | 104376         |
      | 104466         |
      | 104468         |
      | 104240         |
      | 104450         |
      | 104467         |
      | 104191         |
      | 104492         |
      | 104304         |
      | 103694         |
      | 104511         |
      | 104506         |
      | 102769         |
      | 104519         |
      | 104503         |
      | 104480         |
      | 102725         |
      | 104446         |
      | 104536         |
      | 104532         |
      | 104461         |
      | 104477         |
      | 104530         |
      | 104542         |
      | 104527         |
      | 104354         |
      | 104483         |
      | 104541         |
      | 104540         |
      | 104543         |
      | 104448         |
      | 103799         |
      | 104118         |
      | 103906         |
      | 104189         |
      | 104365         |
      | 104296         |
      | 104346         |
      | 104284         |
      | 104397         |
      | 104252         |