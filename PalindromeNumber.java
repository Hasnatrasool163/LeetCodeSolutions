// leet code problem

// 9. Palindrome Number

// Given an integer x, return true if x is a palindrome, and false otherwise.

// Example 1:

// Input: x = 121
// Output: true
// Explanation: 121 reads as 121 from left to right and from right to left.
  
public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        // negative check
        
        if (x < 0) {
            return false;
        }
        // convert 
        String str = String.valueOf(x);
        int left = 0;
        int right = str.length() - 1;
         while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                 return false; 
            }
            left++;
            right--;
        }
         return true;
    }
}
