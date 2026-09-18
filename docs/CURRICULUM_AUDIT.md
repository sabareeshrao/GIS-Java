# Curriculum Audit v2

## Why this audit exists

The original mapping grouped questions mainly by workbook domain/module metadata. That preserved many valid related runs, but it also allowed a small number of semantically misplaced questions to appear before their real prerequisites.

Batch 001 and Batch 002 were already implemented and are correct, so they are frozen. Batch 003 onward has been rebuilt.

## Correction method

Each question now receives:

1. a primary curriculum stage from its actual concept,
2. a logical topic within that stage,
3. a dependency floor for framework-specific or subsystem-specific terms,
4. a difficulty-aware ordering inside the logical topic,
5. a final five-question batch assignment.

Strong dependency floors were explicitly checked for Spring MVC/REST, JPA/Hibernate, Security, Messaging, Microservices and DevOps concepts.

## Examples of corrected placements

| Question | Old placement | Corrected placement | Reason |
|---|---|---|---|
| Q0262 | P0342 / Batch 069 | P1807 / Batch 362, Stage 20 | Spring Boot global exception handling depends on the web/API layer. |
| Q0282 | P0362 / Batch 073 | P1814 / Batch 363, Stage 20 | `@ControllerAdvice` is Spring MVC, not Core Java exception handling. |
| Q0283 | P0363 / Batch 073 | P1815 / Batch 363, Stage 20 | `@RestControllerAdvice` is Spring MVC, not Core Java exception handling. |
| Q0284 | P0364 / Batch 073 | P1816 / Batch 364, Stage 20 | Controller advice comparison belongs to Spring MVC. |
| Q0285 | P0365 / Batch 073 | P1817 / Batch 364, Stage 20 | Handler resolution belongs to Spring MVC exception handling. |
| Q0036 | P0096 / Batch 020 | P2295 / Batch 459, Stage 29 | Agile/Waterfall is project methodology, not Java method fundamentals. |
| Q0531 | P0673 / Batch 135 | P1665 / Batch 333, Stage 19 | Spring Boot classpath/bean discovery requires Spring Boot context. |
| Q0550 | P0692 / Batch 139 | P1550 / Batch 310, Stage 18 | Custom Spring annotations require Spring Core knowledge. |
| Q0553 | P0704 / Batch 141 | P1670 / Batch 334, Stage 19 | Conditional Spring Boot annotations require Spring Boot knowledge. |
| Q0276 | P0356 / Batch 072 | P0762 / Batch 153, Stage 10 | Async exception handling is moved after concurrency/asynchronous Java. |
| Q0888 | P1248 / Batch 250 | P1942 / Batch 389, Stage 22 | `@SpringBootTest` requires the Spring Boot application layer. |
| Q0890 | P1250 / Batch 250 | P1944 / Batch 389, Stage 22 | `@DataJpaTest` requires Spring Boot plus persistence context. |
| Q0952 | P1164 / Batch 233 | P1563 / Batch 313, Stage 19 | Spring Boot starter dependencies are taught with Spring Boot. |
| Q1054 | P1329 / Batch 266 | P1666 / Batch 334, Stage 19 | Spring Boot database migration is taught after Spring Boot is introduced. |
| Q1055 | P1330 / Batch 266 | P1667 / Batch 334, Stage 19 | Spring Boot migration tooling requires Spring Boot context. |
| Q1056 | P1331 / Batch 267 | P1668 / Batch 334, Stage 19 | Zero-downtime Spring Boot schema migration requires Spring Boot context. |
| Q1068 | P1344 / Batch 269 | P1669 / Batch 334, Stage 19 | Multiple-database Spring Boot integration requires Spring Boot context. |

## Consecutive IDs

Consecutive Q IDs are not treated as evidence of a problem. The expanded workbook intentionally contains blocks of related questions, especially the gap-audit additions. They remain consecutive only when they also pass the semantic stage and prerequisite checks.

## Frozen work

- Batch 000 remains the project foundation.
- Batch 001 remains Q0012-Q0016.
- Batch 002 remains Q0017-Q0021.
- No completed source code or completed question status was rewritten by this curriculum audit.