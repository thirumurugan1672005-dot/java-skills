# Packages

Packages are the group of related class in the structure of java program

for example if two of them come with class with name Employee they can put in different package orelse class name conflict may occur.

Main Reason is Gurantee the uniqueness of class name.

We use Internet domain name in reverse order start with naming packages 

for example: example.com is domain

com.example is package and then subpackage will start

if your subpackage for example name is sample and class is Main class

Enitre name : com.example.sample.Main;

There is no relationship between nested packages in compiler point of view


# Class importation

* Classes can use other classes in same package and public classes in different package
* They used fully qualified name. Like java.util.Date; Date is present inside util folder in java folder
* import statement is state that we are using this class instead of writting for everytime
```java

import java.util.Date;
```
* When you import if two packages have same class name it may conflict so use full qualified name import for it
* ByteCodes is going to use fully qualified name only
```java

import java.sql.*;
import java.util.*;
import java.util.Date;
```

```*``` is used to import only files in folder not nested packages.

# Static imports
* A form of imports which tells imports static fields and methods not only classes.
* Rarely it was used

```java

import static java.lang.Math;

class Sol{
  public void solve(int x){
    System.out.println(sqrt(x));
 }
}
```

# Addition of Classes into Packages

* If you want to add .java file to package you need to declare package in source code at beginning before writting code

```java

package com.example;
class Example{
}
```
The Example Class belongs com.example package

* When you compile compilers did not check directories they check this and assumed it belongs to this package
* Compiler compiles even though they are present in wrong directories

* Virtual machine wants class files to be in same directory as package declared or else it won't run.



