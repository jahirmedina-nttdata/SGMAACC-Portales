#language: es
@PPB003-CAP_F_095

Característica: PPB003-CAP_F_095 - Acortar Texto de avisos
  Como un usuario autenticado
  Quiero acceder al portal
  Para acortar texto

  Escenario: Cargando Portal de referencia
    Dado PPB003-CAPF095 - Accedo al Navegador
    Y PPB003-CAPF095 - Aceptar Cookies
    Y PPB003-CAPF095 - Autentico usuario
    Y PPB003-CAPF095 - Acceder a contenido web
    Y PPB003-CAPF095 - Acceder a carpeta Avisos
    Y PPB003-CAPF095 - Copiar Resumen a descripcion
    Y PPB003-CAPF095 - Clickar Publicar
    Entonces PPB003-CAPF095 - Validar cambio
    Y PPB003-CAPF095 - Copiar Descripcion a Resumen




