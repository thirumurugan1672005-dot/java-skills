# for each loop in arrays

for each loop in arrays used to iterate over values it works on arrays and objects of class that implements Iterable interface

```java

int[]arr = {1,2,3};
for(int ele:arr){
System.out.print(ele);
}
```

# Arrays copying


Example 1
```java
int[] arr = new int[]{1,2,3,4,5};
int[]brr = arr;

brr[0] = 100;
System.out.print(arr[0]);
```
output : 100

Because Both Arrays share same copy 

Example 2

```java

int[]arr = {1,2,3};
int[]brr = Arrays.copyOf(arr,arr.length);
```
If it is same length entire array is copied 

If it is less length intial values are copied

If it higher length remaining have default values


# Command line Arguments

Command line arguments are arguments passed in command line in String[] in main method

```
java Hello.java -g Cruel World

args[0] = -g
args[1] = "Cruel"
args[2] = 'World"
```

# Sorting Arrays

Arrays are sorted by sort() method

```java
Arrays.sort(arr);
```

# Multidimensional arrays 

Multidimensional arrays are arrays have more than one dimensions

```java
int[][]arr =  { {1,2,3} ,{4,5,6} ,{7,8,9} };
for(int i=0;i<arr.length;i++){
   for(int j=0;j<arr[i].length;j++){
      System.out.print(arr[i][j]+" ");
   }
}
```

# Ragged Arrays

Ragged Arrays in which a multidimensional arrays inside arrays have different length

```java

int[]arr = {{1,2,3},{4,5},{6}};
```
Convert Arrays into String

Arrays.toString(arr);

For Multidimensional

Arrays.toDeepString(arr);

