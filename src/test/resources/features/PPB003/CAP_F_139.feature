#language: es
@PPB003-CAP_F_139

Característica: PPB003-CAP_F_139 - Validar Busqueda en galeria multimeria
  Como un usuario comun
  Quiero acceder al portal web
  Para buscar por espacio

  Escenario: Cargando Portal Galeria Multimedia
    Dado PPB003-CAPF139 - Accedo al Navegador
    Cuando PPB003-CAPF139 - Acepto Cookies
    Y PPB003-CAPF139 - Seleccionar tipo de espacio LUGAR DE IMPORTANCIA COMUNITARIA
    Y PPB003-CAPF139 - Seleccionar nombre de espacio MARIASMAS DEL ODIEL
    Y PPB003-CAPF139 - Clickar buscar
    Entonces PPB003-CAPF139 - Validar resultado
