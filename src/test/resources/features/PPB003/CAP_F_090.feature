#language: es
@PPB003-CAP_F_090

Característica: PPB003-CAP_F_090 - Eliminar Pasaporte
  Como un usuario autenticado
  Quiero acceder al portal
  Para eliminar pasaporte

  Escenario: Cargando Portal de Referencia
    Dado PPB003-CAPF090 - Accedo al Navegador
    Y PPB003-CAPF090 - Aceptar Cookies
    Y PPB003-CAPF090 - Autentico usuario
    Y PPB003-CAPF090 - Clickar eliminar-cancelar Pasaporte
    Y PPB003-CAPF090 - Clickar eliminar-aceptar Pasaporte
    Entonces PPB003-CAPF090 - Validar Pasaporte eliminado



