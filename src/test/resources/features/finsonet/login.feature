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