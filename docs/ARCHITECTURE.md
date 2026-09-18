# Architecture

## Current state after Batch 001

The application is intentionally still a very small Java 21 console program.

```text
GIS-Java/
├── pom.xml
├── .gitignore
├── docs/
│   └── batches/
│       ├── BATCH_000.md
│       └── BATCH_001.md
└── src/
    └── main/
        └── java/
            └── com/
                └── gisjava/
                    └── bootstrap/
                        └── GeoSurveyBootstrap.java
```

`GeoSurveyBootstrap` proves the first runtime path and reports the Java version, JVM implementation and operating system. It is a learning bootstrap, not the final application architecture.

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
