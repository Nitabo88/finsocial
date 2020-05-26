# language: es

Característica:  Aprobación Crédito
  Como asesor de finsonet
  quiero tramitar la aprobación de un crédito
  para revisar que el proceso funcione correctamente

  Escenario: Aprobación Finsoamigos Riesgo Estandar- Aprobar el crédito desde aprobación de créditos
    Dado que un asesor esta en el paso de aprobación de créditos finsoamigo de un cliente con perfil estándar
    Cuando el asesor diligencia la información del cliente con perfil FinsoAmigo_Estandar+IVA en aprobación de crédito
    Entonces el asesor deberá ver el crédito en el paso de tesorería en pendiente por firma

  @AprobacionCreditosFinsoamigos
  Esquema del escenario: Aprobación Finsoamigos Riesgo No Estandar- Aprobar el crédito desde aprobación de créditos
    Dado que un asesor esta en el paso de aprobación de créditos finsoamigo de un cliente con perfil <Tipo Perfil>
    Cuando el asesor diligencia la información del cliente con perfil <Perfil Riesgo> en aprobación de crédito
    Entonces el asesor deberá ver el crédito en el módulo creditos por confirmar

    Ejemplos:
      | Tipo Perfil | Perfil Riesgo       |
      | 50%+IVA     | FinsoAmigo_50%+IVA  |
      | 150%+IVA    | FinsoAmigo_150%+IVA |

  @AprobacionCreditosHuy
  Escenario: Aprobacion Crédito Huy - Aprobar el crédito desde aprobación de créditos
    Dado que un asesor quiere aprobar un crédito huy en aprobación de créditos
    Cuando el asesor diligencia la información de aprobación de crédito huy
    Entonces el podrá ver el crédito en incorporación huy

  @AprobacionCreditosHuy
  Escenario: Aprobacion Crédito Huy - Marcar el crédito como pendiente en aprobación de créditos
    Dado que un asesor quiere normalizar un crédito huy en aprobación de créditos
    Cuando el crédito se ponga en la lista de pendientes
    Entonces el podrá ver el crédito en pendiente por documentación

  @AprobacionCreditosHuy
  Escenario: Aprobacion Crédito Huy - Negar aprobación del crédito
    Dado que un asesor quiere negar un crédito huy en aprobación de créditos
    Cuando el asesor niegue el crédito Huy
    Entonces el podrá ver el crédito en estado RECHAZADO

  @AprobacionCreditos
  Escenario: Aprobación de Créditos - Aprobar el crédito desde aprobación de créditos
    Dado que un asesor esta en el paso de aprobación de créditos
    Cuando el asesor aprueba el crédito de libranza
    Entonces el asesor deberá ver el crédito en el paso de incorporación

  @AprobacionCreditos
  Escenario: Aprobacion de Creditos - Marcar el crédito como pendiente en aprobación de créditos
    Dado que un asesor esta en el paso de aprobación de créditos
    Cuando el asesor pone el crédito como pendiente
    Entonces el asesor deberá ver el crédito en aprobación de créditos en la lista de pendientes

  @AprobacionCreditos
  Escenario: Aprobacion de Creditos - Regresar el crédito desde aprobación de créditos
    Dado que un asesor esta en el paso de aprobación de créditos
    Cuando el asesor regresa el crédito a confirmación
    Entonces el asesor deberá ver el crédito en el paso de confirmación

  @AprobacionCreditos
  Escenario: Aprobacion de Creditos - Negar el crédito desde aprobación de créditos
    Dado que un asesor esta en el paso de aprobación de créditos
    Cuando el asesor niegue el crédito de libranza
    Entonces el podrá ver el crédito en estado RECHAZADO