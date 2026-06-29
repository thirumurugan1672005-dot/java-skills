/*

**Problem 16.1**
A number is either even or odd. Write logic to:
- If even, print "Even number"
- If odd, print "Odd number"
*/

import java.util.Scanner;

class Solution1{
    public void solve(Scanner sc){
        int n = sc.nextInt();
        if(n%2 == 0){
            System.out.println("Even number");
        }
        else{
            System.out.println("Odd number");
        }
    }
}
/* 
**Problem 16.2**
A student passes if marks are 40 or more, otherwise fails. Write the logic.
*/
class Solution2{
    public void solve(Scanner sc){
          int marks = sc.nextInt();
          if(marks >= 40){
             System.out.println("Passed");
          }
          else{
            System.out.println("Failed");
          }
    }
}
/* 
**Problem 16.3**
A discount is applied if:
- If age > 60: Senior citizen discount
- Otherwise: No discount
*/
class Solution3{
    public void solve(Scanner sc){
         int age = sc.nextInt();
         if(age > 60){
            System.out.println("Senior Citizen");
         }
         else{
            System.out.println("No Discount");
         }
    }
}
/* 
**Problem 16.4**
A room booking is confirmed if:
- If room is available: Confirm booking
- Otherwise: Show "Room not available"
*/
class Solution4{
    public void solve(){
        boolean isRoomAvaialable = false;
        if(isRoomAvaialable){
            System.out.println("Confirm booking");
        }
        else{
            System.out.println("Room not available");
        }
    }
}
/* 
**Problem 16.5**
A password is valid if:
- If length is 8 or more: Password accepted
- Otherwise: Password too short

---
 */
class Solution5{
    public void solve(Scanner sc){
        String password = sc.nextLine();
        if(password.length() >= 8){
            System.out.println("Password accepted");
        }
        else{
            System.out.println("Password too short");
        }
    }
}
public class Demo {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        Solution1 solution1 = new Solution1();
        solution1.solve(sc);
        Solution2 solution2 = new Solution2();
        solution2.solve(sc);
        Solution3 solution3 = new Solution3();
        solution3.solve(sc);
        Solution4 solution4 = new Solution4();
        solution4.solve();
        Solution5 solution5 = new Solution5();
        solution5.solve(sc);

    }
}
