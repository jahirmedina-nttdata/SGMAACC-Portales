#language: es
@PPB003-CAP_F_177 @bloqued

Característica: PPB003-CAP_F_177 - Validar Busqueda en Pagina Agenda
  Como un usuario comun
  Quiero acceder al portal web
  Para buscar por espacio

  Escenario: Cargando Portal Agenda
    Dado PPB003-CAPF177 - Accedo al Navegador
    Cuando PPB003-CAPF177 - Acepto Cookies
    Y PPB003-CAPF177 - Seleccionar tipo de espacio MONUMENTO NATURAL
    Y PPB003-CAPF177 - Seleccionar nombre de espacio ENCINA DE LA PEANA
    Y PPB003-CAPF177 - Clickar buscar
    Entonces PPB003-CAPF177 - Validar resultado
