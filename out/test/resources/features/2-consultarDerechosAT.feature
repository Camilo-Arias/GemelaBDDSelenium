@All
@ConAt
Feature: CP02 - Consultar Derechos Accidente de Trabajo

  Background: Validar la consulta de derechos de un AT
    Given el usuario navega en dc2tvaweb7:3089GemelaLogin


  @ConsultarAT
  Scenario Outline: 2.1 - Consultar Derechos Accidente Trabajo
    When lleno formulario de "<user>" and "<password>"
    And  solución capchat
    And el logueo es exitoso
    And Selecciono el menu Opciones del sistema
    And Selecciono Reporte AT
    And Selecciono Registro de Siniestro
    And Ingreso tipo de documento "<TypeDocument>"
    And Ingreso "<NumberIdentification>" and "<month>" and "<year>" and "<day>"
    And Selecciono consultar
    And Selecciono el boton seleccionar del primer registro
    And Selecciono generar reporte
    Then el sistema trae el listado de siniestros

    Examples:
      | user    | password   | TypeDocument      | NumberIdentification | month | year | day |
      | cariasa | Colpatria1 | CEDULA CIUDADANIA | 1053861387           | Abr   | 2022 | 08  |
