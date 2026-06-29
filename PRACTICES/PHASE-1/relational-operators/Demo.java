/*

**Problem 8.1**
An online store offers a discount if the total purchase is above Rs. 1000. Write conditions to check if:
- Customer qualifies for discount
- Customer's bill equals exactly Rs. 1000
- Customer's bill is below the minimum order amount
*/
class Solution1{
    public void solve(){
        int totalPurchase = 5000;
        System.out.println(totalPurchase > 1000);
        System.out.println(totalPurchase == 1000);
        System.out.println( totalPurchase >= 1000);
    }
}
/* 

**Problem 8.2**
A school has an eligibility criteria for a scholarship:
- Minimum marks: 75
- Maximum family income: Rs. 5,00,000

Create relational expressions to check if a student qualifies.
*/
class Solution2{
    public void solve(){
        int marks =  100;
        int salary = 10_00_000;
        System.out.println(marks >= 75 && salary <= 5_00_000);
        
    }
}
/*
**Problem 8.3**
A gym membership validation needs to check:
- User's age is at least 18 years
- Membership is not expired
- Monthly fees are paid

Write relational expressions for each condition.
*/
class Solution3{
    public void solve(){
        int age = 20;
        boolean isMemeberShipExpired = false;
       boolean isMonthlyFessPaid = true;
        System.out.println(age >= 18);
        System.out.println(!isMemeberShipExpired)
        System.out.println(isMonthlyFessPaid);

    }
}
/* 
**Problem 8.4**
In an exam system, you need to check:
- Student scored more than passing marks (35)
- Student scored between 35 and 60
- Student scored 100 (full marks)

How would you write these conditions using relational operators?
*/
class Solution4{
    public void solve(){
        int marks = 80;
        System.out.println(marks >=35);
        System.out.println(marks >= 35 && marks <= 60);
        System.out.println(marks  == 100);
    }
}
/* 
**Problem 8.5**
A game has level progression:
- Level 1: Score between 0-99
- Level 2: Score between 100-199
- Level 3: Score 200 or above

Write conditions to determine which level the player is in based on their score.

--- */
class Solution5{
    public void solve(){
        int score = 100;
        System.out.println(score >= 0 && score <= 99);
        System.out.println(score >= 100 && score <= 199);
        System.out.println(score >= 200);
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
