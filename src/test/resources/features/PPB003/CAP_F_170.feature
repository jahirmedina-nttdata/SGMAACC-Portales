#language: es
@PPB003-CAP_F_170

Característica: PPB003-CAP_F_170 - Validar busqueda del Portal Agenda
  Como un usuario comun
  Quiero acceder al portal web
  Para buscar por texto

  Escenario: Cargando Portal Agenda
    Dado PPB003-CAPF170 - Accedo al Navegador
    Cuando PPB003-CAPF170 - Acepto Cookies
    Y PPB003-CAPF170 - Buscar por texto congreso
    Y PPB003-CAPF170 - Clickar buscar
    Entonces PPB003-CAPF170 - Validar ficha