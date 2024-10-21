# Proyecto Prueba Nequi

## Descripción

Este proyecto es una API para gestionar franquicias, construida utilizando Spring Boot y PostgreSQL.

## Configuración del Entorno

1. **Clona el Repositorio**:
   ```bash
   git clone https://github.com/johjanbaquerom/nequi_franquicias.git
   
se deben construir y levatra los conteneros
docker-compose up --build

la mejor manera de ejecutar el serviocio con docker es iyilizando este comando 

./gradlew bootRun

urls de las peticiones desde postman 

FRANQUICIAS
POST: http://localhost:8080/franquicias
jSON
{
"nombre": "Alkosto"
}
GET: http://localhost:8080/franquicias

GETID: http://localhost:8080/franquicias/{id}

PUT: http://localhost:8080/franquicias/{id}
JSON
{
"nombre": "EXITO"
}
DELETE: http://localhost:8080/franquicias/{id}

SUCURSALES
POST:http://localhost:8080/franquicias/{idfranquicia}/sucursales para crear una sucursal a esa franquicia
{
"nombre": "cali"
}
GET:http://localhost:8080/franquicias/{idfranquicia}/sucursales
Papa que devuelva todas las sucursales que tiene esa franquicia

GETID:http://localhost:8080/franquicias/{idfranquicia}/sucursales/1

PUT:http://localhost:8080/franquicias/{idfranquicia}/sucursales/1
{
"nombre": "medellin"
}

PRODUCTOS

POST: http://localhost:8080/sucursales/{idsucursal}/productos para crear un producto en esa sucursal
{
"nombre": "carro",
"stock": 15800000
}

GET: http://localhost:8080/sucursales/{idsucursal}/productos/mayor-stock para obtener el producto con mayor estock en la sucursal

GETID: http://localhost:8080/sucursales/{idsucursal}/productos/{id}

PUT:http://localhost:8080/sucursales/{idsucursal}/productos/{id}
{
"nombre": "Producto Actualizado",
"stock": 550000
}

DELETE: http://localhost:8080/sucursales/{idsucursal}/productos/{id}

esto en general como est funcionando el servicio solicitado y los endpoints 
