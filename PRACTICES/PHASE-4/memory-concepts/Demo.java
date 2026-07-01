/*

## MEMORY CONCEPTS (5 Questions)

### Q1: Understand Reference Aliasing
**Real-world scenario:** Edit list from multiple references.

**Input:**
```
List 1: [1, 2, 3]
List 2 = List 1 (assign reference)
Modify List 2[0] = 99
```
*/
class Solution1{
    public void solve(){
        int[]arr1 = {1,2,3};
        int[]arr2 = arr1;
        arr2[0] = 99;
        for(int ele:arr1){
            System.out.print(ele+" ");
        }
        System.out.println();
        int arr3[] = new int[arr1.length];
        for(int i=0;i<arr1.length;i++){
            arr2[i] = arr1[i];
        }

    }
}
/* 
// Answer : References  assigned reflects on changes when 99 beacuse they points to same memory buyt when new you create new object.
**Question:**
```
What is List 1[0]? Why?
```

**Output:**
```
99 (both point to same array in memory)
```

**Hints:**
- Assignment with reference types = same object
- Changes visible from all references
- Use new to create separate copy

---
*/]

/* 

### Q2: String Reference vs Value
**Real-world scenario:** Compare passwords (identity vs equality).

**Input:**
```
Password 1: new String("password123")
Password 2: new String("password123")
```

**Question:**
```
pwd1 == pwd2  → ?
pwd1.equals(pwd2) → ?
Which should you use for password comparison?
```

**Output:**
```
false (different objects)
true (same content)
Use .equals() for content comparison
```

**Hints:**
- == checks if same memory reference
- .equals() checks if same content
- Always use .equals() for Strings

---
*/
class Solution2{
    public void solve(){

        String Password1 = new String("Password@123");
        String Password2 = new String("Password@123");
        System.out.println(Password1 == Password2);// checks both point to same memory
        System.out.println(Password1.equals(Password2)); // checks both equal 
    }
}
/* 
### Q3: Null Reference Exception
**Real-world scenario:** Handle missing data gracefully.

**Input:**
```
User data: null (user not found)
Try to access: userName.length()
```

**Question:**
```
What happens? How to handle safely?
```

**Output:**
```
NullPointerException thrown
Need to check: if(userData != null)
```

**Hints:**
- Check for null before using
- Use if(variable != null)
- Provide default values

---
*/
class Solution3{
    public void solve(){

        String userData = null;
        if(userData != null){
           System.out.println(userData.length());
        }
    }
}
/*
### Q4: Pass by Value vs Pass by Reference
**Real-world scenario:** Modify array in method - does it affect original?

**Input:**
```
Original array: [1, 2, 3]
Call method changeArray(arr)
Inside: arr[0] = 100
```

**Question:**
```
After method call, what is original array?
Why is it different for primitives vs arrays?
```

**Output:**
```
[100, 2, 3] (changes persist)
Arrays are reference type, primitives are value type
```

**Hints:**
- Primitives: pass by value (copy)
- Objects/Arrays: pass by reference (memory address)
- Inside method modifies same object

---
*/
class Solution4{
    public void changeArr(int[]arr){
        arr[0] = 99;
    }
    public void solve(){
        int arr[] = {1,2,3};
        changeArr(arr);
        System.out.println(arr[0]);
    }
}
/* 
### Q5: Understanding Garbage Collection
**Real-world scenario:** Memory cleanup after removing references.

**Input:**
```
Create: Student s1 = new Student("John");
Create: Student s2 = s1;
Remove: s1 = null;
Remove: s2 = null;
```

**Question:**
```
When is the Student object garbage collected?
After s1 = null or after s2 = null?
```

**Output:**
```
After s2 = null (when ALL references removed)
s1 = null alone is not enough
```

**Hints:**
- Object removed when ALL references are null
- Garbage collector runs automatically
- Multiple references = object still alive

--- */
class Student{
    String name;
    Student(String name){
        this.name = name;
    }
}
class Solution5{
    public void solve(){
           Student s1 = new Student("John");
          Student s2 = s1;
          s1 = null;
          s2 = null;
    }
}

public class Demo {
    public static void main(String[] args) {
        Solution1 obj1 = new Solution1();
        obj1.solve();
        Solution2 obj2 = new Solution2();
        obj2.solve();

    }
}
