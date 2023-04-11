#language: es
@PPB003-CAP_F_178

Característica: PPB003-CAP_F_178 - Validar Busqueda en Portal Avisos
  Como un usuario comun
  Quiero acceder al portal web
  Para buscar por espacio

  Escenario: Cargando Portal Avisos
    Dado PPB003-CAPF178 - Accedo al Navegador
    Cuando PPB003-CAPF178 - Acepto Cookies
    Y PPB003-CAPF178 - Seleccionar tipo de espacio MONUMENTO NATURAL
    Y PPB003-CAPF178 - Seleccionar nombre de espacio ENCINA DE LA PEANA
    Y PPB003-CAPF178 - Seleccionar provincia ALMERÍA
    Y PPB003-CAPF178 - Clickar buscar
    Entonces PPB003-CAPF178 - Validar resultado
