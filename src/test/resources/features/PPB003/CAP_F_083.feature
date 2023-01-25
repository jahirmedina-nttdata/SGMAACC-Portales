#language: es
@PPB003-CAP_F_083

Característica: PPB003-CAP_F_083 - Visualizacion Favoritos
  Como un usuario autenticado
  Quiero acceder al portal
  Para visualizar favoritos

  Escenario: Cargando Portal de referencia
    Dado PPB003-CAPF083 - Accedo al Navegador
    Y PPB003-CAPF083 - Aceptar Cookies
    Y PPB003-CAPF083 - Autentico usuario
    Y PPB003-CAPF083 - Clickar Favoritos
    Entonces PPB003-CAPF083 - Valido permisos
    Y PPB003-CAPF083 - Valido lista de Favoritos



