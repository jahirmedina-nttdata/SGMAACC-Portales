Feature: PPB001_Family001 - Validar estado de la Web
  As un usuario comun
  I quiero visualizar la web
  So cargar la web

  Background:
    Given PPB001_Family001 - Cargando el Navegador

  @PPB001_Family001
  Scenario Outline: Cargando la web
    When PPB001_Family001 - Se haya cargado la web
    And PPB001_Family001 - Aceptar las cookies
    And PPB001_Family001 - Limpiar
    And PPB001_Family001 - Buscar por palabras "<palabras>"
    And PPB001_Family001 - Seleccionar Tipos de Espacios Naturales "<tipo_espacio_natural>"
    And PPB001_Family001 - Seleccionar Provincias "<provincias>"
    And PPB001_Family001 - Selecciona un tipo de Equipamento "<equipamento>"
    And PPB001_Family001 - Es Accesible "<accesible>"
    And PPB001_Family001 - Nombre de Espacio Natural "<nombre_espacio_natural>"
    And PPB001_Family001 - Buscar
    Examples:
      | palabras | tipo_espacio_natural             | provincias | equipamento        | accesible | nombre_espacio_natural |
      | none     | none                             | none       | ÁREA RECREATIVA    | no        | none                   |
      | none     | none                             | ALMERÍA    | ÁREA RECREATIVA    | no        | none                   |
      | none     | GEOPARQUE                        | none       | ÁREA RECREATIVA    | no        | none                   |
      | none     | GEOPARQUE                        | CÓRDOBA    | ÁREA RECREATIVA    | no        | none                   |
      | none     | LUGAR DE IMPORTANCIA COMUNITARIA | CÁDIZ      | SENDERO SEÑALIZADO | no        | BAHÍA DE CÁDIZ         |
      | none     | LUGAR DE IMPORTANCIA COMUNITARIA | none       | none               | no        | none                   |
      | none     | LUGAR DE IMPORTANCIA COMUNITARIA | none       | none               | no        | DUNAS DEL ODIEL        |
      | none     | LUGAR DE IMPORTANCIA COMUNITARIA | CÁDIZ      | none               | no        | none                   |
      | none     | LUGAR DE IMPORTANCIA COMUNITARIA | none       | TODO               | si        | none                   |
      | none     | SIN ESPACIO NATURAL ASOCIADO     | none       | TODO               | no        | none                   |
