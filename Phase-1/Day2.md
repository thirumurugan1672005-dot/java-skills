# First Program

```java
public class HelloWorld{
   public static void main(String[] args){
       System.out.println("Hello World");
  }
}
```

* Every Java should have atleast one class
* Every java should have only one public class whose name same name as file name
* public : access everywhere
* main : method which executes start of application
* public static void main(String[] args) is method signature where jvm finds the class which contains this and loads it first

* Java is case sernsitive so main, Main are different Main instead of main program won't run.
  
## Conventions
1.class names always start with upper case
2. variables we use camel case (which is start with lowerCase every LetterofIntermediateBeginnning Words are upperCase)
 exmaple : noOfWords

## Run a Program
```cmd
javac HelloWorld.java
```
It compiles and produce HelloWorld.class if and only if it has main method
```cmd
java HelloWorld
```
## Comments
* Comments are used to describe the program
* Comments are ignored by compiler
* Comments are used to what's happening and what you are doing in this program
1. Single Line Comments : // at end of line
2. Multi line comments :  /* */
3. Documentation : /** */

Caution :
```
/* */ are not nested so if code contains */ it may not deactivate
```
