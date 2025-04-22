Feature: Validar subida de archivo con formato válido y vista previa

  Scenario: Subir archivo válido y mostrar vista previa
    Given estoy en la página de carga de archivos
    When selecciono un archivo en formato PDF/DOCX dentro del límite de 50 MB
    Then el archivo se carga exitosamente y muestra la vista previa con el nombre, tamaño y tipo