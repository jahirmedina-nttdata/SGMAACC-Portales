#language: es
@PPB003-CAP_F_200

Característica: PPB003-CAP_F_200 - Validar Busqueda en Portal Noticias
  Como un usuario comun
  Quiero acceder al portal web
  Para buscar por tipo y provincia

  Escenario: Cargando Portal Noticias
    Dado PPB003-CAPF200 - Accedo al Navegador
    Cuando PPB003-CAPF200 - Acepto Cookies
    Y PPB003-CAPF200 - Seleccionar equipamiento AREA RECREATIVA
    Y PPB003-CAPF200 - Seleccionar provincia ALMERIA
    Y PPB003-CAPF200 - Clickar buscar
