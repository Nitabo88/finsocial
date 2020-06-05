# language: es

Característica:  Validacion Soportes Nuevos
  Como asesor de finsonet
  quiero validar que la informacion de los soportes nuevos
  para evitar enviar data erronea.

  Antecedentes: El usuario debe estar en un crédito finsoamigo en tesoreria.
    Dado que un asesor esta en el paso de tesorería finsoamigos en un crédito

  Escenario: PDF Solicitud de Crédito Finsocial
    Cuando el asesor obtiene la información del pdf de Solicitud de Crédito
    Entonces el asesor deberá ver que la información de Solicitud de Crédito corresponde a la de BD

 # Escenario: PDF Seguro de Vida Mundial
 #   Cuando el asesor obtiene la información del pdf de Formato Seguro de Vida Mundial
 #   Entonces el asesor deberá ver que la información del Formato Seguro de Vida Mundial corresponde a la de BD





