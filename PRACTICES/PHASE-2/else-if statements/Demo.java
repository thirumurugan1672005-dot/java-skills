/*

**Problem 17.1**
Grade assignment based on marks:
- 90+: Grade A
- 80-89: Grade B
- 70-79: Grade C
- Below 70: Grade F
*/

import java.util.Scanner;

class Solution1{
    public void solve(int marks){
        if(marks >=90){
            System.out.println("Grade A");
        }
        else if(marks >=80 && marks<=89){
            System.out.println("Grade B");
        }
        else if(marks >=70 && marks<=79){
            System.out.println("Grade C");
        }
        else if(marks>=0 && marks < 70){
             System.out.println("Grade D");
        }
        else{
            System.out.println("Invalid marks");
        }
    }
}
/* 
How would you check all these conditions?

**Problem 17.2**
Temperature categories:
- Above 40°C: Very hot
- 30-40°C: Hot
- 20-29°C: Warm
- Below 20°C: Cold

Write logic to categorize temperature.
*/
class Solution2{
    public void solve(int temp){
        if(temp > 40){
            System.out.println("Very Hot");
        }
        else if(temp >= 30 && temp <= 40){
            System.out.println("Hot");
        }
        else if(temp >= 20 && temp <= 29){
            System.out.println("Warm");
        }
        else{
            System.out.println("Cold");
        }
    }
}
/* 
**Problem 17.3**
Age groups:
- Below 13: Child
- 13-19: Teenager
- 20-60: Adult
- Above 60: Senior

How would you assign age groups?
*/
class Solution3{
    public void solve(int age){
        if(age < 0){
            System.out.println("Invalid age");
        }
        else if(age >= 13 && age <= 19){
            System.out.println("Teenager");
        }
        else if(age >= 20 && age <= 60){
            System.out.println("Adult");
        }
        else{
            System.out.println("Senior");
        }
    }
}
/* 
**Problem 17.4**
Income tax brackets:
- 0-2,50,000: No tax
- 2,50,001-5,00,000: 10% tax
- 5,00,001-10,00,000: 20% tax
- Above 10,00,000: 30% tax

Write logic to calculate tax bracket.
*/
class Solution4{
    public void solve(int income){
          if(income < 0){
             System.out.println("Invalid income");
          }
          else if(income >= 0 && income <= 2_50_000){
            System.out.println("No tax");
          }
          else if(income <= 5_00_000){
             double  tax = 0.1*income;
             System.out.println(tax);
          }
          else if(income <= 10_00_000){
             double tax = 0.2*income;
             System.out.println(tax);
          }
          else{
            double tax = 0.3*income;
            System.out.println(tax);
          }
    }
}
/* 
**Problem 17.5**
Speed limit violations:
- Speed ≤ 40: No violation
- 41-60: Warning
- 61-80: Fine Rs. 500
- Above 80: Fine Rs. 1000 + License suspension

How would you check speed violations?

---
 */
class Solution5{
    public void solve(int speed){
          if(speed <= 40){
            System.out.println("No Violation");
          }
          else if(speed >= 41 && speed<= 60){
            System.out.println("Warning");
          }
          else if(speed >= 61 && speed <= 80){
              System.out.println("Rs. 500");
          }
          else{
             System.out.println("Rs. 1000 +License Suspension");
          }
    }
}
public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int marks = sc.nextInt();
        Solution1 solution1 = new Solution1();
        solution1.solve(marks);

        int temp = sc.nextInt();
        Solution2 solution2 = new Solution2();
        solution2.solve(temp);

        int age = sc.nextInt();
        Solution3 solution3 = new Solution3();
        solution3.solve(age);

        int income = sc.nextInt();
        Solution4  solution4 = new Solution4();
        solution4.solve(income);

        int speed = sc.nextInt();
        Solution5 solution5 = new Solution5();
        solution5.solve(speed);

        sc.close();

    }
}
