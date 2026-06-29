/*

**Problem 18.1**
Days of the week (1-7):
- 1: Monday
- 2: Tuesday
- ... (continue for all)
- 7: Sunday
*/
class Solution1{
    public void solve(){
        int day = 5;
        switch(day){
            case 1:
                System.out.println("Monday");
                
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid date!");
        }
    }
}
/* 
Write a switch statement to print day name from number.

**Problem 18.2**
Month numbers (1-12):
- 1: January
- 2: February
- ... (continue)
- 12: December

How would you print month name from number using switch?
*/
class Solution2{
    public void solve(){
        int month = 10;
        switch(month){
             case 1:
                System.out.println("January");
                break;
             case 2:
                System.out.println("February");
                break;
             case 3:
                System.out.println("March");
                break;
             case 4:
                System.out.println("April");
                break;
             case 5:
                System.out.println("May");
                break;
             case 6:
                System.out.println("June");
                break;
             case 7:
                System.out.println("July");
                break;
             case 8:
                System.out.println("August");
                break;
             case 9:
                System.out.println("September");
                break;
             case 10:
                System.out.println("October");
                break;
             case 11:
                System.out.println("November");
                break;
             case 12:
                System.out.println("December");
                break;
                default:
                    System.out.println("Invalid month!");
        }
    }
}
/* 
**Problem 18.3**
Traffic light system:
- R: Stop
- Y: Wait
- G: Go

Write a switch to display the message based on light color.
*/
class Solution3{
    public void solve(){
        char light = 'R';
        switch(light){
            case 'R':
              System.out.println("Red");
              break;
            case 'Y':
                System.out.println("Wait");
                break;
            case'G':
            System.out.println("Go");
            break;
            default:
                System.out.println("Invalid code");
        }
    }
}
/* 
**Problem 18.4**
Menu system:
- 1: Login
- 2: Register
- 3: Forgot password
- 4: Exit

How would you handle menu choices using switch?
*/
class Solution4{
    public void solve(){
        int chocie = 1;
        switch (chocie) {
            case 1:
                System.out.println("Login");
                break;
            case 2:
                System.out.println("Register");
                break;
            case 3:
                System.out.println("Forgot Password");
                break;
            case 4:
                System.out.println("Exit");
                break;
        
            default:
                System.out.println("Invalid code");
                break;
        }
    }
}
/*
**Problem 18.5**
Payment method:
- 1: Credit card
- 2: Debit card
- 3: UPI
- 4: Cash

Write switch logic to process different payment methods.

--- */
class Solution5{
    public void solve(){
        int paymentMethods = 2;
        switch(paymentMethods){
             case 1:
                System.out.println("Credit card");
                break;
             case 2:
                System.out.println("Debit card");
                break;
             case 3:
                System.out.println("UPI");
                break;
             case 4:
                System.out.println("Cash");
                break;
            default:
                System.out.println("Invalid code");
        }
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
