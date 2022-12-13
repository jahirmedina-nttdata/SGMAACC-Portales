#language: es
@PPB003-CAP_F_094

Característica: PPB003-CAP_F_094 - Acortar Texto de avisos
  Como un usuario autenticado
  Quiero acceder al portal
  Para acortar texto

  Escenario: Cargando Portal de referencia
    Dado PPB003-CAPF094 - Accedo al Navegador
    Y PPB003-CAPF094 - Aceptar Cookies
    Y PPB003-CAPF094 - Autentico usuario
    Y PPB003-CAPF094 - Acceder a contenido web
    Y PPB003-CAPF094 - Acceder a carpeta Avisos
    Y PPB003-CAPF094 - Copiar Resumen a descripcion
    Y PPB003-CAPF094 - Clickar Publicar
    Entonces PPB003-CAPF094 - Validar cambio
    Y PPB003-CAPF094 - Copiar Descripcion a Resumen




