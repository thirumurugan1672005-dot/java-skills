/*

**Problem 2.1**
You have a byte value of 50 and need to convert it to an int.
 Explain whether this conversion will happen automatically or if you need to do anything manually. 
Will you lose any data? */

import java.util.Scanner;


class Solution1{
    public void solve(){
         byte b = 50;
         int x = b;
         System.out.println(x);
    }
}

/*


**Problem 2.2**
You have two variables: `int x = 100;` and you want to assign this to a long variable. Will Java allow this automatically? Why or why not?
*/
class Solution2{
    public void solve(){
        int x = 100;
        long y = x;
        System.out.print(y);
    }
}
/* 
**Problem 2.3**
You are reading student marks as integers (0-100) and need to calculate average marks as a decimal value. If you add int values and want the result as a double, what will happen? Will you lose precision?
*/
class Solution3{
    public void solve(){
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        int n4 = sc.nextInt();
        int n5 = sc.nextInt();
        int sum = n1+n2+n3+n4+n5;
        double avg = sum/5.0;
        System.out.println("Average : "+avg);
        sc.close();
    }
}
/* 
**Problem 2.4**
In a calculation, you have: `int a = 5;` and you add it to `double b = 2.5;`. What will be the data type of the result? Will Java do this automatically?
*/
class Solution4{
    public void solve(){
         int a = 5;
         double b = 2.5;
         double c = a+b;
         System.out.println(c);
    }
}
/* 
**Problem 2.5**
You have a short variable storing a value 32000. You want to assign it to an int variable. Will this work automatically? Explain the reason.

--- */
class Solution5{
    public void solve(){
        short s = 32000;
        int x = s;
        System.out.println(x);
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
