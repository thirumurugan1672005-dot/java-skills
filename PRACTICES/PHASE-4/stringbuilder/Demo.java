package stringbuilder;
/*

### Q1: Build CSV String from Array
**Real-world scenario:** Export data to CSV format.

**Input:**
```
String[] data = {"John", "Engineer", "5 years", "Mumbai"}
```

**Output:**
```
"John,Engineer,5 years,Mumbai"
```


---
*/

import java.util.HashSet;

import Solution1;
import Solution2;
import Solution3;
import Solution4;
import Solution5;

class Solution1{
    public void solve(){
        String[] data = {"John", "Engineer", "5 years", "Mumbai"};
        StringBuilder builder = new StringBuilder();
        for(String d: data){
            builder.append(d);
            builder.append(",");
        }
        builder.setLength(builder.length()-1);
        System.out.println(builder.toString());
    }
}
/*

### Q2: Reverse String Efficiently
**Real-world scenario:** Palindrome checker optimized.

**Input:**
```
"Hello"
```

**Output:**
```
"olleH"
```


---
*/
class Solution2{
    public void solve(){
        String input = "Hello";
        StringBuilder builder = new StringBuilder(input);
        String ans = builder.reverse().toString();
        System.out.println(ans);
    }
}
/*

### Q3: Remove Duplicate Characters
**Real-world scenario:** Username validation. Remove duplicate characters.

**Input:**
```
"programming"
```

**Output:**
```
"progamin"  (keep first occurrence, remove rest)
```


---
*/
class Solution3{
    public void sol1(String input){
        char arr[] = input.toCharArray();
        int freq[] = new int[256];
        String s = "";

        for(int i=0;i<arr.length;i++){
            if(freq[arr[i]] == 0){
               s+=arr[i];
               freq[arr[i]]++;
            }
        }
        System.out.println(s);
    }
    public void sol2(String input){
        StringBuilder builder = new StringBuilder();
        HashSet<Character>ans = new HashSet<>();
        for(int i=0;i<input.length();i++){
            if(!ans.contains(input.charAt(i))){
               builder.append(input.charAt(i));    
            }
            ans.add(input.charAt(i));
        }
        System.out.println(builder.toString());
    }
    public void solve(){
        String input = "programming";
        sol1(input);
        sol2(input);
    }
}
/*
### Q4: Build HTML String from Components
**Real-world scenario:** Template builder. Dynamically create HTML.

**Input:**
```
Tag: "div"
Content: "Hello World"
Attributes: "class='container' id='main'"
```

**Output:**
```
"<div class='container' id='main'>Hello World</div>"
```

**Hints:**
- StringBuilder more efficient than concatenation
- Multiple append() calls chained
- String formatting

---
*/
class Solution4{
    public void solve(){
        String tag = "div";
        String Content = "Hello World";
        String attributes = "class='container' id='main'";
        System.out.println("<"+tag+" "+attributes+">"+Content+"</"+tag+">");
    }
}
/* 
### Q5: Compress String (Run-Length Encoding)
**Real-world scenario:** Data compression. "aaabbc" → "a3b2c1"

**Input:**
```
"aaabbc"
```

**Output:**
```
"a3b2c1"
```

**Hints:**
- Count consecutive same characters
- Append character + count to StringBuilder
- Reset count when character changes

---
 */
class Solution5{
    public void sol1(String input){
        char arr[] = input.toCharArray();
        String s = "";
        
        int i = 0;
        int j = 1;
        for(j=1;j<arr.length;j++){
             if(arr[i] != arr[j]){
               s+=arr[i];
               s+=(j-i);
               i=j;
             }
        }
        if(i<arr.length){
            s +=arr[i];
            s+=(j-i);
        }
        System.out.println(s);
    }
    public void sol2(String input){
        int i = 0;
        int j = 1;
        StringBuilder builder = new StringBuilder();
        for(j=1;j<input.length();j++){
            if(input.charAt(i)!=input.charAt(j)){
                 builder.append(input.charAt(i));
                 builder.append(j-i);
                 i=j;
            }
        }
        if(i<input.length()){
            builder.append(input.charAt(i));
            builder.append(j-i);
        }
        System.out.println(builder);
    }
    public void solve(){
        String input ="aaabbc";
        sol1(input);
        sol2(input);

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
