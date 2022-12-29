# simple-CURD-Spring-Pratice

## Tech Stack
- Java 19
- Spring
- PostgreSQL

## Package Management
- Meven

## Restful Test tool
- Postman

## Command
- java -jar demo-0.0.1-SNAPSHOT.jar

## port
- localhost:8080

## API end point

```
GET http://localhost:8080/api/v1/student
```

```
POST http://localhost:8080/api/v1/student
Content-Type: application/json

{
  "name": "Name",
  "email": "Name@gmail.com",
  "dob": "2000-01-07"
}
```
```
DELETE http://localhost:8080/api/v1/student/{id_number}
```
```
PUT http://localhost:8080/api/v1/student/{id_number}?name={Name}&email=n{email}
Content-Type: application/json
```
