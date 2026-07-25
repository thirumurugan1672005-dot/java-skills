# Switch Expressions

Switch Expressions used to yield a value from multiple alternatives

```java
int dayNo = 1;
String day = switch(dayNo){
   case 1 : {
       yield "Monday";
   }
   case 2 : {
        yield "Tuesday";
   }
   case 3 : {
       yield "Wednesday";
   }
   case 4 : {
        yield "Thursday";
      
   }
   case 5 : {
       yield "Friday";
   }
   case 6 : {
        yield "Saturday";
        
   }
   case 7:{
          yield "Sunday";
           
     }
    default: yield "Invalid date";

}
```
case : 
1. char , short,byte ,int
2. enumerated type
3. string literals
4. More than one of these seprated by commas

1. yield used to get a value instead of break it stops and get value

Example
This is new Java 14 version of Switch Expressions when break statements no longer required. it is not fall through
```java

switch(c){
  case "Yes",'y'->"Yes";
  case "No" , 'n'-> "No";
   default -> {
     System.out.println("Default");
      yield "Invalid";
     }
}
```

