# language: es

Característica:  Aprobación Crédito
  Como asesor de Finsonet
  quiero tramitar la aprobación de un crédito
  para revisar que el proceso funcione correctamente

  @Finsoamigo
    @AprobacionCreditosFinsoamigos
  Escenario: Aprobación Finsoamigos Riesgo Estándar - Aprobar el crédito desde aprobación de créditos
    Dado que un asesor esta en el paso de aprobación de créditos finsoamigo de un cliente con perfil estándar
    Cuando el asesor diligencia la información del cliente con perfil 418 en aprobación de crédito
    Entonces el asesor deberá ver el crédito en el paso de tesorería en pendiente por firma

  @Finsoamigo
    @AprobacionCreditosFinsoamigos
  Esquema del escenario: Aprobación Finsoamigos Riesgo No Estandar - Aprobar el crédito desde aprobación de créditos
    Dado que un asesor esta en el paso de aprobación de créditos finsoamigo de un cliente con perfil <Tipo Perfil>
    Cuando el asesor diligencia la información del cliente con perfil <Perfil Riesgo> en aprobación de crédito
    Entonces el asesor deberá ver el crédito en el módulo créditos por confirmar

    Ejemplos:
      | Tipo Perfil | Perfil Riesgo |
      | 50%+IVA     | 419           |
      | 150%+IVA    | 420           |
      | 50%_fr      | 423           |
      | 150%_fr     | 424           |

  @Credihuy
  @AprobacionCreditosHuy
  Escenario: Aprobación Crédito Huy - Marcar el crédito como pendiente en aprobación de créditos
    Dado que un asesor quiere normalizar un crédito huy en aprobación de créditos
    Cuando el crédito se ponga en la lista de pendientes
    Entonces el podrá ver el crédito en pendiente por documentación

  @Credihuy
  @AprobacionCreditosHuy
  Escenario: Aprobación Crédito Huy - Aprobar el crédito desde aprobación de créditos
    Dado que un asesor quiere aprobar un crédito huy en aprobación de créditos
    Cuando el asesor diligencia la información de aprobación de crédito huy
    Entonces el podrá ver el crédito en incorporación huy

  @Credihuy
  @AprobacionCreditosHuy
  Escenario: Aprobación Crédito Huy - Marcar el crédito como pendiente en aprobación de créditos
    Dado que un asesor quiere normalizar un crédito huy en aprobación de créditos
    Cuando el crédito se ponga en la lista de pendientes
    Entonces el podrá ver el crédito en pendiente por documentación

  @Credihuy
  @AprobacionCreditosHuy
  Escenario: Aprobacion Crédito Huy - Negar aprobación del crédito
    Dado que un asesor quiere negar un crédito huy en aprobación de créditos
    Cuando el asesor niegue el crédito Huy
    Entonces el podrá ver el crédito en estado RECHAZADO

  @Libranza
  @AprobacionCreditos
  Escenario: Aprobación de Créditos - Aprobar el crédito desde aprobación de créditos
    Dado que un asesor esta en el paso de aprobación de créditos
    Cuando el asesor aprueba el crédito de libranza
    Entonces el asesor deberá ver el crédito en el paso de incorporación

  @Libranza
  @AprobacionCreditos
  Escenario: Aprobación de Créditos - Marcar el crédito como pendiente en aprobación de créditos
    Dado que un asesor esta en el paso de aprobación de créditos
    Cuando el asesor pone el crédito como pendiente
    Entonces el asesor deberá ver el crédito en aprobación de créditos en la lista de pendientes

  @Libranza
  @AprobacionCreditos
  Escenario: Aprobación de Créditos - Regresar el crédito desde aprobación de créditos
    Dado que un asesor esta en el paso de aprobación de créditos
    Cuando el asesor regresa el crédito a confirmación
    Entonces el asesor deberá ver el crédito en el paso de confirmación

  @Libranza
  @AprobacionCreditos
  Escenario: Aprobación de Créditos - Negar el crédito desde aprobación de créditos
    Dado que un asesor esta en el paso de aprobación de créditos
    Cuando el asesor niegue el crédito de libranza
    Entonces el podrá ver el crédito en estado RECHAZADO