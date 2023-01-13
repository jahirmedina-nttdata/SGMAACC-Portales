#language: es
@PPB001-CAP_F_041

Característica: PPB001-CAP_F_041 - Validar Busqueda en galeria multimeria
  Como un usuario comun
  Quiero acceder al portal web
  Para buscar por tipo y provincia

  Escenario: Cargando Portal Galeria Multimedia
    Dado PPB001-CAPF041 - Accedo al Navegador
    Cuando PPB001-CAPF041 - Acepto Cookies
    Y PPB001-CAPF041 - Seleccionar equipamiento AREA RECREATIVA
    Y PPB001-CAPF041 - Seleccionar provincia ALMERIA
    Y PPB001-CAPF041 - Clickar buscar
    Entonces PPB001-CAPF041 - Validar resultado
