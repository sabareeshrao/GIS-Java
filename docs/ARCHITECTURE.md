# Architecture

## Current state after Batch 002

The application is intentionally still a small Java 21 console project focused on Java startup and entry-point behavior.

```text
GIS-Java/
├── pom.xml
├── .gitignore
├── docs/
│   └── batches/
│       ├── BATCH_000.md
│       ├── BATCH_001.md
│       └── BATCH_002.md
└── src/
    └── main/
        └── java/
            └── com/
                └── gisjava/
                    └── bootstrap/
                        ├── GeoSurveyBootstrap.java
                        ├── GeoSurveyLauncher.java
                        ├── NonPublicMainExperiment.java
                        ├── NonStaticMainExperiment.java
                        └── SurveyLauncherBase.java
```

`GeoSurveyBootstrap` is the normal application entry point and now demonstrates command-line argument handling and main method overloading.

`NonStaticMainExperiment` and `NonPublicMainExperiment` are intentional launcher-failure experiments.

`SurveyLauncherBase` and `GeoSurveyLauncher` demonstrate that static main methods are hidden rather than overridden.

Source code now uses batch trace comments such as `BATCH 002 | STEP 03 | Q0018` so a reader can identify where a learning change entered the project. Batch 000 uses `PROJECT FOUNDATION` because it consumed no interview questions.

These classes are learning experiments, not the final application architecture.

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
