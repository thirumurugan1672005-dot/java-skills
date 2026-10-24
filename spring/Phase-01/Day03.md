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


# Sterotype annotation

* Create a configuration class
* @ComponentScan annotation lets you to scan the components
* @Component in given class which is valid for component scan

# registerBean() 

registerBean(var_name,Main.class, supplier)

supplier : gets supplies some value 

other things which sets the property of the bean 


# Causes 

1. if two beans with same name are registered BeanDefinitionOverrideException
2. If two beans with different name but of same class but getBean() calls NoUniqueBeanDefinitionException
3. when scanning they have same names ConflictNameException

@Component("name") : to give names 
