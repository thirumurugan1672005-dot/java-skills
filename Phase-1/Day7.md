# char Data Type

* It was originally Intended to store one character
* Java uses Unicode 16 bit encoding scheme
* They are denoted by single quotes 'A'
* "A" is String is different from 'A'

## Escape Sequences
* Escape sequences are used with quotes '' or ""
* only \u can be allowed outside quotes
for example :
* \n : newline
* \t : tabspace
* \s : space

```
  Unicode Sequences are proccessed before code parsed so if there is mistake in comments are also checked
```
```java

\\  \u
```
The above line won't compile because \u is not followed with hexadecimal

```
You can have any number of \u in the unicode sequence allows to
change between encoding schemes easier
```

# Unicode Encoding System
* Java uses Unicode encoding Scheme 16 bit

In Encoding Schemes There are two problems
1. One letter was encoded as different letters in different encoding schemes
2. Some of the large character sets have variable length of encoding schemes

* Unicode solves this problem (16 bits)
* However there are more than 65,536 characters are used there which cannot fit into 16 bit

* Java uses Code point
## Code Point:
      The code Value associated with character in encoding scheme
* There are grouped into 17 planes are there one is basic multilingual and other 16 are supplementary
* BasicMultilingual plane one code unit is enough
* While Supplementary Plane are represented consecutive pairs of code units
* Basic Multilingual : U+0000 - U+FFFF
* Supplementary : U+10000 - U+1FFFF

In Supplementary Pairs we use 2048 unused pairs of basic mulitlingual pairs to represent it it is referred as surrogate pairs
