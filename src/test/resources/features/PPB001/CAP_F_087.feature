#language: es
@PPB001-CAP_F_087

Característica: PPB001-CAP_F_087 - Visualizar Ficha de una Noticia
  Como un usuario comun
  Quiero acceder al portal web
  Para visualizar ficha

  Escenario: Cargando Portal Noticias
    Dado PPB001-CAPF087 - Accedo al Navegador
    Cuando PPB001-CAPF087 - Acepto Cookies
    Y PPB001-CAPF087 - Seleccionar ficha ANDALUCIA TIERRA DE ACOGIDA DE QUEBRANTAHUESOS
    Entonces PPB001-CAPF087 - Validar Noticia
