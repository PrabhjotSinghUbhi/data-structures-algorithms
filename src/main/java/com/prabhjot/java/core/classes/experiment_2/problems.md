# Problem 1

A college wants to redesign its internal evaluation software so that the process of evaluation is always the same, but the rules used to calculate the final result change from program to program.
For every student, the system must follow this fixed flow: collect theory marks, collect lab marks, apply moderation rules, and finally generate a grade. However, B.Tech, MCA and PhD programs all calculate the final score differently and also use different grading criteria. In addition, moderation rules (for example attendance-based moderation, difficulty-based moderation or manual moderation by the department) must be changeable without touching the existing evaluation logic.

Design an object-oriented model in which the evaluation flow is controlled by a single abstract component, the program-specific logic is provided by separate implementations, and moderation rules are plugged into the system using object composition. The main application must be able to evaluate any program using only a common reference type, and it must be possible to introduce a new program type or a new moderation rule without modifying the existing evaluation engine code.

# Problem 2

An online examination platform wants to build a flexible proctoring controller for different types of exams conducted across multiple departments.
Some exams require only identity verification, while others require identity verification, environment checking and continuous behaviour monitoring. Each of these activities can be performed using different techniques such as human-assisted verification, AI-based verification or biometric verification. The platform must be able to construct a proctoring pipeline for a specific exam at runtime by selecting only the required monitoring components and arranging them in the execution flow.

Design an object-oriented solution in which each monitoring activity is represented by its own small abstraction, no component is forced to implement operations that it does not logically support, and the proctoring controller depends only on abstractions. It must be possible to replace or add a monitoring technique (for example, switching behaviour monitoring from AI-based to human-assisted) without changing the controller logic, and different monitoring strategies must be executed through runtime polymorphism within the same exam session