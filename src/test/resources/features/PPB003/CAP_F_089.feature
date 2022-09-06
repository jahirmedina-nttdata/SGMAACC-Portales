#language: es
@PPB003-CAP_F_089

Característica: PPB003-CAP_F_089 - Eliminar Pasaporte
  Como un usuario autenticado
  Quiero acceder al portal
  Para eliminar pasaporte

  Escenario: Cargando Portal de Referencia
    Dado PPB003-CAPF089 - Accedo al Navegador
    Y PPB003-CAPF089 - Aceptar Cookies
    Y PPB003-CAPF089 - Autentico usuario
    Y PPB003-CAPF089 - Clickar eliminar-cancelar Pasaporte
    Y PPB003-CAPF089 - Clickar eliminar-aceptar Pasaporte
    Entonces PPB003-CAPF089 - Validar Pasaporte eliminado



