/*

**Problem 4.1**
Two byte variables are added: `byte b1 = 100; byte b2 = 50;` and you try to store the result in a byte variable. Will this work? If not, what do you need to do?
*/
class Solution1{
    public void solve(){
        byte b1 = 100;
        byte b2 = 50;
        // Addition gets its out of bounds type promoted
        int x = b1+b2;
        System.out.println(x);
    }
}
/* 
**Problem 4.2**
You have `int x = 10;` and `double y = 5.5;` and you add them. What will be the data type of the result? Explain why Java chooses this type.
*/
class Solution2{
    public void solve(){
        int x = 10;
        double y = 5.5;
        double ans = x+y;
        System.out.println(ans);
        // becuase double might not lose precision while int stored in such lose precision
    }
}
/*
**Problem 4.3**
In an expression: `short s1 = 10; short s2 = 20; short result = s1 + s2;` Will this compile? Why or why not?
*/
class Solution3{
    public void solve(){
        short s1 = 10;
        short s2 = 20;
        int ans = s1+s2;
        System.out.println(ans);
        // Type promoted since there is chance of go out of size
    }
}
/*
*Problem 4.4**
You are calculating a percentage: `int total = 100; int obtained = 75;` and you divide obtained by total. What will be the result and what data type? Is this what you want?
*/
class Solution4{
    public void solve(){
        int total  = 100;
        int obtained = 75;
        System.out.println(obtained/total*1.0);
    }
}
/*
**Problem 4.5**
When performing `long num = 1000000L; int divisor = 2; long result = num / divisor;` What will be the data type of `num / divisor`? Will you get the correct result?

---
 */
class Solution5{
    public void solve(){
         long num = 1000000L;
         int divisor =2;
         long result = num/divisor;
         System.out.println(result);
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
