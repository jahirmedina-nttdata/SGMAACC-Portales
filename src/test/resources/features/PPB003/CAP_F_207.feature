#language: es
@PPB003-CAP_F_207

Característica: PPB003-CAP_F_207 - Visualizar Ficha de una Noticia
  Como un usuario comun
  Quiero acceder al portal web
  Para visualizar ficha

  Escenario: Cargando Portal Noticias
    Dado PPB003-CAPF207 - Accedo al Navegador
    Cuando PPB003-CAPF207 - Acepto Cookies
    Y PPB003-CAPF207 - Seleccionar ficha ANDALUCIA TIERRA DE ACOGIDA DE QUEBRANTAHUESOS
    Entonces PPB003-CAPF207 - Validar Noticia
