#language: es
@PPB003-CAP_F_089

Característica: PPB003-CAP_F_089 - Añadir y Quitar Pasaporte
  Como un usuario autenticado
  Quiero acceder al portal
  Para añadir y quitar pasaporte

  Escenario: Cargando Portal de Referencia
    Dado PPB003-CAPF089 - Accedo al Navegador
    Y PPB003-CAPF089 - Aceptar Cookies
    Y PPB003-CAPF089 - Autentico usuario
    Y PPB003-CAPF089 - Clickar añadir Pasaporte Ecoturista
    Entonces PPB003-CAPF089 - Validar Pasaporte añadido
    Y PPB003-CAPF089 - Clickar eliminar Pasaporte



