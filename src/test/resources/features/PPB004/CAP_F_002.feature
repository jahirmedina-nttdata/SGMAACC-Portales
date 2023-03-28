#language: es
@PPB004-CAP_F_002

Característica: PPB004-CAP_F_002 - Autenticacion de Usuario
  Como un usuario registrado
  Quiero ingresar mis credenciales
  Para validar que el usuario se encuentra autenticado

  Esquema del escenario: Acceder como usuario a la web Referencia
    Dado PPB004-CAPF002 - Accedo al portal
    Cuando PPB004-CAPF002 - Acepto Cookies
    Y PPB004-CAPF002 - Escribo "<usuario>" en el cuadro de texto Nombre de Usuario
    Y PPB004-CAPF002 - Escribo "<contraseña>" en el cuadro de texto Contraseña
    Y PPB004-CAPF002 - Accedo al Portal de Caza y Pesca
    Entonces PPB004-CAPF002 - Validamos autenticacion en Portal Caza y Pesca
    Ejemplos:
      | usuario       | contraseña |
      | cmaot_testing | Liferay*21 |
