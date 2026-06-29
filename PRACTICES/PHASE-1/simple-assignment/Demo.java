/*

**Problem 12.1**
Initialize variables for a student profile:
- Name: "Raj Kumar"
- Roll number: 101
- Marks: 85.5
- Is passed: true

Write assignment statements for all.
*/
class Solution1{
    public void solve(){
        String name = "Raj Kumar";
        int rollNo = 101;
        double marks = 85.5;
        boolean isPassed = true;
        System.out.println("Name: "+name);
        System.out.println("Roll Number: "+rollNo);
        System.out.println("Marks: "+marks);
        System.out.println("Is Passed: "+isPassed);
    }
}
/*
**Problem 12.2**
You're building a calculator. Assign initial values to:
- First number
- Second number
- Operation type (as a character)
- Result
*/
class Solution2{
    public void solve(){
        int firstNumber = 20;
        int secondNumber = 30;
        char operationType  ='+';
        if(operationType == '+'){
             int result = firstNumber + secondNumber;
             System.out.println(result);
        }
    }
}
/* 
**Problem 12.3**
In a game, assign starting values:
- Player name: "Hero"
- Player lives: 3
- Player score: 0
- Game over: false
*/
class Solution3{
  public void solve(){
     String playerName = "Hero";
     int playerLives = 3;
     int playerScore = 0;
     boolean isGameOver = false;
     System.out.println("Player Name: "+playerName);
     System.out.println("Player lives: "+playerLives);
    System.out.println("Player Score: "+playerScore);
    System.out.println("Is Game Over: "+isGameOver);
  }
}
/* 
**Problem 12.4**
Create variables for an e-commerce cart:
- Cart total: 0
- Item count: 0
- Coupon code: "NONE"
- Is checkout started: false
*/
class Solution4{
    public void solve(){
        int totalCart = 0;
        int noItems = 0;
        String couponCode = "NONE";
        boolean isCheckOutStarted = false;
        System.out.println("Total Cart: "+totalCart);
        System.out.println("Number of Items: "+noItems);
        System.out.println("Coupon Code : "+couponCode);
        System.out.println("Is CheckOut Started: "+isCheckOutStarted);
    }
}
/* 
**Problem 12.5**
Initialize variables for a weather application:
- Current temperature: 25.5
- Weather condition: "Sunny"
- Humidity: 65
- Is raining: false

---

 */
class Solution5{
    public void solve(){
        double currTemperature = 25.5;
        String weatherCondition = "Sunny";
        int humidity = 65;
        boolean isRaining = false;
        System.out.println("Current Temperature : "+currTemperature);
        System.out.println("Weather Condition: "+weatherCondition);
        System.out.println("Humidity: "+humidity);
        System.out.println("Is Raining: "+isRaining);

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
