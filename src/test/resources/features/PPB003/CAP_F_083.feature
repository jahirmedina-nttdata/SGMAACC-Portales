#language: es
@PPB003-CAP_F_083

Característica: PPB003-CAP_F_083 - Añadir y Quitar Favoritos
  Como un usuario autenticado
  Quiero acceder al portal
  Para añadir y quitar favoritos

  Escenario: Cargando Portal de Referencia
    Dado PPB003-CAPF083 - Accedo al Navegador
    Y PPB003-CAPF083 - Aceptar Cookies
    Y PPB003-CAPF083 - Autentico usuario
    Y PPB003-CAPF083 - Clickar añadir Favorito
    Entonces PPB003-CAPF083 - Validar Favorito añadido
    Y PPB003-CAPF083 - Clickar eliminar favorito



