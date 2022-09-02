#language: es
@PPB001-CAP_F_066

Característica: PPB001-CAP_F_066 - Validar Busqueda en Portal Avisos
  Como un usuario comun
  Quiero acceder al portal web
  Para buscar por tipo y provincia

  Escenario: Cargando Portal Avisos
    Dado PPB001-CAPF066 - Accedo al Navegador
    Cuando PPB001-CAPF066 - Acepto Cookies
    Y PPB001-CAPF066 - Seleccionar equipamiento AREA RECREATIVA
    Y PPB001-CAPF066 - Seleccionar provincia CÁDIZ
    Y PPB001-CAPF066 - Clickar buscar
    Entonces PPB001-CAPF066 - Validar resultado
