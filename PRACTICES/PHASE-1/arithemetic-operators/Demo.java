/*

**Problem 6.1**
A store sells items. Each item costs Rs. 250. A customer buys 7 items. Calculate the total cost. What operation would you use?
*/

import java.util.Scanner;

class Solution1{
    public void solve(){
        int noItems = 7;
        int costPerEachItem = 250;
        System.out.println("Total price : "+(noItems*costPerEachItem));    
    }
}
/* 
**Problem 6.2**
You have a total amount of Rs. 1000 and you want to divide it equally among 3 friends. What will be the amount each friend gets? How would you ensure you get a decimal result?
*/
// becuase 1000 divides 3 it leaves remainder
class Solution2{
    public void solve(){
        int amount = 1000;
        int noFriends = 3;
        double amountPerPerson = amount / (noFriends *1.0);
        System.out.println(amountPerPerson);

    }
}
/* 
**Problem 6.3**
A car travels 240 kilometers in 4 hours. Calculate the average speed. Which operations would you use?
*/
class Solution3{
    public void solve(){
        int distance = 240;
        int time = 4;
        double speed = distance/time;
        System.out.println(speed);
    }
}
/* 
**Problem 6.4**
You have a salary of Rs. 50,000 per month. Calculate the annual salary. What operation would you use?
*/
class Solution4{
   public void solve(){
      double salaryPerMonth = 50_000;
      int totalMonths = 12;
      double annualSalary = salaryPerMonth * totalMonths;
      System.out.println(annualSalary);
   }   
}
/* 
**Problem 6.5**
A baker has 250 eggs and needs to pack them in cartons of 12 eggs each. How many complete cartons can be filled and how many eggs will be left over? Which operations would you use?

---
 */
class Solution5{
    public void solve(){
        int noEggs = 250;
        int eggsPerPack = 12;
        int totalPacks = noEggs / eggsPerPack;
        int remainingEggs = noEggs  % eggsPerPack;
        System.out.println("Total packs : "+totalPacks);
        System.out.println("Remaining eggs : "+remainingEggs);
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
