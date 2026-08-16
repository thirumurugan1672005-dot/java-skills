 * Records use equals() method to match fields
* Arrays.equals method makes  arrays equal
* Arrays.DeepEquals() method to equal multidimensional array

# toString() method
* toString() method to use make logs of the string
* toString() is helpful for logging.

```java

class Employee{
  private int id;
  private String name;
  public String toString(){
   return getClass().getName()+"["+this.id+";"+this.name+"]";
 }
}
```
# hashCode() 
* hashCode() method returns the integer derrived from object.
* When define equals() method define hashcode() method
* hashCode() Probability of making hashcodes are different
* it is derrived from object memory

* Every object has hashcode.

## Objects.hashcode() : null safe
```java
Objects.hash(field1,field2,field3);
```
Records and Arrays has own implementation of hashcode
