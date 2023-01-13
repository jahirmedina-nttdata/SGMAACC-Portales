#language: es
@PPB001-CAP_F_021

Característica: PPB001-CAP_F_021 - Acceso al buscador de espacios naturales
  Como un usuario comun
  Quiero acceder al portal web
  Para visualizar buscador de espacios naturales

  Escenario: Cargando Portal Ventana Visitante
    Dado PPB001-CAPF021 - Accedo al Navegador
    Cuando PPB001-CAPF021 - Acepto Cookies
    Y PPB001-CAPF021 - Seleccionar Area Recreativa
    Y PPB001-CAPF021 - Seleccionar provincia Almeria
    Y PPB001-CAPF021 - Clickar buscar
    Entonces PPB001-CAPF021 - Validar resultado
