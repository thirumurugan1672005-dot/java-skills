# Operators - 1
Operators are used to do operations and operate data

## Arithemetic Operators
Arithemetic Operators are used to peform arithemetic operations.
1. Addition (+)
2. Subraction (-)
3. Multiplication(*)
4. Division(/)
5. Modulus (%)

```java

class Solution{
     public static void main(String[] args){
        // Addition of Two Numbers
        System.out.println(1+2);
        // Subraction of two numbers
        System.out.println(2-3);
        // Multiplication of two numbers
        System.out.println(2*3);
        // Division of two numbers
        System.out.println(10/2);
        // Modulus of two numbers (Remainder)
        System.out.println(10%2);
    }
}

```
### Rules
1. If Either of them double result is double
2. If Either of them float result is float
3. If Either of them Long and it is long
4. Otherwise it is always int

-----------------------------------------------------------------
## Logical Operators

Logical Operators are used to involve logical operations

1. && -> and operator which is true when both statements are true
2. || -> or operator which is false when both statements are false
3. ! -> flipping the values (true-> false),(false->true)

```
_______________________
|  A  |  B  |  A && B |
-----------------------
|  T  |  T  |     T   |
-----------------------
|  T  |  F  |     F   |
-----------------------
|  F  |  T  |     F   |
-----------------------
|  F  |  F  |     F   |
-----------------------
_______________________
|  A  |  B  |  A || B |
-----------------------
|  T  |  T  |     T   |
-----------------------
|  T  |  F  |     T   |
-----------------------
|  F  |  T  |     T   |
-----------------------
|  F  |  F  |     F   |
-----------------------
_________________
|  A  |    !A   |
-----------------
|  F  |    T  |
----------------
|  T  |    F   |

```
### Example


```java
 class Solution{
    public static void main(String[] args){
        System.out.println(2==2 && 3==2);
        System.out.println(3>=2 || 4<=5);
        System.out.println(!true);
        
    }
}
```
-------------------------------------------------------
## Relational Operators

Relational Operators are used to compare two values and results in true or false

1. ``>``  greater than 
2. ``<``  less than 
3. ``>=``  greater than or equal to
4. ``<=``  less than or equal to
5. `` == `` equal to
6. ``!=`` not equal to

```java
 class Solution{
    public static void main(String[] args){
        System.out.println(2==2);
        System.out.println(3!=2);
        System.out.println(2>2);
        System.out.println(5<2);
        System.out.println(2>=2);
        System.out.println(5<=2);
        
    }
}
```

------------------------------------------------------------------------------------------------

