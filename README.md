# Student-Crud-Api

This project implements CRUD (Create, Read, Update, Delete) operations for student records in a straightforward manner. It utilizes the following technologies:

Java Spring Boot: A powerful framework for building robust and scalable applications.
Maven: A build automation tool that manages dependencies and project structure.
MySQL Database: An open-source relational database management system (RDBMS) based on structured query laungage(SQL).


Create: Add a new student record.
Show all: Retrieve a list of all students from the database.
Find by ID: Search for a student by their unique ID.
Update by ID: Modify student information based on their ID.
Delete by ID: Remove a student record by their ID.

Environment

Intellij IDE
Java 11
Spring Initializr

Operating Instructions

Download the source code and import it into your preferred code editor (such as Eclipse or IntelliJ).
Since the project is built with Maven, simply import it into your IDE and build the project to resolve dependencies.
If there are no errors, run the program.
Use Postman to test the API endpoints.
Testing URLs

Add student (POST method): Send a request to http://localhost:8080/api/v1/student-ms/add with the following JSON body:

{
     
    "firstName": "Ognjen",
    "lastName": "Andjelic",
    "email": "andjelicb.ognjen@gmail.com",
  
}


List all students (GET method): Access http://localhost:8080/api/users .

Find student by ID (GET method): Use // http://localhost:8080/api/users/1

Update student by ID (PUT method): Use http://localhost:8080/api/users/1

Delete student by ID (DELETE method): Delete a student by accessing http://localhost:8080/api/users/{id}.

Feel free to explore the project and test the endpoints! The full code is available on GitHub 1.




