# GIS-Java

## GeoSurvey Operations Platform

GIS-Java is a long-form hands-on Java learning project built around **2,308 Java interview questions** and a realistic **GIS / aerial mapping / topographic survey** domain.

The repository will evolve from an empty Java project into an enterprise-style GeoSurvey Operations Platform. Interview questions are not treated as isolated answers. Each implementation batch uses its assigned questions to add, refactor, test, debug, analyze, or harden the same evolving GIS application.

## Locked curriculum

- Source questions: **2,308**
- Setup batch: **Batch 000**
- Interview-question batches: **Batch 001 to Batch 462**
- Normal batch size: **5 questions**
- Final batch: **3 questions**
- Total batches including Batch 000: **463**
- Question order: **dependency-first logical project order**, not raw spreadsheet row order
- Original question identity: stable IDs **Q0001-Q2308**
- Repository language: **English only**

## Core learning rule

Completing a concept means it has been introduced and demonstrated, not retired. Variables, objects, collections, exceptions, streams, transactions, threads, and other concepts may be reused naturally throughout later batches.

## Required handoff sequence

Before starting or continuing a batch, read:

1. docs/CURRENT_STATE.md
2. docs/BATCH_PROGRESS.md
3. docs/QUESTION_BATCH_MAP.md
4. the current code and latest commits

The repository is the durable handoff. A new chat should reconstruct state from GitHub instead of relying on chat memory.

## Batch completion rule

Every interview-question batch must inspect the current application, implement coherent GIS-domain work for its assigned questions, test/build the result, update progress/current-state documentation, commit, and push.

A question should normally lead to at least one feature, code experiment, refactor, automated test, debugging exercise, performance investigation, architecture improvement, or production-hardening exercise.

## Batch 000

Batch 000 creates the project foundation and consumes no interview questions. Batch 001 must not begin until Batch 000 is completed and pushed.

## Planned product

The final platform is intended to support survey projects, survey points, coordinate validation, CSV/JSON/GeoJSON imports, duplicate detection, PostgreSQL/PostGIS persistence, GIS processing jobs, QA/QC workflows, REST APIs, security, reporting, observability, production diagnostics, and deployment workflows.
