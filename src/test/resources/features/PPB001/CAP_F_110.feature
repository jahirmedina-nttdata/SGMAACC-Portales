#language: es
@PPB001-CAP_F_110

Característica: PPB001-CAP_F_110 - Acceso a preview-journal-module
  Como un usuario autenticado
  Quiero acceder al portal web
  Para visualizar acceso

  Escenario: Cargando Portal de Referencia
    Dado PPB001-CAPF110 - Accedo al Navegador
    Cuando PPB001-CAPF110 - Acepto Cookies
    Y PPB001-CAPF110 - Autentico usuario
    Entonces PPB001-CAPF110 - Validar Preview Contenido Web
