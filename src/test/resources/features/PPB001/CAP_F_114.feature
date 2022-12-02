#language: es
@PPB001-CAP_F_114

Característica: PPB001-CAP_F_114 - Visualizar Busqueda utilizando filtro Usuario y Estado
  Como un usuario autenticado
  Quiero acceder al portal web
  Para visualizar busqueda

  Escenario: Cargando Portal de Referencia
    Dado PPB001-CAPF114 - Accedo al Navegador
    Cuando PPB001-CAPF114 - Acepto Cookies
    Y PPB001-CAPF114 - Autentico usuario
    Y PPB001-CAPF114 - Clickar boton lupa
    Y PPB001-CAPF114 - Seleccionar opcion TODO del listado Correspondencia
    Y PPB001-CAPF114 - Escribir Admin CMAOT en el cuadro de texto usuario creador
    Y PPB001-CAPF114 - Seleccionar Estado Borrador
    Y PPB001-CAPF114 - Clickar boton Buscar
    Entonces PPB001-CAPF114 - Validar Busqueda
