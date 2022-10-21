#language: es
@PPB001-CAP_F_090

Característica: PPB001-CAP_F_090 - Visualizacion de Busqueda en Portal Noticias
  Como un usuario comun
  Quiero acceder al portal web
  Para buscar noticia

  Escenario: Cargando Portal Noticias
    Dado PPB001-CAPF090 - Accedo al Navegador
    Cuando PPB001-CAPF090 - Acepto Cookies
    Y PPB001-CAPF090 - Escribir Andalucia en el cuadro de texto
    Y PPB001-CAPF090 - Seleccionar provincia CÁDIZ
    Y PPB001-CAPF090 - Seleccionar tipo de equipamiento CENTRO DE VISITANTES
    Y PPB001-CAPF090 - Clickar buscar
