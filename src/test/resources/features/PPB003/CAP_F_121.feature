#language: es
@PPB003-CAP_F_121

Característica: PPB003-CAP_F_121 - Visualizar busqueda de Espacios Naturales y Equipamiento
  Como un usuario comun
  Quiero acceder al portal web
  Para buscar en espacios naturales

  Escenario: Cargando Portal Ventana Visitante
    Dado PPB003-CAPF121 - Accedo al Navegador
    Cuando PPB003-CAPF121 - Acepto Cookies
    Y PPB003-CAPF121 - Seleccionar tipo de espacio LUGAR DE IMPORTANCIA COMUNITARIA
    Y PPB003-CAPF121 - Seleccionar nombre de espacio DUNAS DEL ODIEL
    Y PPB003-CAPF121 - Clickar buscar
    Entonces PPB003-CAPF121 - Validar resultado
