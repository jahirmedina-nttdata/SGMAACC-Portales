#language: es
@PPB003-CAP_F_149

Característica: PPB003-CAP_F_149 - Validar Busqueda en galeria multimeria
  Como un usuario comun
  Quiero acceder al portal web
  Para buscar por espacio

  Escenario: Cargando Portal Galeria Multimedia
    Dado PPB003-CAPF149 - Accedo al Navegador
    Cuando PPB003-CAPF149 - Acepto Cookies
    Y PPB003-CAPF149 - Seleccionar tipo de espacio LUGAR DE IMPORTANCIA COMUNITARIA
    Y PPB003-CAPF149 - Seleccionar nombre de espacio MARIASMAS DEL ODIEL
    Y PPB003-CAPF149 - Clickar buscar
    Entonces PPB003-CAPF149 - Validar resultado
