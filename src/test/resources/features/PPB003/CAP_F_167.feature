#language: es
@PPB003-CAP_F_167

Característica: PPB003-CAP_F_167 - Validar Busqueda en Pagina Agenda
  Como un usuario comun
  Quiero acceder al portal web
  Para buscar por espacio

  Escenario: Cargando Portal Agenda
    Dado PPB003-CAPF167 - Accedo al Navegador
    Cuando PPB003-CAPF167 - Acepto Cookies
    Y PPB003-CAPF167 - Seleccionar tipo de espacio MONUMENTO NATURAL
    Y PPB003-CAPF167 - Seleccionar nombre de espacio ENCINA DE LA PEANA
    Y PPB003-CAPF167 - Seleccionar provincia Almeria
    Y PPB003-CAPF167 - Clickar buscar
    Entonces PPB003-CAPF167 - Validar resultado
