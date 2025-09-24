# dummy-java-project

A simple Java project demonstrating intentional code quality issues that can be detected and fixed by SonarQube and AI tools.

## Project Structure

This is a Maven-based Java project with the following structure:
- `src/main/java/com/example/Calculator.java` - Main calculator class with intentional Sonar issues
- `pom.xml` - Maven project configuration

## Intentional Code Quality Issues

The `Calculator.java` file contains several intentional code quality issues that would be flagged by SonarQube:

1. **Non-private field** (Encapsulation violation)
   - `public String calculatorName` should be private with getter/setter methods

2. **Unused variables** (Dead code)
   - `unusedCounter` field is declared but never used
   - `unusedVariable` and `unusedString` in the `add()` method are never used

3. **Magic numbers** (Code clarity issue)
   - Hard-coded numbers like `999` and `1000` should be defined as named constants

4. **Missing exception handling** (Reliability issue)
   - `divide()` method doesn't handle division by zero

## Building and Running

To build the project:
```bash
mvn clean compile
```

To run the calculator:
```bash
mvn exec:java -Dexec.mainClass="com.example.Calculator"
```

## Purpose

This project is designed for demonstrating:
- Static code analysis with SonarQube
- AI-powered code quality improvements
- Code refactoring exercises
- Best practices in Java development