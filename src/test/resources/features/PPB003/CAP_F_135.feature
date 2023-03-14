#language: es
@PPB003-CAP_F_135

Característica: PPB003-CAP_F_135 - Validar Busqueda en galeria multimeria
  Como un usuario comun
  Quiero acceder al portal web
  Para buscar por tipo y provincia

  Escenario: Cargando Portal Galeria Multimedia
    Dado PPB003-CAPF135 - Accedo al Navegador
    Cuando PPB003-CAPF135 - Acepto Cookies
    Y PPB003-CAPF135 - Seleccionar equipamiento AREA RECREATIVA
    Y PPB003-CAPF135 - Seleccionar provincia ALMERIA
    Y PPB003-CAPF135 - Clickar buscar
    Entonces PPB003-CAPF135 - Validar resultado
