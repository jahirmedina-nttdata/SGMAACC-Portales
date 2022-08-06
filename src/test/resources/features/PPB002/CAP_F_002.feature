#language: es

@PPB002-CAP_F_002
Característica: PPB002-CAP_F_002 - Visualizar la pagina principal de Portal Web
  Como un usuario comun
  Quiero acceder a la pagina principal
  Para validar el funcionamiento

  Escenario: Cargando el Portal Web
    Dado PPB002-CAPF002 - Cargando el Navegador
    Y PPB002-CAPF002 - Aceptar las cookies

  Esquema del escenario: Buscador General
    Dado PPB002-CAPF00201 - Cargando el Portal Web
    Cuando PPB002-CAPF00201 - Aceptar las cookies01
    Y PPB002-CAPF00201 - hacemos click en buscador
    Y PPB002-CAPF00201 - escribimos "<tema>" en el buscador y pulsamos enter
    Entonces PPB002-CAPF00201 - visualizamos la filtracion de la busquedad

    Ejemplos:
      | tema |
      | agua |


  Escenario: Funcionamiento del Componente - Carrusel
    Dado PPB002-CAPF00202 - Cargando el Navegador
    Cuando PPB002-CAPF00202 - Aceptar las cookies0
    Y PPB002-CAPF00202 - Ubicarnos en el carrusel


  Escenario: Cargando el Carrusel Ambiental
    Dado PPB002-CAPF00203 - Cargando el Navegador
    Cuando PPB002-CAPF00203 - Aceptamos las cookies
    Y PPB002-CAPF00203 - Ubicarnos en el carrusel
    Y PPB002-CAPF00203 - Clickar en elemento Geodiversidad
    Y PPB002-CAPF00203 - Deslizar de izquierda a derecha
    Y PPB002-CAPF00203 - Clickar en elemento


  Escenario: Cargando el Carrusel Noticia
    Dado PPB002-CAPF00204 - Cargando el Navegador
    Cuando PPB002-CAPF00204 - Aceptamos las cookies
    Y PPB002-CAPF00204 - Ubicarnos seccion noticia
    Y PPB002-CAPF00204 - Deslizar de izquierda a derecha noticia
    Y PPB002-CAPF00204 - Clickar en noticia
    Y PPB002-CAPF00204 - Clickar en categoria noticia
    Y PPB002-CAPF00204 - Clickar en todas las noticias


  Escenario: Funcionamiento del Componente - Directo A
    Dado PPB002-CAPF00205 - Accedemos el Portal Web DA
    Cuando PPB002-CAPF00205 - Ubicar Directo A
    Y PPB002-CAPF00205 - Clickar en Ventana del Visitante


  Escenario: Funcionamiento del Componente - Contenidos destacados
    Dado PPB002-CAPF00206 - Accedemos el Portal Web CD
    Cuando PPB002-CAPF00206 - Ubicar Contenido destacado
    Y PPB002-CAPF00206 - Clickar en lo.mas.buscado


  Escenario: Navegar Pestaña Lo Ultimo
    Dado PPB002-CAPF00207 - Accedemos el Portal Web LU
    Y PPB002-CAPF00207 - Aceptar las cookies02
    Y PPB002-CAPF00207 - Clickar en lo ultimo
    Y PPB002-CAPF00207 - Clickar en Plan Forestal Andaluz
    Y PPB002-CAPF00207 - Clickar en Inicio LU
    Y PPB002-CAPF00207 - Clickar en Ver Mas


  Escenario: Navegar Pestaña Lo Mas Valorado
    Dado PPB002-CAPF00208 - Accedemos el Portal Web MV
    Y PPB002-CAPF00208 - Aceptar las cookies03
    Y PPB002-CAPF00208 - Clickar en lo Mas Valorado
    Y PPB002-CAPF00208 - Clickar en Gestores de los Residuos


  Escenario: Navegar Pestaña Lo Mas Buscado
    Dado PPB002-CAPF00209 - Accedemos el Portal Web MB
    Y PPB002-CAPF00209 - Aceptar las cookies04
    Y PPB002-CAPF00209 - Clickar en lo Mas Buscado
    Y PPB002-CAPF00209 - Clickar en Servicios


  