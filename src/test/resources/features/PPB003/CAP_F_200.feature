#language: es
@PPB003-CAP_F_200

Característica: PPB003-CAP_F_200 - Visualizacion de Busqueda en Portal Noticias
  Como un usuario comun
  Quiero acceder al portal web
  Para buscar noticia

  Escenario: Cargando Portal Noticias
    Dado PPB003-CAPF200 - Accedo al Navegador
    Cuando PPB003-CAPF200 - Acepto Cookies
    Y PPB003-CAPF200 - Escribir Andalucia en el cuadro de texto
    Y PPB003-CAPF200 - Seleccionar provincia CÁDIZ
    Y PPB003-CAPF200 - Seleccionar tipo de equipamiento CENTRO DE VISITANTES
    Y PPB003-CAPF200 - Clickar buscar
