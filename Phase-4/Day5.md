# Records
Records are used to store data 

* Records have instance fields and that is private final
* We cannot add any instance fields inside the body of record
* Records can have static fields , instance methods , static methods
* Records there are three types of constructor
  1. Canonical : one compiler provide for all instance filed declared in brackets
  2. Custom : We declare constructor inside body
  3. Compact : without () to chnage we don't modify anything in instance fields
* Records have accessor methods same name as instance field's name
```java
package demo;

// instance fields are private and final
// corresponding canonical constructor
// coressponding accessor methods
record Point(double x,double y) {
	public static final double ORIGIN = 0;
	Point(){
		this(0.0,0.0);
	}
	public double getDistance(double x , double y) {
		double dx = this.x() *x;
		double dy = this.y() * y;
		double dis = Math.sqrt((dx*dx)+(dy*dy));
		return dis;
	}
	public static void explain() {
		System.out.println("Point can explain");
	}
}
record Range(double from , double to) {
	public Range {
		if(from > to) {
			double t = from;
			from = to;
			to = t;
		}
	}
}
public class First {
   public static void main(String[] args) {
	   Point point = new Point(2,3);
	   System.out.println(Point.ORIGIN);
	   double dis = point.getDistance(0, 0);
	   System.out.println(dis);
	   Point.explain();
	   
	   Range range = new Range(2,3);
	   System.out.println(range.from()+range.to());
	   Range range2 = new Range(-12,-24);
	   System.out.println(range2.from()+" "+range2.to());
   }
}
```
