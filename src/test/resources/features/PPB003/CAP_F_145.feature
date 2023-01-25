#language: es
@PPB003-CAP_F_145

Característica: PPB003-CAP_F_145 - Validar Busqueda en galeria multimeria
  Como un usuario comun
  Quiero acceder al portal web
  Para buscar por tipo y provincia

  Escenario: Cargando Portal Galeria Multimedia
    Dado PPB003-CAPF145 - Accedo al Navegador
    Cuando PPB003-CAPF145 - Acepto Cookies
    Y PPB003-CAPF145 - Seleccionar equipamiento AREA RECREATIVA
    Y PPB003-CAPF145 - Seleccionar provincia ALMERIA
    Y PPB003-CAPF145 - Clickar buscar
    Entonces PPB003-CAPF145 - Validar resultado
