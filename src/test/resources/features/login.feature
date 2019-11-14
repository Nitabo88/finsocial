# language: es

Característica: Login Finsonet
  Como usuario de Finsonet
  Quiero ingresar a la pagina de finsonet
  Para ver la informacion de mis creditos

  Escenario: Ingreso exitoso de un usuario a la pagina finsonet
    Dado que Orlando quiere acceder a finsonet
    Cuando ingresa su informacion de autenticacion
    Entonces el debería ver Bienvenido/a

  Escenario: Loguin Alternativo
    Cuando Orlando se autentica en finsonet con el usuario ochinchilla, la contraseña Nicolas32@ y el codigo 123456
    Entonces el debería ver Bienvenido/a



