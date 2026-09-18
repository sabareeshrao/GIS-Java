Adaptive Batch Policy

Purpose

The GeoSurvey Operations Platform is built in realistic project order.

The 2,308 original interview questions remain the master coverage set, but future uncompleted questions may be moved when the current project build order requires a different prerequisite or concept.

Completed batches are frozen.

Original question rules

1. Every original question keeps its stable Q#### identifier.
2. Every original question must eventually be completed exactly once.
3. Completed batches and completed question positions are not remapped.
4. Future uncompleted questions may be moved to support natural project build order.
5. Relevant original questions should be preferred before creating supplemental questions.

Supplemental question rules

A supplemental question is used only when the project requires an important concept that is not adequately available from the original question set at that point.

Supplemental IDs use this format:

SQ-B###-##

Example:

SQ-B018-01

Supplemental questions are displayed with the star marker:

⭐ SQ-B018-01

Supplemental questions do not count toward the original 2,308-question completion total.

The repository must track the original-question total and supplemental-question total separately.

A batch does not need a supplemental question when its original questions already cover the required project increment.

Build-order decision process

Before each batch:

1. Read the current repository state.
2. Determine the next natural GeoSurvey project increment.
3. Search the remaining original questions for relevant concepts.
4. Check prerequisite order.
5. Move only future uncompleted questions when necessary.
6. Add a supplemental question only when an important learning bridge is genuinely missing.
7. Show the complete proposed batch in chat before pushing.
8. Push only after user approval.
9. Update mapping and progress files when question positions change.
10. Preserve source trace comments using batch, step and question identifiers.

Source trace format

Original question:

BATCH 003 | STEP 03 | Q2224

Supplemental question:

BATCH 018 | STEP 02 | SQ-B018-01

Repository language

Repository content remains English only.
