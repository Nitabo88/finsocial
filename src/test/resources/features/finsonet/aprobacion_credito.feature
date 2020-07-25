# language: es

Característica:  Aprobación Crédito
  Como asesor de Finsonet
  quiero tramitar la aprobación de un crédito
  para revisar que el proceso funcione correctamente

  @AprobacionCreditosFinsoamigos
  Escenario: Aprobación Finsoamigos Riesgo Estándar - Aprobar el crédito desde aprobación de créditos
    Dado que un asesor esta en el paso de aprobación de créditos finsoamigo de un cliente con perfil estándar
    Cuando el asesor diligencia la información del cliente con perfil 390 en aprobación de crédito
    Entonces el asesor deberá ver el crédito en el paso de tesorería en pendiente por firma

  @AprobacionCreditosFinsoamigos
  Esquema del escenario: Aprobación Finsoamigos Riesgo No Estandar - Aprobar el crédito desde aprobación de créditos
    Dado que un asesor esta en el paso de aprobación de créditos finsoamigo de un cliente con perfil <Tipo Perfil>
    Cuando el asesor diligencia la información del cliente con perfil <Perfil Riesgo> en aprobación de crédito
    Entonces el asesor deberá ver el crédito en el módulo créditos por confirmar

    Ejemplos:
      | Tipo Perfil | Perfil Riesgo |
      | 50%+IVA     | 391           |
      | 150%+IVA    | 392           |
      | 50%_fr      | 406           |
      | 150%_fr     | 407           |

  @AprobacionCreditosHuy
  Escenario: Aprobación Crédito Huy - Marcar el crédito como pendiente en aprobación de créditos
    Dado que un asesor quiere normalizar un crédito huy en aprobación de créditos
    Cuando el crédito se ponga en la lista de pendientes
    Entonces el podrá ver el crédito en pendiente por documentación

  @AprobacionCreditosHuy
  Escenario: Aprobación Crédito Huy - Aprobar el crédito desde aprobación de créditos
    Dado que un asesor quiere aprobar un crédito huy en aprobación de créditos
    Cuando el asesor diligencia la información de aprobación de crédito huy
    Entonces el podrá ver el crédito en incorporación huy

  @AprobacionCreditosHuy
  Escenario: Aprobación Crédito Huy - Marcar el crédito como pendiente en aprobación de créditos
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
  Escenario: Aprobación de Créditos - Marcar el crédito como pendiente en aprobación de créditos
    Dado que un asesor esta en el paso de aprobación de créditos
    Cuando el asesor pone el crédito como pendiente
    Entonces el asesor deberá ver el crédito en aprobación de créditos en la lista de pendientes

  @AprobacionCreditos
  Escenario: Aprobación de Créditos - Regresar el crédito desde aprobación de créditos
    Dado que un asesor esta en el paso de aprobación de créditos
    Cuando el asesor regresa el crédito a confirmación
    Entonces el asesor deberá ver el crédito en el paso de confirmación

  @AprobacionCreditos
  Escenario: Aprobación de Créditos - Negar el crédito desde aprobación de créditos
    Dado que un asesor esta en el paso de aprobación de créditos
    Cuando el asesor niegue el crédito de libranza
    Entonces el podrá ver el crédito en estado RECHAZADO