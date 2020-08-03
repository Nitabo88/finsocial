# language: es

Característica: Login Colaborador Banca Express
  Como colaborador de Bancoomeva
  Quiero ingresar a la página de Banca Express
  Para poder gestionar mis clientes

  Escenario: Ingreso exitoso de un colaborador a la página de Banca Express
    Dado que un colaborador quiere acceder a Banca Express
    Cuando ingresa su información de autenticación de Banca Express
    Entonces el debería poder ver el mensaje Dashboard - Banca Express + en Banca Express

  @LoginBancoomeva
  Escenario: Ingreso no exitoso de un colaborador a la página de Banca Express - Contraseña Incorrecta
    Dado que un colaborador quiere acceder a Banca Express
    Cuando ingresa su información con clave incorrecta de Banca Express
    Entonces el debería poder ver el mensaje de error

  @LoginBancoomeva
  Escenario: Ingreso no exitoso de un colaborador a la página de Banca Express - Usuario Incorrecto
    Dado que un colaborador quiere acceder a Banca Express
    Cuando ingresa su información con usuario incorrecto de Banca Express
    Entonces el debería poder ver el mensaje de error de data

  @LoginBancoomeva
  Escenario: Ingreso no exitoso de un colaborador a la página de Banca Express - Datos Incorrectos
    Dado que un colaborador quiere acceder a Banca Express
    Cuando ingresa su información con datos incorrectos de Banca Express
    Entonces el debería poder ver el mensaje de error de data