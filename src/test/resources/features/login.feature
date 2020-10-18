# language: es

Característica: Login Finsonet
  Como asesor de Finsonet
  Quiero ingresar a la pagina de finsonet
  Para poder gestionar mis clientes

  Escenario: Ingreso exitoso de un usuario a la pagina finsonet
    Dado que un asesor quiere acceder a finsonet
    Cuando ingresa su informacion de autenticacion
    Entonces el debería ver Bienvenido/a

  Escenario: Login Alternativo
    Cuando un asesor se autentica en finsonet con el usuario ochinchilla, la contraseña Nicolas32@ y el codigo 123456
    Entonces el debería ver Bienvenido/a

  Escenario: Login No Exitoso - Contraseña equivocada
    Dado que un asesor quiere acceder a finsonet
    Cuando ingresa su información de autenticación con contraseña errada
    Entonces el asesor debería ver un mensaje de error

  Escenario: Login No Exitoso - Usuario equivocado
    Dado que un asesor quiere acceder a finsonet
    Cuando ingresa su información de autenticación con usuario errado
    Entonces el asesor debería ver un mensaje de error

  Escenario: Login No Exitoso - Data errada
    Dado que un asesor quiere acceder a finsonet
    Cuando ingresa su información de autenticación con data errada
    Entonces el asesor debería ver un mensaje de error