#language: es

Característica: Cdas
  Como asesor de finsonet
  Quiero diligenciar los cdas del cliente
  Para verificar que queden en el estado correcto

  @CdaLibranza
  Escenario: Cdas - Incompleto
    Dado que un asesor esta en el modulo de CDAS
    Cuando el asesor diligencia los CDAS del credito como completos
    Entonces el podra ver el credito en estado INCOMPLETO

  @CdaLibranza
  Escenario: Cdas - Completo
    Dado que un asesor esta en el modulo de CDAS con la informacion previa completa
    Cuando el asesor diligencia los CDAS del credito como completos
    Entonces el podra ver el credito en estado COMPLETO

  @CdaLibranza
  Escenario: Cdas - Excepcion
    Dado que un asesor esta en el modulo de CDAS con la informacion previa completa
    Cuando el asesor diligencia los CDAS del credito con excepcion
    Entonces el podra ver el credito en estado COMPLETO