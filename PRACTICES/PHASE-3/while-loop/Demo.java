/*

**Problem 21.1**
A user enters numbers until they enter -1 (sentinel value). The program should stop when -1 is entered. How would you use while loop for this?
*/

import java.util.Scanner;

class Solution1{
    public void solve(Scanner sc){
        int n = sc.nextInt();
        while(n!=-1){
             System.out.println(n);
             n = sc.nextInt();
        }
    }
}
/* 
**Problem 21.2**
You're reading lines from a file until there are no more lines. How would you use a while loop? What condition would you check?
*/
class Solution2{
    public void solve(Scanner sc){
        while(sc.hasNextLine())
        {

            String s = sc.nextLine();
            System.out.println(s);
        }
    }
}
/*
**Problem 21.3**
A password validation system asks the user to enter a password until it's correct. Design a while loop for this.

*/
class Solution3{
    public void solve(Scanner sc ){
        String password = "Thiru@123";
        String entered = "";
        while(!password.equals(entered)){
            entered = sc.nextLine();
        }
    }
}
/* 
**Problem 21.4**
A game continues until the player loses all lives. How would you use while loop to keep the game running?
*/
class Solution4{
    public void solve(){
        int noLives = 5;
        while(noLives>0){
            System.out.println("Player is in game");
            noLives--;
        }
    }
}
/* 
**Problem 21.5**
A server listens for incoming connections and processes them until it's shut down. How would you use a while loop for this?

---
 */
class Solution5{
    public void solve(){
        String connections = "123454";
        while(connections.length()>0){
            connections = connections.substring(0,connections.length()-1);
        }
    }
}
public  class Demo{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Solution1 solution1  = new Solution1();
    solution1.solve(sc);
    Solution2 solution2 = new Solution2();
    solution2.solve(sc);
    Solution3 solution3 = new Solution3();
    solution3.solve(sc);
    Solution4 solution4 = new Solution4();
    solution4.solve();
    Solution5 solution5 = new Solution5();
    solution5.solve();
  }
}