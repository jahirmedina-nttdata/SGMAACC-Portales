#language: es
@PPB001-CAP_F_056 @bloqued

Característica: PPB001-CAP_F_056 - Validar Busqueda en Agenda
  Como un usuario comun
  Quiero acceder al portal web
  Para buscar por tipo y provincia

  Escenario: Cargando Portal Agenda
    Dado PPB001-CAPF056 - Accedo al Navegador
    Cuando PPB001-CAPF056 - Acepto Cookies
    Y PPB001-CAPF056 - Seleccionar equipamiento AREA RECREATIVA
    Y PPB001-CAPF056 - Seleccionar provincia CÁDIZ
    Y PPB001-CAPF056 - Clickar buscar
    Entonces PPB001-CAPF056 - Validar resultado
