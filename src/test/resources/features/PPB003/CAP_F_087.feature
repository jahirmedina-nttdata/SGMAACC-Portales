#language: es
@PPB003-CAP_F_087

Característica: PPB003-CAP_F_087 - Visualizacion Pasaporte Ecoturista
  Como un usuario autenticado
  Quiero acceder al portal
  Para visualizar pasaporte

  Escenario: Cargando Portal de referencia
    Dado PPB003-CAPF087 - Accedo al Navegador
    Y PPB003-CAPF087 - Aceptar Cookies
    Y PPB003-CAPF087 - Autentico usuario
    Y PPB003-CAPF087 - Clickar Pasaporte Ecoturista
    Entonces PPB003-CAPF087 - Valido permisos
    Y PPB003-CAPF087 - Valido lista de Pasaportes



