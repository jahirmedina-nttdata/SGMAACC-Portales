#language: es
@PPB003-CAP_F_123

Característica: PPB003-CAP_F_123 - Visualizar Buscardor de Publicaciones
  Como un usuario comun
  Quiero acceder al portal web
  Para visualizar buscador de Publicaciones

  Escenario: Cargando Portal Buscador de Publicaciones
    Dado PPB003-CAPF123 - Accedo al Navegador
    Cuando PPB003-CAPF123 - Acepto Cookies
    Y PPB003-CAPF123 - Seleccionar menu PUBLICACIONES
    Y PPB003-CAPF123 - Escribe Sierra de Aracena en el cuadro de busqueda
    Y PPB003-CAPF123 - Pulsar el boton Buscar
    Entonces PPB003-CAPF123 - Validar busqueda
    Y PPB003-CAPF123 - Pulsar en enlace Formato PDF

