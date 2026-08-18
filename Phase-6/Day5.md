# Enumerated Class 
Enumerated Class is the class which extends Enums

* It can have some defined number of instances
* It can have instance fields,constants
* Its constructor is always private meaning we cannot instanise the enum
* we cannot extend enum as it was implictly extended by Enum
* we cannot subclass since it is final
* Values() is the method to get all the instances in array
* We can access instances using class names
* we can have methods associated with it

```java
enum TrafficLight{
   RED(0),YELLOW(1),GREEEN(2);
   private int colorCode;
   private TrafficLight(int colorCode){
      this.colorCode = colorCode;
   }
   public int getColorCode(){
      return this.colorCode;
  }
}
TrafficLight[] signals = TrafficLight.Values();
for(TrafficLight light:signals){
    System.out.println(light.getColorCode());
 }
```

# Sealed Classes 
* Sealed Classes are the type of Class in which permits only particular class can inherit this class or the class should be present in same file as source code.
* sealed class in which direct subtype should refer whether is sealed , non-sealed or final
* non-permitted can access if they present in same file.

```java
sealed class Sample permits DirectSample{
}
non-sealed class DirectSample extends Sample{
}
```
* if non-permitted ones try to extend it throws compiler error.
* we cannot permit some nested private classes or package visible classes from other packages.
* direct subclasses persent in public or same package.
