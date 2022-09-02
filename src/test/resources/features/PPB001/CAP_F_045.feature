#language: es
@PPB001-CAP_F_045 @bloqued

Característica: PPB001-CAP_F_045 - Validar Busqueda en galeria multimeria
  Como un usuario comun
  Quiero acceder al portal web
  Para buscar por espacio

  Escenario: Cargando Portal Galeria Multimedia
    Dado PPB001-CAPF045 - Accedo al Navegador
    Cuando PPB001-CAPF045 - Acepto Cookies
    Y PPB001-CAPF045 - Seleccionar tipo de espacio LUGAR DE IMPORTANCIA COMUNITARIA
    Y PPB001-CAPF045 - Seleccionar nombre de espacio MARIASMAS DEL ODIEL
    Y PPB001-CAPF045 - Clickar buscar
    Entonces PPB001-CAPF045 - Validar resultado
