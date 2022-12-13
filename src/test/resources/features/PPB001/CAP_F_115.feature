#language: es
@PPB001-CAP_F_115

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
    Y PPB001-CAPF115 - Seleccionar Estado Borrador
    Y PPB001-CAPF115 - Clickar boton Buscar
    Entonces PPB001-CAPF115 - Validar Busqueda