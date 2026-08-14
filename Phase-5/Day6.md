# How Method Executes

## Method Signature
 * The Method name and its parameters are referred as method signature.
 * Return Type is not a part of method signature.
## Method Overloading 
  * Methods with same method but with different parameters is called method overloading.
  * Methods with same name only different return type are not allowed.

##  Step 1: Compiler looks for method name
   * Compiler first looks all the accessible methods with particular method names
   * See Private method from Superclass are not accessible.
   * If not compiler error
## Step 2: Compiler looks for parameters
   * Compiler will look for parameters  determines the unique method with particular method with parameters.
   * If not compiler error
## Now Compiler knows name and parameters
   * Determines which version
   * Private , static,final methods are find within same class is called static binding
   * other instance methods are find with class and depends on actual type of object is called dynamic binding.
   * Methods specific to subclass cannot be called by superclass references

## What Virtual machine do ? 
1. Virtual machine precomputes the method table with method signatures for each class when class loads
2. When method called the Virtual machine looks up table
3. when use super() keyword used Virtual machine just looks the method table of super class

* Subclass method should be same or more visible as parent class method.
