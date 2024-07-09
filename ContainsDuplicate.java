// leet code problem 
// 217. Contains Duplicate

// Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

 

// Example 1:

// Input: nums = [1,2,3,1]
// Output: true


import java.util.HashSet;
public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        
       HashSet<Integer> set = new HashSet<>();
       for(int i : nums){
           if(!set.add(i)){
               return true;
           }
       }
        return false;
}
}
