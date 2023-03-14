#language: es
@PPB003-CAP_F_149

Característica: PPB003-CAP_F_149 - Visualizar Buscardor de Publicaciones
  Como un usuario comun
  Quiero acceder al portal web
  Para visualizar buscador de Publicaciones

  Escenario: Cargando Portal Buscador de Publicaciones
    Dado PPB003-CAPF149 - Accedo al Navegador
    Cuando PPB003-CAPF149 - Acepto Cookies
    Y PPB003-CAPF149 - Seleccionar menu PUBLICACIONES
    Y PPB003-CAPF149 - Escribe Sierra de Aracena en el cuadro de busqueda
    Y PPB003-CAPF149 - Pulsar el boton Buscar
    Entonces PPB003-CAPF149 - Validar busqueda
    Y PPB003-CAPF149 - Pulsar en enlace Formato PDF

