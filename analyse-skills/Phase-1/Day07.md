# Java Fundamentals I - Day 7
## Reserved Keywords

Reserved keywords are words that have special meaning in Java and **cannot be used as variable names, class names, or method names**.

### List of Reserved Keywords

```
abstract    assert      boolean     break       byte        case
catch       char        class       const       continue    default
do          double      else        enum        extends     final
finally     float       for         goto        if          implements
import      instanceof  int         interface   long        native
new         package     private     protected   public      return
short       static      strictfp    super       switch      synchronized
this        throw       throws      transient   try         void
volatile    while
```

### Important Reserved Keywords Explained

| Keyword | Purpose |
|---------|---------|
| `public` | Access modifier - accessible from anywhere |
| `private` | Access modifier - accessible only within the class |
| `protected` | Access modifier - accessible within package and subclasses |
| `static` | Belongs to the class, not to instances |
| `final` | Cannot be modified or overridden |
| `abstract` | Must be implemented by subclasses |
| `class` | Declares a class |
| `interface` | Declares an interface |
| `extends` | Inheritance from a class |
| `implements` | Implementation of an interface |
| `new` | Creates an instance of a class |
| `this` | Reference to current object |
| `super` | Reference to parent class |
| `try/catch/finally` | Exception handling |
| `import` | Imports classes/packages |
| `package` | Groups related classes |

### Example of Reserved Keywords:
```java
// ❌ WRONG - 'class' is a reserved keyword
int class = 10;

// ✅ CORRECT
int myClass = 10;

// ❌ WRONG - 'public' is a reserved keyword
String public = "hello";

// ✅ CORRECT
public String myVariable = "hello";
```

---
