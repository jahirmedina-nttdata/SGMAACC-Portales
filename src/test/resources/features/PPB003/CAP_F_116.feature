#language: es
@PPB003-CAP_F_116

Característica: PPB003-CAP_F_116 - Acceso al buscador de espacios naturales
  Como un usuario comun
  Quiero acceder al portal web
  Para visualizar buscador de espacios naturales

  Escenario: Cargando Portal Ventana Visitante
    Dado PPB003-CAPF116 - Accedo al Navegador
    Cuando PPB003-CAPF116 - Acepto Cookies
    Y PPB003-CAPF116 - Seleccionar Area Recreativa
    Y PPB003-CAPF116 - Seleccionar provincia Almeria
    Y PPB003-CAPF116 - Clickar buscar
    Entonces PPB003-CAPF116 - Validar resultado
