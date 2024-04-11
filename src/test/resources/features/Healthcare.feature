
Business Need: Registrar una cita en el servicio de cura salud
  Yo como usuario de la aplicacion
  Quiero generar una cita
  Para poder hacer uso del servicio

@Test
  Background: realizar el logueo de la aplicacion
    Given el usuario ingresa a la aplicacion

  Scenario Outline: verificar que se haya registrado la cita de salud con exito
    And el usuario realiza el logueo de la aplicacion ingresando <Usuario> y <Contrasena>
    When realiza el registro ingresando los siguientes datos <Fecha> y <comentario>
    Then se verifica que se ha registrado con exito la cita de salud con <Fecha>
    Examples:
    | Usuario  | Contrasena         |  Fecha     | comentario    |
    | John Doe | ThisIsNotAPassword | 12/04/2024 | ire en ayunas |