#language: es
@PPB001-CAP_F_104

Característica: PPB001-CAP_F_104 - Visualizacion de Busqueda en Portal Publicaciones
  Como un usuario comun
  Quiero acceder al portal web
  Para buscar por texto

  Escenario: Cargando Portal Publicaciones
    Dado PPB001-CAPF104 - Accedo al Navegador
    Cuando PPB001-CAPF104 - Acepto Cookies
    Y PPB001-CAPF104 - Escribir Guia en cuadro de texto
    Y PPB001-CAPF104 - Clickar buscar
    Entonces PPB001-CAPF104 - Validar Busqueda
