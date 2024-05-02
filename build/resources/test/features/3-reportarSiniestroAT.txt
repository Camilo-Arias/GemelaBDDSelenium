@AllSteps
@reporSiniAT
#  No se puede realizar este flujo debido a inconvenientes en la conexión entre Gemela y Portal ARL.
Feature: CP03 - Reportar siniestro Accidente Trabajo

  Background: Validar la consulta y reporte de derechos de un AT
    Given el usuario navega en dc2tvaweb7:3089GemelaLogin


  @ReportarAT
  Scenario Outline: 3.1 - Reportar siniestro Accidente Trabajo
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
#    And Selecciono registrar accidente

    Then el sistema trae el listado de siniestros

    Examples:
      | user    | password   | TypeDocument      | NumberIdentification | month | year | day |
      | cariasa | Colpatria1 | CEDULA CIUDADANIA | 10251577             | Jul   | 2022 | 12  |

