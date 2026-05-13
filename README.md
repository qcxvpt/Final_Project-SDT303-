# Final Project – Distributed Systems (REST API)

## Project Title
Task Management REST API (AWS Deployment)

## Selected Option
Option 2: REST API Service for a Complex Domain

---

## Project Description

This project is a RESTful web service built using Java 21 and Spring Boot.  
It demonstrates the design and implementation of a distributed system with client-server communication using HTTP and REST principles.

The system is a simple Task Management API where users can create, read, update, and delete tasks.

Each task contains:
- unique ID (UUID)
- title
- completion status (true/false)
- creation timestamp
- update timestamp

The application is deployed on AWS EC2 instances and exposed through an AWS Application Load Balancer (ALB), allowing public access to the API.

---

## Features

The API supports the following operations:

- Create a task
- Get all tasks
- Get task by ID
- Update task
- Delete task
- Mark task as completed/uncompleted

Additional features:
- input validation
- error handling for invalid requests
- proper HTTP status codes
- JSON request/response format

---

## Technologies Used

- Java 21
- Spring Boot
- Spring Web
- Maven
- JUnit 5
- AWS EC2 (Ubuntu)
- AWS Application Load Balancer (ALB)
- Git & GitHub

---

## Architecture

The project follows a layered architecture:

- Controller Layer – handles HTTP requests
- Service Layer – contains business logic
- Model Layer – defines Task entity
- DTO Layer – handles request validation and data transfer
- Exception Handling – global exception handler for errors

This separation improves readability, maintainability, and scalability.

---

## API Endpoints

### Create Task
POST /api/tasks

### Get All Tasks
GET /api/tasks

### Get Task by ID
GET /api/tasks/{id}

### Update Task
PUT /api/tasks/{id}

### Delete Task
DELETE /api/tasks/{id}

---

## Example Request

POST /api/tasks
```json
{
  "title": "Final project",
  "completed": false
}


#How to Run
Clone repository
git clone https://github.com/qcxvpt/Final_Project-SDT303-.git
cd Final_Project-SDT303-
Build project
mvn clean install
Run application
mvn spring-boot:run

or

java -jar target/tasks-api-1.0.0-SNAPSHOT.jar
Tests

Run tests using:

mvn test

Tests cover:

service logic
valid task creation
invalid input handling
task retrieval
error scenarios
Deployment

The application is deployed on AWS:

EC2 instances (Ubuntu)
Application Load Balancer (ALB)
Target Group with 3 healthy instances

Base URL:
http://api-alb-2050251788.eu-central-1.elb.amazonaws.com

Example Usage
Create Task
curl -X POST http://api-alb-2050251788.eu-central-1.elb.amazonaws.com/api/tasks \
-H "Content-Type: application/json" \
-d '{"title":"Test task","completed":false}'
Get Tasks
curl http://api-alb-2050251788.eu-central-1.elb.amazonaws.com/api/tasks
Design Decisions
Layered architecture used for clean separation of logic
DTOs used for validation and request safety
Global exception handler ensures consistent error responses
In-memory storage used for simplicity
RESTful principles followed strictly
Limitations
No database (data is not persistent after restart)
No authentication system
Single domain (Task only)
