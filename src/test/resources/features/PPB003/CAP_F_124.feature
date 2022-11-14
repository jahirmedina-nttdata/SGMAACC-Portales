#language: es
@PPB003-CAP_F_124

Característica: PPB003-CAP_F_124 - Visualizar Buscardor de Publicaciones por Texto y Categoria
  Como un usuario comun
  Quiero acceder al portal web
  Para visualizar buscador de Publicaciones

  Escenario: Cargando Portal Buscador de Publicaciones
    Dado PPB003-CAPF124 - Accedo al Navegador
    Cuando PPB003-CAPF124 - Acepto Cookies
    Y PPB003-CAPF124 - Seleccionar menu PUBLICACIONES
    Y PPB003-CAPF124 - Escribe Sierra de Aracena en el cuadro de busqueda
    Y PPB003-CAPF124 - Seleccionar la categoria Mapas
    Y PPB003-CAPF124 - Pulsar el boton Buscar
    Entonces PPB003-CAPF124 - Validar busqueda
    Y PPB003-CAPF124 - Pulsar en enlace Formato PDF

