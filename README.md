#  Bookstore REST API (Spring Boot + MySQL)

A complete backend RESTful API for managing books and authors using **Spring Boot**, **Spring Data JPA**, and **MySQL**. Includes full CRUD support, pagination, Postman collection, Swagger UI, and database export file.

---

##  Tech Stack

| Layer         | Technology                |
|---------------|---------------------------|
| Language      | Java 21                   |
| Framework     | Spring Boot, Spring Data JPA |
| Database      | MySQL                     |
| API Testing   | Postman, Swagger UI       |
| Tooling       | IntelliJ IDEA, Git, GitHub |

---

##  How to Run the Project

1. **Clone the Repository**
```bash
   git clone https://github.com/your-username/bookstore-api.git
   cd bookstore-api 
```
2. **MySQL Setup**

   - Create database: `bookstore_db`

   - Import the dump:

``` sql 
SOURCE db/bookstore_schema.sql;

```

3. **Configure application.properties**

``` properties
spring.datasource.url=jdbc:mysql://localhost:3306/bookstore_db
spring.datasource.username=root
spring.datasource.password=your_password

```

4. **Run the Project**

   - Using IntelliJ :

``` bash
./mvnw spring-boot:run

```

---

##  API Endpoints

-  Book APIs

| Method | Endpoint                      | Description               |
| ------ | ----------------------------- | ------------------------- |
| GET    | `/api/books`                  | Get books (paginated)     |
| GET    | `/api/books/all`              | Get all books (no paging) |
| POST   | `/api/books`                  | Create a new book         |
| DELETE | `/api/books/{id}`             | Delete book by ID         |
| GET    | `/api/books/{id}`             | Get book by ID            |
| GET    | `/api/books/filter?genre=xyz` | Filter books by genre     |


-  Author APIs

| Method | Endpoint            | Description         |
| ------ | ------------------- | ------------------- |
| GET    | `/api/authors`      | Get all authors     |
| POST   | `/api/authors`      | Create new author   |
| DELETE | `/api/authors/{id}` | Delete author by ID |

---

## API Testing Tools

**Swagger UI**
  
``` bash
http://localhost:8080/swagger-ui/index.html

```

**Postman**

- Collection file path:

``` bash
postman/bookstore-api.postman_collection.json

```
---

##  MySQL Dump

> Full database export (tables + data)

``` bash
db/bookstore_schema.sql

```

---


##  Sample JSON Payloads

**Author**

``` json
{
  "name": "James Gosling",
  "bio": "Creator of Java Programming Language at Sun Microsystems."
}

```

**Book**
``` json
{
  "title": "The Java Programming Language",
  "genre": "Programming",
  "price": 499.99,
  "author": {
    "id": 1
  }
}

```