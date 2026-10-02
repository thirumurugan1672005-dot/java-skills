
# Anymnous Inner class
```java


interface Movable{
	public void move();
}
class Sample{
	int x;
	Sample(){
		
	}
	public Sample(int x) {
		this.x = x;
	}
}
public class Third {
   public static void main(String[] args) {  
	  var sample = new Sample(10) {
		  public void start() {
			  System.out.println(x);
			  System.out.println("Starting ....");
		  }
	  };
	  sample.start();
	  
	  var movable = new Movable() {
        int x;
		  {
			  x = 20;
		  }
		  public void move() {
			  System.out.println("Moving ...");
		  }
	  };
	  
	  movable.move();
   }
}

```

* Anymnous Inner class is the class with no name 
* Since they dont have name they cannot have constructors since name as same name as constructor
* But such classes create from class as supertype automatically takes constructor of super class
* If it is created from interface it does not have construction parameters
* But they can have intialisation blocks
