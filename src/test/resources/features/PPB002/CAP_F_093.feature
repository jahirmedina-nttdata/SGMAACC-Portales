#language: es

@PPB002-CAP_F_093
Característica: PPB002-CAP_F_093 - Visualizar acceso al componente Submenu
  Como un usuario comun
  Quiero acceder a la pagina principal
  Para validar acceso al submenu

  Escenario: Cargando el Portal Web
    Dado PPB002-CAPF093 - Cargando el Navegador
    Cuando PPB002-CAPF093 - Acepta las Cookies
    Y PPB002-CAPF093 - Posicionar sobre el menu Areas Tematicas
    Y PPB002-CAPF093 - Pulsar sobre el submenu Atmosfera
    Y PPB002-CAPF093 - Pulsar sobre el componente La calidad del aire
    Entonces PPB002-CAPF093 - Validar acceso al componente

