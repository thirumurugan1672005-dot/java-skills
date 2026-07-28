# Method Parameters 

Method Parameters are parameters passed to methods

Generally in programming world there are two things we do method parameters

1. call by value : method uses copy of value passed
2. call by reference : method uses reference of location

Java only uses call by value 

1. primitive types
   ```java
   class Sol{
        public void triple(int a){
            return 3*a;
        }
        public static void main(String[] args){
            int x = 10;
            triple(x);
            System.out.println(x); // it still prints 10
        }
   }
   ```

   The value won't change passed one was just copy

   2 Reference Types
     * Reference Types actually we passed copy of reference but both original and copy refers to same object.
     * Methods will change beacuse both references share same object

   ```java
   Employee e = new Employee("Ran");
   Employee f = new Employee("Sam");
   ```
   ```java
    public void swap(Employee x , Employee y){
       Employee t = x;
       x = y;
       y = t;
    }
   ```
   ```java
   swap(e,f);
   ```
   This won't change references are still same

   Therefore Java uses only call by value

   ```java
    e.raiseSalary(3); // it may affect 
   ```
