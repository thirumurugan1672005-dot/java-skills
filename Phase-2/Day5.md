# Switch Statements

Switch Statements multiple alternatives for same expression

```java
int day = 1;
switch(day){
   case 1 : {
      System.out.println("Monday");
      break;
   }
   case 2 : {
        System.out.println("Tuesday");
        break;
   }
   case 3 : {
        System.out.println("Wednesday");
         break;
   }
   case 4 : {
        System.out.println("Thursday");
        break;
   }
   case 5 : {
       System.out.println("Friday");
       break;
   }
   case 6 : {
        System.out.println("Saturday");
        break;
   }
   case 7:{
          System.out.println("Sunday");
           break;
     }
   default:{
        System.out.println("Invalid date");
        break;
   }
}
```
case : 
1. char , short,byte ,int
2. enumerated type
3. string literals
4. More than one of these seprated by commas

1. Execution stops until break from case matched or default will execute

Example
This is new Java 14 version of Switch Statements when break statements no longer required. it is not fall through
```java

switch(c){
  case "Yes",'y'->{
      System.out.println("Yes");
  }
  case "No" , 'n'->{
      System.out.println("No");
   }
}
```

