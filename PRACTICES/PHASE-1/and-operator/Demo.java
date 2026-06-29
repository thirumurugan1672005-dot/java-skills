/*

**Problem 9.1**
A bank grants a loan if:
- Customer age is above 21 AND
- Customer's credit score is above 700

Write a logical expression for this. What happens if either condition is false?
*/
class Solution1{
    public void solve(){
        int age = 32;
        int creditScore = 800;
        System.out.println(age > 21 && creditScore> 700);
    }
}
/* 
**Problem 9.2**
A job application is accepted if:
- Candidate has a bachelor's degree AND
- Candidate has at least 2 years of experience

Create a logical expression. Can a candidate be selected if they have only one of these?
*/
class Solution2{
    public void solve(){
        boolean haveBachelorDegree = false;
        int yearsOfExperience = 3;
        System.out.println(haveBachelorDegree && yearsOfExperience >= 2);
    }
}
/* 
**Problem 9.3**
A restaurant reservation is confirmed if:
- Number of guests is between 1 and 100 AND
- Reservation time is during business hours

Write conditions to check this using AND operator.
*/
class Solution3{
    public void solve(){
        int noGuests = 23;
        boolean isReservationTime = false;
        System.out.println(noGuests>=1 && noGuests<=100 && isReservationTime);
    }
}
/* 
**Problem 9.4**
A swimming competition requires participants to:
- Be at least 10 years old AND
- Have a valid membership

How would you check if someone can participate using AND?
*/
class Solution4{
    public void solve(){
        int age = 12;
        boolean isMemberShip = true;
        System.out.println(age >= 10 && isMemberShip);
    }
}
/* 
**Problem 9.5**
A movie rating system grants access if:
- User is at least 18 years old AND
- User has active subscription

Write the logical condition using AND operator.

---
 */
class Solution5{
    public void solve(){
        int age = 20;
        boolean isActiveSubsrciption = false;
        System.out.println(age >= 18 && isActiveSubsrciption);
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
