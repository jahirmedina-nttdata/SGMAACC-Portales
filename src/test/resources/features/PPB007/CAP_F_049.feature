#language: es
@PPB007-CAP_F_049 @skip @KO

Característica: PPB007-CAP_F_049 - Visualizacion Buscador Procedimientos y servicios
  Como un usuario comun
  Quiero acceder al portal
  Para visualizar cacheo correctamente

  Escenario: Cargando Portal Buscador
    Dado PPB007-CAPF049 - Accedo al Navegador
    Y PPB007-CAPF049 - Aceptar Cookies
    Y PPB007-CAPF049 - Clickar paginador
    Y PPB007-CAPF049 - Clickar enlace
    Y PPB007-CAPF049 - Retroceder pagina
    Entonces PPB007-CAPF049 - Validar cacheo de paginador



