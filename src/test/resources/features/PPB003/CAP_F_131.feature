#language: es
@PPB003-CAP_F_131

Característica: PPB003-CAP_F_131 - Visualizar busqueda de Espacios Naturales y Equipamiento
  Como un usuario comun
  Quiero acceder al portal web
  Para buscar en espacios naturales

  Escenario: Cargando Portal Ventana Visitante
    Dado PPB003-CAPF131 - Accedo al Navegador
    Cuando PPB003-CAPF131 - Acepto Cookies
    Y PPB003-CAPF131 - Seleccionar tipo de espacio LUGAR DE IMPORTANCIA COMUNITARIA
    Y PPB003-CAPF131 - Seleccionar nombre de espacio DUNAS DEL ODIEL
    Y PPB003-CAPF131 - Clickar buscar
    Entonces PPB003-CAPF131 - Validar resultado
