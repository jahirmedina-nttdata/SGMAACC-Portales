#language: es

@PPB002-CAP_F_002_01
Característica: PPB002-CAP_F_002_01 - Buscador General
  Como un usuario comun
  Quiero acceder a la pagina principal
  Para validar consulta

  Esquema del escenario: Buscador General
    Dado PPB002-CAPF00201 - Cargando el Portal Web
    Cuando PPB002-CAPF00201 - Aceptar las cookies01
    Y PPB002-CAPF00201 - hacemos click en buscador
    Y PPB002-CAPF00201 - escribimos "<tema>" en el buscador y pulsamos enter
    Entonces PPB002-CAPF00201 - visualizamos la filtracion de la busquedad

    Ejemplos:
      | tema |
      | agua |

  