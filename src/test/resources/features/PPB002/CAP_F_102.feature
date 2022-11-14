#language: es

@PPB002-CAP_F_102
Característica: PPB002-CAP_F_102 - Visualizar acceso al componente Submenu
  Como un usuario comun
  Quiero acceder a la pagina principal
  Para validar acceso al submenu

  Escenario: Cargando el Portal Web
    Dado PPB002-CAPF102 - Cargando el Navegador
    Cuando PPB002-CAPF102 - Acepta las Cookies
    Y PPB002-CAPF102 - Posicionar sobre el menu Areas Tematicas
    Y PPB002-CAPF102 - Pulsar sobre el submenu Atmosfera
    Y PPB002-CAPF102 - Pulsar sobre el componente La calidad del aire
    Entonces PPB002-CAPF102 - Validar acceso al componente

