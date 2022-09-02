#language: es
@PPB001-CAP_F_057 @bloqued

Característica: PPB001-CAP_F_057 - Validar Busqueda en Pagina Agenda
  Como un usuario comun
  Quiero acceder al portal web
  Para buscar por espacio

  Escenario: Cargando Portal Agenda
    Dado PPB001-CAPF057 - Accedo al Navegador
    Cuando PPB001-CAPF057 - Acepto Cookies
    Y PPB001-CAPF057 - Seleccionar tipo de espacio MONUMENTO NATURAL
    Y PPB001-CAPF057 - Seleccionar nombre de espacio ENCINA DE LA PEANA
    Y PPB001-CAPF057 - Clickar buscar
    Entonces PPB001-CAPF057 - Validar resultado
