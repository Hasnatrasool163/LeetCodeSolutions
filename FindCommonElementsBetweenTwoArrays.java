// leet code problem
// 2956. Find Common Elements Between Two Arrays Easy

// You are given two integer arrays nums1 and nums2 of sizes n and m, respectively. Calculate the following values:

// answer1 : the number of indices i such that nums1[i] exists in nums2.
// answer2 : the number of indices i such that nums2[i] exists in nums1.
// Return [answer1,answer2]
# Solution:

public class FindCommonElementsBetweenTwoArrays {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        int[] ans = new int[2];
        int count1 = 0;
        int count2 = 0;
        for(int i=0; i <nums1.length; i++){
            for (int j=0; j<nums2.length; j++){
                if(nums1[i]==nums2[j]){
                    count1++;
                    break;
                }
            }
        }
        for(int i=0; i <nums2.length; i++){
            for (int j=0; j<nums1.length; j++){
                if(nums2[i]==nums1[j]){
                    count2++;
                    break;
                }
            }
        }
        ans[0] = count1;
        ans[1] = count2;
        return ans;
    }
}

