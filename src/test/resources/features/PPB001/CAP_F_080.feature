#language: es
@PPB001-CAP_F_080

Característica: PPB001-CAP_F_080 - Validar Busqueda en Portal Noticias
  Como un usuario comun
  Quiero acceder al portal web
  Para buscar por tipo y provincia

  Escenario: Cargando Portal Noticias
    Dado PPB001-CAPF080 - Accedo al Navegador
    Cuando PPB001-CAPF080 - Acepto Cookies
    Y PPB001-CAPF080 - Seleccionar equipamiento AREA RECREATIVA
    Y PPB001-CAPF080 - Seleccionar provincia ALMERIA
    Y PPB001-CAPF080 - Clickar buscar
