#language: es
@PPB003-CAP_F_113

Característica: PPB003-CAP_F_113 - Buscardor de espacios naturales por Texto
  Como un usuario comun
  Quiero acceder al portal web
  Para visualizar buscador de espacios naturales

  Escenario: Cargando Portal Buscador de Espacios
    Dado PPB003-CAPF113 - Accedo al Navegador
    Cuando PPB003-CAPF113 - Acepto Cookies
    Y PPB003-CAPF113 - Seleccionar menu QUE PUEDES HACER
    Y PPB003-CAPF113 - Seleccionar submenu BUSCADOR DE ESPACIOS NATURALES
    Y PPB003-CAPF113 - Escribe Sierra de Aracena en el cuadro de busqueda
    Y PPB003-CAPF113 - Pulsar el boton Buscar
    Entonces PPB003-CAPF113 - Validar busqueda
    Y PPB003-CAPF113 - Pulsar el boton EXPORTAR RESULTADOS

