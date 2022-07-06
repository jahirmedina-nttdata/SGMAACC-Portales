#language: es
@CAP_F_003

Característica: CAP_F_003 - Valorar publicacion de blog
  Como un usuario comun
  Quiero valorar el contenido de un post
  Para seleccionar el valor por el cual se valorara

  Esquema del escenario: Cargando el Post a Valorar
    Dado CAPF003 - Cargando el Navegador
    Cuando CAPF003 - Se haya cargado el blog
    Y CAPF003 - Aceptar las cookies
    Entonces CAPF003 - Valorar el Post con : "<valoracion>"
    Ejemplos:
      | valoracion |
      | 1          |
      | 2          |
      | 3          |
      | 4          |
      | 5          |

