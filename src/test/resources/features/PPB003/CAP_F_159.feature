#language: es
@PPB003-CAP_F_159

Característica: PPB003-CAP_F_159 - Visualizar Buscardor de Publicaciones
  Como un usuario comun
  Quiero acceder al portal web
  Para visualizar buscador de Publicaciones

  Escenario: Cargando Portal Buscador de Publicaciones
    Dado PPB003-CAPF159 - Accedo al Navegador
    Cuando PPB003-CAPF159 - Acepto Cookies
    Y PPB003-CAPF159 - Seleccionar menu PUBLICACIONES
    Y PPB003-CAPF159 - Escribe Sierra de Aracena en el cuadro de busqueda
    Y PPB003-CAPF159 - Pulsar el boton Buscar
    Entonces PPB003-CAPF159 - Validar busqueda
    Y PPB003-CAPF159 - Pulsar en enlace Formato PDF

