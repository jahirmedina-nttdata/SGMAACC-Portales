#language: es

@PPB002-CAP_F_099
Característica: PPB002-CAP_F_099 - Visualizar Funcionamiento Menu Navegador
  Como un usuario comun
  Quiero acceder a la pagina principal
  Para validar el funcionamiento del menu

  Escenario: Cargando el Portal Web
    Dado PPB002-CAPF099 - Cargando el Navegador
    Cuando PPB002-CAPF099 - Acepta las Cookies
    Y PPB002-CAPF099 - Posicionar sobre el menu Actualidad
    Y PPB002-CAPF099 - Pulsar sobre el submenu Agenda y Eventos
    Entonces PPB002-CAPF099 - Validar navegacion correcta
