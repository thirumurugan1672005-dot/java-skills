# ArrayStoreException

```java
class Employee{
  int id;
  double salary;
}
class Manager extends Employee{
  double bonus;
}
```
```java
Managers managers[] = new Managers[3];

```
* Managers array was declared with Manager references of size 3
* We can make array from subclass references from array of subclass references
```java
Employee[] employees = managers;
employees[0] = new Manager();
employees[1] = new Employee(); // causes ArrayStoreException


```
* Both arrays refer to same array. Since we have manager references and copied to employees array.
* since they stored manager references we cannot store the employee object causes ArrayStoreException


