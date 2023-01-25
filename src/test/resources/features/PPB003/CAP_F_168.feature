#language: es
@PPB003-CAP_F_168

Característica: PPB003-CAP_F_168 - Visualizacion de Busqueda en Portal Publicaciones
  Como un usuario comun
  Quiero acceder al portal web
  Para buscar publicaciones

  Escenario: Cargando Portal Publicaciones
    Dado PPB003-CAPF168 - Accedo al Navegador
    Cuando PPB003-CAPF168 - Acepto Cookies
    Y PPB003-CAPF168 - Seleccionar tipo de espacio MONUMENTO NATURAL
    Y PPB003-CAPF168 - Seleccionar provincia ALMERÍA
    Y PPB003-CAPF168 - Seleccionar categoria GUÍAS
    Y PPB003-CAPF168 - Seleccionar tipo de archivo PDF
    Y PPB003-CAPF168 - Clickar buscar
    Entonces PPB003-CAPF168 - Validar Busqueda
