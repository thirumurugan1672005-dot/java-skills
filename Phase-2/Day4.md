# Control flow Statements

Control flow statements are statements used to control the flow of execution

## Block
Block is scope determined to the scope of variable

```java

{
  int x = 0;
  int y = 1;
}
```
## Conditional Statements

if : if statement was used to execute certain block when condition is satisfied

else : else executes when immediate before if condition fails

else if : when immediately before if fails and check condition and satisfied

use curly braces to define multiple statments to define block 

conditions should be only boolean and 0 or 1 not allowed to be condition

```java

int age = 12;
if(age >= 18){
 System.out.println("adult");
}
else if(age >= 13 && age<= 17){
  System.out.println("Teen");
}
else{
  System.out.println("Child");
}
```
## Looping Statements 

Looping Statements when you need to execute something repeatedly

InDefinite Loops

1. Number of iterations unknown

2. while loop : executes until condition satisifes
3. do while loop: executes atleast once

Definite Loops
1. Number of iterations known

2. for loop : intialise , test ,increment/decrement
```java
int count =  5;
while(count>0){
   count--;
}
```

```java

for(int i=0;i<9;i++){
   System.out.println(i);
}
```

