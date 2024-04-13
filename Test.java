
/*
 * Swapnil Sudhir to Everyone (Apr 8, 2024, 2:29 PM)
Given an integer array nums, find the subarray with the largest sum, and return its sum and the subarray. A subarray is a contiguous non-empty sequence of elements within an array.

Example 1:
Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6, [4,-1,2,1]
Explanation: The subarray [4,-1,2,1] has the largest sum 6.


 */

import java.util.Arrays;

public class Test {
 
   public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int[] result = maxSubarray(nums);
        System.out.println("Maximum sum: " + result[0]);
        System.out.println("Subarray with maximum sum: " + Arrays.toString(Arrays.copyOfRange(nums, result[1], result[2] + 1)));
    }

    public static int[] maxSubarray(int[] nums) {
        if (nums == null || nums.length == 0) {
            return new int[]{0, -1, -1}; // Return 0 if input array is empty
        }

        int maxSum = nums[0];
        int currentSum = nums[0];
        int start = 0;
        int end = 0;
        int currentStart = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > currentSum + nums[i]) {
                currentSum = nums[i];
                currentStart = i;
            } else {
                currentSum += nums[i];
            }

            if (currentSum > maxSum) {
                maxSum = currentSum;
                start = currentStart;
                end = i;
            }
        }

        return new int[]{maxSum, start, end};
    }

    
 }