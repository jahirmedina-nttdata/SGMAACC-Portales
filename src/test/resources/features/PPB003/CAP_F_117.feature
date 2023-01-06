#language: es
@PPB003-CAP_F_117

Característica: PPB003-CAP_F_117 - Visualizacion Buscador Procedimientos y servicios
  Como un usuario comun
  Quiero acceder al portal
  Para visualizar cacheo correctamente

  Escenario: Cargando Portal Buscador
    Dado PPB003-CAPF117 - Accedo al Navegador
    Y PPB003-CAPF117 - Aceptar Cookies
    Y PPB003-CAPF117 - Clickar paginador
    Y PPB003-CAPF117 - Clickar enlace
    Y PPB003-CAPF117 - Retroceder pagina
    Entonces PPB003-CAPF117 - Validar cacheo de paginador



