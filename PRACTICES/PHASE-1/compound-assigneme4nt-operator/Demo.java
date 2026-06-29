/*

**Problem 13.1**
A student's marks are initially 0. During the exam:
- First section adds 20 marks
- Second section adds 25 marks
- Third section adds 30 marks

Use compound assignment operators to update marks.
*/
class Solution1{
    public void solve(){
        //inital marks  is 0
        int marks = 0;
        // first section adds 20 marks;
        marks+=20;
        // second section adds 25 marks
        marks+=25;
        // third section adds 30 marks
        marks+=35;
        System.out.println("Total Marks: "+marks);
    }
}
/* 
**Problem 13.2**
A bank account has an initial balance. During the day:
- A deposit of Rs. 5000 is made
- A withdrawal of Rs. 2000 is made
- Interest of Rs. 50 is added

Update the balance using compound operators.
*/
class Solution2{
    public void solve(){
        int balance = 5000;
        // deposit 
        balance+=5000;
        // withdrawal
        balance-=2000;
        // imterest 50
        balance+=50;
        System.out.println("Final balance : "+balance);
    }
}
/* 
**Problem 13.3**
A shopping cart starts with 0 items:
- Add 5 items
- Add 3 more items
- Remove 2 items

Update the item count using compound operators.
*/
class Solution3{
    public void solve(){
        int noItems = 0;
        noItems+=5;// add 5 items
        noItems+=3;// add 3 more
        noItems-=2;// remove 2 items
        System.out.println("Number of Items : "+noItems);
    }
}
/* 
**Problem 13.4**
A game score starts at 0:
- Player earns 100 points
- Player loses 25 points (penalty)
- Player earns 50 bonus points

Update the score using compound operators.
*/
class Solution4{
    public void solve(){
        int score = 0;
        score+=100;  // earns 100 points
        score-=25; // loses 25 points
        score+=50;// gains 50
        System.out.println("Final Score : "+score);
    }
}
/*
**Problem 13.5**
An inventory system tracks stock:
- Starting stock: 100 units
- Sold 30 units
- Restocked 50 units
- Damaged 5 units

Update the stock using compound operators.

--- */
class Solution5{
    public void solve(){
        int stocks = 100;
        stocks-=30;//sold 30
        stocks+=50;// restocked 50
        stocks-=5; // damaged 5 stocks
        System.out.println("Number of stocks : "+stocks);

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
