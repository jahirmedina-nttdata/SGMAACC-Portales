#language: es
@PPB001-CAP_F_034

Característica: PPB001-CAP_F_034 - Visualizar busqueda de Espacios Naturales y Equipamiento
  Como un usuario comun
  Quiero acceder al portal web
  Para buscar en espacios naturales

  Escenario: Cargando Portal Ventana Visitante
    Dado PPB001-CAPF034 - Accedo al Navegador
    Cuando PPB001-CAPF034 - Acepto Cookies
    Y PPB001-CAPF034 - Buscar por texto bahia
    Y PPB001-CAPF034 - Clickar buscar
    Entonces PPB001-CAPF034 - Validar ficha
