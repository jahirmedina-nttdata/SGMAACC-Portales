#language: es
@PPB003-CAP_F_158

Característica: PPB003-CAP_F_158 - Visualizacion de Busqueda en Portal Publicaciones
  Como un usuario comun
  Quiero acceder al portal web
  Para buscar publicaciones

  Escenario: Cargando Portal Publicaciones
    Dado PPB003-CAPF158 - Accedo al Navegador
    Cuando PPB003-CAPF158 - Acepto Cookies
    Y PPB003-CAPF158 - Seleccionar tipo de espacio MONUMENTO NATURAL
    Y PPB003-CAPF158 - Seleccionar provincia ALMERÍA
    Y PPB003-CAPF158 - Seleccionar categoria GUÍAS
    Y PPB003-CAPF158 - Seleccionar tipo de archivo PDF
    Y PPB003-CAPF158 - Clickar buscar
    Entonces PPB003-CAPF158 - Validar Busqueda
