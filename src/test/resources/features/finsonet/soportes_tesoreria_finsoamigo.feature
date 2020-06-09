# language: es

Característica:  Validacion Soportes Nuevos
  Como asesor de finsonet
  quiero validar que la informacion de los soportes nuevos
  para evitar enviar data erronea.

  Esquema del escenario:  PDF Seguro de Vida Sura
    Dado que un asesor esta en el pdf de Seguro de Vida Sura del crédito <numero credito>
    Cuando el asesor obtiene la información del pdf
    Entonces el asesor deberá ver que la información del Formato Seguro de Vida Sura corresponde a la de BD

    Ejemplos:
      | numero credito |
      | 98594          |
      | 99420          |
      | 99718          |
      | 100530         |
      | 100539         |
      | 100561         |
      | 100555         |


  Esquema del escenario: PDF Solicitud de Crédito Finsocial
    Dado que un asesor esta en el pdf de Solicitud Crédito Finsocial del crédito <numero credito>
    Cuando el asesor obtiene la información del pdf
    Entonces el asesor deberá ver que la información de Solicitud de Crédito corresponde a la de BD

    Ejemplos:
      | numero credito |
      | 98594          |
      | 99420          |
      | 99718          |
      | 100530         |
      | 100539         |
      | 100561         |
      | 100555         |


  Esquema del escenario:  PDF Seguro de Vida Mundial
    Dado que un asesor esta en el pdf de Seguro de Vida Mundial del crédito <numero credito>
    Cuando el asesor obtiene la información del pdf
    Entonces el asesor deberá ver que la información del Formato Seguro de Vida Mundial corresponde a la de BD

    Ejemplos:
      | numero credito |
      | 98594          |
      | 99420          |
      | 99718          |
      | 100530         |
      | 100539         |
      | 100561         |
      | 100555         |





