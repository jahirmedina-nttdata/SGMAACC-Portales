#language: es
@PPB002-CAP_F_001

Característica: PPB002-CAP_F_001 - Valorar publicacion de blog
  Como un usuario comun
  Quiero valorar el contenido de un post
  Para seleccionar el valor por el cual se valorara

  Esquema del escenario: Cargando el Post a Valorar
    Dado PPB002-CAPF001 - Cargando el Navegador
    Cuando PPB002-CAPF001 - Se haya cargado el blog
    Y PPB002-CAPF001 - Aceptar las cookies
    Entonces PPB002-CAPF001 - Valorar el Post con : "<valoracion>"
    Ejemplos:
      | valoracion |
      | 1          |
      | 2          |
      | 3          |
      | 4          |
      | 5          |

