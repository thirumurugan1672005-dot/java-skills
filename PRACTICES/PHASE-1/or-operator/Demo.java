/*

**Problem 10.1**
A student can attend college if:
- They passed 12th grade OR
- They passed an entrance exam

Write a logical expression. What does this mean?
*/
class Solution1{
    public void solve(){
        boolean havePassed12th = true;
        boolean havePassedEntrance = true;
        System.out.println(havePassed12th || havePassedEntrance);
    }
}
/* 
**Problem 10.2**
A parking spot is available if:
- It's a weekend OR
- It's after 6 PM on a weekday

Create a logical condition for this using OR.
*/
class Solution2{
    public void solve(){
        boolean isWeekEnd = false;
        boolean isAfter6pm = false;
        System.out.print(isWeekEnd || isAfter6pm);
    }
}
/*
**Problem 10.3**
A customer gets a discount if:
- They are a senior citizen (age 60+) OR
- They have a loyalty card

Write the condition using OR operator.
*/
class Solution3{
    public void solve(){
        int ageOfCitizen = 65;
        boolean haveLoyaltyCard = true;
        System.out.println(ageOfCitizen >=65 || haveLoyaltyCard);
    }
}
/* 
**Problem 10.4**
A fire alarm should trigger if:
- Temperature exceeds 60°C OR
- Smoke detector is activated

Create a logical expression using OR.
*/
class Solution4{
    public void solve(){
        int temperature = 75;
        boolean haveDetectSmoker = false;
        System.out.println(temperature>= 60 || haveDetectSmoker);
    }
}
/* 
**Problem 10.5**
You can watch a movie if:
- You are 18+ years old OR
- You have parental permission

Write the logical condition using OR operator.

--- */
class Solution5{
    public void solve(){
        int age = 20;
        boolean haveParentalPermission = false;
        System.out.println(age >= 18 || haveParentalPermission);
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
