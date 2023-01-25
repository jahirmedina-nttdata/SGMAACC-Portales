#language: es
@PPB003-CAP_F_160

Característica: PPB003-CAP_F_160 - Visualizar Buscardor de Publicaciones por Texto y Categoria
  Como un usuario comun
  Quiero acceder al portal web
  Para visualizar buscador de Publicaciones

  Escenario: Cargando Portal Buscador de Publicaciones
    Dado PPB003-CAPF160 - Accedo al Navegador
    Cuando PPB003-CAPF160 - Acepto Cookies
    Y PPB003-CAPF160 - Seleccionar menu PUBLICACIONES
    Y PPB003-CAPF160 - Escribe Sierra de Aracena en el cuadro de busqueda
    Y PPB003-CAPF160 - Seleccionar la categoria Mapas
    Y PPB003-CAPF160 - Pulsar el boton Buscar
    Entonces PPB003-CAPF160 - Validar busqueda
    Y PPB003-CAPF160 - Pulsar en enlace Formato PDF

