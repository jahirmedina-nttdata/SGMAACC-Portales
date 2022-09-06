#language: es
@PPB002-CAP_F_001

Característica: PPB002-CAP_F_001 - Login Integración LDAP
  Como un usuario comun
  Quiero acceder al portal
  Para comprobar el correcto funcionamiento de la Integración LDAP con credenciales correctas

  Esquema del escenario: Acceder al Sistema correctamente
    Dado PPB002-CAPF001 - Accedo al portal
    Cuando PPB002-CAPF001 - acepto Cookies
    Y PPB002-CAPF001 - escribimos "<usuario>" en el cuadro de texto Nombre de Usuario
    Y PPB002-CAPF001 - escribimos "<contraseña>" en el cuadro de texto Contraseña
    Entonces PPB002-CAPF001 - realizamos click en el boton Acceder
    Ejemplos:
      | usuario       | contraseña |
      | cmaot_testing | Liferay*21 |

