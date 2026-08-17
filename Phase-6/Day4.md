# Accessing Elements in ArrayList

* get() : get the elements of array list using indexes.
* set(i,ele): set the elements at index of array list 
* if index is greater or equal to size , the IndexBoundsOfException occurs.

## Before Generic Class 
* Legacy code used ArrayList with raw type which is bit dangerous
* Since they can accept objects of any class
* So when casted use instance of tests to avoid ClassCastException
* Compiler Errors which are coming can be supressed by @SupressWarnings()
