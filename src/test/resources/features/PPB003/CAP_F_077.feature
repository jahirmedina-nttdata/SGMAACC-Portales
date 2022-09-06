#language: es
@PPB003-CAP_F_077

Característica: PPB003-CAP_F_077 - Eliminar Visita
  Como un usuario autenticado
  Quiero acceder al portal
  Para eliminar visita

  Escenario: Cargando Portal de Visitas
    Dado PPB003-CAPF077 - Accedo al Navegador
    Y PPB003-CAPF077 - Aceptar Cookies
    Y PPB003-CAPF077 - Autentico usuario
    Y PPB003-CAPF077 - Clickar eliminar visita
    Y PPB003-CAPF077 - Clickar cancelar eliminacion
    Y PPB003-CAPF077 - Clickar aceptar eliminacion
    Entonces PPB003-CAPF077 - Validar visita eliminada



