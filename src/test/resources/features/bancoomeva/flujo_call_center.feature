# language: es

Característica: Flujo call center Banca Express
  Como colaborador de Bancoomeva
  Quiero gestionar un crédito por call center de Banca Express
  Para poder ayudar a mis clientes

  Escenario: Flujo de call center- Cliente Aprobado - Valores Mínimos - Pagares creados - Cuenta creada
    Dado que un asesor quiere acceder a un crédito por el call center
    Cuando el asesor del call center diligencia el crédito aprobado de libranza con el valor mínimo
    Y el cliente realiza el proceso de firma de un cliente aprobado
    Entonces el debería poder ver el crédito creado

  Escenario: Flujo de call center- Cliente Pre-Aprobado - Valores Mínimos - Pagares creados - Cuenta creada - Fabrica Negada
    Dado que un asesor quiere acceder a un crédito por el call center
    Cuando el asesor del call center diligencia el crédito pre-aprobado de libranza con el valor mínimo
    Y el cliente realiza el proceso de firma de un cliente pre-aprobado
    Y el asesor niega el proceso de fábrica
    Entonces el asesor debería poder ver el crédito negado en la bandeja de call center

  Escenario: Flujo de call center- Cliente Pre-Aprobado - Valores Mínimos - Pagares creados - Cuenta creada - Fabrica Negada
    Dado que un asesor quiere acceder a un crédito por el call center
    Cuando el asesor del call center diligencia el crédito pre-aprobado de libranza con el valor mínimo
    Y el cliente realiza el proceso de firma de un cliente pre-aprobado
    Y el asesor aplaza el proceso de fábrica
    Entonces el asesor debería poder ver el crédito aplazado en la bandeja de call center

  Escenario: Flujo de call center- Cliente Pre-Aprobado - Valores Mínimos - Pagares creados - Cuenta creada -Fabrica Aprobada
    Dado que un asesor quiere acceder a un crédito por el call center
    Cuando el asesor del call center diligencia el crédito pre-aprobado de libranza con el valor mínimo
    Y el cliente realiza el proceso de firma de un cliente pre-aprobado
    Y el asesor aprueba el proceso de fábrica
    Entonces el debería poder ver el crédito creado




 
