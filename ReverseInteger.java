/ leet code problem 
  
// 7. Reverse Integer Medium

// Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.

// Assume the environment does not allow you to store 64-bit integers (signed or unsigned).

 

Example 1:

Input: x = 123
Output: 321

public class ReverseInteger {
    public int reverse(int x) {
        if (x == 0) {
            return 0;
        }
        
        boolean isNegative = x < 0; 
        if (isNegative) {
            x = -x;  
        }
        
        int reversedNum = 0;
        while (x > 0) {
            int lastDigit = x % 10;
           
            if (reversedNum > (Integer.MAX_VALUE - lastDigit) / 10) {
                return 0;  
            }
            reversedNum = reversedNum * 10 + lastDigit;
            x = x / 10;
        }
        
      
        if (isNegative) {
            reversedNum = -reversedNum;
        }
        
        return reversedNum;
    }
}
