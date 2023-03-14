#language: es
@PPB003-CAP_F_197

Característica: PPB003-CAP_F_197 - Visualizar Ficha de una Noticia
  Como un usuario comun
  Quiero acceder al portal web
  Para visualizar ficha

  Escenario: Cargando Portal Noticias
    Dado PPB003-CAPF197 - Accedo al Navegador
    Cuando PPB003-CAPF197 - Acepto Cookies
    Y PPB003-CAPF197 - Seleccionar ficha ANDALUCIA TIERRA DE ACOGIDA DE QUEBRANTAHUESOS
    Entonces PPB003-CAPF197 - Validar Noticia
