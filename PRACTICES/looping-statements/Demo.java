/*
**Problem 20.1**
Print numbers from 1 to 100. How would you use a for loop? What would be the initialization, condition, and increment?
*/

class Solution1{
    public void solve(){
         for(int i=1;i<=100;i++){
            System.out.print(i+" ");
         }
         System.out.println();
    }
}
/*
**Problem 20.2**
Print multiplication table of 5 (5×1=5, 5×2=10, ... 5×10=50). Design a for loop for this.
*/
class Solution2{
    public void solve(){
         for(int i=1;i<=10;i++){
            System.out.println(5+"x"+i+"="+(5*i));
         }
    }
}
/*
**Problem 20.3**
Calculate the sum of numbers from 1 to 50. How would you use a for loop with an accumulator variable?
*/
class Solution3{
    public void solve(){
        int sum = 0;
        for(int i=1;i<=50;i++){
            sum+=i;
        }
        System.out.println(sum);
    }
}
/* 
**Problem 20.4**
Count the number of even numbers from 1 to 100. Explain how you would do this in a for loop.
*/
class Solution4{
    public void solve(){
        for(int i=1;i<=100;i++){
            if(i%2==0){
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }
}
/* 
**Problem 20.5**
Generate the Fibonacci sequence for the first 10 numbers (1, 1, 2, 3, 5, 8, 13, 21, 34, 55). Design a for loop for this.

---
 */
class Solution5{
    public void solve(){
        
        int a = 0;
        int b = 1;
        System.out.println(1);
        for(int i=2;i<=10;i++){
            int c = a+b;
            System.out.print(c+" ");
            a = b;
            b = c;
        }
        System.out.println();

    }
}
public class Demo {
    public static void main(String[] args) {
        Solution1 solution1 = new Solution1();
        solution1.solve();
        Solution2 solution2 = new Solution2();
        solution2.solve();
        Solution3 solution3 = new Solution3();
        solution3.solve();
        Solution4 solution4 = new Solution4();
        solution4.solve();
        Solution5 solution5 = new Solution5();
        solution5.solve();
    }
}
