#language: es
@PPB003-CAP_F_176 @bloqued

Característica: PPB003-CAP_F_176 - Validar Busqueda en Agenda
  Como un usuario comun
  Quiero acceder al portal web
  Para buscar por tipo y provincia

  Escenario: Cargando Portal Agenda
    Dado PPB003-CAPF176 - Accedo al Navegador
    Cuando PPB003-CAPF176 - Acepto Cookies
    Y PPB003-CAPF176 - Seleccionar equipamiento AREA RECREATIVA
    Y PPB003-CAPF176 - Seleccionar provincia CÁDIZ
    Y PPB003-CAPF176 - Clickar buscar
    Entonces PPB003-CAPF176 - Validar resultado
