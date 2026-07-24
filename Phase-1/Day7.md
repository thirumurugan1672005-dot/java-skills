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
