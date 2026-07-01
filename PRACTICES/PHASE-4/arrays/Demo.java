
/*

### Q1: Find Missing Number in Array
**Real-world scenario:** A library has book IDs 1 to 100. One book is missing. Find it.

**Input:**
```
Array: [1, 2, 3, 4, 6, 7, 8, 9, 10] (length = 9)
Expected: IDs should be 1-10
```

**Output:**
```
Missing number: 5
```


---
*/

import java.util.HashSet;

class Solution1{
    public void solve(){
        int arr[] = {1,2,3,4,6,8,9,10};
        int len = arr.length;
        int n = len + 1;
        int sum = n * (n+1) / 2;
        for(int num:arr){
            sum-=num;
        }
        System.out.println(sum);
    }
}
/* 

### Q2: Find Second Largest Number
**Real-world scenario:** In a student grades array, find the second-highest score.

**Input:**
```
Grades: [95, 87, 92, 95, 78, 85, 91]
```

**Output:**
```
Second largest: 92
```


---
*/
class Solution2{
    public void solve(){
        int[] grades =  {95, 87, 92, 95, 78, 85, 91};
        int first = grades[0];
        int second = Integer.MIN_VALUE;
        for(int grade:grades){
             if(first < grade){
                second = first;
                first = grade;
             }
             else if(second < grade && grade != first){
                second = grade;
             }
        }
        System.out.println(second);
    }
}
/* 

### Q3: Rotate Array Left by K Positions
**Real-world scenario:** Playlist rotation. Move first K songs to end.

**Input:**
```
Array: [1, 2, 3, 4, 5]
K: 2
```

**Output:**
```
[3, 4, 5, 1, 2]
```

**Hints:**
- Create new array, copy elements from index k
- Use modulo operator for circular indexing

---
*/
class Solution3{
    public void rotate(int[]arr,int k){
         int newArr[] = new int[arr.length];
         for(int i=k;i<arr.length;i++){
            newArr[i-k] = arr[i];
         }
         for(int i=0;i<k;i++){
            newArr[i+k] = arr[i];
         }
         for(int num:newArr){
            System.out.print(num+" ");
         }
         System.out.println();
    }
    public void reverse(int[]arr,int l,int r){
          while(l<=r){
             int t = arr[l];
             arr[l] = arr[r];
             arr[r] = t;
             l++;
             r--;
          }
    }
    public void solve(){
        int[]arr = {1,2,3,4,5};
        int k = 2;
        rotate(arr, k);
        reverse(arr,0,k-1);
        reverse(arr,k,arr.length-1);
        reverse(arr,0,arr.length-1);


    }
}
/* 
### Q4: Find Duplicate Elements in 2D Matrix
**Real-world scenario:** Seating chart for exam. Find students appearing in multiple rows (data error).

**Input:**
```
Student IDs (2D):
[1, 2, 3, 4]
[2, 5, 6, 7]
[1, 8, 9, 10]
```

**Output:**
```
Duplicates: 1, 2
```


---
*/
class Solution4{
    public void solve(){
        int arr[][] = {{1, 2, 3, 4},{2, 5, 6, 7},{1, 8, 9, 10}};

        HashSet<Integer>set = new HashSet<>();
        HashSet<Integer>duplicates = new HashSet<>();

        boolean isDuplicate = false;
        for(int []a:arr){
            for(int ele:a){
                if(set.contains(ele)){
                    duplicates.add(ele);
                
                }
                set.add(ele);
            }
        }
        System.out.println("Duplicates are : "+duplicates);
    }
}
/* 
### Q5: Sum of Diagonals in 2D Matrix
**Real-world scenario:** Calculate total cost for items along diagonal of pricing grid.

**Input:**
```
Price matrix (5x5):
[10, 20, 30, 40, 50]
[60, 70, 80, 90, 100]
[110, 120, 130, 140, 150]
[160, 170, 180, 190, 200]
[210, 220, 230, 240, 250]
```

**Output:**
```
Primary diagonal sum: 650
Secondary diagonal sum: 650
```

---
 */
class Solution5{
    public void solve(){
        int mat[][] = {
            {10, 20, 30, 40, 50},{60, 70, 80, 90, 100},
            {110, 120, 130, 140, 150},{160, 170, 180, 190, 200},
            {210, 220, 230, 240, 250}
        };
        int pDiagonal = 0;
        int sDiagonal = 0;
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++){
                if(i==j){
                   pDiagonal += mat[i][j];
                }
                if(j==mat[0].length-i-1){
                    sDiagonal +=mat[i][j];
                }
            }
        }
        System.out.println("Primary Diagonal : "+pDiagonal);
        System.out.println("Secondary Diagonal : "+sDiagonal);
    }
}

public class Demo {
    public static void main(String[] args) {
        Solution1 obj1 = new Solution1();
        obj1.solve();
        Solution2 obj2 = new Solution2();
        obj2.solve();
        Solution3 obj3 = new Solution3();
        obj3.solve();
        Solution4 obj4 = new Solution4();
        obj4.solve();
        Solution5 obj5 = new Solution5();
        obj5.solve();
    }
}
