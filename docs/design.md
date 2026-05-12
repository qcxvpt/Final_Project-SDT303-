Architecture:
Client → AWS ALB → 3 EC2 instances → Spring Boot REST API

Components:
- Controller (REST endpoints)
- Service (business logic)
- Model (Task entity)
- DTO (requests/responses)

Design decisions:
- Stateless REST API
- Load balancing via AWS ALB
- In-memory data storage
- Separation of DTO and Model

Limitations:
- No database
- No authentication

Possible improvements:
- Add PostgreSQL
- Add JWT authentication
- Add pagination
