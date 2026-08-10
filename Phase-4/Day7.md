# Default Modifier
* When you give method or field without access modifier it becomes default modifier
* It makes the fields or methods access the classes inside same package
* To avoid some problems in core library library designers rigged class loader so we cannot make any of our custom class in java.* package

```java
package com.example
class A{
int x;
}
```
