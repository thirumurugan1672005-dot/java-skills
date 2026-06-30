/*

**Problem 24.1**
Print all numbers from 1 to 20 except multiples of 3. How would you use continue to skip multiples of 3?
*/

import java.util.Scanner;

class Solution1{
    public void solve(){
         for(int i=1;i<=20;i++){
            if(i%3==0){
                continue;
            }
            System.out.print(i+" ");
         }
        System.out.println();
     }
}
/* 
**Problem 24.2**
Calculate the sum of even numbers from 1 to 100. How would you use continue to skip odd numbers?
*/
class Solution2{
    public void solve(){
        int sum = 0;
        for(int i=1;i<=100;i++){
            if(i % 2 != 0){
                continue;
            }
            sum+=i;
        }
    }
}
/* 
**Problem 24.3**
Process a list of students and skip those who are absent. How would continue help?
*/
class Solution3{
    public void solve(){
        String students[] = {"Ramesh","Suresh","Pamesh","Kalesh"};
        boolean isPresent[] = {true,false,true,false};
        for(int i=0;i<students.length;i++){
             if(!isPresent[i]){
                continue;
             }
             System.out.print(students[i]+" ");
        }
        System.out.println();
    }
}
/* 
**Problem 24.4**
Print a pattern but skip certain rows. For example, skip every 3rd row. How would continue work?
*/
class Solution4{
    public void solve(){
        int skippedRows = 3;
        for(int i=1;i<=10;i++){
            if(skippedRows%i==0){
                continue;
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
/* 
**Problem 24.5**
You're validating user input. If input is invalid, continue asking without processing. How would continue help?
 */
class Solution5{
    public void solve(Scanner sc ){
          int[] agesOfPersons = {20,25,-54,65};
          for(int i=0;i<agesOfPersons.length;i++){
               if(agesOfPersons[i] <0){
                  continue;
               }
               System.out.print(agesOfPersons[i]+" ");
          }
          System.out.println();
    }
}
public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solution1 solution1 = new Solution1();
        solution1.solve();
        Solution2 solution2 = new Solution2();
        solution2.solve();
        Solution3 solution3 = new Solution3();
        solution3.solve();
        Solution4 solution4 = new Solution4();
        solution4.solve();
        Solution5 solution5 = new Solution5();
        solution5.solve(sc);
    }
}
