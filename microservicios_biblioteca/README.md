# Microservicios Biblioteca Digital

Proyecto para IntelliJ IDEA con Spring Boot, MySQL, Docker, Swagger, MapStruct y OpenFeign.

## Microservicios

- libros-service: http://localhost:8081
- prestamos-service: http://localhost:8082

## Base de datos

- libros_db en puerto 3309
- prestamos_db en puerto 3310

## Ejecutar con Docker

```bash
docker compose up --build
```

## Ejecutar desde IntelliJ usando MySQL en Docker

Levantar bases de datos:

```bash
docker compose up -d mysql-libros mysql-prestamos
```

Luego ejecutar estas clases:

- com.idat.libros.LibrosServiceApplication
- com.idat.prestamos.PrestamosServiceApplication

## Swagger

- http://localhost:8081/swagger-ui.html
- http://localhost:8082/swagger-ui.html

## Endpoints principales

### Libros

- GET http://localhost:8081/api/libros
- GET http://localhost:8081/api/libros/1
- POST http://localhost:8081/api/libros
- PUT http://localhost:8081/api/libros/1
- DELETE http://localhost:8081/api/libros/1

### Prestamos

- GET http://localhost:8082/api/prestamos
- GET http://localhost:8082/api/prestamos/1
- GET http://localhost:8082/api/prestamos/1/detalle
- POST http://localhost:8082/api/prestamos
- PUT http://localhost:8082/api/prestamos/1
- DELETE http://localhost:8082/api/prestamos/1

## Comunicación entre microservicios

El endpoint `GET /api/prestamos/{id}/detalle` consume el microservicio `libros-service` mediante OpenFeign para mostrar los datos del libro dentro del préstamo.
