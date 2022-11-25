#language: es
@PPB004-CAP_FN_002 @bloqued

Característica: PPB004-CAP_FN_002 - Autenticacion de Usuario
  Como un usuario registrado
  Quiero ingresar mis credenciales
  Para validar que el usuario se encuentra autenticado

  Esquema del escenario: Acceder como usuario a la web Referencia
    Dado PPB004-CAPFN002 - Accedo al portal
    Cuando PPB004-CAPFN002 - Acepto Cookies
    Y PPB004-CAPFN002 - Escribo "<usuario>" en el cuadro de texto Nombre de Usuario
    Y PPB004-CAPFN002 - Escribo "<contraseña>" en el cuadro de texto Contraseña
    Entonces PPB004-CAPFN002 - Validamos el usuario
    Ejemplos:
      | usuario       | contraseña |
      | cmaot_testing | Liferay*21 |

