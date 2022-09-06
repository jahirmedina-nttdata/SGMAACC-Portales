#language: es
@PPB001-CAP_F_115 @bloqued

Característica: PPB001-CAP_F_115 - Visualizar Busqueda utilizando filtro Usuario o Estado
  Como un usuario autenticado
  Quiero acceder al portal web
  Para visualizar busqueda

  Escenario: Cargando Portal de Referencia
    Dado PPB001-CAPF115 - Accedo al Navegador
    Cuando PPB001-CAPF115 - Acepto Cookies
    Y PPB001-CAPF115 - Autentico usuario
    Y PPB001-CAPF115 - Clickar boton lupa
    Y PPB001-CAPF115 - Seleccionar opcion CUALQUIERA del listado Correspondencia
    Y PPB001-CAPF115 - Escribir Admin CMAOT en el cuadro de texto usuario creador
    Y PPB001-CAPF115 - Escribir Borrador en el cuadro de texto estado
    Y PPB001-CAPF115 - Clickar search
