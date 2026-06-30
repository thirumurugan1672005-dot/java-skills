/*

### Concept 23: break Statement

**Problem 23.1**
You're searching for a specific number in a list. Once found, you should stop searching. How would you use break?
*/
class Solution1{
    public void solve(){
         int[]num = {1,2,3,4,5};
         int search = 3;
         for(int i=0;i<num.length;i++){
            if(num[i] == search){
                System.out.println(i);
                break;
            }
         }
    }
}
/* 
**Problem 23.2**
A game runs in a loop until the player presses the exit button. How would break help here?
*/
class Solution2{
    public void solve(){
        boolean isGameRunning = true;
        int playerLives = 5;
        while(true){
             if(playerLives >0){
                playerLives--;
             }
             else{
                isGameRunning = false;
             }
             if(!isGameRunning){
                 break;
             }
        }
    }
}
/* 
**Problem 23.3**
You're processing a list of items. If you encounter an invalid item, you should stop processing. How would you use break?
*/
class Solution3{
    public void solve(){
        String invalid = "Invalid";
        boolean isProcessing = true;
        while(isProcessing){
              if(invalid.equals("Invalid")){
                break;
              }
        }
    }
}
/*
**Problem 23.4**
A switch statement has multiple cases. Once a case is executed, you need to exit the switch. Why is break important?
*/
class Solution4{
    public void solve(){
        int n = 3;
        switch(n){
            case 1:
                case 2:
                    System.out.println(1);
                    break;
                    case 3:
                        System.out.println(2);
                        break;
        }
    }
}
/* 
**Problem 23.5**
You're counting consecutive even numbers. Once you find an odd number, you should stop. How would break help?

--- */
class Solution5{
    public void solve(){
        int num[] = {2,2,2,4,6,8,5,9,10,2,3};
        int i;
        for( i=0;i<num.length;i++){
            if(num[i] % 2  != 0){
                break;
            }
        }
        if(i<num.length){
            System.out.print(num[i]);
        }
        else{
            System.out.print(-1);
        }
    }
}
public class Demo {
    public static void main(String[] args) {
        Solution1 solution1 = new Solution1();
        solution1.solve();
        Solution2 solution2 = new Solution2();
        solution2.solve();
        Solution3 solution3 = new Solution3();
        solution3.solve();
        Solution4 solution4 = new Solution4();
        solution4.solve();
        Solution5 solution5 = new Solution5();
        solution5.solve();
    }
}
