#language: es
@PPB001-CAP_F_073

Característica: PPB001-CAP_F_073 - Validar busqueda en Portal Avisos
  Como un usuario comun
  Quiero acceder al portal web
  Para buscar por texto

  Escenario: Cargando Portal Avisos
    Dado PPB001-CAPF073 - Accedo al Navegador
    Cuando PPB001-CAPF073 - Acepto Cookies
    Y PPB001-CAPF073 - Buscar por texto zona
    Y PPB001-CAPF073 - Clickar buscar
    Entonces PPB001-CAPF073 - Validar ficha