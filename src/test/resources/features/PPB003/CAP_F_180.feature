#language: es
@PPB003-CAP_F_180 @bloqued

Característica: PPB003-CAP_F_180 - Validar busqueda del Portal Agenda
  Como un usuario comun
  Quiero acceder al portal web
  Para buscar por texto

  Escenario: Cargando Portal Agenda
    Dado PPB003-CAPF180 - Accedo al Navegador
    Cuando PPB003-CAPF180 - Acepto Cookies
    Y PPB003-CAPF180 - Buscar por texto congreso
    Y PPB003-CAPF180 - Clickar buscar
    Entonces PPB003-CAPF180 - Validar ficha