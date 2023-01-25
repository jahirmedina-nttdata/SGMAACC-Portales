#language: es
@PPB003-CAP_F_126

Característica: PPB003-CAP_F_126 - Acceso al buscador de espacios naturales
  Como un usuario comun
  Quiero acceder al portal web
  Para visualizar buscador de espacios naturales

  Escenario: Cargando Portal Ventana Visitante
    Dado PPB003-CAPF126 - Accedo al Navegador
    Cuando PPB003-CAPF126 - Acepto Cookies
    Y PPB003-CAPF126 - Seleccionar Area Recreativa
    Y PPB003-CAPF126 - Seleccionar provincia Almeria
    Y PPB003-CAPF126 - Clickar buscar
    Entonces PPB003-CAPF126 - Validar resultado
