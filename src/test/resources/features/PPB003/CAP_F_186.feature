#language: es
@PPB003-CAP_F_186

Característica: PPB003-CAP_F_186 - Validar Busqueda en Portal Avisos
  Como un usuario comun
  Quiero acceder al portal web
  Para buscar por tipo y provincia

  Escenario: Cargando Portal Avisos
    Dado PPB003-CAPF186 - Accedo al Navegador
    Cuando PPB003-CAPF186 - Acepto Cookies
    Y PPB003-CAPF186 - Seleccionar equipamiento AREA RECREATIVA
    Y PPB003-CAPF186 - Seleccionar provincia CÁDIZ
    Y PPB003-CAPF186 - Clickar buscar
    Entonces PPB003-CAPF186 - Validar resultado
