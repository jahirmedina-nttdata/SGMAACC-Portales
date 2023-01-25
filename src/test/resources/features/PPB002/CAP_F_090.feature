#language: es

@PPB002-CAP_F_090
Característica: PPB002-CAP_F_090 - Visualizar Funcionamiento Menu Navegador
  Como un usuario comun
  Quiero acceder a la pagina principal
  Para validar el funcionamiento del menu

  Escenario: Cargando el Portal Web
    Dado PPB002-CAPF090 - Cargando el Navegador
    Cuando PPB002-CAPF090 - Acepta las Cookies
    Y PPB002-CAPF090 - Posicionar sobre el menu Actualidad
    Y PPB002-CAPF090 - Pulsar sobre el submenu Agenda y Eventos
    Entonces PPB002-CAPF090 - Validar navegacion correcta
