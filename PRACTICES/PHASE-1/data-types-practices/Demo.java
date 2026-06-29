/*You need to store information about a student in a program. Decide which data type would be appropriate for:
- Student's name
- Student's age
- Student's height (in decimal)
- Whether the student passed or failed

Write down which primitive data type you would use for each and explain why.
 */
class Solution1{
    public void solve(){
        String name = "Arun";
        int age =15;
        double height = 165.64;
        boolean isPassed = true;
        System.out.println("Student's name: "+name);
        System.out.println("Age of Student: "+age);
        System.out.println("Height of Student: "+height);
        System.out.println("Is passed : "+isPassed);

    }
}
/*

**Problem 1.2**
A company needs to store employee records. For an employee, they need to store:
- Employee ID (whole number, up to 2 million)
- Employee salary (decimal value up to 1 billion)
- Employee initial (single character)
- Whether employee is full-time or part-time

Choose appropriate data types and justify your choices. */
class Solution2{
    public void solve(){
        int employeeId = 123;
        double salary = 12000;
        char intial = 'A';
        boolean isFullTime = false;
        System.out.println("Employee Id: "+employeeId);
        System.out.println("Employee  Salary:"+salary);
        System.out.println("Employee's  intial  "+intial);
        System.out.println("Is FullTime : "+isFullTime);
    }
}
/*
**Problem 1.3**
You are developing a temperature monitoring system. The system needs to record:
- Current temperature (can be negative and decimal)
- Maximum temperature today
- Minimum temperature today
- Number of readings taken

Suggest data types and explain if there are any risks with your choices. */
class Solution3{
    public void solve(){
        double currTemperature = 35.4;
        double maxTemperature = 39.45;
        double minTemperature = 28.94;
        int noReadings = 180;
        System.out.println("Current Temperature : "+currTemperature);
        System.out.println("Maximum Temperature in day : "+maxTemperature);
        System.out.println("Minimum Temperature in day : "+minTemperature);
        System.out.println("Number of Readings : "+noReadings);
    }
}
/*
 
**Problem 1.4**
An online store needs to track inventory. They need to store:
- Product price per unit
- Number of units in stock
- Product code (very large number, over 2 billion)
- Whether product is available or out of stock
*/
class Solution4{
    public void solve(){
        double productPricePerUnit= 23.45;
        int noUnitsInStock= 120;
        long productCode = 12345;
        boolean isOutOfStock = false;

        System.out.println("Product's unit price per stock : "+productPricePerUnit);
        System.out.println("Number of Units in Stock: "+noUnitsInStock);
        System.out.println("Product Code: "+productCode);
        System.out.println("Stocks exists : "+isOutOfStock);
    }
}
/* 
Select appropriate data types. Will any of these choices cause problems?

**Problem 1.5**
A banking application needs to store:
- Account balance (very large decimal value, in millions)
- Transaction amount
- Customer age
- Account status (Active/Inactive)

What data types would you use and what are the potential issues?

---
 */
class Solution5{
     public void solve(){
        double balance = 12678.34;
        double transaction_amount = 123.45;
        int age = 30;
        boolean isActive = false;
        System.out.println("Account Balance : "+balance);
        System.out.println("Transaction Amount : "+transaction_amount);
        System.out.println("Age : "+age);
        System.out.println("Is Active "+isActive);
     }
}
public class Demo{
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