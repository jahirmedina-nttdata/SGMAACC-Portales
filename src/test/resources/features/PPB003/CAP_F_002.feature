#language: es
@PPB003-CAP_F_002

Característica: PPB003-CAP_F_002 - Autenticacion
  Como un usuario
  Quiero acceder al portal
  Para autenticarse

  Escenario: Cargando Portal Login
    Dado PPB003-CAPF002 - Accedo al Navegador
    Y PPB003-CAPF002 - Aceptar Cookies
    Y PPB003-CAPF002 - Autentico usuario
    Y PPB003-CAPF002 - Acceder a Ventana Visitante
    Entonces PPB003-CAPF002 - Valida acceso correcto


