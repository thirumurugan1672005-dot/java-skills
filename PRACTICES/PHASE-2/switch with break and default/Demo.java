/*

**Problem 19.1**
A switch without break statements can "fall through". Give an example where this might be useful. What happens if you forget the break?
*/

import java.util.Scanner;

class Solution1{
    public void solve(){
        int num = 5;
        switch(num){
            case 1:
                System.out.println(1);
                break;
            case 2:
                System.out.println(2);

            case 3:
                System.out.println(3);
            case 4:
                System.out.println(4);
                break;
            case 5:
                System.out.println(5);
            case 6:
                System.out.println(6);
            case 7:
                System.out.println(7);
            
        }
    }
}
// fall through it matches it goes from top to bottom
/* 

**Problem 19.2**
You're processing a character input (A, E, I, O, U for vowels, rest consonants). Should you use break statements? Why?
*/
class Solution2{
    public void solve(char c){
        switch(c){
            case 'A':
            case 'E':
            case 'I':
             case 'O':
            case 'U':
                 System.out.println("Vowel");
                 break;
            default:
                System.out.println("Consonants");
        }
    }
}
/* 
**Problem 19.3**
In a calculator, if the user enters an invalid operation, what should the default case do?
*/
class Solution3{
    public void solve(char op){
        int num1 = 12;
        int num2 = 3;
        switch(op){
             case '+':
                System.out.print(num1+num2);
                break;
            case '-':
                System.out.println(num1-num2);
                break;
            case '*':
                System.out.println(num1*num2);
                break;
            case '/':
                System.out.println(num1/num2);
                break;
            case '%':
                System.out.println(num1 % num2);
                break;
            default:
                System.out.println("Invalid Operation!");
        }
    }
}
/* **Problem 19.4**
A system handles different user roles (admin, user, guest). What should happen in the default case if an unknown role is provided?
*/
class Solution4{
    public void solve(String role){
        switch(role){
            case "Admin":
                System.out.println("Admin");
                break;
            case "User":
                System.out.println("User");
                break;
            case "Guest":
                System.out.println("Guest");
                break;
            default:
                System.out.println("Invalid user");
        }
    }
}
/*
**Problem 19.5**
You're processing shape codes (C for circle, S for square, T for triangle). What would the default case handle and how?

---
 */
class Solution5{
    public void solve(char shapeCode){
         switch(shapeCode){
            case 'C':
                System.out.println("Circle");
                break;
            case 'S':
                System.out.println("Square");
                break;
            case 'T':
                System.out.println("Triangle");
                break;
            default:
                System.out.println("Default Shape");
         }
    }
}
public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solution1 solution1 = new Solution1();
        solution1.solve();

        Solution2 solution2 = new Solution2();
        char c = sc.next().charAt(0);
        solution2.solve(c);

        Solution3 solution3 = new Solution3();
        char op = sc.next().charAt(0);
        solution3.solve(op);
        sc.nextLine();
        
        Solution4 solution4 = new Solution4();
        String role = sc.nextLine();
        solution4.solve(role);
        
        Solution5 solution5 = new Solution5();
        char shapeCode = sc.next().charAt(0);
        solution5.solve(shapeCode);

    }
}
