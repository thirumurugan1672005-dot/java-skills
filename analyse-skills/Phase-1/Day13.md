
# Java Fundamentals I - Day 13
## Relational Operators

Relational operators are used to compare two values. They return a **boolean result** (`true` or `false`).

### List of Relational Operators

| Operator | Name | Description | Example | Result |
|----------|------|-------------|---------|--------|
| `>` | Greater than | Checks if left operand is greater than right | 12 > 10 | true |
| `<` | Less than | Checks if left operand is less than right | 12 < 10 | false |
| `>=` | Greater than or equal | Checks if left operand is greater than or equal to right | 12 >= 10 | true |
| `<=` | Less than or equal | Checks if left operand is less than or equal to right | 12 <= 10 | false |
| `==` | Equal to | Checks if left operand is equal to right | 10 == 10 | true |
| `!=` | Not equal to | Checks if left operand is not equal to right | 10 != 10 | false |

### Relational Operator Examples

```java
int a = 10;
int b = 12;

System.out.println(a > b);   // false (10 > 12)
System.out.println(a < b);   // true  (10 < 12)
System.out.println(a >= b);  // false (10 >= 12)
System.out.println(a <= b);  // true  (10 <= 12)
System.out.println(a == b);  // false (10 == 12)
System.out.println(a != b);  // true  (10 != 12)
```

### Important Notes

- Relational operators **always return boolean values** (`true` or `false`)
- Used primarily in **conditional statements** (if, while, for)
- `==` checks for **equality of values**
- `!=` checks for **inequality of values**

---
