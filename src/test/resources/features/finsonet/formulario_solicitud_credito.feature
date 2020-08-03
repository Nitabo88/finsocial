# language: es

Característica:Formulario de solicitud de credito finsonet
  Como asesor de finsonet
  Quiero gestionar el formulario solicitud de crédito de un cliente
  Para poder llenar los datos del formulario

  @Credihuy
  @FormularioCredihuy
  Escenario: Diligenciar formulario de solicitud de crédito crédihuy- BackEnd
    Dado que un asesor quiere llenar el formulario de solicitud de un crédihuy
    Cuando diligencia el formulario de crédihuy de un cliente por back end
    Entonces el debería visualizar el crédito en estado OK

  @Segundo
  @FormularioLibranza
  Escenario: Diligenciar formulario de solicitud de crédito - Cliente
    Dado que un asesor quiere llenar el formulario de solicitud de un crédito de libranza
    Cuando diligencia el formulario de un cliente en su totalidad
    Entonces el debería visualizar el crédito del cliente

  @Libranza
  @FormularioLibranza
  Escenario: Diligenciar formulario de solicitud de crédito libranza - BackEnd
    Dado que un asesor quiere llenar el formulario de solicitud de un crédito de libranza
    Cuando diligencia el formulario de un cliente por back end
    Entonces el debería visualizar el crédito en estado OK

