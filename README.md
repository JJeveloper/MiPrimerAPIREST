## API REST

### Descripcion
Pequeño proyecto que consiste en crear una api rest basica.

### Tecnologías Implementadas

| Tecnologias   | Descripcion               | 
| :---          | :---                      |    
| Java          |Lenguaje de programacion   |
| Spring Boot   | Framework                 |
| Intellj IDEA  | IDE                       |
| Maven         | Gestor de proyectos       |
| JPA-Hibernate | Framework para el mapeo de objetos y persistencia en la db |
| PostMan       | Puebas de la API          |
| Mysql         | Motor de base de datos    |
| Git           | Control de versiones      |

## Metodos HTTP

**GET: mostrar todos los datos**
 ```bash
  http://localhost:8092/primeraapi/v1/personas
```
**GET: mostrar un dato por id**
 ```bash
  http://localhost:8092/primeraapi/v1/persona/id
```
**POST: Guardar un dato**
```bash
  http://localhost:8092/primeraapi/v1/persona
```
**JSON**
```bash
 {
    "nombre": "Ruben",
    "apellido": "Macario",
    "correo": "rumamaca@hhh.com"
 }
```
**PUT: editar Producto por Id**
```bash
  http://localhost:8092/primeraapi/v1/persona/id
```
**DELETE: Eliminar Producto por Id**
```bash
  http://localhost:8092/primeraapi/v1/persona/id
```

### Despliege
- Descargar el proyecto y abrir en **Intellj IDEA**, link de descarga
 ```bash
  https://github.com/JJeveloper/MiPrimerAPIREST.git
```
- Ejecutar en **MYSQL WORKBENCH** el siquiente script (se encuentra en la raiz del proyecto)
 ```bash
  primeraapi.sql
```
