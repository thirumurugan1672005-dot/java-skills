# Static fields

* If the Field is static then it belongs to class not for the induvidual objects.
* static members have only one copy per class and shared among all instance members
* Though We can refer by object reference it always preferred to use Classname to access this

```java
class Employee{
     private int id;
     private static int nextId = 1;
     public Employee(){
         this.id = nextId;
         nextId++;
     }
     public int getId(){
         return this.id;
     }
}
```

```java
Employee obj1 = new Employee();
System.out.println(obj1.getId()); // 1
Employee obj2 = new Employee();
System.out.println(obj2.getId()); // 2
```

# Static Constants

* Static Constants are used to access the constants the static field with final 
* These constants cannot be modified.
* For Example In Math Class PI is static constant we don't need to create object access it
* It is generally bad idea to make field public but static constants cannot be modified so make them public so it can be accessible.

```java
class Math{
   public static final double PI = 3.14;
}
```

# Static Methods

* Static Methods are methods to access via class name.
* These methods used when only explicit parameters are used
* These methods also used when only static fields are involved.
* These methods cannot access instance fields directly
* In order to access static methods they need to create object reference for the same class itself.

```java
class Sol{
public static int sum(int a,int b){
 return a+b;
}
}

```

# Factory Methods

* Factory Methods are methods which is used to get instance of the object.
* Some class like LocalDate class and NumberFormat class don't use constructors to construct objects.
* They need to get seperate instances for different things but constructors only used with same class name.
* So for different instance for different methods we used the static utility methods to construct objects.

```java
NumberFormat format = NumberFormat.getInstance();
```

# Main method

* Main Method starts the execution of program
* But At the Start we don't have any objects
* For this reason main method also declared static


```java
public class Main{
public static void main(String[] args){
 }
}
```


Naive Methods can compromise the actual security mechanism in java programming for example setOut method in System Class.
