# Injecting values in bean 

* We already know how to add the instances in context
* Now it is time to use the beans or inject it in another bean


# Calling directly 
* It works only when the beans are present in same configuration class
* you can directly call the bean inside another bean

* It does not create another bean
* Spring knows whether the bean already created or not

# Calling using Method Parameter

* Using inside bean , either Component or Bean method must be in same context
* If they are not in same context NoBeanDefinitionException occurs
* if they are same name as bean already in context Exception occurs
* @Component("diff") you can provide different name like this

# Autowired 

* When the @Component or @Bean used inside @Component you need to inject using @Autowired annotation
* It helps the Spring manages the objects

## Using value 

* Injected using value
* only for testing purposes as it may occur it cannot be final
* so it might accidentally change


## Using setter
* rarely used
* cannot be final

## Constructor injection
* Often used
* recommended approach we can make it as final


# Circular Dependency 

* When you accidentally makes bean dependent on each other on creation make deadlock
* Find exception and avoid it carefully

# Name conflicts

When there are many instances of same class you have naming clashes 

1. use @Primary to make one as default value
2. @Qualifier during injection so it takes correct value
3. Name conflicts can throw exception if not handled

# Interface 

* Contract tells what has to be done
* In order to decouple the implementations we use interface so one class does not depend on another class tightly
* It also provides abstraction
* We are going to seperate what is done and how is done
* When implemention changes it does not affect class using it

  Several sterotype annotations like @Service and @Repository also used


