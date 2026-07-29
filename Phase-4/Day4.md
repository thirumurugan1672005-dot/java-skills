# Parameter names

Parameter names are important in constructors and methods

1. some write single letter but it is hard to understand
2. some write same name with prefix a to distinguish between local and instance variable

## Shadowing

But When you give same name for local variable as instance field if we assign it becomes assigned to local variable itself

```java
class Main{
   String sample;
   Main(String sample){
      sample = sample;
   }
}
```
The above code won't update sample so rewrite code using this keyword 

this referes to implicit parameter actually reference to current object


```java
class Main{
   String sample;
   Main(String sample){
      sample = sample;
   }
}
```

You cannot access use this keyword in static methods 

# Calling another constructor

this() is used to call constructor of same class.

it should be placed at first statement of constructor

```java

class A{
   A(){
     System.out.println("Constructor called");
   }
   A(String s){
      this();
   }
   A(int i)(
      this("sample"+i);
   }
}
```

```java

class Employee{
     int id;
      String name;
      double salary;
    Employee(){
      this(0,"employee",30_000.00);
    }
    Employee(int id,String name,double salary){
       this.id = id;
       this.name = name;
       this.salary = salary;
    }
}
```

# Intialisation blocks

There are two ways to intialise values for instance fields.

1. by intialising during assignment itself.
2. by setting the values in constructors.

intialisation blocks are third mechanism which executes everytime object creates

```java
class A{
   String s;
   {
     s = "Rahul";
   }
}
```
1. when constructor is called it calls second constructor until it calls all of them
2. First Intialise them with default values  0 for numbers , false for boolean , null for object references
3. All field intialisation and intialisation blocks executed order they written in class
4. Body of constructor executes

## static variables 
for static variables we have static blocks which is used to intialise values or directly intialise them

```java
class A{
    private static int i = 10;
}
```

```java
class A{
    private static int i;
    static{
        i = 10;
   }
}
```

static blocks and static intialisation in order they written in class

They are loaded when class loaded.

they do have default values.


```
up to JDK 6 static blocks executed first static blocks . but from jsk 7+ it checks whether main method is present or not first
```

# Object Destructors and finalize method

In java Objects are automatically destroyed when abadoned by garbage collector

For this reason there is no destructors

When you use the file or other resources other than memory you will use close() method to close the resources.

* finalize method was intended to call before garbage collector sweeps away the object 
* But We don't know when this object sweeped away
* so finalize method is depreceated.


