@All
@HistClinica
Feature: CP04 - Consultar Datos Basicos Historia Clinica

  Background: Validar El flujo completo consultas medicas Historias Clinicas.
    Given el usuario navega en dc2tvaweb7:3089GemelaLogin


  @ConsultarHC
  Scenario Outline: 4.1 - Consultar Listado Historias Clinicas
    When lleno formulario de "<user>" and "<password>"
    And  solución capchat
    And el logueo es exitoso
    And Selecciono el menu Opciones del sistema
    And Selecciono HISTORIA CLINICA
    And selecciono Consultas Médicas
    And Ingreso tipo de documento HC "<TypeDocument>"
    And Ingreso "<NumberIdentification>"
    And Selecciono buscar
    Then El sistema trae el listado

    Examples:
      | user    | password   | TypeDocument      | NumberIdentification |
      | cariasa | Colpatria1 | CEDULA CIUDADANIA | 123456               |

  @HCConcAptLab
  Scenario Outline: 4.2 - Concepto de Aptitud labotal
    When lleno formulario de "<user>" and "<password>"
    And solución capchat
    And el logueo es exitoso
    And Selecciono el menu Opciones del sistema
    And Selecciono HISTORIA CLINICA
    And selecciono Concepto de aptitud laboral
    And Ingreso tipo de documento HC "<TypeDocument>"
    And Ingreso "<NumberIdentification>"
    And Selecciono buscar
    Then El sistema trae el listado

    Examples:
      | user    | password   | TypeDocument      | NumberIdentification |
      | cariasa | Colpatria1 | CEDULA CIUDADANIA | 123456               |

  @HCActaIncProRehabilitacion
  Scenario Outline: 4.3 - Concepto de Aptitud labotal
    When lleno formulario de "<user>" and "<password>"
    And solución capchat
    And el logueo es exitoso
    And Selecciono el menu Opciones del sistema
    And Selecciono HISTORIA CLINICA
    And selecciono Acta inclusion programa rehabilitacion
    And Ingreso tipo de documento HC "<TypeDocument>"
    And Ingreso "<NumberIdentification>"
    And Selecciono buscar
    Then El sistema trae el listado

    Examples:
      | user    | password   | TypeDocument      | NumberIdentification |
      | cariasa | Colpatria1 | CEDULA CIUDADANIA | 123456               |

  @HCNotas
  Scenario Outline: 4.4 - Notas
    When lleno formulario de "<user>" and "<password>"
    And solución capchat
    And el logueo es exitoso
    And Selecciono el menu Opciones del sistema
    And Selecciono HISTORIA CLINICA
    And selecciono Notas
    And Ingreso tipo de documento HC "<TypeDocument>"
    And Ingreso "<NumberIdentification>"
    And Selecciono buscar
    Then El sistema trae el listado

    Examples:
      | user    | password   | TypeDocument      | NumberIdentification |
      | cariasa | Colpatria1 | CEDULA CIUDADANIA | 123456               |

  @HCIncapacidades
  Scenario Outline: 4.5 - Incapacidades
    When lleno formulario de "<user>" and "<password>"
    And solución capchat
    And el logueo es exitoso
    And Selecciono el menu Opciones del sistema
    And Selecciono HISTORIA CLINICA
    And selecciono Incapacidades
    And Ingreso tipo de documento HC Incapacidades "<TypeDocument>"
    And Ingreso "<NumberIdentification>" Incapacidades
    And Selecciono buscar
    Then El sistema trae el listado Incapacidades

    Examples:
      | user    | password   | TypeDocument      | NumberIdentification |
      | cariasa | Colpatria1 | CEDULA CIUDADANIA | 123456               |

  @HCSeguimiento
  Scenario Outline: 4.6 - Seguimiento
    When lleno formulario de "<user>" and "<password>"
    And solución capchat
    And el logueo es exitoso
    And Selecciono el menu Opciones del sistema
    And Selecciono HISTORIA CLINICA
    And selecciono Seguimiento
    And Ingreso tipo de documento HC "<TypeDocument>"
    And Ingreso "<NumberIdentification>"
    And Selecciono buscar
    Then El sistema trae el listado

    Examples:
      | user    | password   | TypeDocument      | NumberIdentification |
      | cariasa | Colpatria1 | CEDULA CIUDADANIA | 123456               |

  @HCConsultaIncTemp
  Scenario Outline: 4.7 - Consultar Incap. Temp.
    When lleno formulario de "<user>" and "<password>"
    And solución capchat
    And el logueo es exitoso
    And Selecciono el menu Opciones del sistema
    And Selecciono HISTORIA CLINICA
    And selecciono Consulta Incap. Temp.
#    And Cargo el archivo valido.
#    And Selecciono buscar
#    Then El sistema trae el listado incapacadidad temporal.

    Examples:
      | user    | password   | TypeDocument      | NumberIdentification |
      | cariasa | Colpatria1 | CEDULA CIUDADANIA | 123456               |