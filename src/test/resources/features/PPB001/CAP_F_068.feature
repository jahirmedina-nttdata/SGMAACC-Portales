#language: es
@PPB001-CAP_F_068

Característica: PPB001-CAP_F_068 - Validar Busqueda en Portal Avisos
  Como un usuario comun
  Quiero acceder al portal web
  Para buscar por espacio

  Escenario: Cargando Portal Avisos
    Dado PPB001-CAPF068 - Accedo al Navegador
    Cuando PPB001-CAPF068 - Acepto Cookies
    Y PPB001-CAPF068 - Seleccionar tipo de espacio MONUMENTO NATURAL
    Y PPB001-CAPF068 - Seleccionar provincia ALMERÍA
    Y PPB001-CAPF068 - Seleccionar nombre de espacio ENCINA DE LA PEANA
    Y PPB001-CAPF068 - Clickar buscar
    Entonces PPB001-CAPF068 - Validar resultado
