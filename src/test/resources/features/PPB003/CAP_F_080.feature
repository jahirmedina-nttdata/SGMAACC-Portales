#language: es
@PPB003-CAP_F_080 @skip @KO

Característica: PPB003-CAP_F_080 - Eliminar Ficha Planifica tu Visita
  Como un usuario
  Quiero acceder al portal
  Para eliminar ficha

  Escenario: Cargando Portal de referencia
    Dado PPB003-CAPF080 - Accedo al Navegador
    Y PPB003-CAPF080 - Aceptar Cookies
    Y PPB003-CAPF080 - Autentico usuario
    Y PPB003-CAPF080 - Clickar icono papelera
    Y PPB003-CAPF080 - Clickar cancelar eliminacion
    Entonces PPB003-CAPF080 - Validar ficha eliminada



