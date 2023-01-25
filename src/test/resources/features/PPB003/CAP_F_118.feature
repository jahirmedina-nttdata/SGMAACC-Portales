#language: es
@PPB003-CAP_F_118 @skip @KO

Característica: PPB003-CAP_F_118 - Visualizacion Buscador Procedimientos y servicios
  Como un usuario comun
  Quiero acceder al portal
  Para visualizar cacheo correctamente

  Escenario: Cargando Portal Buscador
    Dado PPB003-CAPF118 - Accedo al Navegador
    Y PPB003-CAPF118 - Aceptar Cookies
    Y PPB003-CAPF118 - Clickar paginador
    Y PPB003-CAPF118 - Clickar enlace
    Y PPB003-CAPF118 - Retroceder pagina
    Entonces PPB003-CAPF118 - Validar cacheo de paginador



