
@login
Feature: CP01 - Inicio sesión

  Background: Validar el inicio de sesión con credenciales validas y llenado de captchat
    Given el usuario navega en dc2tvaweb7:3089GemelaLogin

  @case1
  @loguearse
  Scenario Outline: 1 - Logueo con credenciales correctas
    When lleno formulario de "<user>" and "<password>"
    And  solución capchat
    Then el logueo es exitoso

    Examples:
      | user    | password   |
      | cariasa | Colpatria1 |

  @logout
  Scenario Outline: 2 - Validar Cerrar sesión
    When lleno formulario de "<user>" and "<password>"
    And  solución capchat
    And  selecciono salir
    Then la sesión cierra exitosamente

    Examples:
      | user    | password   |
      | cariasa | Colpatria1 |