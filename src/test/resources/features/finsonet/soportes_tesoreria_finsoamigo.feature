# language: es

Característica:  Validacion Soportes Nuevos
  Como asesor de finsonet
  quiero validar que la informacion de los soportes nuevos
  para evitar enviar data erronea.

  Antecedentes: El usuario debe estar en un crédito finsoamigo en tesoreria.
    Dado que un asesor esta en el paso de tesorería finsoamigos en un crédito

    Escenario: Soporte Seguro de Vida Mundial
      Cuando el asesor obtiene la información del pdf de Seguro de Vida Mundial
      Entonces el asesor deberá ver que la información corresponde a la de BD

