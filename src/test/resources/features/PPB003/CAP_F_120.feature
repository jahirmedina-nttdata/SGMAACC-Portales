#language: es
@PPB003-CAP_F_120

Característica: PPB003-CAP_F_120 - Acceso al buscardor de espacios naturales
  Como un usuario comun
  Quiero acceder al portal web
  Para visualizar buscador de espacios naturales

  Escenario: Cargando Portal Buscador de Espacios
    Dado PPB003-CAPF120 - Accedo al Navegador
    Cuando PPB003-CAPF120 - Acepto Cookies
    Y PPB003-CAPF120 - Seleccionar menu QUE PUEDES HACER
    Y PPB003-CAPF120 - Seleccionar submenu BUSCADOR DE ESPACIOS NATURALES
    Y PPB003-CAPF120 - Seleccionar tipo de espacio Parque Natural
    Y PPB003-CAPF120 - Seleccionar nombre de espacio Sierra de Aracena y picos de Aroche
    Y PPB003-CAPF120 - Pulsar el boton Buscar
    Entonces PPB003-CAPF120 - Validar busqueda
    Y PPB003-CAPF120 - Pulsar el boton Limpiar

