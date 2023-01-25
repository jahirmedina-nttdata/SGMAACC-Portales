#language: es
@PPB003-CAP_F_088

Característica: PPB003-CAP_F_088 - Visualizacion Pasaporte Ecoturista
  Como un usuario autenticado
  Quiero acceder al portal
  Para visualizar pasaporte

  Escenario: Cargando Portal de referencia
    Dado PPB003-CAPF088 - Accedo al Navegador
    Y PPB003-CAPF088 - Aceptar Cookies
    Y PPB003-CAPF088 - Autentico usuario
    Y PPB003-CAPF088 - Clickar Pasaporte Ecoturista
    Entonces PPB003-CAPF088 - Valido permisos
    Y PPB003-CAPF088 - Valido lista de Pasaportes



