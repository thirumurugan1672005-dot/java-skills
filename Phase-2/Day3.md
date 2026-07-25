# String Methods

* toUpperCase
  new String with upper case
  
* toLowerCase
   new String with lower case

* strip
   new String with all leading and trailing spaces removed
* stripLeading , stripTrailing()
    new String with leading or trailing spaces removed respectively

* compareTo()
  comparing strings a.compareTo(b)
   1. 0 : equal
   2. +ve: a is lexographically greater than b
   3. -ve: a is lexographically lesser than b

* equals()
   check the value equal in strings

* replace(a,b)
  replace a  with b in string to create new string

# StringBuilder
StringBuilder is the class which helps to build mutable strings

1. append : append the character at end
2. length : length of builder
3. setLength : set Length of builder
4. insert : insert at particular index
5. delete : delete the character
6. deleteCharAt() : delete char at index
7. setCharAt(i) : set char at index
```java
StringBuilder s = new StringBuilder();
s.append("c");
s.append("a");
s.insert(1,"d");
s.delete("c");
s.append("H");
s.deleteCharAt(0);
s.setLength(1);
System.out.println(s);
```
# Text Blocks 
Text Blocks used to include some strings non code strings 

```java

String block = """
<html>
</html>
"""
```
