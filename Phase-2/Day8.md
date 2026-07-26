# Big Numbers

Big Numbers are numbers which goes beyond the limit

1. BigDecimals
2. BigInteger

```java
import java.math.*;
class Solution{
   public static void main(String[] args){
       BigInteger x = BigInteger.valueOf(23);
       BigInteger y = new BigInteger("123456789012345667");
       y.multiply(2)
   }
}
```

They have methods like add , multiply,subract ,divide 

For comparing they have compareTo method


# Arrays

Arrays are DataStructure which holds similar data type of any fixed size

Intialsing with fixed size 10
```java
int[]arr; // Declaring array variable
arr = new int[10]; // intialising with fixed size 10
```
Intialsing with user input size n
```java
 Scanner sc = new Scanner(System.in);
 int n = sc.nextInt();
int[] arr = new int[n]; // you can also use variables 
```

Empty Arrays : Arrays of length zero
```java
int[] arr = new int[0];
```
Null means array variable does not associate with any arrays
```java
int[]arr = null;
```

Array values are accessed by indexes which ranges from 0 to size - 1
```java
int[]arr = new int[10];
System.out.print(arr[0]);
```
At Default Numerical data types have 0 and pointing have 0.0 and objects have null , boolean have false
```java
String[]sArr = new String[10];
System.out.println(sArr[2]);// prints null
```
To find the length of array we have array.length to use 

Now We can change elements inside array but not increase or decrease size of array

```java
int[]arr = new int[3];
arr[0] = 4;
arr[1] = 3;
arr[2] = 2;
arr[0] = 5;
```

We can iterate array using indexes
```java
int[]arr = {1,2,4,5}; // intialising without new keyword
for(int i=0;i<arr.length;i++){
System.out.print(arr[i]+" ");
}
```
Some Arrays don't have names : Anymnous Arrays

```java
 new int[]{1,2,3,4,5};
```

Arrays produce Exception when access elements outside bounds index >= length
```java
int arr[] = new int[10];
System.out.println(arr[10]); // wont compile
```
