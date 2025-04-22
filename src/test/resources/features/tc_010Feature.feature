Feature: Validar generación de 'Slip de salida' y almacenamiento en historial

  Scenario: Completar la carga y procesamiento de documentos
    Given El usuario ha cargado los documentos necesarios en el sistema
    When El usuario procesa los documentos
    Then El sistema genera el 'Slip de salida'
    And Los documentos originales y datos extraídos son guardados en el historial de la solicitud