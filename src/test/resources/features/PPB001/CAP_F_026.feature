#language: es
@PPB001-CAP_F_026 @bloqued

Característica: PPB001-CAP_F_026 - Visualizar busqueda de Espacios Naturales y Equipamiento
  Como un usuario comun
  Quiero acceder al portal web
  Para buscar en espacios naturales

  Escenario: Cargando Portal Ventana Visitante
    Dado PPB001-CAPF026 - Accedo al Navegador
    Cuando PPB001-CAPF026 - Acepto Cookies
    Y PPB001-CAPF026 - Seleccionar tipo de espacio LUGAR DE IMPORTANCIA COMUNITARIA
    Y PPB001-CAPF026 - Seleccionar nombre de espacio DUNAS DEL ODIEL
    Y PPB001-CAPF026 - Clickar buscar
    Entonces PPB001-CAPF026 - Validar resultado
