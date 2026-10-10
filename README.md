# Java Backend Learning

My hands-on Java learning archive. Each topic has a separate runnable example, so new exercises **do not overwrite previous ones**.

> Java 21 • IntelliJ IDEA • No Maven/Spring Boot yet. This is a learning repository, not a finished backend portfolio project.

## Lessons / Приклади

| Topic | Runnable class | Origin |
| --- | --- | --- |
| Hello World | `learning.basics.HelloWorldDemo` | Commit 1552ce8f |
| Variables, conditions, Scanner | `learning.basics.JavaBasicsDemo` | Commit ef86f198 |
| for, while, switch, break/continue | `learning.basics.LoopsAndSwitchDemo` | Commit 706e36af |
| Parameters, return, void | `learning.methods.MethodsDemo` | Commit 665ccf6b |
| Arrays, loops, searching | `learning.arrays.ArrayBasicsDemo` | Commit d81c873f |
| Names and String methods | `learning.arrays.NameAnalyzerDemo` | Commit c4c88d6e |
| Order Analyzer menu | `learning.projects.OrderAnalyzerDemo` | Commit 5ecd6692 |
| Student Grades menu | `learning.projects.StudentGradesDemo` | Commit bfa0b1a4 |
| Private, getters, methods | `learning.oop.BankAccountDemo` | Commit 62ff2b97 |
| Override and polymorphism | `learning.oop.PolymorphismDemo` | Commit 3da2d4f1 |
| Abstract class + polymorphism | `learning.oop.AbstractFigureDemo` | Commit b038c969 |
| Constructors, `this` | `learning.oop.CarDemo` | Reconstructed from lessons |
| Getters and setters | `learning.oop.ProductDemo` | Reconstructed from lessons |
| Inheritance, `super` | `learning.oop.InheritanceDemo` | Reconstructed from lessons |
| String methods | `learning.strings.StringMethodsDemo` | Reconstructed from lessons |
| Codewars: parity | `learning.kata.OppositesAttractDemo` | Reconstructed from lessons |
| Codewars: minimum | `learning.kata.SmallestNumberDemo` | Reconstructed from lessons |
| Codewars: pangram | `learning.kata.PangramDemo` | Reconstructed from lessons |
| Codewars: DNA to RNA | `learning.kata.DnaToRnaDemo` | Reconstructed from lessons |

**Important:** Archived exercises were extracted from earlier `src/Main.java` Git revisions and adapted to separate classes/packages. Some typos and small issues were corrected, and comments were added. Reconstructed examples reflect topics studied in chat; they are **not claimed to be verbatim historical submissions**.

## Як запускати

1. Open the project in **IntelliJ IDEA** with JDK 21 and mark `src` as the Sources Root if needed.
2. Expand `src/learning`, open any `*Demo.java` and use the green **Run** triangle next to `main()`.
3. `src/Main.java` is a quick launcher for the most recent Figure example. Do not overwrite a historical example when practicing a new topic.
4. Some original lessons (`JavaBasicsDemo`, `LoopsAndSwitchDemo`, `MethodsDemo`, `StudentGradesDemo`, `OrderAnalyzerDemo`) ask for input in the console.

From a terminal in the repository root (requires JDK 21 and a shell with `find`):

```bash
mkdir -p out
javac -d out $(find src -name '*.java')
java -cp out learning.oop.AbstractFigureDemo
```

## Notes and workflow

- [Java concept cheat sheet](docs/CONCEPTS.md) — короткі підказки до важливих тем.
- Write new topics as **new classes**, e.g. `src/learning/oop/InterfaceDemo.java` when we actually study interfaces.
- Commit descriptive milestones such as `feat(oop): practice interfaces` or `docs: add notes on arrays`.
- Previous Git commits are kept intact and remain available in Git history.

## Roadmap

Basics ✅ → Methods ✅ → Arrays ✅ → OOP (in progress; next: **interfaces**) → Collections + Exceptions → Maven + JUnit → SQL/PostgreSQL → HTTP/REST → Spring Boot → Docker/Linux.
