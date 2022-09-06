#language: es
@PPB003-CAP_F_082

Característica: PPB003-CAP_F_082 - Visualizacion Favoritos
  Como un usuario autenticado
  Quiero acceder al portal
  Para visualizar favoritos

  Escenario: Cargando Portal de referencia
    Dado PPB003-CAPF082 - Accedo al Navegador
    Y PPB003-CAPF082 - Aceptar Cookies
    Y PPB003-CAPF082 - Autentico usuario
    Y PPB003-CAPF082 - Clickar Favoritos
    Entonces PPB003-CAPF082 - Valido permisos
    Y PPB003-CAPF082 - Valido lista de Favoritos



