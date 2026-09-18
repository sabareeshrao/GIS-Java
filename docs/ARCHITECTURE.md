# Architecture

## Current state after Batch 000

The repository now has a minimal Maven Java 21 foundation. No production application architecture is forced yet.

Current structure:

```text
GIS-Java/
├── pom.xml
├── .gitignore
├── docs/
└── src/
    └── main/
        └── java/
```

## Planned evolution

1. Java console experiments
2. Object-oriented GIS domain model
3. In-memory validation and collections
4. File import/export and processing
5. Concurrent GIS processing jobs
6. JDBC and relational persistence
7. Spring Core
8. Spring Boot REST backend
9. JPA/Hibernate and PostgreSQL/PostGIS
10. Security, messaging and async processing
11. Observability and production hardening
12. Distributed-system exercises where they add learning value

Candidate domain objects include SurveyProject, SurveyPoint, Coordinate, SurveyDataset, SurveyFile, ImportJob, ProcessingJob, ValidationResult, QualityCheck, ProjectAssignment, Deliverable and AuditLog.

Do not force final-state architecture into early batches.
