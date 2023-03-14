#language: es
@PPB003-CAP_F_150

Característica: PPB003-CAP_F_150 - Visualizar Buscardor de Publicaciones por Texto y Categoria
  Como un usuario comun
  Quiero acceder al portal web
  Para visualizar buscador de Publicaciones

  Escenario: Cargando Portal Buscador de Publicaciones
    Dado PPB003-CAPF150 - Accedo al Navegador
    Cuando PPB003-CAPF150 - Acepto Cookies
    Y PPB003-CAPF150 - Seleccionar menu PUBLICACIONES
    Y PPB003-CAPF150 - Escribe Sierra de Aracena en el cuadro de busqueda
    Y PPB003-CAPF150 - Seleccionar la categoria Mapas
    Y PPB003-CAPF150 - Pulsar el boton Buscar
    Entonces PPB003-CAPF150 - Validar busqueda
    Y PPB003-CAPF150 - Pulsar en enlace Formato PDF

