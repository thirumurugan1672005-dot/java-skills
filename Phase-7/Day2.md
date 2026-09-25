# Comparable Interface
* Comparable interface is the interface that has compareTo() method
* compareTo() method accepts argument compares with instance of this class
* positive : if the value is greater in current class
* negative : if value is lesser in current class
* zero : if values are same
* Before Java 5 it was raw type just like ArrayList
* In Java 5 major update it becomes generics
* it has one method compareTo(Object obj) which overrides the class which implements interface
* it used to compare the objects value but object should be from class that implements interface


```java
class A implements Comparable{
    int x;
    public int compareTo(Object obj){
         A other = (A)obj;
       return Integer.compare(this.x,other.x);
    }
}
```
You should use all the implementated methods is public otherwise compiler notes it is too restrictive.

Documentation :
x.equals(y) and x.compareTo(y) should be compatible but differs in BigDecimal class alone.


# Why this interface used we could have use just compareTo() method?
<p> In some cases in sort method arrays passed into as object arrays type casted to 
 becomes Comparable array and then saw compareTo() <br/> if the object passed does not implements comparable 
 it will throw ClassCastException</p>


##  equals() and compareTo()
* Super class have common notion make it as final and test instance of for all subclasses
* Specific notion used getClass test in specific subclass 



## Note: 
Abstract class implements interface it need not implement methods


## instance of 
 * instance of test to make sure it belongs to class
 * instance of test to make sure it belongs to class implements interface
