// leet code problem
// 69. Sqrt(x)  Easy
// Given a non-negative integer x, return the square root of x rounded down to the nearest integer. The returned integer should be non-negative as well.

// You must not use any built-in exponent function or operator.

// For example, do not use pow(x, 0.5) in c++ or x ** 0.5 in python.
 

// Example 1:

// Input: x = 4
// Output: 2
// Explanation: The square root of 4 is 2, so we return 2.

public class Sqrt {
    public int mySqrt(int x) {
        if (x == 0 || x == 1) {
            return x;
        }
        return binarySearch(1, x, x);
    }
    
    private int binarySearch(int left, int right, int x) {
        int mid = left + (right - left) / 2;
        
        if (mid <= x / mid && (mid + 1) > x / (mid + 1)) {
            return mid;
        } else if (mid > x / mid) {
            return binarySearch(left, mid - 1, x);
        } else {
            return binarySearch(mid + 1, right, x);
        }
    }
}
