# Data Type Conversion

## Implicit Casting 
* Implicit Casting is the form of Type Conversion in which compiler automatically converts
* It is concept of Widening the datatype
* Widening means putting smaller into bigger

---------------------------------

* byte ==> short ==> int ==> long

* float ==> double 

* char ==> int
----------------------------------

## Explicit Casting 
* It represents Casting which requires the casting into different data types explicitly
* It is Narrowing where the bigger data type is put into smaller one may lead to loss of information


-----------------------------------

(int)
(byte)
(short)
(long)
(char)
(float)
(double)
------------------------------------

Example 1
```java

class Solution {
      public static void main(String[] args){
           short x = 23;
           int y = x;
           System.out.println(y);
      }
}
```

The above code causes the lossless conversion so it works

Example 2
```java

class Solution{
    public static void main(String[] args){
        int y = 23;
        short x = y;
    }
}

```
The above code wont compile cause lossy conversion error

Example 3
```java
class Solution{
    public static void main(String[] args){
        int y = 23;
        short x = (int)y;
        System.out.println(x);
    }
}

```

Example 4
character shows unicode (16bits)

```java

class Solution{
    public static void main(String[] args){
        char c = 'A';
        System.out.println((int)c);
    }
}

```

Output : 65

You can also underscores in numbers 

```java
class Solution{
     public static void main(String[] args){
        int y = 10_000_000;
        System.out.println(y);
    }
}

```

## Type Promotion
Type Promotion says it promoted to type of data automatically by java compiler when doing operations

```java
class A{
   public static void main(String[] a){
      byte b1 = 23;
      byte b2 = 126;
      int x = b1*b2;
      System.out.print(x);
   }
}
```



