#language: es
@PPB001-CAP_F_060 @bloqued

Característica: PPB001-CAP_F_060 - Validar busqueda del Portal Agenda
  Como un usuario comun
  Quiero acceder al portal web
  Para buscar por texto

  Escenario: Cargando Portal Agenda
    Dado PPB001-CAPF060 - Accedo al Navegador
    Cuando PPB001-CAPF060 - Acepto Cookies
    Y PPB001-CAPF060 - Buscar por texto congreso
    Y PPB001-CAPF060 - Clickar buscar
    Entonces PPB001-CAPF060 - Validar ficha