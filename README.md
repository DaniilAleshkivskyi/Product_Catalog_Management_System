# Product Catalog Management API

## How to run
### Option 1 - IDE
1. Clone the repository
   `git clone https://github.com/DaniilAleshkivskyi/Product_Catalog_Management_System.git`
2. Open project in IDE
3. Wait for Maven to download dependencies
4. Find and run `ProductCatalogApplication.java`

### Option 2 - Terminal
1. Clone the repository
   `git clone https://github.com/DaniilAleshkivskyi/Product_Catalog_Management_System.git`
2. Navigate to project folder
   `cd Product_Catalog_Management_System`
3. Run the application
   `./mvnw spring-boot:run`
4. API will be available at http://localhost:8080

## API Endpoints
 - CURL is shown in next section
### Postman
#### Producers
- `GET http://localhost:8080/api/producers` - get all producers
- `POST http://localhost:8080/api/producers` - create producer
- `PUT http://localhost:8080/api/producers/{id}` - update producer
- `DELETE http://localhost:8080/api/producers/{id}` - delete producer

#### Products
- `GET http://localhost:8080/api/products` - get all products
- `POST http://localhost:8080/api/products` - create product
- `PUT http://localhost:8080/api/products/{id}` - update product
- `DELETE http://localhost:8080/api/products/{id}` - delete product

#### Product Attributes
- `GET http://localhost:8080/api/product-attributes` - get all attributes
- `POST http://localhost:8080/api/product-attributes` - create attribute
- `PUT http://localhost:8080/api/product-attributes/{id}` - update attribute
- `DELETE http://localhost:8080/api/product-attributes/{id}` - delete attribute
- 
#### Example requests
Create producer:
POST /api/producers
```json
{
    "name": "Samsung",
    "description": "South Korean electronics company"
}
```

Create product:
POST /api/products
```json
{
"producer": { "id": 1 }
}
```

Add attribute to product:
POST /api/product-attributes
```json
{
"name": "color",
"attributeValue": "black",
"product": { "id": 1 }
}
```

### CURL
#### Producers
- GET `curl http://localhost:8080/api/producers`
- POST `curl -X POST http://localhost:8080/api/producers -H "Content-Type: application/json" -d '{"name": "Samsung", "description": "South Korean electronics company"}'`
- PUT `curl -X PUT http://localhost:8080/api/producers/{id} -H "Content-Type: application/json" -d '{"name": "Samsung Electronics", "description": "Updated description"}'`
- DELETE `curl -X DELETE http://localhost:8080/api/producers/{id}`

#### Products
- GET `curl http://localhost:8080/api/products`
- GET with id filtering `curl http://localhost:8080/api/products/by-producer/{producerId}`
- POST `curl -X POST http://localhost:8080/api/products -H "Content-Type: application/json" -d '{"producer": {"id": 1}}'`
- PUT `curl -X PUT http://localhost:8080/api/products/{id} -H "Content-Type: application/json" -d '{"producer": {"id": 2}}'`
- DELETE `curl -X DELETE http://localhost:8080/api/products/{id}`

#### Product Attributes
- GET `curl http://localhost:8080/api/product-attributes`
- POST `curl -X POST http://localhost:8080/api/product-attributes -H "Content-Type: application/json" -d '{"name": "color", "attributeValue": "black", "product": {"id": 1}}'`
- PUT `curl -X PUT http://localhost:8080/api/product-attributes/{id} -H "Content-Type: application/json" -d '{"name": "color", "attributeValue": "white"}'`
- DELETE `curl -X DELETE http://localhost:8080/api/product-attributes/{id}`


## Database

The project uses H2 file-based database.
Data is stored locally in the `/data` folder and persists between restarts.

## Additional implementations
 - Searching products by id, Request: `GET http://localhost:8080/api/products/by-producer/{id}`

## Tech Stack
- Java 21
- Spring Boot 3.5.11
