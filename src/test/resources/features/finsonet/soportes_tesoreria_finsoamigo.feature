# language: es

Característica:  Validacion Soportes Nuevos
  Como asesor de finsonet
  quiero validar que la informacion de los soportes nuevos
  para evitar enviar data erronea.

  Esquema del escenario: PDF Solicitud de Crédito Finsocial
    Dado que un asesor esta en el pdf de Solicitud Crédito Finsocial del crédito <numero credito>
    Cuando el asesor obtiene la información del pdf
    Entonces el asesor deberá ver que la información de Solicitud de Crédito corresponde a la de BD

    Ejemplos:
      | numero credito |
      | 94957          |
      | 95503          |
      | 95638          |
      | 95780          |
      | 98412          |
      | 98438          |
      | 98552          |
      | 98594          |
      | 98846          |
      | 98932          |
      | 98962          |
      | 99213          |
      | 99258          |
      | 99420          |
      | 99441          |
      | 99489          |
      | 99556          |
      | 99666          |
      | 99718          |
      | 99836          |
      | 99852          |
      | 100049         |
      | 100141         |
      | 100169         |
      | 100205         |
      | 100226         |
      | 100241         |
      | 100284         |
      | 100322         |
      | 100399         |
      | 100417         |
      | 100430         |
      | 100431         |
      | 100493         |
      | 100502         |
      | 100503         |
      | 100506         |
      | 100517         |
      | 100518         |
      | 100520         |
      | 100521         |
      | 100530         |
      | 100533         |
      | 100534         |
      | 100539         |
      | 100546         |
      | 100548         |
      | 100549         |
      | 100552         |
      | 100553         |
      | 100555         |
      | 100560         |
      | 100561         |
      | 100567         |
      | 100568         |
      | 100578         |
      | 100583         |
      | 100585         |
      | 100589         |
      | 100592         |
      | 100593         |
      | 100598         |
      | 100600         |
      | 100601         |
      | 100602         |
      | 100604         |
      | 100605         |
      | 100606         |
      | 100609         |
      | 100611         |
      | 100627         |
      | 100628         |
      | 100630         |
      | 100632         |
      | 100634         |
      | 100639         |
      | 100643         |
      | 100648         |
      | 100670         |
      | 100678         |
      | 100683         |
      | 100689         |
      | 100690         |
      | 100691         |
      | 100697         |
    
  Esquema del escenario:  PDF Seguro de Vida Mundial
    Dado que un asesor esta en el pdf de Seguro de Vida Mundial del crédito <numero credito>
    Cuando el asesor obtiene la información del pdf
    Entonces el asesor deberá ver que la información del Formato Seguro de Vida Mundial corresponde a la de BD

    Ejemplos:
      | numero credito |
      | 98594          |
      | 99420          |
      | 100539         |





