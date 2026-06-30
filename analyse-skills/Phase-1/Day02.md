# Java Fundamentals - Day 2
[Data Types](#data-types)
## Data Types

Java has **8 primitive data types** that store values directly in stack memory.

### Primitive Data Types

| Type | Size | Range | Example |
|------|------|-------|---------|
| **byte** | 8 bits | -128 to 127 | `byte b = 50;` |
| **short** | 16 bits | -32,768 to 32,767 | `short s = 1000;` |
| **int** | 32 bits | -2,147,483,648 to 2,147,483,647 | `int x = 100000;` |
| **long** | 64 bits | -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807 | `long y = 1243L;` |
| **float** | 32 bits | Single-precision floating point | `float f = 3.14f;` |
| **double** | 64 bits | Double-precision floating point | `double d = 3.14159;` |
| **boolean** | 1 bit | true or false (NOT 0 or 1) | `boolean isValid = true;` |
| **char** | 16 bits | Unicode characters (0 to 65,535) | `char c = 'A';` |

### Key Points About Primitives:
- **Stored in Stack**: Primitives store their value directly in stack memory
- **Fixed Size**: Each primitive has a fixed size
- **Performance**: Faster than reference types because they are stored directly in memory
- **Memory Efficient**: Require less memory compared to objects

### Boolean Type:
- Only stores `true` or `false`
- Java does NOT allow implicit conversion from integer (0, 1) to boolean
- `(0,1)` is NOT boolean - it's an integer

### Character Type:
- `char` is 16-bit Unicode
- Can store any character from the Unicode character set
- Example: `char ch = 'A';` or `char ch = '\u0041';` (Unicode representation)

---
