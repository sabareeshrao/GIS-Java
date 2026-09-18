# Project Roadmap v2

## Goal

Build one evolving enterprise-style GIS Survey Operations Platform while covering all 2,308 Java interview questions exactly once as primary curriculum anchors.

Questions are introduced in dependency-first order. Previously learned concepts remain available for reuse in every later batch.

## Ordering policy

Version 2 uses semantic prerequisite floors in addition to workbook metadata. Framework-specific questions cannot appear before the framework or subsystem they depend on.

Examples:

- `@ControllerAdvice` and `@RestControllerAdvice` are placed after Spring Boot and Spring MVC are introduced.
- JPA/Hibernate questions are placed after SQL/JDBC and Spring fundamentals.
- `@SpringBootTest` and `@DataJpaTest` are placed after the application framework and persistence layers exist.
- Kafka/RabbitMQ questions are placed after application integration concepts.
- Microservice-specific questions are placed after the monolithic Spring application foundations.
- Jenkins, Docker, Kubernetes and deployment questions are placed after the application is mature enough to deploy.

## Curriculum stages

| Stage | Curriculum area | Questions | Project order | Approx. batches |
|---:|---|---:|---|---|
| 01 | Java Platform, Entry Point & Basic Toolchain | 19 | P0001-P0019 | 001-004 |
| 02 | Language Fundamentals | 75 | P0020-P0094 | 004-019 |
| 03 | Object-Oriented Domain Modeling | 137 | P0095-P0231 | 019-047 |
| 04 | Core Types, Object Contracts & Standard Utilities | 93 | P0232-P0324 | 047-065 |
| 05 | Exception Handling | 38 | P0325-P0362 | 065-073 |
| 06 | Generics | 31 | P0363-P0393 | 073-079 |
| 07 | Collections | 115 | P0394-P0508 | 079-102 |
| 08 | Functional Java, Optional & Streams | 59 | P0509-P0567 | 102-114 |
| 09 | I/O, NIO, Serialization & Networking | 63 | P0568-P0630 | 114-126 |
| 10 | Concurrency & Asynchronous Java | 195 | P0631-P0825 | 127-165 |
| 11 | JVM Internals, Class Loading, Reflection & GC | 95 | P0826-P0920 | 166-184 |
| 12 | Modern Java, JPMS & Advanced Toolchain | 65 | P0921-P0985 | 185-197 |
| 13 | Algorithms, Recursion & Coding Problems | 66 | P0986-P1051 | 198-211 |
| 14 | SOLID, Clean Code & Design Patterns | 61 | P1052-P1112 | 211-223 |
| 15 | JUnit, Mockito & General Testing | 56 | P1113-P1168 | 223-234 |
| 16 | Build, Source Control, IDEs, Logging & Code Quality | 119 | P1169-P1287 | 234-258 |
| 17 | SQL, JDBC & Database Engineering | 72 | P1288-P1359 | 258-272 |
| 18 | Spring Core | 191 | P1360-P1550 | 272-310 |
| 19 | Spring Boot | 172 | P1551-P1722 | 311-345 |
| 20 | Servlets, Spring MVC, REST & API Design | 107 | P1723-P1829 | 345-366 |
| 21 | JPA, Hibernate & Spring Data Persistence | 112 | P1830-P1941 | 366-389 |
| 22 | Spring Application Testing | 6 | P1942-P1947 | 389-390 |
| 23 | Application Security | 60 | P1948-P2007 | 390-402 |
| 24 | Integration, Messaging & Application Events | 22 | P2008-P2029 | 402-406 |
| 25 | Microservices & Distributed Systems | 109 | P2030-P2138 | 406-428 |
| 26 | CI/CD, Containers, Cloud & Observability | 63 | P2139-P2201 | 428-441 |
| 27 | Production Performance & Incident Engineering | 31 | P2202-P2232 | 441-447 |
| 28 | System Design & Architecture | 20 | P2233-P2252 | 447-451 |
| 29 | Project Experience, Behavioral & Ecosystem Evolution | 56 | P2253-P2308 | 451-462 |

## Final target workflow

Client/project setup -> dataset import -> coordinate validation -> duplicate detection -> PostgreSQL/PostGIS persistence -> GIS processing jobs -> QA/QC -> approval -> reporting/delivery -> monitoring/production support.

## Architecture policy

The architecture is intentionally evolutionary. Early batches remain simple. Databases, frameworks, concurrency, distributed-system patterns and infrastructure are introduced only after their prerequisites are available.

Batch 001 and Batch 002 are frozen because they are already implemented. The corrected mapping begins with Batch 003.

Future remapping must preserve completed batches and re-run all integrity and prerequisite checks.