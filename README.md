Este proyecto gestiona los datos consumidos desde la API llamada Gutendex, misma que ofrece una gran variedad de información sobre libros.
La informacion es tratada por el programa de manera que se puedan consultar datos especificos sobre cada libro, por medio de un menu.

![imagen](https://github.com/user-attachments/assets/bd7057c6-ecb1-4f02-b0b7-019c967de700)

La primer opcion del menu, solicita el nombre de algun libro para hacer una consulta de la informacion del libro, una vez consultada y que haya encontrado informacion en la API, el programa devuelve la informacion y hace el registro de esta informacion en una base de datos para poder consultar posteriormente, de otra forma sino encuenra la informacion buscada mostrara el mensaje de no encontrado.
![imagen](https://github.com/user-attachments/assets/0ae26447-946b-40a2-b27d-1fc0e2ae01bb)
![imagen](https://github.com/user-attachments/assets/9084db81-1d64-40de-b6a8-1a472e534676)

Al seleccionar la opcion dos del menu, se mostraran los registros de las busquedas realizadas.
![imagen](https://github.com/user-attachments/assets/c98eb92b-b9cb-4e8b-b62f-48e941d344cb)
Si se elige la opcion numero 3, se mostraran un listado de los autores de los cuales se han realizado busquedas.
![imagen](https://github.com/user-attachments/assets/d1ba3cab-6142-4843-8874-4e76898f1ed7)
Cuando se selecciona la opcion numero 4, se solicta un año en el cual se buscaran los autores que se encontraban con vida en dicho año.
![imagen](https://github.com/user-attachments/assets/6ceef2ea-6c8d-496c-bfd5-87ac4729922d)
Al seleccionar la ultima opcion, el programa solicitara el idioma del cual se buscanran los registros de libros con el idioma seleccionado.
![imagen](https://github.com/user-attachments/assets/85aa652f-3b13-476d-b382-0ad87e2ec9c6)
La opcion de salir del programa se ejecuta al digitar 0.

Tecnologias utilizadas

    Java JDK: versión: 17 en adelante

    Maven: versión 4 en adelante

    Spring: versión 3.2.3 - https://start.spring.io/

    Postgres: versión 16 en adelante -

    IDE (Entorno de desenvolvimento integrado) IntelliJ IDEA- opcional -

Configuración al crear el proyecto en Spring Initializr:

    Java (versión 17 en adelante)

    Maven (Initializr utiliza la versión 4)

    Spring Boot (versión 3.2.3)

    Proyecto en JAR

Dependencias para agregar al crear el proyecto en Spring Initializr:

    Spring Data JPA

    Postgres Driver








