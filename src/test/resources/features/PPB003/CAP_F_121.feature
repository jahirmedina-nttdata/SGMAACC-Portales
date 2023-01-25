#language: es
@PPB003-CAP_F_121

Característica: PPB003-CAP_F_121 - Acceso al buscardor de espacios naturales
  Como un usuario comun
  Quiero acceder al portal web
  Para visualizar buscador de espacios naturales

  Escenario: Cargando Portal Buscador de Espacios
    Dado PPB003-CAPF121 - Accedo al Navegador
    Cuando PPB003-CAPF121 - Acepto Cookies
    Y PPB003-CAPF121 - Seleccionar menu QUE PUEDES HACER
    Y PPB003-CAPF121 - Seleccionar submenu BUSCADOR DE ESPACIOS NATURALES
    Y PPB003-CAPF121 - Seleccionar tipo de espacio Parque Natural
    Y PPB003-CAPF121 - Seleccionar nombre de espacio Sierra de Aracena y picos de Aroche
    Y PPB003-CAPF121 - Pulsar el boton Buscar
    Entonces PPB003-CAPF121 - Validar busqueda
    Y PPB003-CAPF121 - Pulsar el boton Limpiar

