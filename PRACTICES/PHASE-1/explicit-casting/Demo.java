/*

**Problem 3.1**
You have `double salary = 50000.75;` and you need to store it in an int variable for a report that only needs whole numbers. Will Java allow this directly? What do you need to do?
*/
class Solution1{
    public void solve(){
        double salary = 50000.75;
        int intSalary = (int)salary;
        System.out.println(intSalary);
    }
}
/* 
**Problem 3.2**
You are converting a long value (9999999999L) to an int. Explain what might happen to the data. Is this a safe operation?
*/
class Solution2{
    public void solve(){
        long x = 9999999999L;
        int y = (int)x;
        System.out.print(y);
    }
}
/* 
**Problem 3.3**
You have a decimal value `double price = 19.99;` and you need to display it as a whole number in a price list. What would happen if you convert it to int? Will you lose data?
*/ 

class Solution3{
    public void solve(){
         double price = 19.99;
         int intPrice=0;
         if(price <= Integer.MAX_VALUE){
          intPrice =(int)price;

         }
         System.out.println(intPrice);
    }
}
/***Problem 3.4**
You receive a large number as a long: `long largeNum = 10000000000L;` and you need to store it in an int. Discuss what will happen and whether this is a good idea.
*/
class Solution4{
    public void solve(){
        long largeNum = 10000000000L;
        int num =0;
        if(largeNum <= Integer.MAX_VALUE){
             num = (int)largeNum;
        }
        System.out.println(num);
    }
}
/*
**Problem 3.5**
In a game, player scores are stored as double (with multipliers like 1.5x). To display the final score as a whole number, you need to convert it to int. Explain the process and any potential data loss.

--- */
class Solution5{
    public void solve(){
        double score = 1.567;
        int wholeScore = (int)score;
        System.out.println(wholeScore);
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
