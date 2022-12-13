#language: es
@PPB003-CAP_F_015 @skip @KO

Característica: PPB003-CAP_F_015 - Validar Ficha Tecnica
  Como un usuario
  Quiero acceder al portal
  Para validar ficha

  Escenario: Cargando Portal Referencial
    Dado PPB003-CAPF015 - Accedo al Navegador
    Y PPB003-CAPF015 - Aceptar Cookies
    Y PPB003-CAPF015 - Autenticar usuario
    Y PPB003-CAPF015 - Ejecutar CAPF003
    Y PPB003-CAPF015 - Consultar codigo RENPA para validar Fecha de Declaracion
    Y PPB003-CAPF015 - Consultar codigo RENPA para validar Datos Tecnicos
    Y PPB003-CAPF015 - Consultar codigo RENPA para validar Superficie Total



