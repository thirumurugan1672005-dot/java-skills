package string;
/*


## STRINGS (5 Questions)

### Q1: Reverse Words in String
**Real-world scenario:** Text editor. Reverse word order in a sentence.

**Input:**
```
"Hello World Java"
```

**Output:**
```
"Java World Hello"
```


---
*/

import java.util.HashMap;

class Solution1{ 
    public void reverse(char arr[],int l , int r){
        
        
        while(l<=r){
            char t = arr[l];
            arr[l] = arr[r];
            arr[r] = t;
            l++;
            r--;
        }
    
    }
    public void solve(){
        String word = "Hello  World  Java";
        char arr[] = word.toCharArray();
        reverse(arr,0,arr.length-1);
        int i = 0;
        int left = 0;
        int right = 0;
        while(i<arr.length){
                while(i<arr.length && arr[i] ==' '){
                    i++;
                }
                if(i==arr.length){
                    break;
                }
                while(i<arr.length && arr[i]!=' '){
                     arr[right++] = arr[i++];
                }
                reverse(arr,left,right-1);
                arr[right++] = ' ';
                left = right;
                i++;
        }
        
        StringBuilder ans = new StringBuilder();
        for(int k=0;k<right-1;k++){
            ans.append(arr[k]);
        }
        System.out.println(ans.toString());
        
        
}
/* 

### Q2: Check if String is Palindrome
**Real-world scenario:** Validate product codes (many are palindromes).

**Input:**
```
"madam"
"racecar"
"hello"
```

**Output:**
```
true
true
false
```


---
*/
class Solution2{
    boolean isAlphabetic(char c){
        return (c >='A' && c <= 'Z') || (c >= 'a' && c <= 'z');
    }
    boolean isNumeric(char c){
        return c >= '0' && c <= '9';
    }
    boolean isAlnum(char c){
        return isAlphabetic(c) || isNumeric(c);
    }
    public void solve(){
        String input = "madam";
        int l = 0;
        int r = input.length()-1;
        boolean isPalindrome = true;
        while(l<r){
            if(!isAlnum(input.charAt(l))){
                l++;
            }
            else if(!isAlnum(input.charAt(r))){
                r--;
            }
            else{
                if(input.charAt(l) != input.charAt(r)){
                    isPalindrome = false;
                    break;
                }
                l++;
                r--;
            }

        }
        if(isPalindrome){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
    }
}
/*

### Q3: Count Vowels and Consonants
**Real-world scenario:** Text analysis tool for document statistics.

**Input:**
```
"HelloWorld"
```

**Output:**
```
Vowels: 3
Consonants: 7
```


---
*/
class Solution3{
    boolean isVowel(char c){
        return 
               c == 'a' || c  == 'e' || 
               c == 'i' || c =='o'|| 
               c == 'u' ||c == 'A'||
               c == 'E' || c == 'I' || 
               c == 'O' || c == 'U';
    }
    public void solve(){
        String s ="HelloWorld";
        int cntVowels = 0;
        int cntConsonants = 0;
        for(int i=0;i<s.length();i++){
            if(isVowel(s.charAt(i))){
                cntVowels++;
            }
            else{
                cntConsonants++;
            }
        }
        System.out.println("Consonants : "+cntConsonants);
        System.out.println("Vowels : "+cntVowels);
    }
}
}
/* 
### Q4: Find First Non-Repeating Character
**Real-world scenario:** Coding algorithm. Find the first unique character.

**Input:**
```
"leetcode"
"loveleetcode"
"aabb"
```

**Output:**
```
'l' (index 0)
'v' (index 2)
-1 (no unique character)
```


---
*/
class Solution4{
    public void solve(){
        String ans = "loveleetcode";
        int freq[] = new int[256];
        for(int i=0;i<ans.length();i++){
              freq[ans.charAt(i)]++;
        }
        for(int i=0;i<ans.length();i++){
            if(freq[ans.charAt(i)] == 1){
                System.out.println(ans.charAt(i));
                break;
            }
        }
    }
}
/* 
### Q5: Longest Common Prefix
**Real-world scenario:** File path validator. Find common prefix in paths.

**Input:**
```
Strings: ["flower", "flow", "flight"]
```

**Output:**
```
"fl"
```

**Hints:**
- Compare characters at each position
- Stop at first mismatch
- Check shortest string length first

---

 */
class Solution5{
    public void solve(){
        String[] arr = {"flowers","flow","flight"};
        String ans = arr[0];
        for(int i=1;i<arr.length;i++){
            String w = arr[i];
            int j  = 0;
            while(j<w.length() && j<ans.length() && w.charAt(j) == ans.charAt(j)){
                 j++;
            }
            ans = w.substring(0,j);
        }
        System.out.println(ans);
    }
}
public class Demo {
    public static void main(String[] args) {
        Solution1 obj1 = new Solution1();
        obj1.solve();
    }
}

