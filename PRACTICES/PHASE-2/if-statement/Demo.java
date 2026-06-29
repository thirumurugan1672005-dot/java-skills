/*
**Problem 15.1**
Write the logic for: A student gets a certificate if their marks are 80 or above.
 How would you check this? */

import java.util.Scanner;

class Solution1{
    public void solve(Scanner sc){
        System.out.println("Get Marks : ");
        int marks = sc.nextInt();
        if(marks >= 80){
            System.out.println("It is above 80 marks");
        }
        else{
            System.out.println("It is less than 80 marks");
        }
        
    }
 }
 /*
 
**Problem 15.2**
A vehicle can enter a parking if the slot is available. How would you check this condition?
]
  */
 class Solution2{
    public void solve(){
        boolean isSlotAvailable = true;
        if(isSlotAvailable){
            System.out.println("Slot is available");
        }
        else{
            System.out.println("Slot is not available");
        }
    }
 }
 /*
 
**Problem 15.3**
A customer gets free delivery if the order amount is above Rs. 500. Write the logic to check this. */
class Solution3{
    public void solve(Scanner sc){

         int orderAmount = sc.nextInt();
         if(orderAmount<=500){
            System.out.println("Delivery is not free");
         }
         else{
            System.out.println("Free Delivery!");
         }
         
    }
}
/*
**Problem 15.4**
A person is eligible to vote if they are 18 years or older. How would you verify this? */
class Solution4{
    public void solve(Scanner sc){
    
         int age = sc.nextInt();
         if(age <=0){
            System.out.println("Invalid age!");
         }
         else if(age <18){
            System.out.println("Not able to vote!");
         }
         else{
            System.out.println("Eligible to vote!");
         }
         
        
    }
}
/*

**Problem 15.5**
A product is in stock if the quantity is greater than 0. Write the condition to check availability. */
class Solution5{
    public void solve(Scanner sc){
        
        int quantity =sc.nextInt();
        if(quantity >0){
            System.out.println("In Stock");
        }
        sc.close();
    }
}
public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solution1 solution1 = new Solution1();
        solution1.solve(sc);
         Solution2  solution2 = new Solution2();
         solution2.solve();
        Solution3 solution3 =new Solution3();
        solution3.solve(sc);
        Solution4 solution4 = new Solution4();
        solution4.solve(sc);
        Solution5 solution5 = new Solution5();
        solution5.solve(sc);
        sc.close();
    }
}
