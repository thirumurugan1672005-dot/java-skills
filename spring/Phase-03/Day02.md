# Aspect Oriented Programming 

* Aspects are the part of logic which intercepts the method call and can even alter its execution
* Advice : where the aspects should be happen
* Target Object : The bean whose method is going to intercept
* joinPoint : what triggers the aspect
* pointcut : actual method which got intercepted


```
<dependency>
    <groupId>org.springframework</groupId>
    <artifactId>spring-aspects</artifactId>
    <version>7.0.8</version>
    <scope>compile</scope>
</dependency>
```

* @EnableAspectJProxy annotation is the annotatin which enables aspect in configuration class
* @Aspect makes the class as aspect clas
* @Around() will act as advice for aspect
* You should create bean for aspect to work either @Bean or sterotype annotation


```
execution(.* , com.example/service.* .* (...))
```
* execution : means method call
* ```.*``` : means any return type
* com.example.service.* : every class in package
* ```.*``` : any name
* (..) : any parameters

```
@annotation(MyLog)
```
where annotation is MyLog 

* ProceedingJoinPoint which has everything method
* It can make it proceed , get args , get singature
* return a value which alters returned Value
* We can also alters the arguments

* annotation
* -> RetentionPolicy.RUNTIME it can intercepts at runtime
* -> Target : which elements type 
```java

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface ToLog {

}
```


# Other annotation instead of @Around

* @Before : before exection of code
* @AfterReturning : after the returning
* @AfterThrowing : after an exception
* @After : after the method ends


# AOP Execution chain
* We determines aspects executes order decides by spring
* @Order takes number : ordered it
* lesser than number early it starts
* same number means randomly selected by Spring

