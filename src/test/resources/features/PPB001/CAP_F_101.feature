#language: es
@PPB001-CAP_F_101

Característica: PPB001-CAP_F_101 - Visualizacion de Busqueda en Portal Publicaciones
  Como un usuario comun
  Quiero acceder al portal web
  Para buscar publicaciones

  Escenario: Cargando Portal Publicaciones
    Dado PPB001-CAPF101 - Accedo al Navegador
    Cuando PPB001-CAPF101 - Acepto Cookies
    Y PPB001-CAPF101 - Seleccionar tipo de espacio MONUMENTO NATURAL
    Y PPB001-CAPF101 - Seleccionar provincia ALMERÍA
    Y PPB001-CAPF101 - Seleccionar categoria GUÍAS
    Y PPB001-CAPF101 - Seleccionar tipo de archivo PDF
    Y PPB001-CAPF101 - Clickar buscar
    Entonces PPB001-CAPF101 - Validar Busqueda
