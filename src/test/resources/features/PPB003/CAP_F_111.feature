#language: es
@PPB003-CAP_F_111

Característica: PPB003-CAP_F_111 - Acceso al buscardor de espacios naturales
  Como un usuario comun
  Quiero acceder al portal web
  Para visualizar buscador de espacios naturales

  Escenario: Cargando Portal Buscador de Espacios
    Dado PPB003-CAPF111 - Accedo al Navegador
    Cuando PPB003-CAPF111 - Acepto Cookies
    Y PPB003-CAPF111 - Seleccionar menu QUE PUEDES HACER
    Y PPB003-CAPF111 - Seleccionar submenu BUSCADOR DE ESPACIOS NATURALES
    Y PPB003-CAPF111 - Seleccionar tipo de espacio Parque Natural
    Y PPB003-CAPF111 - Seleccionar nombre de espacio Sierra de Aracena y picos de Aroche
    Y PPB003-CAPF111 - Pulsar el boton Buscar
    Entonces PPB003-CAPF111 - Validar busqueda
    Y PPB003-CAPF111 - Pulsar el boton Limpiar

