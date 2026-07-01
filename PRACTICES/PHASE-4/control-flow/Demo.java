import string.Solution1;
import string.Solution4;
import string.Solution5;
import stringbuilder.Solution2;
import stringbuilder.Solution3;

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

/*
 * 
 * ## CONTROL FLOW (5 Questions)
 * 
 * ### Q1: Print Multiplication Table Matrix
 ** Real-world scenario:** Create a reference table for quick calculations.
 ** 
 * Input:**
 * ```
 * Rows: 5
 * Columns: 5
 * ```
 ** 
 * Output:**
 * ```
 * 1 2 3 4 5
 * 2 4 6 8 10
 * 3 6 9 12 15
 * 4 8 12 16 20
 * 5 10 15 20 25
 * ```
 * 
 * 
 * ---
 */
class Solution1 {
    public void solve() {
        int rows = 5;
        int cols = 5;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {
                System.out.print(i * j + " ");
            }
            System.out.println();
        }
    }
}

/*
 * ### Q2: Find Element in 2D Array (Using Labeled Break)
 ** Real-world scenario:** Search for employee ID in department matrix.
 ** 
 * Input:**
 * ```
 * Matrix:
 * [101, 102, 103]
 * [104, 105, 106]
 * [107, 108, 109]
 * 
 * Search for: 105
 * ```
 ** 
 * Output:**
 * ```
 * Found at position: Row 1, Column 1
 * ```
 * 
 * 
 * ---
 */
class Solution2 {
    public void solve(){
        int[][]mat = {
            {101, 102, 103},{104, 105, 106},
            {107, 108, 109},
        };
        int search = 105;
        int rPos = -1;
        int cPos = -1;
        outer:for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                 if(mat[i][j] == search){
                    rPos = i;
                    cPos = j;
                     break outer;
                 }
            }
        }
        if(rPos == -1 || cPos == -1){
            System.out.println("Element not found!");
        }
        else{
            System.out.println("Found at Position Row "+rPos+", Column: "+cPos);
        }
     }
}
/*
 * 
 * ### Q3: Skip Even Rows (Using Labeled Continue)
 ** Real-world scenario:** Process only odd-numbered records.
 ** 
 * Input:**
 * ```
 * Process records 1-8
 * Skip even-numbered records
 * ```
 ** 
 * Output:**
 * ```
 * Processing: Record 1, 3, 5, 7
 * ```
 ** 
 
 * 
 * ---
 * 
 * */
class Solution3{
    public void solve(){
        System.out.println("Processing Records: ");
         outer: for(int i=1;i<=8;i++){
             if(i%2 == 0){
                continue outer;
             }
             System.out.print(i);
         }
         System.out.println();
    }
}
/* 
 * ### Q4: Diamond Pattern with Nested Loops
 ** Real-world scenario:** Generate ASCII art for display.
 ** 
 * Input:**
 * ```
 * n = 5
 * ```
 ** 
 * Output:**
 * ```
 *
 * *
 * * *
 * * * *
 * * * * *
 * * * *
 * * *
 * *
 *
 * ```

 */
class Solution4{
    public void sol1(int rows){
        for(int i=1;i<=rows;i++){
            for(int spaces = 1;spaces<=rows-i;spaces++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=1;i<=rows;i++){
            for(int space=1;space<=i-1;space++){
                System.out.print(" ");
            }
            for(int j=rows;j>=i;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public void sol2(int rows){
         for(int i=1;i<=2*rows-1;i++){
            int cols = (i <= rows) ? i : 2*rows-i;
            for(int spaces = 1;spaces<=rows-cols;spaces++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*cols-1;j++){
                System.out.print("*");
            }
            System.out.println();
         }
    }
    public void solve(){
              sol2(4);
    }
}
/* 
 * 
 * ---
 * 
 * ### Q5: Find Prime Numbers in Range (Using Labeled Break)
 ** Real-world scenario:** Generate list of primes for cryptography.
 ** 
 * Input:**
 * ```
 * Range: 1 to 20
 * ```
 ** 
 * Output:**
 * ```
 * Primes: 2, 3, 5, 7, 11, 13, 17, 19
 * ```
 ** 
 * Hints:**
 * - Outer loop: iterate numbers 2 to n
 * - Inner loop: check divisors 2 to sqrt(number)
 * - Use labeled break when divisor found
 * 
 * ---
 */
class Solution5{
    public void solve(){
        int l = 1;
        int r = 20;
        outer:for(int x=l;x<=r;x++){
            if(x == 1){
                continue outer;
            }
            for(int y=2;y<=(int)Math.sqrt(x);y++){
                    if(x % y == 0){
                        continue outer;
                    }
            }
           
            System.out.print(x+" ");
        }
        System.out.println();
    }
}
