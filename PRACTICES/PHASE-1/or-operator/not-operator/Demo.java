/*

**Problem 11.1**
You want to check if a user is NOT an admin. How would you write this condition using the NOT operator?
*/
class Solution1{
    public void solve(){
        boolean isAdmin = false;
        System.out.println(! isAdmin);
    }
}
/*
**Problem 11.2**
A system should perform an action if the user is NOT logged in. Write a logical expression for this.
*/
class Solution2{
    public void solve(){
         boolean isLogged = false;
         System.out.println(!isLogged);
    }
}
/*
**Problem 11.3**
A discount should NOT apply if the product is NOT on sale. How would you check this?
*/
class Solution3{
    public void solve(){
         boolean isSale = false;
         System.out.println(!isSale);
    }
}
/* 
**Problem 11.4**
You want to continue a game loop while the game is NOT over. Write the condition using NOT operator.
*/
class Solution4{
    public void solve(){
         boolean isGameOver = false;
         System.out.println(!isGameOver);
    }
}
/* 
**Problem 11.5**
A notification should show if the internet connection is NOT working. Write the condition using NOT operator.

---
 */
class Solution5{
    public void solve(){
        boolean isNotWorking = false;
        System.out.println(!isNotWorking);
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
