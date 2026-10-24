# Adding new beans to Spring app

1. using @Bean annotation
2. using sterotype annotation
3. programming


# Bean annotation 

* Create a configuration class to config the class 
* Bean annotation for every methods so that they will be managed by context 
* If there is one instance for class managed we can use getBean(Main.class)
* or else Spring need reference variable name for getBean
* if you dont use variable name when giving multiple instances of same class then throws Exception

* This technique is used for classes and your own classes 

* @Primary Annotation to make it as default value for that class 
