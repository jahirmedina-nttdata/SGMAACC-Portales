#language: es
@PPB001-CAP_F_112

Característica: PPB001-CAP_F_112 - Visualizar Busqueda
  Como un usuario autenticado
  Quiero acceder al portal web
  Para visualizar busqueda

  Escenario: Cargando Portal de Referencia
    Dado PPB001-CAPF112 - Accedo al Navegador
    Cuando PPB001-CAPF112 - Acepto Cookies
    Y PPB001-CAPF112 - Autentico usuario
    Y PPB001-CAPF112 - Clickar boton lupa
    Y PPB001-CAPF112 - Escribir Admin CMAOT en el cuadro de texto nombre de usuario
    Y PPB001-CAPF112 - Clickar boton Buscar
    Entonces PPB001-CAPF112 - Validar Busqueda
