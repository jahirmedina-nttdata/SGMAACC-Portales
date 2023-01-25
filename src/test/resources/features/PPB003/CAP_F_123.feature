#language: es
@PPB003-CAP_F_123

Característica: PPB003-CAP_F_123 - Buscardor de espacios naturales por Texto
  Como un usuario comun
  Quiero acceder al portal web
  Para visualizar buscador de espacios naturales

  Escenario: Cargando Portal Buscador de Espacios
    Dado PPB003-CAPF123 - Accedo al Navegador
    Cuando PPB003-CAPF123 - Acepto Cookies
    Y PPB003-CAPF123 - Seleccionar menu QUE PUEDES HACER
    Y PPB003-CAPF123 - Seleccionar submenu BUSCADOR DE ESPACIOS NATURALES
    Y PPB003-CAPF123 - Escribe Sierra de Aracena en el cuadro de busqueda
    Y PPB003-CAPF123 - Pulsar el boton Buscar
    Entonces PPB003-CAPF123 - Validar busqueda
    Y PPB003-CAPF123 - Pulsar el boton EXPORTAR RESULTADOS

