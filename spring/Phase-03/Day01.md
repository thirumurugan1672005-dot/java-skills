# Spring Bean Scopes

Spring has two main approaches for scope 
1. singleton
2. prototype

Singleton is the default approach for this scope 



# Singleton 
* Spring assigns one instance per bean definition and shares it 
* You will always get same reference stored at bean
* It does not create any new instance instead it returns existing one
* bean definition can produce only one instance
* Beans of same types with different name are seperate singleton instances

* If the object does not need capability provided by framework it does not need to be bean
* Better design singleton beans immutable
* Mutable prefer prototype bean which avoids race condition

## eager and lazy instanisation

* eager instanisation : created bean when context loaded
* lazy instanisation : create bean when first it refers


# Prototype Scope 
* Prototype scope refers it can new instance every time it called
* they created at demand not at started
* But dont inject inside singleton bean or sterortype annotation directly because it will be create only once
* Get it from ApplicationContext instead 
