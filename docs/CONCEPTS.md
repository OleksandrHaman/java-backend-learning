# Java learning notes

These are quick reminders from our lessons, not a replacement for writing code yourself.

| Concept | Reminder | Example |
| --- | --- | --- |
| `int` vs `String` | Number vs text | `21 + 5` vs `"21" + 5` |
| `=` vs `==` | Assignment vs comparison | `x = 5` vs `x == 5` |
| `String.equals()` | Compare text content | `name.equals("Alex")` |
| `array.length` | Number of array elements | `numbers.length` |
| `text.length()` | Number of characters | `text.length()` |
| `this.name = name` | Field vs method/constructor parameter | See `CarDemo` |
| `private` | Prevent external direct field access | See `BankAccountDemo` |
| `extends` | Inherit from one class | See `InheritanceDemo` |
| `super(name)` | Invoke parent constructor | See `InheritanceDemo` |
| `@Override` | Verify intended method override | See `PolymorphismDemo` |
| `abstract class` | Cannot instantiate directly | See `AbstractFigureDemo` |
| `abstract void method();` | Subclass must implement in a concrete class | See `AbstractFigureDemo` |
| `for-each` | Iterate over array items | `for (int n : numbers)` |
| `return` | Exit a method with a value | See `NameAnalyzerDemo` |

## Typical mistakes

- For min/max in a non-empty array, start from `numbers[0]`, **not** from 0.
- Loop over `alphabet.length()` when indexing the alphabet; using `sentence.length()` can throw `StringIndexOutOfBoundsException`.
- Use `&&` for **both**, `||` for **either**; add parentheses for clarity.
- A method marked `abstract` ends in `;`, not a method body `{ ... }`.
- An abstract class **may contain regular, implemented methods**.
- `@Override` is an annotation: overriding still works without it, but the annotation catches mistakes.
- A variable of type `Employee` can refer to a `Manager` object, but can call only the methods available on its declared type.
- A Java `String` is immutable: `dna.replace('T', 'U')` returns a new value.

## Next planned topic

`interface` — not marked as completed yet. After OOP: Collections, exceptions, Maven/JUnit, SQL/PostgreSQL, HTTP/REST, Spring Boot.
