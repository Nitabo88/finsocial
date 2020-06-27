# language: es

Característica:Formulario de solicitud de credito finsonet
  Como asesor de finsonet
  Quiero gestionar el formulario solicitud de crédito de un cliente
  Para poder llenar los datos del formulario

  Escenario: Diligenciar formulario de solicitud de crédito - BackEnd
    Dado que un asesor quiere llenar el formulario de solicitud de crédito
    Cuando diligencia el formulario de un cliente por back end
    Entonces el debería visualizar el crédito en estado OK

  Escenario: Diligenciar formulario de solicitud de crédito - Cliente
    Dado que un asesor quiere llenar el formulario de solicitud de crédito
    Cuando diligencia el formulario de un cliente en su totalidad
    Entonces el debería visualizar el crédito del cliente