#language: es
@PPB005-CAP_F_001-01

Característica: PPB005-CAP_F_001-01 - Validar Login
  Como un usuario comun
  Quiero acceder al portal
  Para ingresar credenciales

  Esquema del escenario: Ingreso al Portal
    Dado PPB005-CAPF00101 - Accedo al portal
    Cuando PPB005-CAPF00101 - Acepto Cookies
    Y PPB005-CAPF00101 - Escribimos "<usuario>" en Nombre de Usuario
    Y PPB005-CAPF00101 - Escribimos "<contraseña>" en Contraseña
    Entonces PPB005-CAPF00101 - realizamos click en el boton Acceder
    Ejemplos:
      | usuario       | contraseña |
      | cmaot_testing | Liferay*21 |

