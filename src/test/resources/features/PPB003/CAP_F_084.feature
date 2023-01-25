#language: es
@PPB003-CAP_F_084

Característica: PPB003-CAP_F_084 - Añadir y Quitar Favoritos
  Como un usuario autenticado
  Quiero acceder al portal
  Para añadir y quitar favoritos

  Escenario: Cargando Portal de Referencia
    Dado PPB003-CAPF084 - Accedo al Navegador
    Y PPB003-CAPF084 - Aceptar Cookies
    Y PPB003-CAPF084 - Autentico usuario
    Y PPB003-CAPF084 - Clickar añadir Favorito
    Entonces PPB003-CAPF084 - Validar Favorito añadido
    Y PPB003-CAPF084 - Clickar eliminar favorito



