# Java Fundamentals - Day 4
### Important: Java's Type Strictness

**Java does NOT allow implicit type conversion from larger to smaller types.**

Even though the programmer might know that a value is small enough to fit, Java requires explicit casting:

```java
long L = 100;
byte b = L;          // ❌ ERROR: incompatible types (cannot convert long to byte)
byte b = (byte)L;    // ✅ CORRECT: explicit cast required
```

### Type Promotion in Operations

When performing operations between different types, Java automatically promotes operands to a compatible type.

**Important**: When adding two bytes, they are promoted to `int`:

```java
byte b1 = 127;
byte b2 = 127;
byte result = b1 + b2;  // ❌ ERROR: int cannot fit in byte
byte result = (byte)(b1 + b2);  // ✅ CORRECT: explicit cast needed
```

**Why?** The result of `b1 + b2` is `int` because:
- The result might exceed byte range (127)
- Java promotes to a larger type for safety
- Must explicitly cast back to byte if needed

### Lossless vs. Lossy Conversion Summary

| Category | Direction | Data Loss? | Implicit Allowed? | Example |
|----------|-----------|------------|-------------------|---------|
| Widening (Implicit) | small → large | No | Yes | `byte → int` |
| Narrowing (Explicit) | large → small | Possible | No | `int → byte` |

---
