#language: es
@PPB003-CAP_F_088

Característica: PPB003-CAP_F_088 - Añadir y Quitar Pasaporte
  Como un usuario autenticado
  Quiero acceder al portal
  Para añadir y quitar pasaporte

  Escenario: Cargando Portal de Referencia
    Dado PPB003-CAPF088 - Accedo al Navegador
    Y PPB003-CAPF088 - Aceptar Cookies
    Y PPB003-CAPF088 - Autentico usuario
    Y PPB003-CAPF088 - Clickar añadir Pasaporte Ecoturista
    Entonces PPB003-CAPF088 - Validar Pasaporte añadido
    Y PPB003-CAPF088 - Clickar eliminar Pasaporte



