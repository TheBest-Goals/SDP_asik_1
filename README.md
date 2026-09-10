# Assignment 1 - Builder Design Pattern (Email Service)

This project implements the **Builder Design Pattern** in Java for an Email service. It demonstrates how a single construction process managed by a Director can produce two different representations of a product (a Java object and a text preview).

## Project Structure

- `Email.java` - Immutable product class with package-private constructor and final fields.
- `EmailBuilder.java` - Builder interface with fluent API setters.
- `EmailObjectBuilder.java` - Concrete builder that validates inputs and creates an `Email` object.
- `EmailTextBuilder.java` - Concrete builder that creates a formatted text preview (`String`).
- `EmailDirector.java` - Director class containing predefined email configurations (`makeWelcomeEmail`, `makePasswordResetEmail`).
- `Main.java` - Client entry point that demonstrates building both representations using the same director.

## Features
- **Fluent API:** Method chaining via `return this;`.
- **Immutability:** Product state cannot be modified after creation.
- **Fail-Fast Validation:** Throws `IllegalStateException` if required fields (`recipient`, `subject`) are missing.
- **Multiple Representations:** Builds both an in-memory `Email` object and a text preview `String`.

## How to Run

1. Clone or download the repository:
   ```bash
   git clone https://github.com/TheBest-Goals/SDP_asik_1.git
